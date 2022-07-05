package Project_Perpustakaan;

import javax.swing.JOptionPane;

public class JDialog_Help extends javax.swing.JDialog {
    DataPenyimpanan data;
    public JDialog_Help(java.awt.Frame parent, boolean modal, DataPenyimpanan data) {
        super(parent, modal);
        initComponents();
        this.data = data;
    }
//    public JDialog_Help(java.awt.Frame parent, boolean modal, DataPenyimpanan koleksi){
//        super(parent, modal);
//        initComponents();
//        this.koleksi = koleksi;
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        dtTambah_Otomatis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("DIALOG HELP");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel1)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel1)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        dtTambah_Otomatis.setText("Tambah Data  Otomatis");
        dtTambah_Otomatis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtTambah_OtomatisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dtTambah_Otomatis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dtTambah_Otomatis)
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

        setSize(new java.awt.Dimension(432, 378));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dtTambah_OtomatisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtTambah_OtomatisActionPerformed
        DataFile dataPenyimpanan = new DataFile(this.data);
        
        Koleksi dataKoleksi;//String id_koleksi, String judul, String penerbit, String tahunTerbit, boolean status_pinjam,String tipeKoleksi,String format, String ISBN
        dataKoleksi = new Disk("D12345", "Legendary Toefl Test Of English", "Sealova Media","1234", Boolean.TRUE,"Disk", "MP4", "9799483530");
        this.data.isiDataKoleksi(dataKoleksi);
        this.data.isiDataDisk(dataKoleksi);
        dataKoleksi = new Disk("D12346", "Getting To Yes", "Gramedia Pustaka Utama","1235", Boolean.TRUE,"Disk", "DVD", "9789792271973");
        this.data.isiDataKoleksi(dataKoleksi);
        this.data.isiDataDisk(dataKoleksi);
        dataKoleksi = new Disk("D12347", "Cumsumer Behavior Hoyer Macinnis", "Mc GrawHill","1239", Boolean.TRUE,"Disk", "MP4", "9780324834277");
        this.data.isiDataKoleksi(dataKoleksi);
        this.data.isiDataDisk(dataKoleksi);
        dataKoleksi = new Disk("D12348", "Men Are from Mars Women Are from Venus", "Andi Offset","1353", Boolean.FALSE,"Disk", "MP3", "9786020375212");
        this.data.isiDataKoleksi(dataKoleksi);
        this.data.isiDataDisk(dataKoleksi);
        dataKoleksi = new Disk("D12349", "The Ancient Chinese Wisdom Sc", "Tiga Serangkai","1234", Boolean.TRUE,"Disk", "MP4", "9789792291827");
        this.data.isiDataKoleksi(dataKoleksi);
        this.data.isiDataDisk(dataKoleksi);
        dataKoleksi = new Disk("D12350", "The Art of War ", "Pustaka Karya","1234", Boolean.TRUE,"Disk", "MP4", "9786020333465");
        this.data.isiDataKoleksi(dataKoleksi);
        this.data.isiDataDisk(dataKoleksi);
        dataKoleksi = new Disk("D12351", "X-Men Mutant Genesis 2.0 HC", "Wiley Press","1234", Boolean.TRUE,"Disk", "CDAUDIO", "9780785163589");
        this.data.isiDataKoleksi(dataKoleksi);
        this.data.isiDataDisk(dataKoleksi);
        //String id_koleksi, String judul, String penerbit, String tahunTerbit, boolean status_pinjam,String tipeKoleksi,int halaman, String ISBN
        dataKoleksi = new Buku("B56789", "Algoritma dan Pemrograman", "Informatika","1234", Boolean.TRUE,"Buku", 770, "6021514917");
        this.data.isiDataKoleksi(dataKoleksi);
        this.data.isiDataBuku(dataKoleksi);
        dataKoleksi = new Buku("B56790", "Pemrograman C dan C plus plus", "Informatika","1234", Boolean.TRUE, "Buku",290, "8221514787");
        this.data.isiDataKoleksi(dataKoleksi);
        this.data.isiDataBuku(dataKoleksi);
        dataKoleksi = new Buku("B56791", "Algoritma dan Pemrograman", "Informatika","1234", Boolean.TRUE,"Buku", 770, "6021514917");
        this.data.isiDataKoleksi(dataKoleksi);
        this.data.isiDataBuku(dataKoleksi);
        dataKoleksi = new Buku("B56792", "Pemrograman Berbasis Mobile Menggunakan Android Studio", "Deepublish","1234", Boolean.FALSE,"Buku", 550, "9786024016272");
        this.data.isiDataKoleksi(dataKoleksi);
        this.data.isiDataBuku(dataKoleksi);
        dataKoleksi = new Buku("B56793", "Konsep dan Implementasi Pemrograman Laravel 7", "Lokomedia","1234", Boolean.TRUE,"Buku", 665, "9860240124917");
        this.data.isiDataKoleksi(dataKoleksi);
        this.data.isiDataBuku(dataKoleksi);
        dataKoleksi = new Buku("B56794", "Pemrograman Mikrokontroler AVR Bahasa Assemby dan C", "Media Online","1234", Boolean.TRUE,"Buku", 780, "235648514917");
        this.data.isiDataKoleksi(dataKoleksi);
        this.data.isiDataBuku(dataKoleksi);
        dataKoleksi = new Buku("B56795", "Esensi Bahasa Pemrograman Java", "Kodebuku","1234", Boolean.FALSE,"Buku", 770, "68948775215");
        this.data.isiDataKoleksi(dataKoleksi);
        this.data.isiDataBuku(dataKoleksi);
        //String id_koleksi, String judul, String penerbit, String tahunTerbit, boolean status_pinjam,String tipeKoleksi,String ISSN,int volume, int seri
        dataKoleksi = new Majalah("M695847", "Infokomputer", "Infomedia", "1234",Boolean.FALSE,"Majalah", "21253658984", 12, 2);
        this.data.isiDataKoleksi(dataKoleksi);
        this.data.isiDataMajalah(dataKoleksi);
        dataKoleksi = new Majalah("M695848", "Tempo", "Tempo Press", "1234",Boolean.FALSE,"Majalah", "212536845758", 12, 2);
        this.data.isiDataKoleksi(dataKoleksi);
        this.data.isiDataMajalah(dataKoleksi);
        dataKoleksi = new Majalah("M695849", "Trubus", "Gramedia Print", "1234",Boolean.FALSE,"Majalah", "54255788548", 12, 2);
        this.data.isiDataKoleksi(dataKoleksi);
        this.data.isiDataMajalah(dataKoleksi);
        dataKoleksi = new Majalah("M695850", "Art Projects", "Artis Press", "1234",Boolean.TRUE,"Majalah", "62548799521", 12, 2);
        this.data.isiDataKoleksi(dataKoleksi);
        this.data.isiDataMajalah(dataKoleksi);
        dataKoleksi = new Majalah("M695851", "Elektron", "Elek Media", "1234",Boolean.FALSE,"Majalah", "356548745522", 12, 2);
        this.data.isiDataKoleksi(dataKoleksi);
        this.data.isiDataMajalah(dataKoleksi);
        dataKoleksi = new Majalah("M695852", "PCPlus", "Media Indonesia", "1234",Boolean.TRUE,"Majalah", "45488784512", 12, 2);
        this.data.isiDataKoleksi(dataKoleksi);
        this.data.isiDataMajalah(dataKoleksi);
        dataKoleksi = new Majalah("M695853", "CHIP", "Softart Inc", "1234",Boolean.FALSE,"Majalah", "98765215487", 12, 2);
        this.data.isiDataKoleksi(dataKoleksi);
        this.data.isiDataMajalah(dataKoleksi);
//        dataPenyimpanan.isiKoleksiFile();
        
        Peminjam dataPeminjam;
        //String id_peminjam,String nip, String nama, String alamat, int maks_pinjam
        dataPeminjam = new Dosen("D123", "19820325007", "Sujadmiko Raharjo", "Jl. Kembang Arum no.123 Condongcatur", 5);
        this.data.isiDataPeminjam(dataPeminjam);
        dataPeminjam = new Dosen("D124", "19800305012", "Bagong Ahmadi", "Jl. Proklamasi no.13 Caturtunggal", 5);
        this.data.isiDataPeminjam(dataPeminjam);
        dataPeminjam = new Dosen("D125", "19781225001", "Yohanes Supangat", "Jl. Ayam Jantan no.23X Maguwo Hardjo", 5);
        this.data.isiDataPeminjam(dataPeminjam);
        dataPeminjam = new Dosen("D126", "19730321006", "Alberta Sri Sumini", "Jl. Segi Tiga no.M88 Pakem", 5);
        this.data.isiDataPeminjam(dataPeminjam);
        dataPeminjam = new Dosen("D127", "19990909009", "John Sabar Menanti", "Gg. Kapuas no.L12 Mancasan Kidul", 5);
        this.data.isiDataPeminjam(dataPeminjam);
        dataPeminjam = new Dosen("D128", "19880818018", "Ayu Setianing Sekar", "Jl. Achmad Yani no.55 Blok I Komplek Kembang Jaya", 6);
        this.data.isiDataPeminjam(dataPeminjam);
        dataPeminjam = new Dosen("D129", "19850520003", "Citra Jesica Indah", "Jl. Pinus 5 no. 2 Cassa Grande", 5);
        this.data.isiDataPeminjam(dataPeminjam);
        dataPeminjam = new Mahasiswa("M2015", "205314077", "Rafael Mahesa Putra", "Jl. Sawo Matang no.133 Condongcatur", 3);
        this.data.isiDataPeminjam(dataPeminjam);
        dataPeminjam = new Mahasiswa("M2016", "205314079", "Justino Ardian Suban Baolangu", "Gg. Kosan Indah Paingan Maguwoharjo", 3);
        this.data.isiDataPeminjam(dataPeminjam);
        dataPeminjam = new Mahasiswa("M2017", "205314096", "Gabriel Advent Batan", "Gg. Programming no.1010 Desa Java", 3);
        this.data.isiDataPeminjam(dataPeminjam);
        dataPeminjam = new Mahasiswa("M2018", "205314104", "Mario Richard Paulo Yamlean", "Jl. Apache Netbeans  no.12B Oracle Black Street 5th", 3);
        this.data.isiDataPeminjam(dataPeminjam);
        dataPeminjam = new Mahasiswa("M2019", "205314099", "Katrina Yuliana Kartika", "Gg. Inheritance no.77 Desa Object Oriented II", 4);
        this.data.isiDataPeminjam(dataPeminjam);
        dataPeminjam = new Mahasiswa("M2020", "205314075", "Marcelia Putri Supriosa", "Jl. Graphical User Interface no.1 Kampung Java Component 2th", 3);
        this.data.isiDataPeminjam(dataPeminjam);
        dataPeminjam = new Mahasiswa("M2021", "195314058", "Bernadetha Mega Devina Ayuningtyas", "Gg. Exception Personal no.2X Wall of Error II ", 4);
        this.data.isiDataPeminjam(dataPeminjam);
        dataPeminjam = new Umum("U8810", "3404070802756001", "Chelsea Olivia", "Gg. Anak Jalanan no.2X The World of the Married", 4);
        this.data.isiDataPeminjam(dataPeminjam);
        dataPeminjam = new Umum("U8811", "3404080702156006", "Raffi Ahmad", "Jl. Ikatan Cinta no.8 SKY Castle 2th", 4);
        this.data.isiDataPeminjam(dataPeminjam);
        dataPeminjam = new Umum("U8812", "3404070305875004", "Kevin Julio", "Gg. Ganteng ganteng Srigala no.11 Crash Landing on You ", 4);
        this.data.isiDataPeminjam(dataPeminjam);
        dataPeminjam = new Umum("U8813", "5404080804758009", "Ayu Ting Ting", "Jl. Cinta Fitri no.8A The World of the Married", 4);
        this.data.isiDataPeminjam(dataPeminjam);
        dataPeminjam = new Umum("U8814", "4404080602776003", "Prilly Latuconsina", "Gg. Intan no.25 Squid Gam", 4);
        this.data.isiDataPeminjam(dataPeminjam);
        dataPeminjam = new Umum("U8815", "3404071205756012", "Via Valen", "Gg. Putri Yang Ditukar no.9 Dali and Cocky Prince", 4);
        this.data.isiDataPeminjam(dataPeminjam);
        dataPeminjam = new Umum("U8816", "3404071112957021", "Gisella Anastasia", "Gg. Preman Pensiun no.99 The Good Detective", 4);
        this.data.isiDataPeminjam(dataPeminjam);
//        dataPenyimpanan.isiPeminjamFile();
        JOptionPane.showMessageDialog(this, "Semua Data Terlah Di Tambahkan", "Info",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_dtTambah_OtomatisActionPerformed

    
    
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
        
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                JDialog_Help dialog = new JDialog_Help(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dtTambah_Otomatis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
