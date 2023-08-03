/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemKerja;

import Main.MainMovie;
import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class UserVerification {

    Koneksi dbSetting;
    String driver, database, user, pass;
    Object tabel;

    // Sistem Login
    String id;
    String email;

    String password;
    String umur = "0";

    // Create USER UUID
    String USER_UUID;

    // Cek Login
    boolean cek_email;

    public UserVerification() {
        dbSetting = new Koneksi();
        driver = dbSetting.SettingPanel("DBDriver");
        database = dbSetting.SettingPanel("DBDatabase");
        user = dbSetting.SettingPanel("DBUsername");
        pass = dbSetting.SettingPanel("DBPassword");
    }

    public void userVerificationLogin(Component context, JTextField txt_email, JTextField txt_password, JPanel panel_utama, JPanel menu_panel) {
        // Untuk Mengecek Format Email
        String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";

        // Get data dari table user untuk get email
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(
                    database,
                    user,
                    pass);

            Statement stt = conn.createStatement();
            String SQL = "SELECT * FROM user WHERE email='" + txt_email.getText() + "'";
            ResultSet res = stt.executeQuery(SQL);
            while (res.next()) {
                id = res.getString(1);
                email = res.getString(2);
                password = res.getString(3);
                umur = res.getString(4);
            }
            res.close();
            stt.close();
            conn.close();

            if (txt_email.getText().isEmpty()) {
                JOptionPane.showMessageDialog(context, "Empty Username Or Password");
            } else if (!txt_email.getText().matches(emailPattern)) {
                JOptionPane.showMessageDialog(context, "Isi Data Email Dengan Benar");
            } else if (txt_password.getText().isEmpty()) {
                JOptionPane.showMessageDialog(context, "Empty Username Or Password");
            } else if (txt_email.getText().equals(email) && txt_password.getText().equals(password)) {
                JOptionPane.showMessageDialog(context, "Login Succesfully");

                // Send USER UUID
                Pembelian.user_UUID = id;
  
                // Send Umur User
                Pembelian.get_umur_to_HP = umur;

                // Send From TRUE
                MainMovie.from = true;
            } else {
                JOptionPane.showMessageDialog(context, "Wrong Username Or Password");
            }

        } catch (Exception e) {
            System.out.print(email);
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(
                    null,
                    e.getMessage(),
                    "Error",
                    JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }

    public void userVerificationRegister(Component context, JTextField txt_email, JTextField txt_password, JDateChooser get_umur, JPanel panel_utama, JPanel menu_panel) {
        // Untuk Mengecek Format Email
        String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";

        // List untuk menyimpan get email dari table user
        List<String> list = new ArrayList<>();
        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(
                    database,
                    user,
                    pass);

            Statement stt = connection.createStatement();
            String SQL = "SELECT email FROM user ";
            ResultSet res = stt.executeQuery(SQL);
            while (res.next()) {
                list.add(res.getString(1));
            }
            res.close();
            stt.close();
            connection.close();

        } catch (Exception e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(
                    null,
                    e.getMessage(),
                    "Error",
                    JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }

        // Cek Email Apakah Sudah Digunakan
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(txt_email.getText())) {
                cek_email = true;
                break;
            }
        }

        try {
            if (txt_email.getText().isEmpty()) {
                JOptionPane.showMessageDialog(context, "Isi Data Email Kosong");
            } else if (!txt_email.getText().matches(emailPattern)) {
                JOptionPane.showMessageDialog(context, "Isi Data Email Dengan Benar");
            } else if (cek_email) {
                JOptionPane.showMessageDialog(context, "Data Email Sudah Digunakan");
            } else if (txt_password.getText().length() < 8 || txt_password.getText().isEmpty()) {
                JOptionPane.showMessageDialog(context, "Isi Data Password Harus 8 Dan Tidak Boleh Kosong");
            } else if (get_umur.getDate() == null) {
                JOptionPane.showMessageDialog(context, "Isi Data Umur");
            } else {
                // Kalkulasi antara tahun lahir dengan tahun sekarang untuk menghitung umur user berapa
                Date kini = new Date();
                int kalkulasi_umur = kini.getYear() - get_umur.getDate().getYear();
                umur = String.valueOf(kalkulasi_umur);

                Class.forName(driver);
                Connection connection = DriverManager.getConnection(
                        database,
                        user,
                        pass);
                Statement stt = connection.createStatement();
                USER_UUID = UUID.randomUUID().toString().toUpperCase();
                String SQL = "INSERT INTO user(user_id, "
                        + "email, "
                        + "password, "
                        + "umur) "
                        + "VALUES "
                        + "( '" + USER_UUID + "',"
                        + " '" + txt_email.getText() + "',"
                        + " '" + txt_password.getText() + "',"
                        + " '" + umur + "')";
                stt.executeUpdate(SQL);
                stt.close();
                connection.close();
                JOptionPane.showMessageDialog(context, "Register Succesfully");
                
                // Send USER UUID
                Pembelian.user_UUID = USER_UUID;

                // Send From TRUE
                MainMovie.from = true;
            }
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
