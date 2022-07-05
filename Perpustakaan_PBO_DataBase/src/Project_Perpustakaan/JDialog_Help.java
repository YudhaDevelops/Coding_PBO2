package Project_Perpustakaan;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class JDialog_Help extends javax.swing.JDialog {
    DataPenyimpanan data;
    
    
    public JDialog_Help(java.awt.Frame parent, boolean modal, DataPenyimpanan data) {
        super(parent, modal);
        initComponents();
        this.data = data;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        dtTambah_Otomatis = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("DIALOG HELP");

        jButton2.setText("Hapus Semua Data Peminjam");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Hapus Semua Data Koleksi");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        dtTambah_Otomatis.setText("Tambah Data  Otomatis Peminjam");
        dtTambah_Otomatis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtTambah_OtomatisActionPerformed(evt);
            }
        });

        jButton1.setText("Tambah Data Otomatis Koleksi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dtTambah_Otomatis, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dtTambah_Otomatis)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        setSize(new java.awt.Dimension(563, 378));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dtTambah_OtomatisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtTambah_OtomatisActionPerformed
        Peminjam dataPeminjam;
        //String idPeminjam, String nomorIdentitas, String nama, String alamat, int maksPinjam
        dataPeminjam = new Dosen("D123", "19820325007", "Sujadmiko Raharjo", "Jl. Kembang Arum no.123 Condongcatur", 5);
        data.dbPerpus.insertDosen("D123", "19820325007", "Sujadmiko Raharjo", "Jl. Kembang Arum no.123 Condongcatur", 5);
        this.data.isiDataPeminjam(dataPeminjam);
        
        dataPeminjam = new Dosen("D124", "19800305012", "Bagong Ahmadi", "Jl. Proklamasi no.13 Caturtunggal", 5);
        this.data.dbPerpus.insertDosen("D124", "19800305012", "Bagong Ahmadi", "Jl. Proklamasi no.13 Caturtunggal", 5);
        this.data.isiDataPeminjam(dataPeminjam);
        
        dataPeminjam = new Dosen("D125", "19781225001", "Yohanes Supangat", "Jl. Ayam Jantan no.23X Maguwo Hardjo", 5);
        this.data.dbPerpus.insertDosen("D125", "19781225001", "Yohanes Supangat", "Jl. Ayam Jantan no.23X Maguwo Hardjo", 5);
        this.data.isiDataPeminjam(dataPeminjam);
        
        dataPeminjam = new Dosen("D126", "19730321006", "Alberta Sri Sumini", "Jl. Segi Tiga no.M88 Pakem", 5);
        this.data.dbPerpus.insertDosen("D126", "19730321006", "Alberta Sri Sumini", "Jl. Segi Tiga no.M88 Pakem", 5);
        this.data.isiDataPeminjam(dataPeminjam);
        
        dataPeminjam = new Dosen("D127", "19990909009", "John Sabar Menanti", "Gg. Kapuas no.L12 Mancasan Kidul", 5);
        this.data.dbPerpus.insertDosen("D127", "19990909009", "John Sabar Menanti", "Gg. Kapuas no.L12 Mancasan Kidul", 5);
        this.data.isiDataPeminjam(dataPeminjam);
        
        dataPeminjam = new Dosen("D128", "19880818018", "Ayu Setianing Sekar", "Jl. Achmad Yani no.55 Blok I Komplek Kembang Jaya", 6);
        this.data.dbPerpus.insertDosen("D128", "19880818018", "Ayu Setianing Sekar", "Jl. Achmad Yani no.55 Blok I Komplek Kembang Jaya", 6);
        this.data.isiDataPeminjam(dataPeminjam);
        
        dataPeminjam = new Dosen("D129", "19850520003", "Citra Jesica Indah", "Jl. Pinus 5 no. 2 Cassa Grande", 5);
        this.data.dbPerpus.insertDosen("D129", "19850520003", "Citra Jesica Indah", "Jl. Pinus 5 no. 2 Cassa Grande", 5);
        this.data.isiDataPeminjam(dataPeminjam);
        
        dataPeminjam = new Mahasiswa("M2015", "205314077", "Rafael Mahesa Putra", "Jl. Sawo Matang no.133 Condongcatur", 3);
        this.data.dbPerpus.insertMahasiswa("M2015", "205314077", "Rafael Mahesa Putra", "Jl. Sawo Matang no.133 Condongcatur", 3);
        this.data.isiDataPeminjam(dataPeminjam);
        
        dataPeminjam = new Mahasiswa("M2016", "205314079", "Justino Ardian Suban Baolangu", "Gg. Kosan Indah Paingan Maguwoharjo", 3);
        this.data.dbPerpus.insertMahasiswa("M2016", "205314079", "Justino Ardian Suban Baolangu", "Gg. Kosan Indah Paingan Maguwoharjo", 3);
        this.data.isiDataPeminjam(dataPeminjam);
        
        dataPeminjam = new Mahasiswa("M2017", "205314096", "Gabriel Advent Batan", "Gg. Programming no.1010 Desa Java", 3);
        this.data.dbPerpus.insertMahasiswa("M2017", "205314096", "Gabriel Advent Batan", "Gg. Programming no.1010 Desa Java", 3);
        this.data.isiDataPeminjam(dataPeminjam);
        
        dataPeminjam = new Mahasiswa("M2018", "205314104", "Mario Richard Paulo Yamlean", "Jl. Apache Netbeans  no.12B Oracle Black Street 5th", 3);
        this.data.dbPerpus.insertMahasiswa("M2018", "205314104", "Mario Richard Paulo Yamlean", "Jl. Apache Netbeans  no.12B Oracle Black Street 5th", 3);
        this.data.isiDataPeminjam(dataPeminjam);
        
        dataPeminjam = new Mahasiswa("M2019", "205314099", "Katrina Yuliana Kartika", "Gg. Inheritance no.77 Desa Object Oriented II", 4);
        this.data.dbPerpus.insertMahasiswa("M2019", "205314099", "Katrina Yuliana Kartika", "Gg. Inheritance no.77 Desa Object Oriented II", 4);
        this.data.isiDataPeminjam(dataPeminjam);
        
        dataPeminjam = new Mahasiswa("M2020", "205314075", "Marcelia Putri Supriosa", "Jl. Graphical User Interface no.1 Kampung Java Component 2th", 3);
        this.data.dbPerpus.insertMahasiswa("M2020", "205314075", "Marcelia Putri Supriosa", "Jl. Graphical User Interface no.1 Kampung Java Component 2th", 3);
        this.data.isiDataPeminjam(dataPeminjam);
        
        dataPeminjam = new Mahasiswa("M2021", "195314058", "Bernadetha Mega Devina Ayuningtyas", "Gg. Exception Personal no.2X Wall of Error II ", 4);
        this.data.dbPerpus.insertMahasiswa("M2021", "195314058", "Bernadetha Mega Devina Ayuningtyas", "Gg. Exception Personal no.2X Wall of Error II ", 4);
        this.data.isiDataPeminjam(dataPeminjam);
        
        dataPeminjam = new Umum("U8810", "3404070802756001", "Chelsea Olivia", "Gg. Anak Jalanan no.2X The World of the Married", 4);
        this.data.dbPerpus.insertUmum("U8810", "3404070802756001", "Chelsea Olivia", "Gg. Anak Jalanan no.2X The World of the Married", 4);
        this.data.isiDataPeminjam(dataPeminjam);
        
        dataPeminjam = new Umum("U8811", "3404080702156006", "Raffi Ahmad", "Jl. Ikatan Cinta no.8 SKY Castle 2th", 4);
        this.data.dbPerpus.insertUmum("U8811", "3404080702156006", "Raffi Ahmad", "Jl. Ikatan Cinta no.8 SKY Castle 2th", 4);
        this.data.isiDataPeminjam(dataPeminjam);
        
        dataPeminjam = new Umum("U8812", "3404070305875004", "Kevin Julio", "Gg. Ganteng ganteng Srigala no.11 Crash Landing on You ", 4);
        this.data.dbPerpus.insertUmum("U8812", "3404070305875004", "Kevin Julio", "Gg. Ganteng ganteng Srigala no.11 Crash Landing on You ", 4);
        this.data.isiDataPeminjam(dataPeminjam);
        
        dataPeminjam = new Umum("U8813", "5404080804758009", "Ayu Ting Ting", "Jl. Cinta Fitri no.8A The World of the Married", 4);
        this.data.dbPerpus.insertUmum("U8813", "5404080804758009", "Ayu Ting Ting", "Jl. Cinta Fitri no.8A The World of the Married", 4);
        this.data.isiDataPeminjam(dataPeminjam);
        
        dataPeminjam = new Umum("U8814", "4404080602776003", "Prilly Latuconsina", "Gg. Intan no.25 Squid Gam", 4);
        this.data.dbPerpus.insertUmum("U8814", "4404080602776003", "Prilly Latuconsina", "Gg. Intan no.25 Squid Gam", 4);
        this.data.isiDataPeminjam(dataPeminjam);
        
        dataPeminjam = new Umum("U8815", "3404071205756012", "Via Valen", "Gg. Putri Yang Ditukar no.9 Dali and Cocky Prince", 4);
        this.data.dbPerpus.insertUmum("U8815", "3404071205756012", "Via Valen", "Gg. Putri Yang Ditukar no.9 Dali and Cocky Prince", 4);
        this.data.isiDataPeminjam(dataPeminjam);
        
        dataPeminjam = new Umum("U8816", "3404071112957021", "Gisella Anastasia", "Gg. Preman Pensiun no.99 The Good Detective", 4);
        this.data.dbPerpus.insertUmum("U8816", "3404071112957021", "Gisella Anastasia", "Gg. Preman Pensiun no.99 The Good Detective", 4);
        this.data.isiDataPeminjam(dataPeminjam);
        
        JOptionPane.showMessageDialog(this, "Semua Data Peminjam Telah Di Tambahkan", "Info",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_dtTambah_OtomatisActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Koleksi dataKoleksi;
        //String id_koleksi, String judul, String penerbit, String tahunTerbit, boolean status_pinjam,String format, String ISBN
        dataKoleksi = new Disk("D12345", "Legendary Toefl Test Of English", "Sealova Media","1234", Boolean.TRUE, "MP4", "9799483530");
        this.data.dbPerpus.insertDisk("D12345","Legendary Toefl Test Of English", "Sealova Media", "1234", 0, "MP4","9799483530");
//String id_koleksi, String judul, String penerbit, String tahunTerbit, boolean status_pinjam, String format, String ISBN
        this.data.isiDataKoleksi(dataKoleksi);
        
        dataKoleksi = new Disk("D12346", "Getting To Yes", "Gramedia Pustaka Utama","1235", Boolean.TRUE,"Disk", "9789792271973");
        this.data.dbPerpus.insertDisk("D12346","Getting To Yes","Gramedia Pustaka Utama","1235",0,"DVD","9789792271973");
        this.data.isiDataKoleksi(dataKoleksi);
        
        dataKoleksi = new Disk("D12347", "Cumsumer Behavior Hoyer Macinnis", "Mc GrawHill","1239", Boolean.TRUE, "MP4", "9780324834277");
        this.data.dbPerpus.insertDisk("D12347","Cumsumer Behavior Hoyer Macinnis","Mc GrawHill","1239",0,"MP4","9780324834277");
        this.data.isiDataKoleksi(dataKoleksi);
        
        dataKoleksi = new Disk("D12348", "Men Are from Mars Women Are from Venus", "Andi Offset","1353", Boolean.FALSE,"MP3", "9786020375212");
        this.data.dbPerpus.insertDisk("D12348","Men Are from Mars Women Are from Venus","Andi Offset","1353",0,"MP3","9786020375212");
        this.data.isiDataKoleksi(dataKoleksi);
        
        dataKoleksi = new Disk("D12349", "The Ancient Chinese Wisdom Sc", "Tiga Serangkai","1234", Boolean.TRUE, "MP4", "9789792291827");
        this.data.dbPerpus.insertDisk("D12349","The Ancient Chinese Wisdom Sc","Tiga Serangkai","1234",0,"MP4","9789792291827");
        this.data.isiDataKoleksi(dataKoleksi);
        
        dataKoleksi = new Disk("D12350", "The Art of War ", "Pustaka Karya","1234", Boolean.TRUE, "MP4", "9786020333465");
        this.data.dbPerpus.insertDisk("D12350","The Art of War ","Pustaka Karya","1234",0,"MP4","9786020333465");
        this.data.isiDataKoleksi(dataKoleksi);
        
        dataKoleksi = new Disk("D12351", "X-Men Mutant Genesis 2.0 HC", "Wiley Press","1234", Boolean.TRUE, "CDAUDIO", "9780785163589");
        this.data.dbPerpus.insertDisk("D12351","X-Men Mutant Genesis 2.0 HC","Wiley Press","1234",1,"CDAUDIO","9780785163589");
        this.data.isiDataKoleksi(dataKoleksi);
        
        //String id_koleksi, String judul, String penerbit, String tahunTerbit, boolean status_pinjam,int halaman, String ISBN
        dataKoleksi = new Buku("B56789","Algoritma dan Pemrograman", "Informatika","1234",Boolean.TRUE,770,"6021514917");
//        String id_koleksi, String judul, String penerbit, String tahunTerbit, boolean status_pinjam, int halaman, String ISBN
        this.data.dbPerpus.insertBuku("B56789","Algoritma dan Pemrograman", "Informatika","1234",0,770,"6021514917");
        this.data.isiDataKoleksi(dataKoleksi);
        
        dataKoleksi = new Buku("B56790","Pemrograman C dan C plus plus", "Informatika","1234",Boolean.TRUE,290,"8221514787");
        this.data.dbPerpus.insertBuku("B56790","Pemrograman C dan C plus plus", "Informatika","1234",1,290,"8221514787");
        this.data.isiDataKoleksi(dataKoleksi);
        
        dataKoleksi = new Buku("B56791","Algoritma dan Pemrograman", "Informatika","1234",Boolean.TRUE,770,"6021514917");
        this.data.dbPerpus.insertBuku("B56791","Algoritma dan Pemrograman", "Informatika","1234",1,770,"6021514917");
        this.data.isiDataKoleksi(dataKoleksi);
        
        dataKoleksi = new Buku("B56792","Pemrograman Berbasis Mobile Menggunakan Android Studio", "Deepublish","1234",Boolean.FALSE,550,"9786024016272");
        this.data.dbPerpus.insertBuku("B56792","Pemrograman Berbasis Mobile Menggunakan Android Studio", "Deepublish","1234",0,550,"9786024016272");
        this.data.isiDataKoleksi(dataKoleksi);
        
        dataKoleksi = new Buku("B56793","Konsep dan Implementasi Pemrograman Laravel 7", "Lokomedia","1234",Boolean.TRUE,665,"9860240124917");
        this.data.dbPerpus.insertBuku("B56793","Konsep dan Implementasi Pemrograman Laravel 7", "Lokomedia","1234",1,665,"9860240124917");
        this.data.isiDataKoleksi(dataKoleksi);
        
        dataKoleksi = new Buku("B56794","Pemrograman Mikrokontroler AVR Bahasa Assemby dan C", "Media Online","1234",Boolean.TRUE,780,"235648514917");
        this.data.dbPerpus.insertBuku("B56794","Pemrograman Mikrokontroler AVR Bahasa Assemby dan C", "Media Online","1234",1,780,"235648514917");
        this.data.isiDataKoleksi(dataKoleksi);
        
        dataKoleksi = new Buku("B56795","Esensi Bahasa Pemrograman Java", "Kodebuku","1234",Boolean.FALSE,770,"68948775215");
        this.data.dbPerpus.insertBuku("B56795","Esensi Bahasa Pemrograman Java", "Kodebuku","1234",0,770,"68948775215");
        this.data.isiDataKoleksi(dataKoleksi);
        
        //String id_koleksi, String judul, String penerbit, String tahunTerbit, int status_pinjam, int volume, int seri, String ISSN
        dataKoleksi = new Majalah("M695847", "Infokomputer", "Infomedia", "1234",Boolean.FALSE, 12, 2,"21253658984");
        this.data.dbPerpus.insertMajalah("M695847","Infokomputer","Infomedia","1234",0,12,2,"21253658984");
        this.data.isiDataKoleksi(dataKoleksi);
        
        dataKoleksi = new Majalah("M695848", "Tempo", "Tempo Press", "1234",Boolean.FALSE, 12, 2, "212536845758");
        this.data.dbPerpus.insertMajalah("M695848","Tempo","Tempo Press","1234",0,12,2,"212536845758");
        this.data.isiDataKoleksi(dataKoleksi);
        
        dataKoleksi = new Majalah("M695849", "Trubus", "Gramedia Print", "1234",Boolean.FALSE, 12, 2, "54255788548");
        this.data.dbPerpus.insertMajalah("M695849","Trubus","Gramedia Print","1234",0,12,2,"54255788548");
        this.data.isiDataKoleksi(dataKoleksi);
        
        dataKoleksi = new Majalah("M695850", "Art Projects", "Artis Press", "1234",Boolean.TRUE, 12, 2, "62548799521");
        this.data.dbPerpus.insertMajalah("M695850","Art Projects","Artis Press","1234",1,12,2,"62548799521");
        this.data.isiDataKoleksi(dataKoleksi);
        
        dataKoleksi = new Majalah("M695851", "Elektron", "Elek Media", "1234",Boolean.FALSE, 12, 2, "356548745522");
        this.data.dbPerpus.insertMajalah("M695851","Elektron","Elek Media","1234",0,12,2,"356548745522");
        this.data.isiDataKoleksi(dataKoleksi);
        
        dataKoleksi = new Majalah("M695852", "PCPlus", "Media Indonesia", "1234",Boolean.TRUE, 12, 2, "45488784512");
        this.data.dbPerpus.insertMajalah("M695852","PCPlus","Media Indonesia","1234",0,12,2,"45488784512");
        this.data.isiDataKoleksi(dataKoleksi);
        
        dataKoleksi = new Majalah("M695853", "CHIP", "Softart Inc", "1234",Boolean.FALSE, 12, 2, "98765215487");
        this.data.dbPerpus.insertMajalah("M695853","CHIP","Softart Inc","1234",0,12,2,"98765215487");
        this.data.isiDataKoleksi(dataKoleksi);
        
        JOptionPane.showMessageDialog(this, "Semua Data Koleksi Telah Di Tambahkan", "Info",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

    
//    String id_koleksi, String judul, String penerbit, String tahunTerbit, boolean status_pinjam,String tipeKoleksi, String ISBN ,String format 
//    String id_koleksi, String judul, String penerbit, String tahunTerbit, boolean status_pinjam,String tipeKoleksi, String ISSN ,int    volume, int seri
//    String id_koleksi, String judul, String penerbit, String tahunTerbit, boolean status_pinjam,String tipeKoleksi, String ISBN ,int    halaman
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.data.hapusDataPeminjam_semua();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.data.hapusDataKoleksi_semua();
    }//GEN-LAST:event_jButton3ActionPerformed

    
    
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDialog_Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog_Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog_Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog_Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dtTambah_Otomatis;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
