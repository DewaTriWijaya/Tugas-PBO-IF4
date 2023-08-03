/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import SistemKerja.LoadJBCombo;
import SistemKerja.Pembelian;
import SistemKerja.MovieList;
import SistemKerja.StudioList;
import SistemKerja.UserVerification;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainMovie extends javax.swing.JFrame {

    public static boolean from;
    Pembelian pembelian_ = new Pembelian();
    LoadJBCombo loadJB_ = new LoadJBCombo();

    MovieList movieList_ = new MovieList();
    StudioList studioList_ = new StudioList();

    // Cek kursi UI Update
    public static boolean A1_Up, A2_Up, A3_Up, A4_Up;

    /**
     * Creates new form MainMovie
     */
    public MainMovie() {
        initComponents();

        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);

        // Get Table History
        table_history.setModel(pembelian_.tableHistory);
        pembelian_.setTableLoadHistory();

        // Get Data Waktu Tayang & Judul Movie
        loadJB_.loadJBMovie(jb_judul_movie);
        loadJB_.loadJBWaktuTayang(jb_waktu_tayang);
        loadJB_.loadJBStudio(jb_studio);

        // Get Data Movie List Rating > 7 
        movieList_.movieList(judul1, rating1, bu1, 0);
        movieList_.movieList(judul2, rating2, bu2, 1);
        movieList_.movieList(judul3, rating3, bu3, 2);
        movieList_.movieList(judul4, rating4, bu4, 3);

        // Get Data Studio List Rating > 7
        studioList_.studioList(mall1, alamat1, ratingMall1, 0);
        studioList_.studioList(mall2, alamat2, ratingMall2, 1);
        studioList_.studioList(mall3, alamat3, ratingMall3, 2);
        studioList_.studioList(mall4, alamat4, ratingMall4, 3);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelUtama = new javax.swing.JPanel();
        login = new javax.swing.JPanel();
        icon_login = new javax.swing.JLabel();
        panel_login = new javax.swing.JPanel();
        txt_login_email = new javax.swing.JTextField();
        txt_login_password = new javax.swing.JPasswordField();
        title_login = new javax.swing.JLabel();
        pass_login = new javax.swing.JLabel();
        user_login = new javax.swing.JLabel();
        btn_login_register = new javax.swing.JButton();
        btn_login = new javax.swing.JButton();
        register = new javax.swing.JPanel();
        icon_register = new javax.swing.JLabel();
        panel_register = new javax.swing.JPanel();
        txt_register_email = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        umr = new javax.swing.JLabel();
        btn_register = new javax.swing.JButton();
        umr1 = new javax.swing.JLabel();
        umr2 = new javax.swing.JLabel();
        txt_register_password = new javax.swing.JPasswordField();
        get_umur = new com.toedter.calendar.JDateChooser();
        menuPanel = new javax.swing.JPanel();
        MenuLogo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        MenuPanel = new javax.swing.JPanel();
        btn_list = new javax.swing.JButton();
        btn_studio = new javax.swing.JButton();
        btn_buy = new javax.swing.JButton();
        btn_history = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        MenuNama = new javax.swing.JPanel();
        judulmovielist = new javax.swing.JPanel();
        mv = new javax.swing.JLabel();
        judulstudio = new javax.swing.JPanel();
        sc = new javax.swing.JLabel();
        judulbuy = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        judulhistory = new javax.swing.JPanel();
        ht = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        MovieList = new javax.swing.JPanel();
        judul1 = new javax.swing.JLabel();
        rating1 = new javax.swing.JLabel();
        bu1 = new javax.swing.JLabel();
        judul2 = new javax.swing.JLabel();
        rating2 = new javax.swing.JLabel();
        bu2 = new javax.swing.JLabel();
        judul3 = new javax.swing.JLabel();
        rating3 = new javax.swing.JLabel();
        bu3 = new javax.swing.JLabel();
        judul4 = new javax.swing.JLabel();
        rating4 = new javax.swing.JLabel();
        bu4 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        studio = new javax.swing.JPanel();
        mall1 = new javax.swing.JLabel();
        alamat1 = new javax.swing.JLabel();
        ratingMall1 = new javax.swing.JLabel();
        mall2 = new javax.swing.JLabel();
        alamat2 = new javax.swing.JLabel();
        ratingMall2 = new javax.swing.JLabel();
        mall3 = new javax.swing.JLabel();
        alamat3 = new javax.swing.JLabel();
        ratingMall3 = new javax.swing.JLabel();
        mall4 = new javax.swing.JLabel();
        alamat4 = new javax.swing.JLabel();
        ratingMall4 = new javax.swing.JLabel();
        bgstudio = new javax.swing.JLabel();
        Ticket = new javax.swing.JPanel();
        namapembeli = new javax.swing.JLabel();
        txt_nama_pembeli = new javax.swing.JTextField();
        judulmovie = new javax.swing.JLabel();
        jb_judul_movie = new javax.swing.JComboBox<>();
        waktutayang = new javax.swing.JLabel();
        jb_waktu_tayang = new javax.swing.JComboBox<>();
        jb_studio = new javax.swing.JComboBox<>();
        studioLabel = new javax.swing.JLabel();
        kursi = new javax.swing.JLabel();
        A1 = new javax.swing.JRadioButton();
        A2 = new javax.swing.JRadioButton();
        A3 = new javax.swing.JRadioButton();
        A4 = new javax.swing.JRadioButton();
        btn_tambah = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        bgbuyticket = new javax.swing.JLabel();
        history = new javax.swing.JPanel();
        masukkannama = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        btn_cari = new javax.swing.JButton();
        table_historyPane = new javax.swing.JScrollPane();
        table_history = new javax.swing.JTable();
        tampil_data = new javax.swing.JButton();
        bgsearch = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelUtama.setBackground(new java.awt.Color(255, 255, 255));
        PanelUtama.setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setForeground(new java.awt.Color(102, 102, 102));

        icon_login.setBackground(new java.awt.Color(255, 255, 255));
        icon_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/bgiconlogin.jpg"))); // NOI18N

        title_login.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        title_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title_login.setText("Login");

        pass_login.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        pass_login.setText("Password");

        user_login.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        user_login.setText("Email");

        btn_login_register.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btn_login_register.setText("Register");
        btn_login_register.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_login_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_login_registerActionPerformed(evt);
            }
        });

        btn_login.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btn_login.setText("Login");
        btn_login.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_loginLayout = new javax.swing.GroupLayout(panel_login);
        panel_login.setLayout(panel_loginLayout);
        panel_loginLayout.setHorizontalGroup(
            panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_loginLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_login_email)
                    .addComponent(user_login)
                    .addComponent(pass_login)
                    .addGroup(panel_loginLayout.createSequentialGroup()
                        .addComponent(btn_login_register, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_login_password))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_loginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title_login, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        panel_loginLayout.setVerticalGroup(
            panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_loginLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(title_login, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(user_login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_login_email, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pass_login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_login_password, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_login_register, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(195, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(icon_login, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(panel_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icon_login, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(loginLayout.createSequentialGroup()
                .addComponent(panel_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PanelUtama.add(login, "card3");

        register.setBackground(new java.awt.Color(255, 255, 255));
        register.setForeground(new java.awt.Color(102, 102, 102));

        icon_register.setBackground(new java.awt.Color(255, 255, 255));
        icon_register.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/bgiconlogin.jpg"))); // NOI18N

        title.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Register");

        umr.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        umr.setText("Umur");

        btn_register.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btn_register.setText("Register");
        btn_register.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });

        umr1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        umr1.setText("Password");

        umr2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        umr2.setText("Email");

        get_umur.setToolTipText("0");

        javax.swing.GroupLayout panel_registerLayout = new javax.swing.GroupLayout(panel_register);
        panel_register.setLayout(panel_registerLayout);
        panel_registerLayout.setHorizontalGroup(
            panel_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_registerLayout.createSequentialGroup()
                .addGroup(panel_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_registerLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panel_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_register_email, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(umr)
                            .addComponent(umr1)
                            .addComponent(umr2)
                            .addComponent(txt_register_password, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(get_umur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panel_registerLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_registerLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btn_register, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        panel_registerLayout.setVerticalGroup(
            panel_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_registerLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(umr2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_register_email, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(umr1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_register_password, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(umr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(get_umur, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_register, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(register);
        register.setLayout(registerLayout);
        registerLayout.setHorizontalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_register, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        registerLayout.setVerticalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerLayout.createSequentialGroup()
                .addComponent(panel_register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(registerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelUtama.add(register, "card2");

        menuPanel.setBackground(new java.awt.Color(0, 0, 0));
        menuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuLogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/logo.JPG"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 200, 80));

        MenuLogo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 180));

        menuPanel.add(MenuLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 220, 180));

        MenuPanel.setBackground(new java.awt.Color(204, 204, 204));

        btn_list.setText("MOVIE LIST");
        btn_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listActionPerformed(evt);
            }
        });

        btn_studio.setText("STUDIO");
        btn_studio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_studioActionPerformed(evt);
            }
        });

        btn_buy.setText("BUY TICKET");
        btn_buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buyActionPerformed(evt);
            }
        });

        btn_history.setText("HISTORY");
        btn_history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_historyActionPerformed(evt);
            }
        });

        btn_logout.setText("LOG OUT");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_studio, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_history, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buy, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_list, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_list, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btn_studio, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_buy, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_history, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        menuPanel.add(MenuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 190, 220, 340));

        MenuNama.setBackground(new java.awt.Color(204, 204, 204));
        MenuNama.setLayout(new java.awt.CardLayout());

        judulmovielist.setBackground(new java.awt.Color(102, 102, 102));
        judulmovielist.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mv.setBackground(new java.awt.Color(255, 255, 255));
        mv.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        mv.setForeground(new java.awt.Color(255, 255, 255));
        mv.setText("MOVIE LIST");
        judulmovielist.add(mv, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 80, 40));

        MenuNama.add(judulmovielist, "card2");

        judulstudio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sc.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        sc.setText("STUDIO");
        judulstudio.add(sc, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        MenuNama.add(judulstudio, "card4");

        judulbuy.setBackground(new java.awt.Color(153, 153, 153));
        judulbuy.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BUY TICKET");
        judulbuy.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        MenuNama.add(judulbuy, "card5");

        judulhistory.setBackground(new java.awt.Color(204, 204, 204));
        judulhistory.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ht.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        ht.setText("HISTORY");
        judulhistory.add(ht, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        MenuNama.add(judulhistory, "card5");

        menuPanel.add(MenuNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 12, 602, 45));

        MainPanel.setBackground(new java.awt.Color(153, 153, 153));
        MainPanel.setPreferredSize(new java.awt.Dimension(519, 500));
        MainPanel.setLayout(new java.awt.CardLayout());

        MovieList.setBackground(new java.awt.Color(0, 0, 0));
        MovieList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judul1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        MovieList.add(judul1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 390, 30));

        rating1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        rating1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/star.png"))); // NOI18N
        MovieList.add(rating1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 50, 30));

        bu1.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        MovieList.add(bu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 70, 60));

        judul2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        MovieList.add(judul2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 390, 30));

        rating2.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        rating2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/star.png"))); // NOI18N
        MovieList.add(rating2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 50, 30));

        bu2.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        MovieList.add(bu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, 50));

        judul3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        MovieList.add(judul3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 410, 30));

        rating3.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        rating3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/star.png"))); // NOI18N
        MovieList.add(rating3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 50, 30));

        bu3.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        MovieList.add(bu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, -1, 50));

        judul4.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        MovieList.add(judul4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 410, 30));

        rating4.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        rating4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/star.png"))); // NOI18N
        MovieList.add(rating4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 50, 20));

        bu4.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        MovieList.add(bu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, -1, 50));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/bgmovie.jpg"))); // NOI18N
        bg.setText("sd");
        bg.setPreferredSize(new java.awt.Dimension(602, 544));
        MovieList.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 616, 470));

        MainPanel.add(MovieList, "card2");

        studio.setBackground(new java.awt.Color(0, 0, 0));
        studio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mall1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        studio.add(mall1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 380, 30));

        alamat1.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        studio.add(alamat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        ratingMall1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        ratingMall1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/star.png"))); // NOI18N
        studio.add(ratingMall1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 60, 20));

        mall2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        studio.add(mall2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 400, 30));

        alamat2.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        studio.add(alamat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 180, -1));

        ratingMall2.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        ratingMall2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/star.png"))); // NOI18N
        studio.add(ratingMall2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 60, 20));

        mall3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        studio.add(mall3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 380, 30));

        alamat3.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        studio.add(alamat3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        ratingMall3.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        ratingMall3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/star.png"))); // NOI18N
        studio.add(ratingMall3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 60, 20));

        mall4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        studio.add(mall4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 460, 30));

        alamat4.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        studio.add(alamat4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        ratingMall4.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        ratingMall4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/star.png"))); // NOI18N
        studio.add(ratingMall4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 60, 20));

        bgstudio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/bgstudio.jpg"))); // NOI18N
        bgstudio.setText("jLabel2");
        studio.add(bgstudio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        MainPanel.add(studio, "card5");

        Ticket.setBackground(new java.awt.Color(0, 0, 0));
        Ticket.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namapembeli.setBackground(new java.awt.Color(255, 255, 255));
        namapembeli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        namapembeli.setForeground(new java.awt.Color(255, 255, 255));
        namapembeli.setText("Masukkan Nama Anda :");
        Ticket.add(namapembeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        txt_nama_pembeli.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        Ticket.add(txt_nama_pembeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 220, 30));

        judulmovie.setBackground(new java.awt.Color(255, 255, 255));
        judulmovie.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        judulmovie.setForeground(new java.awt.Color(255, 255, 255));
        judulmovie.setText("Judul Movie                    :");
        Ticket.add(judulmovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 220, -1));

        Ticket.add(jb_judul_movie, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 220, 30));

        waktutayang.setBackground(new java.awt.Color(255, 255, 255));
        waktutayang.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        waktutayang.setForeground(new java.awt.Color(255, 255, 255));
        waktutayang.setText("Waktu Tayang               :");
        Ticket.add(waktutayang, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 220, -1));

        Ticket.add(jb_waktu_tayang, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 220, 30));

        Ticket.add(jb_studio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 220, 30));

        studioLabel.setBackground(new java.awt.Color(255, 255, 255));
        studioLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        studioLabel.setForeground(new java.awt.Color(255, 255, 255));
        studioLabel.setText("Studio                              :");
        Ticket.add(studioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 220, -1));

        kursi.setBackground(new java.awt.Color(255, 255, 255));
        kursi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kursi.setForeground(new java.awt.Color(255, 255, 255));
        kursi.setText("Kursi                                :");
        Ticket.add(kursi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 220, -1));

        A1.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        A1.setForeground(new java.awt.Color(255, 255, 255));
        A1.setText("A1");
        Ticket.add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 50, 30));

        A2.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        A2.setForeground(new java.awt.Color(255, 255, 255));
        A2.setText("A2");
        Ticket.add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 50, 30));

        A3.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        A3.setForeground(new java.awt.Color(255, 255, 255));
        A3.setText("A3");
        Ticket.add(A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 50, 30));

        A4.setBackground(new java.awt.Color(51, 51, 50));
        A4.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        A4.setForeground(new java.awt.Color(255, 255, 255));
        A4.setText("A4");
        Ticket.add(A4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 50, 30));

        btn_tambah.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btn_tambah.setText("TAMBAH");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });
        Ticket.add(btn_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 110, 40));

        btn_simpan.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btn_simpan.setText("SIMPAN");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        Ticket.add(btn_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 110, 40));

        btn_hapus.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btn_hapus.setText("HAPUS");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        Ticket.add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 110, 40));

        bgbuyticket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/bgbuyticket.jpg"))); // NOI18N
        Ticket.add(bgbuyticket, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 470));

        MainPanel.add(Ticket, "card3");

        history.setBackground(new java.awt.Color(0, 0, 0));
        history.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        masukkannama.setFont(new java.awt.Font("Yu Mincho Light", 1, 18)); // NOI18N
        masukkannama.setForeground(new java.awt.Color(255, 255, 255));
        masukkannama.setText("Masukan ID Transaksi");
        history.add(masukkannama, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        txt_search.setBackground(new java.awt.Color(32, 33, 35));
        txt_search.setForeground(new java.awt.Color(255, 255, 255));
        txt_search.setBorder(null);
        txt_search.setPreferredSize(new java.awt.Dimension(59, 30));
        txt_search.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txt_search.setSelectionColor(new java.awt.Color(0, 0, 0));
        history.add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 330, 23));

        btn_cari.setText("CARI");
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });
        history.add(btn_cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, 23));

        table_history.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_history.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_historyMouseClicked(evt);
            }
        });
        table_historyPane.setViewportView(table_history);

        history.add(table_historyPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 600, 190));

        tampil_data.setText("TAMPILKAN SELURUH DATA");
        tampil_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampil_dataActionPerformed(evt);
            }
        });
        history.add(tampil_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 190, 40));

        bgsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/bgsearch.jpg"))); // NOI18N
        history.add(bgsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        MainPanel.add(history, "card4");

        menuPanel.add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 63, 602, 471));

        PanelUtama.add(menuPanel, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 867, 583);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        UserVerification uv = new UserVerification();

        uv.userVerificationLogin(this, txt_login_email, txt_login_password, PanelUtama, MenuPanel);
        if (from == true) {
            PanelUtama.removeAll();
            PanelUtama.repaint();
            PanelUtama.revalidate();

            PanelUtama.add(menuPanel);
            PanelUtama.repaint();
            PanelUtama.revalidate();
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_login_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_login_registerActionPerformed
        // TODO add your handling code here:
        PanelUtama.removeAll();
        PanelUtama.repaint();
        PanelUtama.revalidate();

        PanelUtama.add(register);
        PanelUtama.repaint();
        PanelUtama.revalidate();
    }//GEN-LAST:event_btn_login_registerActionPerformed


    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        // TODO add your handling code here:
        UserVerification uv = new UserVerification();

        uv.userVerificationRegister(this, txt_register_email, txt_register_password, get_umur, PanelUtama, MenuPanel);
        if (from == true) {
            PanelUtama.removeAll();
            PanelUtama.repaint();
            PanelUtama.revalidate();

            PanelUtama.add(menuPanel);
            PanelUtama.repaint();
            PanelUtama.revalidate();
        }
    }//GEN-LAST:event_btn_registerActionPerformed


    private void btn_buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buyActionPerformed
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

        btn_tambah.setEnabled(true);
        btn_simpan.setEnabled(false);
        btn_hapus.setEnabled(false);
    }//GEN-LAST:event_btn_buyActionPerformed

    private void btn_historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_historyActionPerformed
        MainPanel.removeAll();
        MainPanel.repaint();
        MainPanel.revalidate();

        MainPanel.add(history);
        MainPanel.repaint();
        MainPanel.revalidate();

        MenuNama.removeAll();
        MenuNama.repaint();
        MenuNama.revalidate();

        MenuNama.add(judulhistory);
        MenuNama.repaint();
        MenuNama.revalidate();
    }//GEN-LAST:event_btn_historyActionPerformed

    private void btn_studioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_studioActionPerformed
        MainPanel.removeAll();
        MainPanel.repaint();
        MainPanel.revalidate();

        MainPanel.add(studio);
        MainPanel.repaint();
        MainPanel.revalidate();

        MenuNama.removeAll();
        MenuNama.repaint();
        MenuNama.revalidate();

        MenuNama.add(judulstudio);
        MenuNama.repaint();
        MenuNama.revalidate();
    }//GEN-LAST:event_btn_studioActionPerformed

    private void btn_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listActionPerformed
        MainPanel.removeAll();
        MainPanel.repaint();
        MainPanel.revalidate();

        MainPanel.add(MovieList);
        MainPanel.repaint();
        MainPanel.revalidate();

        MenuNama.removeAll();
        MenuNama.repaint();
        MenuNama.revalidate();

        MenuNama.add(judulmovielist);
        MenuNama.repaint();
        MenuNama.revalidate();
    }//GEN-LAST:event_btn_listActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        int DialogBtn = JOptionPane.YES_NO_OPTION;
        int DialogReault = JOptionPane.showConfirmDialog(this, "Anda Yakin Akan Kelur?", "PERINGATAN", DialogBtn);

        if (DialogReault == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_btn_logoutActionPerformed


    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        // TODO add your handling code here:

        if (A1.isSelected() || A2.isSelected() || A3.isSelected() || A4.isSelected()) {
            pembelian_.cek_kursi = true;
        } else {
            pembelian_.cek_kursi = false;
        }

        if (A1.isSelected()) {
            if (!pembelian_.listKursi.contains("A1")) {
                pembelian_.listKursi.add("A1");
            }
        }
        if (A2.isSelected()) {
            if (!pembelian_.listKursi.contains("A2")) {
                pembelian_.listKursi.add("A2");
            }
        }
        if (A3.isSelected()) {
            if (!pembelian_.listKursi.contains("A3")) {
                pembelian_.listKursi.add("A3");
            }
        }
        if (A4.isSelected()) {
            if (!pembelian_.listKursi.contains("A4")) {
                pembelian_.listKursi.add("A4");
            }
        }

        pembelian_.buy_ticket(this, txt_nama_pembeli, jb_judul_movie, jb_waktu_tayang, jb_studio);
    }//GEN-LAST:event_btn_tambahActionPerformed


    private void table_historyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_historyMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 1) {
            btn_tambah.setEnabled(false);
            btn_simpan.setEnabled(true);
            btn_hapus.setEnabled(true);
            pembelian_.tampil_ubah(table_history, txt_nama_pembeli, jb_judul_movie, jb_waktu_tayang, jb_studio, MenuNama, MainPanel, judulbuy, Ticket);
            A1.setSelected(A1_Up);
            A2.setSelected(A2_Up);
            A3.setSelected(A3_Up);
            A4.setSelected(A4_Up);

        }
    }//GEN-LAST:event_table_historyMouseClicked

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        if (A1.isSelected()) {
            pembelian_.cek_kursi = true;
            if (!pembelian_.listKursi.contains("A1")) {
                pembelian_.listKursi.add("A1");
            }
        }

        if (A2.isSelected()) {
            pembelian_.cek_kursi = true;
            if (!pembelian_.listKursi.contains("A2")) {
                pembelian_.listKursi.add("A2");
            }
        }

        if (A3.isSelected()) {
            pembelian_.cek_kursi = true;
            if (!pembelian_.listKursi.contains("A3")) {
                pembelian_.listKursi.add("A3");
            }
        }

        if (A4.isSelected()) {
            pembelian_.cek_kursi = true;
            if (!pembelian_.listKursi.contains("A4")) {
                pembelian_.listKursi.add("A4");
            }
        }

        pembelian_.buy_update(this, txt_nama_pembeli, jb_judul_movie, jb_waktu_tayang, jb_studio);

    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        pembelian_.hapus(this);
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void tampil_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampil_dataActionPerformed
        // TODO add your handling code here:
        pembelian_.tableHistory.setRowCount(0);
        pembelian_.setTableLoadHistory();
    }//GEN-LAST:event_tampil_dataActionPerformed

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        // TODO add your handling code here:
        pembelian_.cari(txt_search);
    }//GEN-LAST:event_btn_cariActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMovie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton A1;
    private javax.swing.JRadioButton A2;
    private javax.swing.JRadioButton A3;
    private javax.swing.JRadioButton A4;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel MenuLogo;
    private javax.swing.JPanel MenuNama;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JPanel MovieList;
    private javax.swing.JPanel PanelUtama;
    private javax.swing.JPanel Ticket;
    private javax.swing.JLabel alamat1;
    private javax.swing.JLabel alamat2;
    private javax.swing.JLabel alamat3;
    private javax.swing.JLabel alamat4;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel bgbuyticket;
    private javax.swing.JLabel bgsearch;
    private javax.swing.JLabel bgstudio;
    private javax.swing.JButton btn_buy;
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_history;
    private javax.swing.JButton btn_list;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_login_register;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_register;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_studio;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JLabel bu1;
    private javax.swing.JLabel bu2;
    private javax.swing.JLabel bu3;
    private javax.swing.JLabel bu4;
    private com.toedter.calendar.JDateChooser get_umur;
    private javax.swing.JPanel history;
    private javax.swing.JLabel ht;
    private javax.swing.JLabel icon_login;
    private javax.swing.JLabel icon_register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jb_judul_movie;
    private javax.swing.JComboBox<String> jb_studio;
    private javax.swing.JComboBox<String> jb_waktu_tayang;
    private javax.swing.JLabel judul1;
    private javax.swing.JLabel judul2;
    private javax.swing.JLabel judul3;
    private javax.swing.JLabel judul4;
    private javax.swing.JPanel judulbuy;
    private javax.swing.JPanel judulhistory;
    private javax.swing.JLabel judulmovie;
    private javax.swing.JPanel judulmovielist;
    private javax.swing.JPanel judulstudio;
    private javax.swing.JLabel kursi;
    private javax.swing.JPanel login;
    private javax.swing.JLabel mall1;
    private javax.swing.JLabel mall2;
    private javax.swing.JLabel mall3;
    private javax.swing.JLabel mall4;
    private javax.swing.JLabel masukkannama;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel mv;
    private javax.swing.JLabel namapembeli;
    private javax.swing.JPanel panel_login;
    private javax.swing.JPanel panel_register;
    private javax.swing.JLabel pass_login;
    private javax.swing.JLabel rating1;
    private javax.swing.JLabel rating2;
    private javax.swing.JLabel rating3;
    private javax.swing.JLabel rating4;
    private javax.swing.JLabel ratingMall1;
    private javax.swing.JLabel ratingMall2;
    private javax.swing.JLabel ratingMall3;
    private javax.swing.JLabel ratingMall4;
    private javax.swing.JPanel register;
    private javax.swing.JLabel sc;
    private javax.swing.JPanel studio;
    private javax.swing.JLabel studioLabel;
    public javax.swing.JTable table_history;
    private javax.swing.JScrollPane table_historyPane;
    private javax.swing.JButton tampil_data;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title_login;
    private javax.swing.JTextField txt_login_email;
    private javax.swing.JPasswordField txt_login_password;
    private javax.swing.JTextField txt_nama_pembeli;
    private javax.swing.JTextField txt_register_email;
    private javax.swing.JPasswordField txt_register_password;
    private javax.swing.JTextField txt_search;
    private javax.swing.JLabel umr;
    private javax.swing.JLabel umr1;
    private javax.swing.JLabel umr2;
    private javax.swing.JLabel user_login;
    private javax.swing.JLabel waktutayang;
    // End of variables declaration//GEN-END:variables
}
