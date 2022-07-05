package Project_Perpustakaan;

import java.io.File;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class JDialogTambahKoleksi extends javax.swing.JDialog {

    DataPenyimpanan dataKoleksi;
    TableColumnModel columnModel;
    DefaultTableModel tabelModel;
    File file = new File("Data_Koleksi.txt");
    
    public JDialogTambahKoleksi(java.awt.Frame parent, boolean modal, DataPenyimpanan data) {
        super(parent, modal);
        initComponents();
        this.dataKoleksi = data;
        tampilData();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_IdKoleksi = new javax.swing.JTextField();
        jTextField_Judul = new javax.swing.JTextField();
        jTextField_Penerbit = new javax.swing.JTextField();
        jTextField_TahunTerbit = new javax.swing.JTextField();
        jComboBox_TipeKoleksi = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_ISBNBuku = new javax.swing.JTextField();
        jTextField_JumlahHalaman = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField_ISBNDisk = new javax.swing.JTextField();
        jComboBox_FileFormat = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField_ISSN = new javax.swing.JTextField();
        jTextField_Volume = new javax.swing.JTextField();
        jTextField_Seri = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKoleksi = new javax.swing.JTable();
        jButton_Simpan = new javax.swing.JButton();
        jButton_Reset = new javax.swing.JButton();
        jButton_Hapus = new javax.swing.JButton();
        jButton_Kembali = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jCheckBox_status = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tambah Data Koleksi");

        jPanel1.setBackground(java.awt.SystemColor.inactiveCaption);
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TAMBAH DATA KOLEKSI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        jPanel2.setBackground(java.awt.SystemColor.inactiveCaption);
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Petunjuk Penggunaan");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setText("ID KOLEKSI         :");

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setText("JUDUL                     :");

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setText("PENERBIT            :");

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel6.setText("TAHUN TERBIT :");

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel7.setText("TIPE KOLEKSI   :");

        jTextField_IdKoleksi.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jTextField_IdKoleksi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_IdKoleksiFocusLost(evt);
            }
        });

        jTextField_Judul.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jTextField_Judul.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_JudulFocusLost(evt);
            }
        });

        jTextField_Penerbit.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jTextField_Penerbit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_PenerbitFocusLost(evt);
            }
        });

        jTextField_TahunTerbit.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jTextField_TahunTerbit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_TahunTerbitFocusLost(evt);
            }
        });

        jComboBox_TipeKoleksi.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jComboBox_TipeKoleksi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih", "Buku", "Disk", "Majalah" }));
        jComboBox_TipeKoleksi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBox_TipeKoleksiFocusLost(evt);
            }
        });
        jComboBox_TipeKoleksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_TipeKoleksiActionPerformed(evt);
            }
        });

        jPanel3.setBackground(java.awt.SystemColor.activeCaption);
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("BUKU"));
        jPanel3.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel8.setText("NOMOR ISBN             :");

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel9.setText("JUMLAH HALAMAN :");

        jTextField_ISBNBuku.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jTextField_ISBNBuku.setEnabled(false);
        jTextField_ISBNBuku.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_ISBNBukuFocusLost(evt);
            }
        });

        jTextField_JumlahHalaman.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jTextField_JumlahHalaman.setEnabled(false);
        jTextField_JumlahHalaman.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_JumlahHalamanFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_JumlahHalaman, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(jTextField_ISBNBuku))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_ISBNBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField_JumlahHalaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel4.setBackground(java.awt.SystemColor.activeCaption);
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("DISK"));

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel10.setText("NOMOR ISBN      :");

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel11.setText("FORMAT FILE    :");

        jTextField_ISBNDisk.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jTextField_ISBNDisk.setEnabled(false);
        jTextField_ISBNDisk.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_ISBNDiskFocusLost(evt);
            }
        });

        jComboBox_FileFormat.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jComboBox_FileFormat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Format File", "Audio", "MP3", "Document", "Video", "MP4", "DVD", "CDAUDIO" }));
        jComboBox_FileFormat.setEnabled(false);
        jComboBox_FileFormat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBox_FileFormatFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox_FileFormat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_ISBNDisk, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField_ISBNDisk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBox_FileFormat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel5.setBackground(java.awt.SystemColor.activeCaption);
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("MAJALAH"));
        jPanel5.setToolTipText("");

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel12.setText("NOMOR ISSN      :");

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel13.setText("VOLUME               :");

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel14.setText("SERI                        :");

        jTextField_ISSN.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jTextField_ISSN.setEnabled(false);
        jTextField_ISSN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_ISSNFocusLost(evt);
            }
        });

        jTextField_Volume.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jTextField_Volume.setEnabled(false);
        jTextField_Volume.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_VolumeFocusLost(evt);
            }
        });

        jTextField_Seri.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jTextField_Seri.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_ISSN, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Volume, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Seri, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField_ISSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField_Volume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField_Seri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        tblKoleksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Koleksi", "Judul", "Penerbit", "Tahun Terbit", "Tipe Koleksi", "Status", "ISBN Buku", "Jumlah Halaman", "ISSN", "Volume", "Seri", "ISBN Disk", "Format File"
            }
        ));
        tblKoleksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKoleksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKoleksi);

        jButton_Simpan.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        jButton_Simpan.setText("SIMPAN");
        jButton_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SimpanActionPerformed(evt);
            }
        });

        jButton_Reset.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        jButton_Reset.setText("RESET");
        jButton_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ResetActionPerformed(evt);
            }
        });

        jButton_Hapus.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        jButton_Hapus.setText("HAPUS");
        jButton_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_HapusActionPerformed(evt);
            }
        });

        jButton_Kembali.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        jButton_Kembali.setText("KEMBALI");
        jButton_Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_KembaliActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel15.setText("STATUS PINJAM:");

        jCheckBox_status.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox_status.setText("Di Pinjam");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(586, 586, 586))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_IdKoleksi, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_Judul))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_Penerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox_status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox_TipeKoleksi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_TahunTerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton_Simpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Reset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Hapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_Kembali)))
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_IdKoleksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField_Judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField_Penerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField_TahunTerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBox_TipeKoleksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jCheckBox_status))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Simpan)
                            .addComponent(jButton_Reset)
                            .addComponent(jButton_Hapus)
                            .addComponent(jButton_Kembali))))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1362, 704));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void tampilData() {
        String[] judul = {"ID Koleksi", "Judul", "Penerbit", "Tahun Terbit", "Tipe Koleksi","Status", "ISBN Buku", "Jumlah Halaman","ISSN",
            "Volume", "Seri", "ISBN Disk", "Format File"};
        Object[][] objKoleksi = new Object[dataKoleksi.koleksiList.size()][13];

        int i = 0;
        for (Koleksi n : dataKoleksi.koleksiList) {
            if (n instanceof Buku) {
                String[] arrData = {n.getId_koleksi(), n.getJudul(), n.getPenerbit(), n.getTahunTerbit(), n.getTipeKoleksi(),
                    n.isStatus_pinjam() ? "Dipinjam" : "Tersedia",((Buku) n).getISBN(), String.valueOf(((Buku) n).getHalaman()), "-", "-", "-", "-", "-"};
                objKoleksi[i] = arrData;
            }
            if (n instanceof Disk) {
                String[] arrData = {n.getId_koleksi(), n.getJudul(), n.getPenerbit(), n.getTahunTerbit(), n.getTipeKoleksi(),
                    n.isStatus_pinjam() ? "Dipinjam" : "Tersedia","-", "-", "-", "-", "-", ((Disk) n).getISBN(), ((Disk) n).getFormat()};
                objKoleksi[i] = arrData;
            }
            if (n instanceof Majalah) {
                String[] arrData = {n.getId_koleksi(), n.getJudul(), n.getPenerbit(), n.getTahunTerbit(), n.getTipeKoleksi(),
                    n.isStatus_pinjam() ? "Dipinjam" : "Tersedia","-", "-", ((Majalah) n).getISSN(), String.valueOf(((Majalah) n).getVolume()), 
                    String.valueOf(((Majalah) n).getSeri()), "-", "-"};
                objKoleksi[i] = arrData;
            }
            i++;
        }
        tabelModel = new DefaultTableModel(objKoleksi, judul) {
            //membuat tabel tidak bisa diedit saat diklik
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        tblKoleksi.setModel(tabelModel);
        columnModel = tblKoleksi.getColumnModel();
    }

    private void jButton_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_HapusActionPerformed
        int a = tblKoleksi.getSelectedRowCount();
        if (a == -1) {
        } else {
            int selectedRow = tblKoleksi.getSelectedRow();
            if (tblKoleksi.getValueAt(selectedRow, 0).toString().charAt(0) == 'B') {
                dataKoleksi.koleksiList.remove(selectedRow);
                resetField();
            } else if (tblKoleksi.getValueAt(selectedRow, 0).toString().charAt(0) == 'D') {
                dataKoleksi.koleksiList.remove(selectedRow);
                resetField();
            } else if (tblKoleksi.getValueAt(selectedRow, 0).toString().charAt(0) == 'M') {
                dataKoleksi.koleksiList.remove(selectedRow);
                resetField();
            }
            tampilData();
        }
    }//GEN-LAST:event_jButton_HapusActionPerformed

    private void jComboBox_TipeKoleksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_TipeKoleksiActionPerformed
        if (jComboBox_TipeKoleksi.getSelectedItem() == "Buku") {
            jTextField_ISBNBuku.setText("");
            jTextField_JumlahHalaman.setText("");
            jTextField_ISSN.setText("");
            jTextField_Volume.setText("");
            jTextField_Seri.setText("");
            jTextField_ISBNDisk.setText("");
            jComboBox_FileFormat.setSelectedItem("Pilih Format File");

            jTextField_ISBNBuku.setEnabled(true);
            jTextField_JumlahHalaman.setEnabled(true);
            jTextField_ISSN.setEnabled(false);
            jTextField_Volume.setEnabled(false);
            jTextField_Seri.setEnabled(false);
            jTextField_ISBNDisk.setEnabled(false);
            jComboBox_FileFormat.setEnabled(false);
        } else if (jComboBox_TipeKoleksi.getSelectedItem() == "Majalah") {
            jTextField_ISBNBuku.setText("");
            jTextField_JumlahHalaman.setText("");
            jTextField_ISSN.setText("");
            jTextField_Volume.setText("");
            jTextField_Seri.setText("");
            jTextField_ISBNDisk.setText("");
            jComboBox_FileFormat.setSelectedItem("Pilih Format File");

            jTextField_ISBNBuku.setEnabled(false);
            jTextField_JumlahHalaman.setEnabled(false);
            jTextField_ISSN.setEnabled(true);
            jTextField_Volume.setEnabled(true);
            jTextField_Seri.setEnabled(true);
            jTextField_ISBNDisk.setEnabled(false);
            jComboBox_FileFormat.setEnabled(false);
        } else if (jComboBox_TipeKoleksi.getSelectedItem() == "Disk") {
            jTextField_ISBNBuku.setText("");
            jTextField_JumlahHalaman.setText("");
            jTextField_ISSN.setText("");
            jTextField_Volume.setText("");
            jTextField_Seri.setText("");
            jTextField_ISBNDisk.setText("");
            jComboBox_FileFormat.setSelectedItem("Pilih Format File");

            jTextField_ISBNBuku.setEnabled(false);
            jTextField_JumlahHalaman.setEnabled(false);
            jTextField_ISSN.setEnabled(false);
            jTextField_Volume.setEnabled(false);
            jTextField_Seri.setEnabled(false);
            jTextField_ISBNDisk.setEnabled(true);
            jComboBox_FileFormat.setEnabled(true);
        } else {
            jTextField_ISBNBuku.setText("");
            jTextField_JumlahHalaman.setText("");
            jTextField_ISSN.setText("");
            jTextField_Volume.setText("");
            jTextField_Seri.setText("");
            jTextField_ISBNDisk.setText("");
            jComboBox_FileFormat.setSelectedItem("Pilih Format File");

            jTextField_ISBNBuku.setEnabled(false);
            jTextField_JumlahHalaman.setEnabled(false);
            jTextField_ISSN.setEnabled(false);
            jTextField_Volume.setEnabled(false);
            jTextField_Seri.setEnabled(false);
            jTextField_ISBNDisk.setEnabled(false);
            jComboBox_FileFormat.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBox_TipeKoleksiActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        JOptionPane.showMessageDialog(this, "\n Isi Data Dari ID Koleksi Sampai Tipe Koleksi nya apa sesuai dengan koleksi yang akan di tambahkan, \n "
                + "kemudian jika jenis koleksi nya buku maka lanjutkan isi data tersebut pada kolom bagian buku, \n "
                + "begitu juga untuk majalah dan Disk", "Petunjuk Pengunaan", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SimpanActionPerformed
        String idKoleksi = jTextField_IdKoleksi.getText();
        String judul = jTextField_Judul.getText();
        String penerbit = jTextField_Penerbit.getText();
        String tahunTerbit = jTextField_TahunTerbit.getText();
        String jenisKoleksi = jComboBox_TipeKoleksi.getSelectedItem().toString();

        String ISBNBuku = jTextField_ISBNBuku.getText();
        String halaman = jTextField_JumlahHalaman.getText();

        String ISBNDisk = jTextField_ISBNDisk.getText();
        String formatFile = jComboBox_FileFormat.getSelectedItem().toString();

        String ISSNMajalah = jTextField_ISSN.getText();
        String volume = jTextField_Volume.getText();
        String seri = jTextField_Seri.getText();
        
        Boolean status = jCheckBox_status.isSelected();
        Koleksi dtKoleksi = null;
        if (jComboBox_TipeKoleksi.getSelectedItem()=="Buku") {
            dtKoleksi = new Buku(idKoleksi, judul, penerbit, tahunTerbit,status,jenisKoleksi, Integer.parseInt(halaman), ISBNBuku);
        }
        if (jComboBox_TipeKoleksi.getSelectedItem()=="Disk") {
            dtKoleksi = new Disk(idKoleksi, judul, penerbit, tahunTerbit,status,jenisKoleksi, formatFile, ISBNDisk);
        }
        if (jComboBox_TipeKoleksi.getSelectedItem()=="Majalah") {
            dtKoleksi = new Majalah(idKoleksi, judul, penerbit, tahunTerbit,status,jenisKoleksi, ISSNMajalah,Integer.parseInt(volume), Integer.parseInt(seri));
        }
        dataKoleksi.isiDataKoleksi(dtKoleksi);
        tampilData();
    }//GEN-LAST:event_jButton_SimpanActionPerformed

    private void jButton_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ResetActionPerformed
        resetField();
    }//GEN-LAST:event_jButton_ResetActionPerformed

    private void jButton_KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_KembaliActionPerformed
        JFrame_Perpustakaan perpus = new JFrame_Perpustakaan();
        perpus.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_KembaliActionPerformed

    private Koleksi cariKoleksi(String idKoleksi) {
        Iterator<Koleksi> iterator = dataKoleksi.koleksiList.iterator();
        while (iterator.hasNext()) {
            Koleksi koleksi = iterator.next();
            if (koleksi.getId_koleksi().equals(idKoleksi)) {
                return koleksi;
            }
        }
        return null;
    }    
    private void tblKoleksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKoleksiMouseClicked
        resetField();
//        int selectedRow = tblKoleksi.getSelectedRow();
//        Koleksi koleksi = cariKoleksi(tabelModel.getValueAt(selectedRow, 0).toString());
//        jTextField_IdKoleksi.setText(tblKoleksi.getValueAt(selectedRow, 0).toString());
//        jTextField_Judul.setText(tblKoleksi.getValueAt(selectedRow, 1).toString());
//        jTextField_Penerbit.setText(tblKoleksi.getValueAt(selectedRow, 2).toString());
//        jTextField_TahunTerbit.setText(tblKoleksi.getValueAt(selectedRow, 3).toString());
//        jCheckBox_status.setSelected(koleksi.isStatus_pinjam());
        
        int selectedRow = tblKoleksi.getSelectedRow();
        Koleksi kolek = cariKoleksi(tabelModel.getValueAt(selectedRow, 0).toString());
        char tipe = kolek.getId_koleksi().charAt(0);
        jTextField_IdKoleksi.setText(kolek.getId_koleksi());
        jTextField_Judul.setText(kolek.getJudul());
        jTextField_Penerbit.setText(kolek.getPenerbit());
        jTextField_TahunTerbit.setText(kolek.getTahunTerbit());
        jCheckBox_status.setSelected(kolek.isStatus_pinjam());
//"ID Koleksi", "Judul", "Penerbit", "Tahun Terbit", "Tipe Koleksi", "Status", "ISBN Buku", 
        //"Jumlah Halaman", "ISSN", "Volume", "Seri", "ISBN Disk", "Format File"
       
        switch(tipe){
            case 'B':
                jComboBox_TipeKoleksi.setSelectedItem(kolek.getTipeKoleksi());
                jTextField_ISBNBuku.setText( ((Buku)kolek).getISBN());
                jTextField_JumlahHalaman.setText(Integer.toString(((Buku)kolek).getHalaman()));

                jTextField_ISBNBuku.setEnabled(true);
                jTextField_JumlahHalaman.setEnabled(true);
                jTextField_ISSN.setEnabled(false);
                jTextField_Volume.setEnabled(false);
                jTextField_Seri.setEnabled(false);
                jTextField_ISBNDisk.setEnabled(false);
                break;
            case 'D':
                jComboBox_TipeKoleksi.setSelectedItem(kolek.getTipeKoleksi());
                jTextField_ISBNDisk.setText(((Disk)kolek).getISBN());
                jComboBox_FileFormat.setSelectedItem(((Disk)kolek).getFormat());

                jTextField_ISBNBuku.setEnabled(false);
                jTextField_JumlahHalaman.setEnabled(false);
                jTextField_ISSN.setEnabled(false);
                jTextField_Volume.setEnabled(false);
                jTextField_Seri.setEnabled(false);
                jTextField_ISBNDisk.setEnabled(true);
                jComboBox_FileFormat.setEnabled(true);
                break;
            case 'M':
                jComboBox_TipeKoleksi.setSelectedItem(kolek.getTipeKoleksi());
                jTextField_ISSN.setText(((Majalah)kolek).getISSN());
                jTextField_Volume.setText(Integer.toString(((Majalah)kolek).getVolume()));
                jTextField_Seri.setText(Integer.toString(((Majalah)kolek).getSeri()));

                jTextField_ISBNBuku.setEnabled(false);
                jTextField_JumlahHalaman.setEnabled(false);
                jTextField_ISSN.setEnabled(true);
                jTextField_Volume.setEnabled(true);
                jTextField_Seri.setEnabled(true);
                jTextField_ISBNDisk.setEnabled(false);
                jComboBox_FileFormat.setEnabled(false);
                break;
            default:
                JOptionPane.showMessageDialog(this, "ID Koleksi tidak terdefinisi!!","Warning",JOptionPane.WARNING_MESSAGE);
        }
//        if (tipe == bk) {
//            
//        }
//        else if (tipe == dk) {
//            
//        }
//        else if (tipe == mjlh) {
//            
//        }
    }//GEN-LAST:event_tblKoleksiMouseClicked

    private void jTextField_IdKoleksiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_IdKoleksiFocusLost
        if (jTextField_IdKoleksi.getText().isEmpty()) {
            return;
        }
        String cek = jTextField_IdKoleksi.getText();
        try {
            if (!cek.matches("^[B|D|M][\\d+].*")) {
                throw new Exception("\n ID Koleksi harus diawali dengan huruf "
                        + "\n B (untuk Buku) atau "
                        + "\n D (untuk Disk) atau "
                        + "\n M (untuk Majalah) dan "
                        + "\n kemudian diikuti dengan angka \n \n "
                        + "Contoh : B2435 atau D1234 atau M1234");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jTextField_IdKoleksiFocusLost

    private void jTextField_JudulFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_JudulFocusLost
        if (jTextField_Judul.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Judul Tidak Boleh Kosong", "Warning Info", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jTextField_JudulFocusLost

    private void jTextField_PenerbitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_PenerbitFocusLost
        if (jTextField_Penerbit.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Penerbit Tidak Boleh Kosong", "Warning Info", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jTextField_PenerbitFocusLost

    private void jTextField_TahunTerbitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_TahunTerbitFocusLost
        if (jTextField_TahunTerbit.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Penerbit Tidak Boleh Kosong", "Warning Info", JOptionPane.WARNING_MESSAGE);
        }
        String cek = jTextField_TahunTerbit.getText();
        if (!cek.matches("[0-9]{4}")) {
            try {
                throw new Exception("Tahun Terbit Harus Berupa 4 Digit Angka");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jTextField_TahunTerbitFocusLost

    private void jComboBox_TipeKoleksiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox_TipeKoleksiFocusLost
        try {
            if (jComboBox_TipeKoleksi.getSelectedItem() == "Pilih") {
                throw new Exception("Anda Belum Memilih Tipe Keleksi Yang Ingin Di Tambahkan");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jComboBox_TipeKoleksiFocusLost

    private void jTextField_ISBNBukuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_ISBNBukuFocusLost
        if (jTextField_ISBNBuku.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ISBN Buku Tidak Boleh Kosong", "Warning Info", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jTextField_ISBNBukuFocusLost

    private void jTextField_JumlahHalamanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_JumlahHalamanFocusLost
        if (jTextField_JumlahHalaman.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Penerbit Tidak Boleh Kosong", "Warning Info", JOptionPane.WARNING_MESSAGE);
        }
        String cek = jTextField_JumlahHalaman.getText();
        if (!cek.matches(".*^[0-9].*")) {
            try {
                throw new Exception("Jumlah Halaman Harus Berupa Angka");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jTextField_JumlahHalamanFocusLost

    private void jTextField_ISBNDiskFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_ISBNDiskFocusLost
        if (jTextField_ISBNDisk.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ISBN Disk Tidak Boleh Kosong", "Warning Info", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jTextField_ISBNDiskFocusLost

    private void jComboBox_FileFormatFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox_FileFormatFocusLost
        try {
            if (jComboBox_FileFormat.getSelectedItem() == "Pilih Format File") {
                throw new Exception("Anda Belum Memilih Format File Pada Disk Yang Ingin Di Tambahkan");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jComboBox_FileFormatFocusLost

    private void jTextField_ISSNFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_ISSNFocusLost
        if (jTextField_ISSN.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ISSN Majalah Tidak Boleh Kosong", "Warning Info", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jTextField_ISSNFocusLost

    private void jTextField_VolumeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_VolumeFocusLost
        if (jTextField_Volume.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Penerbit Tidak Boleh Kosong", "Warning Info", JOptionPane.WARNING_MESSAGE);
        }
        String volume = jTextField_Volume.getText();
        String seri = jTextField_Seri.getText();
        try {
            if (!volume.matches(".*^[0-9].*")) {
                throw new Exception("Jumlah Halaman Harus Berupa Angka");
            }
            if (!seri.matches(".*^[0-9].*")) {
                throw new Exception("Jumlah Seri Harus Berupa Angka");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jTextField_VolumeFocusLost

    private void resetField() {
        jTextField_IdKoleksi.setText("");
        jTextField_Judul.setText("");
        jTextField_Penerbit.setText("");
        jTextField_TahunTerbit.setText("");
        jTextField_ISBNBuku.setText("");
        jTextField_JumlahHalaman.setText("");
        jTextField_ISSN.setText("");
        jTextField_Volume.setText("");
        jTextField_Seri.setText("");
        jTextField_ISBNDisk.setText("");
        jComboBox_FileFormat.setSelectedItem("Pilih Format File");
        jComboBox_TipeKoleksi.setSelectedItem("Pilih");
        jCheckBox_status.setSelected(Boolean.FALSE);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDialogTambahKoleksi.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogTambahKoleksi.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogTambahKoleksi.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogTambahKoleksi.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                JDialogTambahKoleksi dialog = new JDialogTambahKoleksi(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton_Hapus;
    private javax.swing.JButton jButton_Kembali;
    private javax.swing.JButton jButton_Reset;
    private javax.swing.JButton jButton_Simpan;
    private javax.swing.JCheckBox jCheckBox_status;
    private javax.swing.JComboBox jComboBox_FileFormat;
    private javax.swing.JComboBox jComboBox_TipeKoleksi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField_ISBNBuku;
    private javax.swing.JTextField jTextField_ISBNDisk;
    private javax.swing.JTextField jTextField_ISSN;
    private javax.swing.JTextField jTextField_IdKoleksi;
    private javax.swing.JTextField jTextField_Judul;
    private javax.swing.JTextField jTextField_JumlahHalaman;
    private javax.swing.JTextField jTextField_Penerbit;
    private javax.swing.JTextField jTextField_Seri;
    private javax.swing.JTextField jTextField_TahunTerbit;
    private javax.swing.JTextField jTextField_Volume;
    private javax.swing.JTable tblKoleksi;
    // End of variables declaration//GEN-END:variables
}
