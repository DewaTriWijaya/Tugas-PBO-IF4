/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemKerja;

import Main.MainMovie;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Pembelian {

    Koneksi dbSetting;
    String driver, database, user, pass;

    // Get Data Umur & userUUID Dari UserVerification
    public static String get_umur_to_HP;
    public static String user_UUID;

    // Cek Data Kursi Dari MainMovie
    public boolean cek_kursi;
    
    public  List<String> tiketList = new ArrayList<>();;
    
    // Get Data Kursi Dari MainMovie
    public List<String> listKursi = new ArrayList<>();

    // Cek umur sesuai dengan pembelian movie
    boolean cek_umur;
    // Cek kursi apakah sudah di beli atau tidak
    boolean cek_kursiDibeli;
    // Menyimpan data arrayList setelah konversi dari String To Array
    List<String> getList = new ArrayList<>();
    // Get data dari database dan dimasukan ke dalam arrayList
    List<String> arrayList;
    // Cek id transaksi pembelian
    String transaksi;
    
     int tiketP = 0;

    // Cek kursi apabila sudah di beli maka, ketika fitur Ubah dijalan kan akan di enable true radioButton
    List<String> arrayListTampil;

    public Pembelian() {
        dbSetting = new Koneksi();
        driver = dbSetting.SettingPanel("DBDriver");
        database = dbSetting.SettingPanel("DBDatabase");
        user = dbSetting.SettingPanel("DBUsername");
        pass = dbSetting.SettingPanel("DBPassword");
    }

    public javax.swing.table.DefaultTableModel tableHistory = getTableHistory();

    public javax.swing.table.DefaultTableModel getTableHistory() {
        return new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Transaksi",
                    "Nama",
                    "Movie",
                    "Studio",
                    "Tayang",
                    "Kursi",
                    "Harga"
                }
        ) {
            boolean[] canEditHistory = new boolean[]{
                false, false, false, false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEditHistory[columnIndex];
            }
        };
    }

    public void setTableLoadHistory() {
        String data_history[] = new String[8];
        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(
                    database,
                    user,
                    pass);

            Statement stt = connection.createStatement();
            //System.out.println(user_UUID);
            String SQL = "SELECT * FROM history_pembelian WHERE user_id='" + user_UUID + "';";
            ResultSet res = stt.executeQuery(SQL);
            while (res.next()) {
                data_history[0] = res.getString(1);
                data_history[1] = res.getString(3);
                data_history[2] = res.getString(4);
                data_history[3] = res.getString(5);
                data_history[4] = res.getString(6);
                data_history[5] = res.getString(7);
                data_history[6] = res.getString(8);
                tableHistory.addRow(data_history);
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
    }

    public void buy_ticket(Component context, JTextField txt_nama_pembeli, JComboBox jb_judul_movie, JComboBox jb_waktu_tayang, JComboBox jb_studio) {
        String data[] = new String[7];

        // Get Data Judul Movie & Batas Umur Movie
        List<String> listJudul = new ArrayList<>();
        List<String> listBatasUmur = new ArrayList<>();
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(
                    database,
                    user,
                    pass);
            Statement stt = conn.createStatement();
            String SQL = "SELECT judul_movie, batas_umur FROM movie_list ";
            ResultSet res = stt.executeQuery(SQL);
            while (res.next()) {
                listJudul.add(res.getString(1));
                listBatasUmur.add(res.getString(2));
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

        // Cek Umur Antara User Dan Batas Umur Film
        for (int i = 0; i < listJudul.size(); i++) {
            if (listJudul.get(i).equals(jb_judul_movie.getSelectedItem().toString())) {
                if (!(Integer.parseInt(get_umur_to_HP) >= Integer.parseInt(listBatasUmur.get(i)))) {
                    cek_umur = true;
                    break;
                } else {
                    cek_umur = false;
                    break;
                }
            }
        }

        // Get Data Judul, studio, Waktu, & Kursi
        List<String> listMovie = new ArrayList<>();
        List<String> listStudio = new ArrayList<>();
        List<String> listWaktu = new ArrayList<>();
        List<String> listKursiDibeli = new ArrayList<>();
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(
                    database,
                    user,
                    pass);
            Statement stt = conn.createStatement();
            String SQL = "SELECT transaksi_id, judul_movie, studio, waktu_tayang, kursi FROM history_pembelian";
            ResultSet res = stt.executeQuery(SQL);
            while (res.next()) {

                // untuk mengambil id transaksi
                transaksi = res.getString(1);

                listMovie.add(res.getString(2));
                listStudio.add(res.getString(3));
                listWaktu.add(res.getString(4));
                listKursiDibeli.add(res.getString(5));
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

        // Cek Apakah kursi sudah di pilih
        if (cek_kursi == true) {
            // Cek Judul & Waktu Tayang Movie & studio Dengan Data Kursi
            for (int i = 0; i < listMovie.size(); i++) {
                if (listMovie.get(i).equals(jb_judul_movie.getSelectedItem())) {
                    if (listWaktu.get(i).equals(jb_waktu_tayang.getSelectedItem())) {
                        if (listStudio.get(i).equals(jb_studio.getSelectedItem())) {

                            // String To Array Dari Database 
                            String elementsString = listKursiDibeli.get(i).substring(1, listKursiDibeli.get(i).length() - 1);
                            String[] elementsArray = elementsString.split(", ");
                            arrayList = new ArrayList<>(Arrays.asList(elementsArray));
                            // arrayList di masukan ke getList
                            getList.addAll(arrayList);

                        }
                    }
                }
            }

            // Add Kursi Yang Dibeli Dari Database yang sudah konversi To ArrayList, lalu dikirim ke getList. Setelah itu getList akan disortir apabila ada yang sama maka akan
            // dihapus dan dimasukan ke listCekKursiDibeli.
            HashSet<String> uniqueSet = new HashSet<>();
            List<String> listCekKursiDibeli = new ArrayList<>();
            for (String num : getList) {
                if (!uniqueSet.contains(num)) {
                    uniqueSet.add(num);
                    listCekKursiDibeli.add(num);
                }
            }

     
            if (listCekKursiDibeli.isEmpty()) {
                cek_kursiDibeli = false;
            } else if (listKursi.isEmpty()) {
                cek_kursiDibeli = false;
            } else {
                for (int x = 0; x < listCekKursiDibeli.size(); x++) {
                    // Masih Revisi Error Ketika Salah satu index berbeda
                    if (listCekKursiDibeli.contains(listKursi.get(x))) {
                        cek_kursiDibeli = true;
                        break;
                    } else {
                        cek_kursiDibeli = false;
                        
                        break;
                    }
                }
            }
        }

        if (txt_nama_pembeli.getText().isEmpty()) {
            JOptionPane.showMessageDialog(context, "Data Tidak Boleh Kosong, Silahkan Dilengkapi");
        } else if (cek_umur) {
            JOptionPane.showMessageDialog(context, "Silahkan Pilih Movie Lain, Umur Anda Tidak Cukup");
        } else if (cek_kursi == false) {
            JOptionPane.showMessageDialog(context, "Silakan Pilih Nomor Kursi");
        } else if (cek_kursiDibeli == true) {
            JOptionPane.showMessageDialog(context, "Mohon Maaf Kursi Sudah diBeli");
        } else {


            // Penjumlahan total tiket diambil dari pembelian kursi
            int total = listKursi.size() * 45000;

            try {
                Class.forName(driver);
                Connection conn = DriverManager.getConnection(
                        database,
                        user,
                        pass);
                Statement stt = conn.createStatement();
                String SQL = "INSERT INTO history_pembelian(user_id, "
                        + "nama_pembeli, "
                        + "judul_movie, "
                        + "studio, "
                        + "waktu_tayang, "
                        + "kursi, "
                        + "total_harga) "
                        + "VALUES"
                        + "( '" + user_UUID + "',"
                        + "  '" + txt_nama_pembeli.getText() + "',"
                        + "  '" + jb_judul_movie.getSelectedItem() + "',"
                        + "  '" + jb_studio.getSelectedItem() + "',"
                        + "  '" + jb_waktu_tayang.getSelectedItem() + "',"
                        + "  '" + listKursi + "',"
                        + "  '" + total + "')";

                stt.executeUpdate(SQL);
                data[0] = transaksi;
                data[1] = txt_nama_pembeli.getText();
                data[2] = jb_judul_movie.getSelectedItem().toString();
                data[3] = jb_studio.getSelectedItem().toString();
                data[4] = jb_waktu_tayang.getSelectedItem().toString();
                data[5] = listKursi.toString();
                data[6] = String.valueOf(total);
                tableHistory.insertRow(0, data);
                stt.close();
                conn.close();
                JOptionPane.showMessageDialog(context, "Tiket Sudah Dibeli");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(context,
                        e.getMessage(),
                        "Error",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
        listKursi.clear();
        getList.clear();
       
    }

    int row = 0;

    public void tampil_ubah(JTable table_history, JTextField txt_nama_pembeli, JComboBox jb_judul_movie, JComboBox jb_waktu_tayang, JComboBox jb_studio, JPanel MenuNama, JPanel MainPanel, JPanel judulbuy, JPanel Ticket) {
        MainPanel.removeAll();
        MainPanel.repaint();
        MainPanel.revalidate();

        MainPanel.add(Ticket);
        MainPanel.repaint();
        MainPanel.revalidate();

        MenuNama.removeAll();
        MenuNama.repaint();
        MenuNama.revalidate();

        MenuNama.add(judulbuy);
        MenuNama.repaint();
        MenuNama.revalidate();

        row = table_history.getSelectedRow();
        txt_nama_pembeli.setText(tableHistory.getValueAt(row, 1).toString());
        jb_judul_movie.setSelectedItem(tableHistory.getValueAt(row, 2).toString());
        jb_studio.setSelectedItem(tableHistory.getValueAt(row, 3).toString());
        jb_waktu_tayang.setSelectedItem(tableHistory.getValueAt(row, 4).toString());
   

        // String To Array Dari Database 
        String elementsString = tableHistory.getValueAt(row, 5).toString().substring(1, tableHistory.getValueAt(row, 5).toString().length() - 1);
        String[] elementsArray = elementsString.split(", ");
        arrayListTampil = new ArrayList<>(Arrays.asList(elementsArray));

        // Pengecekan Satu Persatu apabila kursi sudah di beli maka akan di tampilkan ketika menu ubah
        if (arrayListTampil.contains("A1")) {
            MainMovie.A1_Up = true;
        } else {
            MainMovie.A1_Up = false;
        }

        if (arrayListTampil.contains("A2")) {
            MainMovie.A2_Up = true;
        } else {
            MainMovie.A2_Up = false;
        }

        if (arrayListTampil.contains("A3")) {
            MainMovie.A3_Up = true;
        } else {
            MainMovie.A3_Up = false;
        }

        if (arrayListTampil.contains("A4")) {
            MainMovie.A4_Up = true;
        } else {
            MainMovie.A4_Up = false;
        }

    }

    public void buy_update(Component context, JTextField txt_nama_pembeli, JComboBox jb_judul_movie, JComboBox jb_waktu_tayang, JComboBox jb_studio) {
        String data[] = new String[7];

        // Get Data Judul Movie & Batas Umur Movie
        List<String> listJudul = new ArrayList<>();
        List<String> listBatasUmur = new ArrayList<>();
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(
                    database,
                    user,
                    pass);
            Statement stt = conn.createStatement();
            String SQL = "SELECT judul_movie, batas_umur FROM movie_list ";
            ResultSet res = stt.executeQuery(SQL);
            while (res.next()) {
                listJudul.add(res.getString(1));
                listBatasUmur.add(res.getString(2));
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

        // Cek Umur Antara User Dan Batas Umur Film
        for (int i = 0; i < listJudul.size(); i++) {
            if (listJudul.get(i).equals(jb_judul_movie.getSelectedItem().toString())) {
                if (!(Integer.parseInt(get_umur_to_HP) >= Integer.parseInt(listBatasUmur.get(i)))) {
                    cek_umur = true;
                    break;
                } else {
                    cek_umur = false;
                    tiketP++;
                    break;
                }
            }
        }

        // Get Data Judul, studio, Waktu, & Kursi
        List<String> listMovie = new ArrayList<>();
        List<String> listStudio = new ArrayList<>();
        List<String> listWaktu = new ArrayList<>();
        List<String> listKursiDibeli = new ArrayList<>();
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(
                    database,
                    user,
                    pass);
            Statement stt = conn.createStatement();
            String SQL = "SELECT judul_movie, studio, waktu_tayang, kursi FROM history_pembelian";
            ResultSet res = stt.executeQuery(SQL);
            while (res.next()) {
                listMovie.add(res.getString(1));
                listStudio.add(res.getString(2));
                listWaktu.add(res.getString(3));
                listKursiDibeli.add(res.getString(4));
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

        // pengecekan kursi apabila sudah dipilih
        if (cek_kursi == true) {
            // Cek Judul & Waktu Tayang Movie Dengan Data Kursi
            for (int i = 0; i < listMovie.size(); i++) {
                if (listMovie.get(i).equals(jb_judul_movie.getSelectedItem())) {
                    if (listWaktu.get(i).equals(jb_waktu_tayang.getSelectedItem())) {
                        if (listStudio.get(i).equals(jb_studio.getSelectedItem())) {

                            // String To Array Dari Database 
                            String elementsString = listKursiDibeli.get(i).substring(1, listKursiDibeli.get(i).length() - 1);
                            String[] elementsArray = elementsString.split(", ");
                            arrayList = new ArrayList<>(Arrays.asList(elementsArray));
                            getList.addAll(arrayList);

                        }
                    }
                }
            }

            // Add Kursi Yang Dibeli Dari Database yang sudah konversi To ArrayList, lalu dikirim ke getList. Setelah itu getList akan disortir apabila ada yang sama maka akan
            // dihapus dan dimasukan ke listCekKursiDibeli.
            HashSet<String> uniqueSet = new HashSet<>();
            List<String> listWithoutDuplicates = new ArrayList<>();
            for (String num : getList) {
                if (!uniqueSet.contains(num)) {
                    uniqueSet.add(num);
                    listWithoutDuplicates.add(num);
                }
            }

            if (listWithoutDuplicates.isEmpty()) {
                cek_kursiDibeli = false;
            } else if (listKursi.isEmpty()) {
                cek_kursiDibeli = false;
            } else {
                for (int x = 0; x < listWithoutDuplicates.size(); x++) {

                    // Masih Revisi Error Ketika Salah satu index berbeda
                    if (listWithoutDuplicates.contains(listKursi.get(x))) {
                        cek_kursiDibeli = true;
                        break;
                    } else {
                        cek_kursiDibeli = false;
                        break;
                    }
                }
            }
        }

        if (txt_nama_pembeli.getText().isEmpty()) {
            JOptionPane.showMessageDialog(context, "Data Tidak Boleh Kosong, Silahkan Dilengkapi");
        } else if (cek_umur) {
            JOptionPane.showMessageDialog(context, "Silahkan Pilih Movie Lain, Umur Anda Tidak Cukup");
        } 
        
        else if (cek_kursi == false) {
            JOptionPane.showMessageDialog(context, "Silakan Pilih Nomor Kursi");
        } else if (cek_kursiDibeli == true) {
            JOptionPane.showMessageDialog(context, "Mohon Maaf Kursi Sudah diBeli");
        } else {

            String id = user_UUID;
            String nama = txt_nama_pembeli.getText();
            String judul = jb_judul_movie.getSelectedItem().toString();
            String studio = jb_studio.getSelectedItem().toString();
            String waktu = jb_waktu_tayang.getSelectedItem().toString();

            // Jumlah Total dari pembelian kursi
            int total = listKursi.size() * 45000;

            try {
                Class.forName(driver);
                Connection conn = DriverManager.getConnection(
                        database,
                        user,
                        pass);
                Statement stt = conn.createStatement();
                String SQL = "UPDATE history_pembelian "
                        + "SET user_id='" + id + "',"
                        + "nama_pembeli='" + nama + "',"
                        + "judul_movie='" + judul + "',"
                        + "studio='" + studio + "',"
                        + "waktu_tayang='" + waktu + "',"
                        + "kursi='" + listKursi + "',"
                        + "total_harga='" + total + "'"
                        + "WHERE "
                        + "transaksi_id='" + tableHistory.getValueAt(row, 0).toString() + "';";

                stt.executeUpdate(SQL);
                data[0] = transaksi;
                data[1] = nama;
                data[2] = judul;
                data[3] = studio;
                data[4] = waktu;
                data[5] = listKursi.toString();
                data[6] = String.valueOf(total);
                tableHistory.removeRow(row);
                tableHistory.insertRow(row, data);
                stt.close();
                conn.close();
                JOptionPane.showMessageDialog(context, "Tiket Sudah Di Edit");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(context,
                        e.getMessage(),
                        "Error",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
        listKursi.clear();
        getList.clear();
    }

    public void hapus(Component context) {
        String transaksiHapus = tableHistory.getValueAt(row, 0).toString();
        
        // Delete history pembelian dengan kata kunci user_id
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(database, user, pass);
            Statement stt = conn.createStatement();
            String SQL = "DELETE FROM history_pembelian "
                    + "WHERE "
                    + "transaksi_id='" + transaksiHapus + "'";
            stt.executeUpdate(SQL);
            tableHistory.removeRow(row);
            stt.close();
            conn.close();
             JOptionPane.showMessageDialog(context, "Tiket Sudah Di Hapus");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void cari(JTextField txt_nama_pembeli) {
        String dataCari[] = new String[7];
        tableHistory.setRowCount(0);
        String namaPembeli = txt_nama_pembeli.getText();
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(
                    database,
                    user,
                    pass);
            Statement stt = conn.createStatement();
            String SQL = "SELECT * FROM history_pembelian WHERE nama_pembeli='" + namaPembeli + "';";
            ResultSet res = stt.executeQuery(SQL);
            while (res.next()) {
                dataCari[0] = res.getString(1);
                dataCari[1] = res.getString(3);
                dataCari[2] = res.getString(4);
                dataCari[3] = res.getString(5);
                dataCari[4] = res.getString(6);
                dataCari[5] = res.getString(7);
                dataCari[6] = res.getString(8);
                tableHistory.addRow(dataCari);
            }
            res.close();
            stt.close();
            conn.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null,
                    e.getMessage(),
                    "Error",
                    JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }

}
