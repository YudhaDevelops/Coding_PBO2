package Project_Perpustakaan;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.SQLException;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class JDialogTransaksiPinjam extends javax.swing.JDialog {

    DataPenyimpanan dataPerpus;
    Peminjam dtPeminjam;
    Koleksi dtKoleksi;
    Transaksi dtTransaksi;
    ArrayList<Koleksi> dtPesanKoleksi;
    ArrayList<Transaksi> dt_TransaksiList;
    DefaultTableModel tbModelPesanKoleksi;
    DefaultTableModel tbModelTransaksi;
    TableColumnModel clModelPesanKoleksi;
    TableColumnModel clModelTransaksi;
    static String tglSekarang, tglKembali;

    public JDialogTransaksiPinjam(java.awt.Frame parent, boolean modal, DataPenyimpanan data) {
        super(parent, modal);
        initComponents();
        this.dataPerpus = data;
        dtPesanKoleksi = new ArrayList();
        try {
            dt_TransaksiList = dataPerpus.dbPerpus.GetTransaksi();
        } catch (SQLException ex) {
            Logger.getLogger(JDialogTransaksiPinjam.class.getName()).log(Level.SEVERE, null, ex);
        }
        tampilPesanKoleksi();
        tampilTransaksi();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblNo1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_IdPeminjam = new javax.swing.JTextField();
        jTextField_nama = new javax.swing.JTextField();
        jTextField_jumlahPinjam = new javax.swing.JTextField();
        jTextField_NomorIdentitas = new javax.swing.JTextField();
        jTextField_alamat = new javax.swing.JTextField();
        jButton_CariID = new javax.swing.JButton();
        jLabel_Identitas = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_IdKoleksi = new javax.swing.JTextField();
        jTextField_Judul = new javax.swing.JTextField();
        jTextField_Penerbit = new javax.swing.JTextField();
        jTextField_Status = new javax.swing.JTextField();
        jTextField_ISBN_SSSN = new javax.swing.JTextField();
        jButton_CariKoleksi = new javax.swing.JButton();
        labelVolumeKoleksi = new javax.swing.JLabel();
        jTextField_Volume = new javax.swing.JTextField();
        labelSeriKoleksi = new javax.swing.JLabel();
        jTextField_Seri = new javax.swing.JTextField();
        jButton_TambahKoleksi = new javax.swing.JButton();
        btlPesanan = new javax.swing.JButton();
        jLabel_Identitas_Koleksi = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btPinjam = new javax.swing.JButton();
        btBatal = new javax.swing.JButton();
        Jb_TambahBaru = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_PesanKoleksi = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_Transaksi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pinjam Koleksi");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Peminjam"));

        jLabel2.setText("ID Peminjam");

        lblNo1.setText("Nama");

        jLabel6.setText("Alamat");

        jLabel7.setText("Jumlah Pinjam");

        jLabel8.setText("No. Identitas");

        jTextField_IdPeminjam.setEnabled(false);

        jTextField_nama.setEditable(false);

        jTextField_jumlahPinjam.setEditable(false);

        jTextField_NomorIdentitas.setEditable(false);

        jTextField_alamat.setEditable(false);

        jButton_CariID.setText("Cari ID");
        jButton_CariID.setEnabled(false);
        jButton_CariID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CariIDActionPerformed(evt);
            }
        });

        jLabel_Identitas.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel_Identitas.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Identitas.setText("NIM/NIP/NIK");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_IdPeminjam, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_CariID, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(lblNo1)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_alamat, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_nama)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField_jumlahPinjam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(jTextField_NomorIdentitas, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel_Identitas)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_IdPeminjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_CariID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNo1)
                    .addComponent(jTextField_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_NomorIdentitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Identitas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_jumlahPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Koleksi"));

        jLabel1.setText("ID Koleksi");

        lblNo.setText("Judul");

        jLabel3.setText("Penerbit");

        jLabel4.setText("Status");

        jLabel5.setText("ISBN/ISSN");

        jTextField_Judul.setEditable(false);

        jTextField_Penerbit.setEditable(false);

        jTextField_Status.setEditable(false);

        jTextField_ISBN_SSSN.setEditable(false);

        jButton_CariKoleksi.setText("Cari");
        jButton_CariKoleksi.setEnabled(false);
        jButton_CariKoleksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CariKoleksiActionPerformed(evt);
            }
        });

        labelVolumeKoleksi.setText("Volume");

        jTextField_Volume.setEditable(false);

        labelSeriKoleksi.setText("Seri");

        jTextField_Seri.setEditable(false);

        jButton_TambahKoleksi.setText("Tambah Pesanan");
        jButton_TambahKoleksi.setEnabled(false);
        jButton_TambahKoleksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TambahKoleksiActionPerformed(evt);
            }
        });

        btlPesanan.setText("Batal Pesanan");
        btlPesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlPesananActionPerformed(evt);
            }
        });

        jLabel_Identitas_Koleksi.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel_Identitas_Koleksi.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Identitas_Koleksi.setText("ISBN B/ ISBN D / ISSN M");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNo)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jTextField_IdKoleksi, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_CariKoleksi, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                            .addComponent(jTextField_Judul)
                            .addComponent(jTextField_Penerbit)
                            .addComponent(jTextField_Status)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelVolumeKoleksi)
                            .addComponent(labelSeriKoleksi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_Seri, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                    .addComponent(jTextField_Volume))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btlPesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField_ISBN_SSSN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_TambahKoleksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel_Identitas_Koleksi)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_IdKoleksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_CariKoleksi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNo)
                    .addComponent(jTextField_Judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_Penerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_ISBN_SSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Identitas_Koleksi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btlPesanan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelVolumeKoleksi)
                            .addComponent(jTextField_Volume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelSeriKoleksi)
                            .addComponent(jTextField_Seri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton_TambahKoleksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Transaksi Peminjaman"));

        btPinjam.setText("Proses Peminjaman");
        btPinjam.setEnabled(false);
        btPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPinjamActionPerformed(evt);
            }
        });

        btBatal.setText("Batal");
        btBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBatalActionPerformed(evt);
            }
        });

        Jb_TambahBaru.setText("Pinjam Baru");
        Jb_TambahBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_TambahBaruActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Jb_TambahBaru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btPinjam)
                .addComponent(btBatal)
                .addComponent(Jb_TambahBaru))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Daftar Pesanan Koleksi"));

        jTable_PesanKoleksi.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_PesanKoleksi);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Transaksi "));

        jTable_Transaksi.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable_Transaksi);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1173, 625));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private Peminjam cariPeminjam(String idPeminjam) {
        Iterator<Peminjam> iterator = dataPerpus.peminjamList.iterator();
        while (iterator.hasNext()) {
            Peminjam peminjam = iterator.next();
            if (peminjam.getId_peminjam().equals(idPeminjam)) {
                return peminjam;
            }
        }
        return null;
    }

    private void jButton_CariIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CariIDActionPerformed
        if (jTextField_IdPeminjam.getText() == null) {
            JOptionPane.showMessageDialog(this, "ID Peminjam tidak terdefinisi!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        dtPeminjam = cariPeminjam(jTextField_IdPeminjam.getText());
        try {
            jTextField_nama.setText(dtPeminjam.getNama());
            jTextField_alamat.setText(dtPeminjam.getAlamat());
            jTextField_jumlahPinjam.setText(Integer.toString(dtPeminjam.getMaks_pinjam()));
            char tipe = dtPeminjam.getId_peminjam().charAt(0);
            switch (tipe) {
                case 'D':
                    jTextField_NomorIdentitas.setText(((Dosen) dtPeminjam).getNip());
                    jLabel_Identitas.setText("NIP");
                    break;
                case 'M':
                    jTextField_NomorIdentitas.setText(((Mahasiswa) dtPeminjam).getNim());
                    jLabel_Identitas.setText("NIM");
                    break;
                case 'U':
                    jTextField_NomorIdentitas.setText(((Umum) dtPeminjam).getNik());
                    jLabel_Identitas.setText("NIK");
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "ID Peminjam tidak terdefinisi!!", "Warning", JOptionPane.WARNING_MESSAGE);
                    jTextField_IdPeminjam.setText("No ID");
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Data Yang Di Cari Tidak Di Temukan", "Warning", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton_CariIDActionPerformed

    private Koleksi cariKoleksi(String idKoleksi) {
        Iterator<Koleksi> iterator = dataPerpus.koleksiList.iterator();
        while (iterator.hasNext()) {
            Koleksi koleksi = iterator.next();
            if (koleksi.getId_koleksi().equals(idKoleksi)) {
                return koleksi;
            }
        }
        return null;
    }

    private void jButton_CariKoleksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CariKoleksiActionPerformed
        if (jTextField_IdKoleksi.getText() == null) {
            JOptionPane.showMessageDialog(this, "ID Koleksi tidak terdefinisi!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        dtKoleksi = cariKoleksi(jTextField_IdKoleksi.getText());
        try {
            jTextField_Judul.setText(dtKoleksi.getJudul());
            jTextField_Penerbit.setText(dtKoleksi.getPenerbit());
            jTextField_Status.setText(dtKoleksi.isStatus_pinjam() ? "Dipinjam" : "Tersedia");
            jButton_TambahKoleksi.setEnabled(!dtKoleksi.isStatus_pinjam());
            char tipe = dtKoleksi.getId_koleksi().charAt(0);
            switch (tipe) {
                case 'D':
                    labelVolumeKoleksi.setText("Format");
                    labelSeriKoleksi.setText("   ");
                    jTextField_Seri.setVisible(false);
                    jLabel_Identitas_Koleksi.setText("ISBN DISK");
                    jTextField_ISBN_SSSN.setText(((Disk) dtKoleksi).getISBN());
                    jTextField_Volume.setText(((Disk) dtKoleksi).getFormat());
                    break;
                case 'M':
                    labelVolumeKoleksi.setText("Volume");
                    labelSeriKoleksi.setText("Seri");
                    jTextField_Seri.setVisible(true);
                    jLabel_Identitas_Koleksi.setText("ISSN MAJALAH");
                    jTextField_ISBN_SSSN.setText(((Majalah) dtKoleksi).getISSN());
                    jTextField_Volume.setText(Integer.toString(((Majalah) dtKoleksi).getVolume()));
                    jTextField_Seri.setText(Integer.toString(((Majalah) dtKoleksi).getSeri()));
                    break;
                case 'B':
                    labelVolumeKoleksi.setText("Halaman");
                    labelSeriKoleksi.setText("   ");
                    jTextField_Seri.setVisible(false);
                    jLabel_Identitas_Koleksi.setText("ISBN BUKU");
                    jTextField_ISBN_SSSN.setText(((Buku) dtKoleksi).getISBN());
                    jTextField_Volume.setText(Integer.toString(((Buku) dtKoleksi).getHalaman()));
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "ID Koleksi tidak terdefinisi!!", "Warning", JOptionPane.WARNING_MESSAGE);
                    jTextField_IdKoleksi.setText("No ID");
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Data Yang Di Cari Tidak Di Temukan", "Warning", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton_CariKoleksiActionPerformed

    private void jButton_TambahKoleksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TambahKoleksiActionPerformed
        dtPesanKoleksi.add(dtKoleksi);
        tampilPesanKoleksi();
        btPinjam.setEnabled(true);
    }//GEN-LAST:event_jButton_TambahKoleksiActionPerformed

    private void btPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPinjamActionPerformed
        LocalDateTime now = LocalDateTime.now();
        String idTransaksi = "T" + Long.toString(now.toEpochSecond(ZoneOffset.UTC));
        dataPerpus.dbPerpus.pinjam(idTransaksi, dtPesanKoleksi, dtPeminjam);
        dataPerpus.dbPerpus.tambahLogsTransaksi(idTransaksi, dtPesanKoleksi, dtPeminjam);
        try {
            dt_TransaksiList = dataPerpus.dbPerpus.GetTransaksi();
        } catch (SQLException ex) {
            Logger.getLogger(JDialogTransaksiPinjam.class.getName()).log(Level.SEVERE, null, ex);
        }
        dataPerpus.refreshKoleksi();
        tampilTransaksi();
        hapusListPesanKoleksi();
        clearPeminjam();
        disTambah();
        dtPesanKoleksi.clear();
        tampilPesanKoleksi();
//        dtKoleksi = cariKoleksi(jTextField_IdKoleksi.getText());
//        Koleksi[] data = {dtKoleksi};
//        dtPeminjam = cariPeminjam(jTextField_IdPeminjam.getText());
//        String id_transaksi, LocalDate tgl_pinjam, LocalDate tgl_kembali, float denda, Koleksi[] koleksi, Peminjam peminjam) {
        //tanggal sekarang
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        DateTimeFormatter formatUntukID = DateTimeFormatter.ofPattern("ddMMyyyy");
//        LocalDateTime getNow = LocalDateTime.now();
//        String now = dateTimeFormatter.format(getNow);
//        tglSekarang = now;
        //tanggal mendatang
//        LocalDate tglBaru = getNow.toLocalDate().plus(7, ChronoUnit.DAYS);
//        String dateBaru = dateTimeFormatter.format(tglBaru);
//        tglKembali = dateBaru;
        //tanggal untuk masuk id transaksi

//        String tglId = formatUntukID.format(getNow);
//        try {
//            transaksiPinjam("T" + tglId, getNow.toLocalDate(), tglBaru, 0, dtKoleksi, dtPeminjam);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
//        }
//        tabel();
    }//GEN-LAST:event_btPinjamActionPerformed

    private void delete_File() {
        String FOLDER_FILE = "D:\\KULIAH\\PBO II\\Tugas\\Netbean\\v8\\Perpustakaan_PBO_Praktek/";// folder/tempat penyimpanan file
        String NAMA_FILE = "Data_Transaksi.txt";// file yang akan dihapus
        File file = new File(FOLDER_FILE + "" + NAMA_FILE);
        if (file.delete())// method delete() yang digunakan untuk menghapus file
        {
            System.out.println("file berhasil dihapus !");
        } else {
            System.out.println("file gagal dihapus !");
        }
    }

    private void btBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBatalActionPerformed
        dtPesanKoleksi.clear();
        hapusListPesanKoleksi();
        clearPeminjam();
    }//GEN-LAST:event_btBatalActionPerformed

    private void Jb_TambahBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_TambahBaruActionPerformed
        jTextField_IdPeminjam.setEnabled(true);
        jTextField_IdKoleksi.setEnabled(true);
        jButton_CariID.setEnabled(Boolean.TRUE);
        jButton_CariKoleksi.setEnabled(Boolean.TRUE);
        btBatal.setEnabled(Boolean.TRUE);
        btlPesanan.setEnabled(Boolean.TRUE);
    }//GEN-LAST:event_Jb_TambahBaruActionPerformed

    private void btlPesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlPesananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btlPesananActionPerformed

    private void hapusListPesanKoleksi() {
        jButton_TambahKoleksi.setEnabled(Boolean.FALSE);
        jTextField_IdKoleksi.setText("");
        jTextField_Judul.setText("");
        jTextField_Penerbit.setText("");
        jTextField_Status.setText("");
        jTextField_ISBN_SSSN.setText("");
        jTextField_Volume.setText("");
        jTextField_Seri.setText("");
    }

    private void clearPeminjam() {
        jTextField_IdPeminjam.setText("");
        jTextField_nama.setText("");
        jTextField_alamat.setText("");
        jTextField_jumlahPinjam.setText("");
        jTextField_NomorIdentitas.setText("");
    }

    private void disTambah() {
        jButton_CariID.setEnabled(Boolean.FALSE);
        jButton_CariKoleksi.setEnabled(Boolean.FALSE);
        btBatal.setEnabled(Boolean.FALSE);
        btlPesanan.setEnabled(Boolean.FALSE);
        jButton_TambahKoleksi.setEnabled(Boolean.FALSE);
        btPinjam.setEnabled(Boolean.FALSE);
    }

//    private void transaksiPinjam(String id_transaksi, LocalDate tgl_pinjam, LocalDate tgl_kembali, int denda, Koleksi Koleksi, Peminjam peminjam) {
//        Transaksi transaksiPinjam = new Transaksi(id_transaksi, tgl_pinjam, tgl_kembali, denda, Koleksi, peminjam);
//        dataPerpus.isiDataTransaksi(transaksiPinjam);
////        delete_File();
//        File file = new File("Data_Transaksi.txt");
//        try (FileOutputStream fileOut = new FileOutputStream(file);
//                ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
//            objectOut.writeObject(dataPerpus.transaksiList);
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(JDialogTransaksiPinjam.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(JDialogTransaksiPinjam.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    private void tampilPesanKoleksi() {
        String IsbnIssn = "";
        String[] kolom = {"Id Koleksi", "Judul", "Penerbit", "Status", "ISBN/ISSN"};
        Object[][] objData = new Object[dtPesanKoleksi.size()][5]; // 6 merupakan jumlah kolom
        int i = 0;
        for (Koleksi n : dtPesanKoleksi) {
            if (n instanceof Disk) {
                IsbnIssn = ((Disk) n).getISBN();
            }
            if (n instanceof Majalah) {
                IsbnIssn = ((Majalah) n).getISSN();
            }
            if (n instanceof Buku) {
                IsbnIssn = ((Buku) n).getISBN();
            }
            objData[i] = new String[]{n.getId_koleksi(), n.getJudul(), n.getPenerbit(), n.isStatus_pinjam() ? "Dipinjam" : "Tersedia", IsbnIssn};
            i++;
        }
        tbModelPesanKoleksi = new DefaultTableModel(objData, kolom) {
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        jTable_PesanKoleksi.repaint();
        jTable_PesanKoleksi.setModel(tbModelPesanKoleksi);
        clModelPesanKoleksi = jTable_PesanKoleksi.getColumnModel();
        clModelPesanKoleksi.getColumn(0).setPreferredWidth(10);
        clModelPesanKoleksi.getColumn(1).setPreferredWidth(300);
        clModelPesanKoleksi.getColumn(2).setPreferredWidth(50);
        clModelPesanKoleksi.getColumn(3).setPreferredWidth(10);
        clModelPesanKoleksi.getColumn(4).setPreferredWidth(20);
    }

    private ArrayList<Transaksi> tampilDataTransaksiPinjam(File file) {
        ArrayList<Transaksi> result = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis)) {

//            for (int i = 0; i < dataPerpus.transaksiList.size(); i++) {
            result = (ArrayList<Transaksi>) ois.readObject();
//            }
            ois.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JDialog_OutDataFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JDialog_OutDataFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDialogTransaksiPinjam.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;
    }

    private void tabel() {
//       File file = new File("Data_Transaksi.txt");
//        ArrayList<Transaksi> t = null;
//        t = tampilDataTransaksiPinjam(file);
        String[] header = {"Id Transaksi", "Tgl Pinjam", "Tgl Kembali", "Denda",
            "ID Peminjam", "Nama Peminjam", "ID Koleksi", "Judul Koleksi"};
        DefaultTableModel tabelModel = new DefaultTableModel(null, header);
        Object[] tr_Pinjam = new Object[8];
//        JOptionPane.showMessageDialog(null, dataPerpus.transaksiList.get(0).getId_transaksi());
        for (int i = 0; i < dataPerpus.transaksiList.size(); i++) {
            tr_Pinjam[0] = dataPerpus.transaksiList.get(i).getId_transaksi();
            tr_Pinjam[1] = dataPerpus.transaksiList.get(i).getTgl_pinjam();
            tr_Pinjam[2] = dataPerpus.transaksiList.get(i).getTgl_kembali();
            tr_Pinjam[3] = dataPerpus.transaksiList.get(i).getDenda();
//            tr_Pinjam[6] = dataPerpus.transaksiList.get(i).peminjam.getId_peminjam();
//            tr_Pinjam[7] = dataPerpus.transaksiList.get(i).peminjam.getNama();
//            tr_Pinjam[4] = dataPerpus.transaksiList.get(i).kol.getId_koleksi();
//            tr_Pinjam[5] = dataPerpus.transaksiList.get(i).kol.getJudul();
        }
        tabelModel.addRow(tr_Pinjam);
        jTable_Transaksi.repaint();
        jTable_Transaksi.setModel(tabelModel);

        clModelTransaksi = jTable_Transaksi.getColumnModel();
    }

    private void tampilTransaksi() {
        //id_transaksi, tgl_pinjam, tgl_kembali, denda, id_koleksi, id_peminjam
        String[] kolom = {"Id Transaksi", "Tanggal Pinjam", "Tanggal Kembali", "Denda", "ID Koleksi", "ID Peminjam"};
        Object[][] objData = new Object[dt_TransaksiList.size()][8]; // 6 merupakan jumlah kolom
        int i = 0;

        for (Transaksi n : dt_TransaksiList) {
            String kol = "";
            int j = 0;
//            kol = " " + n.getArrKoleksi().get(i).getId_koleksi();
//            for (Koleksi b : n.getArrKoleksi()) {
//                kol = " " + n.getArrKoleksi().get(j).getId_koleksi();
//                j++;
//            }
            objData[i] = new String[]{n.getId_transaksi(), String.valueOf(n.getTgl_pinjam()), String.valueOf(n.getTgl_kembali()),"Rp." +String.valueOf(n.getDenda()), n.getIdKoleksi(), n.getIdPeminjam()};
            i++;
        }
        tbModelPesanKoleksi = new DefaultTableModel(objData, kolom) {
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        jTable_Transaksi.repaint();
        jTable_Transaksi.setModel(tbModelPesanKoleksi);
        clModelPesanKoleksi = jTable_Transaksi.getColumnModel();
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
            java.util.logging.Logger.getLogger(JDialogTransaksiPinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogTransaksiPinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogTransaksiPinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogTransaksiPinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    private static DateFormat dateFormat;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jb_TambahBaru;
    private javax.swing.JButton btBatal;
    private javax.swing.JButton btPinjam;
    private javax.swing.JButton btlPesanan;
    private javax.swing.JButton jButton_CariID;
    private javax.swing.JButton jButton_CariKoleksi;
    private javax.swing.JButton jButton_TambahKoleksi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Identitas;
    private javax.swing.JLabel jLabel_Identitas_Koleksi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable_PesanKoleksi;
    private javax.swing.JTable jTable_Transaksi;
    private javax.swing.JTextField jTextField_ISBN_SSSN;
    private javax.swing.JTextField jTextField_IdKoleksi;
    private javax.swing.JTextField jTextField_IdPeminjam;
    private javax.swing.JTextField jTextField_Judul;
    private javax.swing.JTextField jTextField_NomorIdentitas;
    private javax.swing.JTextField jTextField_Penerbit;
    private javax.swing.JTextField jTextField_Seri;
    private javax.swing.JTextField jTextField_Status;
    private javax.swing.JTextField jTextField_Volume;
    private javax.swing.JTextField jTextField_alamat;
    private javax.swing.JTextField jTextField_jumlahPinjam;
    private javax.swing.JTextField jTextField_nama;
    private javax.swing.JLabel labelSeriKoleksi;
    private javax.swing.JLabel labelVolumeKoleksi;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lblNo1;
    // End of variables declaration//GEN-END:variables

}
