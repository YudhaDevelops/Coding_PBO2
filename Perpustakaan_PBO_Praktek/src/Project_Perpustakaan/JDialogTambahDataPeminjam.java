package Project_Perpustakaan;

import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class JDialogTambahDataPeminjam extends javax.swing.JDialog {

    DataPenyimpanan dataPeminjam;
    DefaultTableModel tabelModel;
    TableColumnModel columnModel;

    public JDialogTambahDataPeminjam(java.awt.Frame parent, boolean modal, DataPenyimpanan peminjam) {
        super(parent, modal);
        initComponents();
        this.dataPeminjam = peminjam;
        tampilData();
        jRadioButton_Mahasiswa.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_JenisPeminjam = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_IdPeminjam = new javax.swing.JTextField();
        jTextField_Nama = new javax.swing.JTextField();
        jTextField_Alamat = new javax.swing.JTextField();
        jTextField_NomorIdentitas = new javax.swing.JTextField();
        jTextField_MaksPinjam = new javax.swing.JTextField();
        jRadioButton_Mahasiswa = new javax.swing.JRadioButton();
        jRadioButton_Dosen = new javax.swing.JRadioButton();
        jRadioButton_Umum = new javax.swing.JRadioButton();
        jLabel_Identitas = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_Simpan = new javax.swing.JButton();
        jButton_Edit = new javax.swing.JButton();
        jButton_Reset = new javax.swing.JButton();
        jButton_Hapus = new javax.swing.JButton();
        jButton_Kembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form Data Peminjam");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TAMBAH DATA PEMINJAM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1184, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setText("ID Peminjam            : ");

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setText("Nama                           :");

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setText("Alamat                        :");

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setText("Jenis Peminjam       :");

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel6.setText("Nomor Identitas     :");

        jTextField_IdPeminjam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_IdPeminjam.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_IdPeminjamFocusLost(evt);
            }
        });

        jTextField_Nama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Nama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_NamaFocusLost(evt);
            }
        });

        jTextField_Alamat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField_NomorIdentitas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_NomorIdentitas.setEnabled(false);
        jTextField_NomorIdentitas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_NomorIdentitasFocusLost(evt);
            }
        });

        jTextField_MaksPinjam.setEditable(false);
        jTextField_MaksPinjam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        buttonGroup_JenisPeminjam.add(jRadioButton_Mahasiswa);
        jRadioButton_Mahasiswa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton_Mahasiswa.setText("Mahasiswa");
        jRadioButton_Mahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_MahasiswaActionPerformed(evt);
            }
        });

        buttonGroup_JenisPeminjam.add(jRadioButton_Dosen);
        jRadioButton_Dosen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton_Dosen.setText("Dosen");
        jRadioButton_Dosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_DosenActionPerformed(evt);
            }
        });

        buttonGroup_JenisPeminjam.add(jRadioButton_Umum);
        jRadioButton_Umum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton_Umum.setText("Umum");
        jRadioButton_Umum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_UmumActionPerformed(evt);
            }
        });

        jLabel_Identitas.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel_Identitas.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Identitas.setText("NIM/NIP/NIK");

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel8.setText("Maks.Pinjam");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Peminjam"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Peminjam", "Nomor Identitas", "Nama", "Alamat", "Maks Pinjam"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
        );

        jButton_Simpan.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jButton_Simpan.setText("Simpan");
        jButton_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SimpanActionPerformed(evt);
            }
        });

        jButton_Edit.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jButton_Edit.setText("Edit");

        jButton_Reset.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jButton_Reset.setText("Reset");
        jButton_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ResetActionPerformed(evt);
            }
        });

        jButton_Hapus.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jButton_Hapus.setText("Hapus");
        jButton_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_HapusActionPerformed(evt);
            }
        });

        jButton_Kembali.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jButton_Kembali.setText("Kembali");
        jButton_Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_KembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton_Mahasiswa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton_Dosen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton_Umum)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_MaksPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jButton_Simpan)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Edit)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Reset)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Hapus)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Kembali))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_NomorIdentitas, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Identitas))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_IdPeminjam, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_IdPeminjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_Alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRadioButton_Mahasiswa)
                    .addComponent(jRadioButton_Dosen)
                    .addComponent(jRadioButton_Umum)
                    .addComponent(jTextField_MaksPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jButton_Simpan)
                    .addComponent(jButton_Edit)
                    .addComponent(jButton_Reset)
                    .addComponent(jButton_Hapus)
                    .addComponent(jButton_Kembali))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_NomorIdentitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Identitas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

        setSize(new java.awt.Dimension(1219, 664));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void tampilData() {
        String[] header = {"ID Peminjam", "Nmr Identitas", "Nama", "Alamat", "MaksPinjam"};
        Object[][] objPeminjam = new Object[dataPeminjam.peminjamList.size()][5];
        int i = 0;
        for (Peminjam n : dataPeminjam.peminjamList) {
            if (n instanceof Mahasiswa) {
                String[] arrData = {n.getId_peminjam(), ((Mahasiswa) n).getNim(), n.getNama(), n.getAlamat(), String.valueOf(n.getMaks_pinjam())};
                objPeminjam[i] = arrData;
            }
            if (n instanceof Dosen) {
                String[] arrData = {n.getId_peminjam(), ((Dosen) n).getNip(), n.getNama(), n.getAlamat(), String.valueOf(n.getMaks_pinjam())};
                objPeminjam[i] = arrData;
            }
            if (n instanceof Umum) {
                String[] arrData = {n.getId_peminjam(), ((Umum) n).getNik(), n.getNama(), n.getAlamat(), String.valueOf(n.getMaks_pinjam())};
                objPeminjam[i] = arrData;
            }
            i++;
        }
        tabelModel = new DefaultTableModel(objPeminjam, header) {
            //membuat tabel tidak bisa diedit saat diklik
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        jTable1.setModel(tabelModel);
        columnModel = jTable1.getColumnModel();
    }


    private void jButton_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SimpanActionPerformed
        try {
            if (jTextField_IdPeminjam.getText().isEmpty()) {
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
        String idPeminjam = jTextField_IdPeminjam.getText();
        String nama = jTextField_Nama.getText();
        String alamat = jTextField_Alamat.getText();
        String nomorIdentitas = jTextField_NomorIdentitas.getText();
        int maksPinjam;
        jTextField_MaksPinjam.setText("5");
        maksPinjam = Integer.parseInt(jTextField_MaksPinjam.getText());

        Peminjam dataPeminjam = null;
        if (jRadioButton_Mahasiswa.isSelected()) {
            dataPeminjam = new Mahasiswa(idPeminjam, nomorIdentitas, nama, alamat, maksPinjam);
        }
        if (jRadioButton_Dosen.isSelected()) {
            dataPeminjam = new Dosen(idPeminjam, nomorIdentitas, nama, alamat, maksPinjam);
        }
        if (jRadioButton_Umum.isSelected()) {
            dataPeminjam = new Umum(idPeminjam, nomorIdentitas, nama, alamat, maksPinjam);
        }
        this.dataPeminjam.isiDataPeminjam(dataPeminjam);
        tampilData();
        resetField();
    }//GEN-LAST:event_jButton_SimpanActionPerformed

    private void jRadioButton_MahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_MahasiswaActionPerformed
        jTextField_NomorIdentitas.setEnabled(true);
        String id = jTextField_IdPeminjam.getText();
        if (jRadioButton_Mahasiswa.isSelected()) {
            jLabel_Identitas.setText("NIM");
            int maksPinjam;
            jTextField_MaksPinjam.setText("5");
            jTextField_MaksPinjam.setEditable(false);
            maksPinjam = Integer.parseInt(jTextField_MaksPinjam.getText());
        }
    }//GEN-LAST:event_jRadioButton_MahasiswaActionPerformed

    private void jRadioButton_DosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_DosenActionPerformed
        jTextField_NomorIdentitas.setEnabled(true);
        String id = jTextField_IdPeminjam.getText();
        if (jRadioButton_Dosen.isSelected()) {
            Peminjam pinjam = new Dosen();
            pinjam.setIdPeminjam(id);
            jLabel_Identitas.setText("NIP");
            int maksPinjam;
            jTextField_MaksPinjam.setText("5");
            jTextField_MaksPinjam.setEditable(false);
            maksPinjam = Integer.parseInt(jTextField_MaksPinjam.getText());
        }
    }//GEN-LAST:event_jRadioButton_DosenActionPerformed

    private void jRadioButton_UmumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_UmumActionPerformed
        jTextField_NomorIdentitas.setEnabled(true);
        String id = jTextField_IdPeminjam.getText();
        if (jRadioButton_Umum.isSelected()) {
            Peminjam pinjam = new Umum();
            pinjam.setIdPeminjam(id);
            jLabel_Identitas.setText("NIK");
            int maksPinjam;
            jTextField_MaksPinjam.setText("5");
            jTextField_MaksPinjam.setEditable(false);
            maksPinjam = Integer.parseInt(jTextField_MaksPinjam.getText());
        }
    }//GEN-LAST:event_jRadioButton_UmumActionPerformed

    private void jButton_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ResetActionPerformed
        resetField();
    }//GEN-LAST:event_jButton_ResetActionPerformed

    private void jButton_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_HapusActionPerformed
        int a = jTable1.getSelectedRow();
        if (a == -1) {
        } else {
            dataPeminjam.peminjamList.remove(a);
        }
        resetField();
        tampilData();
    }//GEN-LAST:event_jButton_HapusActionPerformed

    private void jButton_KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_KembaliActionPerformed
        JFrame_Perpustakaan perpus = new JFrame_Perpustakaan();
        perpus.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_KembaliActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        resetField();
        int selectedRow = jTable1.getSelectedRow();
        jTextField_IdPeminjam.setText(jTable1.getValueAt(selectedRow, 0).toString());
        jTextField_Nama.setText(jTable1.getValueAt(selectedRow, 2).toString());
        jTextField_Alamat.setText(jTable1.getValueAt(selectedRow, 3).toString());

        if (jTable1.getValueAt(selectedRow, 0).toString().charAt(0) == 'M') {
            jRadioButton_Mahasiswa.setSelected(true);
            jLabel_Identitas.setText("NIM");
        }
        if (jTable1.getValueAt(selectedRow, 0).toString().charAt(0) == 'D') {
            jRadioButton_Dosen.setSelected(true);
            jLabel_Identitas.setText("NIP");
        }
        if (jTable1.getValueAt(selectedRow, 0).toString().charAt(0) == 'U') {
            jRadioButton_Umum.setSelected(true);
            jLabel_Identitas.setText("NIK");
        }

        jTextField_NomorIdentitas.setEnabled(true);
        jTextField_NomorIdentitas.setText(jTable1.getValueAt(selectedRow, 1).toString());
        jTextField_MaksPinjam.setEnabled(true);
        jTextField_MaksPinjam.setText(jTable1.getValueAt(selectedRow, 4).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField_IdPeminjamFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_IdPeminjamFocusLost
        if (jTextField_IdPeminjam.getText().isEmpty()) {
            return;
        }
        String cek = jTextField_IdPeminjam.getText();
        if (!cek.matches("^[M|D|U][\\d+].*")) {
            try {
                throw new Exception("\n ID harus diawali dengan huruf "
                        + "\n M (untuk Mahasiswa) atau "
                        + "\n D (untuk Dosen) atau "
                        + "\n U (untuk Umum) dan "
                        + "\n kemudian diikuti dengan angka \n \n "
                        + "Contoh : M1234 atau D1234 atau U1234");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jTextField_IdPeminjamFocusLost

    private void jTextField_NamaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_NamaFocusLost
        if (jTextField_Nama.getText().isEmpty()) {
            return;
        }
        String cek = jTextField_Nama.getText();
        if (cek.matches(".*[^a-zA-Z\\s+].*")) {
            try {
                throw new Exception("\n Nama harus berupa alfabet \n \n Contoh: Heru Suheru bukan Heru ke5");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jTextField_NamaFocusLost

    private void jTextField_NomorIdentitasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_NomorIdentitasFocusLost
        if (jTextField_NomorIdentitas.getText().isEmpty()) {
            return;
        }
        String cek = jTextField_NomorIdentitas.getText();
        if (jRadioButton_Mahasiswa.isSelected()) {
            try {
                if (!cek.matches("[0-9]{9}")) {
                    throw new Exception("\n Jumlah Input NIM Harus 9 angka"
                            + "\n \n Contoh : 205314020");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } else if (jRadioButton_Dosen.isSelected()) {
            try {
                if (!cek.matches("[0-9]{18}")) {
                    throw new Exception("\n Jumlah Input NIP Harus 18 angka"
                            + "\n \n Contoh : 205314020846273465");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } else if (jRadioButton_Umum.isSelected()) {
            try {
                if (!cek.matches("[0-9]{16}")) {
                    throw new Exception("\n Jumlah Input NIK Harus 16 angka"
                            + "\n \n Contoh : 2053140206237436");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jTextField_NomorIdentitasFocusLost

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        int selectedRow = jTable1.getSelectedRow();
        jTextField_IdPeminjam.setText(jTable1.getValueAt(selectedRow, 0).toString());
        jTextField_Nama.setText(jTable1.getValueAt(selectedRow, 2).toString());
        jTextField_Alamat.setText(jTable1.getValueAt(selectedRow, 3).toString());
        if (jTable1.getValueAt(selectedRow, 0).toString().charAt(0) == 'M') {
            jRadioButton_Mahasiswa.setSelected(true);
            jLabel_Identitas.setText("NIM");
        }
        if (jTable1.getValueAt(selectedRow, 0).toString().charAt(0) == 'D') {
            jRadioButton_Dosen.setSelected(true);
            jLabel_Identitas.setText("NIP");
        }
        if (jTable1.getValueAt(selectedRow, 0).toString().charAt(0) == 'U') {
            jRadioButton_Umum.setSelected(true);
            jLabel_Identitas.setText("NIK");
        }
        jTextField_NomorIdentitas.setEnabled(true);
        jTextField_NomorIdentitas.setText(jTable1.getValueAt(selectedRow, 1).toString());
        jTextField_MaksPinjam.setEnabled(true);
        jTextField_MaksPinjam.setText(jTable1.getValueAt(selectedRow, 4).toString());
    }//GEN-LAST:event_jTable1KeyPressed

    public void resetField() {
        jTextField_IdPeminjam.setText("");
        jTextField_Nama.setText("");
        jTextField_Alamat.setText("");
        jTextField_MaksPinjam.setText("");
        buttonGroup_JenisPeminjam.clearSelection();
        jLabel_Identitas.setText("NIM/NIP/NIK");
        jTextField_NomorIdentitas.setText("");
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
            java.util.logging.Logger.getLogger(JDialogTambahDataPeminjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogTambahDataPeminjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogTambahDataPeminjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogTambahDataPeminjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                JDialogTambahDataPeminjam dialog = new JDialogTambahDataPeminjam(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup buttonGroup_JenisPeminjam;
    private javax.swing.JButton jButton_Edit;
    private javax.swing.JButton jButton_Hapus;
    private javax.swing.JButton jButton_Kembali;
    private javax.swing.JButton jButton_Reset;
    private javax.swing.JButton jButton_Simpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Identitas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton_Dosen;
    private javax.swing.JRadioButton jRadioButton_Mahasiswa;
    private javax.swing.JRadioButton jRadioButton_Umum;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_Alamat;
    private javax.swing.JTextField jTextField_IdPeminjam;
    private javax.swing.JTextField jTextField_MaksPinjam;
    private javax.swing.JTextField jTextField_Nama;
    private javax.swing.JTextField jTextField_NomorIdentitas;
    // End of variables declaration//GEN-END:variables
}
