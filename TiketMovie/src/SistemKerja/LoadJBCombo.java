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
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class LoadJBCombo {

    Koneksi dbSetting;
    String driver, database, user, pass;
    Object tabel;

    public LoadJBCombo() {
        dbSetting = new Koneksi();
        driver = dbSetting.SettingPanel("DBDriver");
        database = dbSetting.SettingPanel("DBDatabase");
        user = dbSetting.SettingPanel("DBUsername");
        pass = dbSetting.SettingPanel("DBPassword");
    }

    public void loadJBMovie(JComboBox jb_judul_movie) {
        // Get data judul_movie ke dalam JBCombo
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(
                    database,
                    user,
                    pass);

            Statement stt = conn.createStatement();
            String SQL = "SELECT judul_movie FROM movie_list;";
            ResultSet res = stt.executeQuery(SQL);
            while (res.next()) {
                jb_judul_movie.addItem(res.getString(1));
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

    }

    public void loadJBWaktuTayang(JComboBox jb_waktu_tayang) {
        // Get data waktu_tayang ke dalam JBCombo
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(
                    database,
                    user,
                    pass);

            Statement stt = conn.createStatement();
            String SQL = "SELECT * FROM waktu_tayang;";
            ResultSet res = stt.executeQuery(SQL);
            while (res.next()) {
                jb_waktu_tayang.addItem(res.getString(1));
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

    }

    public void loadJBStudio(JComboBox jb_studio) {
        // Get data nama_mall ke dalam JBCombo
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(
                    database,
                    user,
                    pass);

            Statement stt = conn.createStatement();
            String SQL = "SELECT nama_mall FROM studio_list;";
            ResultSet res = stt.executeQuery(SQL);
            while (res.next()) {
                jb_studio.addItem(res.getString(1));
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

    }
}
