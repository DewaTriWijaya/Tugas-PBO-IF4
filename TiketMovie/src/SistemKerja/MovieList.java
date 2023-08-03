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

public class MovieList {

    Koneksi dbSetting;
    String driver, database, user, pass;
    Object tabel;

    String judul;
    String rating;
    String batasUmur;

    public MovieList() {
        dbSetting = new Koneksi();
        driver = dbSetting.SettingPanel("DBDriver");
        database = dbSetting.SettingPanel("DBDatabase");
        user = dbSetting.SettingPanel("DBUsername");
        pass = dbSetting.SettingPanel("DBPassword");
    }

    public void movieList(JLabel judul, JLabel rating, JLabel bu, int get_list) {
        
        // menyimpan hasil get data ke dalam list
        List<String> listJudul = new ArrayList<>();
        List<String> listRating = new ArrayList<>();
        List<String> listBatasUmur = new ArrayList<>();

        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(
                    database,
                    user,
                    pass);

            float ratingMax = 7.0f;

            Statement stt = conn.createStatement();
            String SQL = "SELECT judul_movie, batas_umur, rating FROM movie_list WHERE rating >= '" + ratingMax + "';";
            ResultSet res = stt.executeQuery(SQL);
            while (res.next()) {
                listJudul.add(res.getString(1));
                listBatasUmur.add(res.getString(2));
                listRating.add(res.getString(3));
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
        judul.setText(listJudul.get(get_list));
        rating.setText(listRating.get(get_list));
        bu.setText(listBatasUmur.get(get_list) + "+");

    }

}
