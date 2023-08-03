/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemKerja;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class StudioList {

    Koneksi dbSetting;
    String driver, database, user, pass;
    Object tabel;

    String judul;
    String rating;
    String batasUmur;

    public StudioList() {
        dbSetting = new Koneksi();
        driver = dbSetting.SettingPanel("DBDriver");
        database = dbSetting.SettingPanel("DBDatabase");
        user = dbSetting.SettingPanel("DBUsername");
        pass = dbSetting.SettingPanel("DBPassword");
    }

    public void studioList(JLabel mall, JLabel alamat, JLabel rating, int get_list) {
        
        // Menyimpan data setelah get data ke dalam list
        List<String> mallList = new ArrayList<>();
        List<String> alamatList = new ArrayList<>();
        List<String> ratingList = new ArrayList<>();

        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(
                    database,
                    user,
                    pass);

            float ratingMax = 1.0f;

            Statement stt = conn.createStatement();
            String SQL = "SELECT nama_mall, alamat, rating FROM studio_list WHERE rating >= '" + ratingMax + "';";
            ResultSet res = stt.executeQuery(SQL);
            while (res.next()) {
                mallList.add(res.getString(1));
                alamatList.add(res.getString(2));
                ratingList.add(res.getString(3));
            }
            res.close();
            stt.close();
            conn.close();

        } catch (Exception e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(
                    null,
                    e.getMessage(),
                    "Error",
                    JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }

        // Menambahkan data ke UI
        mall.setText(mallList.get(get_list));
        alamat.setText(alamatList.get(get_list));
        rating.setText(ratingList.get(get_list) + "+");

    }

}
