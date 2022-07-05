package pegawai;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;

public class frPegawai extends javax.swing.JFrame {

    dataPegawai dtPegawai = new dataPegawai();
    DefaultTableModel tabelModel;
    TableColumnModel columnModel;
    
    public frPegawai() {
        initComponents();
        dtPegawai.fillData();
        tampilData();
    }

    public void tampilData(){
        String[] kolom = {"Nama","Alamat","Gaji", "Tanggal Lahir"};
        Object[][] objData = new Object[dtPegawai.pegawaiList.size()][4]; // 4 merupakan jumlah kolom
        int i = 0;
        for(Pegawai n : dtPegawai.pegawaiList){
            String[] arrData = {n.getNama(), n.getAlamat(), String.valueOf(n.getJumGaji()), dateFormat.format(n.getTgLahir())};
            objData[i] = arrData;
            i++;
        }
        tabelModel = new DefaultTableModel(objData,kolom){
            //membuat tabel tidak bisa diedit saat diklik
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        jTable1.setModel(tabelModel);
        columnModel = jTable1.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(100);
        columnModel.getColumn(1).setPreferredWidth(400);
        columnModel.getColumn(2).setPreferredWidth(50);
        columnModel.getColumn(3).setPreferredWidth(75);
    }
    
    public void isiData(String nama, String alamat, int gaji, Date tgl){
        Pegawai peg = new Pegawai(nama, alamat, gaji, tgl);
        dtPegawai.pegawaiList.add(peg);
    }
    
    private void clrInput(){
        jTextField_nama.setText("");
        jTextField_alamat.setText("");
        jTextField_Gaji.setText("");
        jTextField_Tgl_Lahir.setText("");
        jTextField_nama.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_nama = new javax.swing.JTextField();
        jTextField_alamat = new javax.swing.JTextField();
        jTextField_Gaji = new javax.swing.JTextField();
        jTextField_Tgl_Lahir = new javax.swing.JTextField();
        btn_Tambah = new javax.swing.JButton();
        btn_Hapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Form Data Pegawai"));

        jLabel1.setText("Nama            :");

        jLabel2.setText("Alamat          :");

        jLabel3.setText("Gaji               :");

        jLabel4.setText("Tanggal Lahir :");

        jTextField_Gaji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_GajiActionPerformed(evt);
            }
        });

        btn_Tambah.setText("Tambah");
        btn_Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TambahActionPerformed(evt);
            }
        });

        btn_Hapus.setText("Hapus");
        btn_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_Gaji, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addComponent(jTextField_nama)
                    .addComponent(jTextField_alamat)
                    .addComponent(jTextField_Tgl_Lahir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Tambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_Gaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btn_Tambah)
                        .addGap(61, 61, 61)
                        .addComponent(btn_Hapus)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_Tgl_Lahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(765, 573));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TambahActionPerformed
        String vName= jTextField_nama.getText();
        String vLoc= jTextField_alamat.getText();
        String vSalary= jTextField_Gaji.getText();
        String vDate= jTextField_Tgl_Lahir.getText();
         
        try{
            if( vName.matches(".*[^a-zA-Z\\s+].*")) {
                throw new Exception("Nama harus berupa alfabet");
            }
            isiData((vName), vLoc, Integer.parseInt(vSalary), dateFormat.parse(vDate));
        }catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(this, "Gaji harus Angka !!","Warning",JOptionPane.WARNING_MESSAGE);
        }catch (ParseException ert)  {
            JOptionPane.showMessageDialog(this, "Tanggal yang anda masukkan salah!!","Warning",JOptionPane.WARNING_MESSAGE);
        }catch (Exception exception) {
            JOptionPane.showMessageDialog(this, exception.getMessage(),"Warning",JOptionPane.WARNING_MESSAGE);
        }
        tampilData();
        clrInput();
    }//GEN-LAST:event_btn_TambahActionPerformed

    private void btn_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HapusActionPerformed
        int a = jTable1.getSelectedRow();
        if (a == -1) {} else {dtPegawai.pegawaiList.remove(a);}
        clrInput();
        tampilData();
    }//GEN-LAST:event_btn_HapusActionPerformed

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        int selectedRow = jTable1.getSelectedRow();
        jTextField_nama.setText(tabelModel.getValueAt(selectedRow, 0).toString());
        jTextField_alamat.setText(tabelModel.getValueAt(selectedRow, 1).toString());
        jTextField_Gaji.setText(tabelModel.getValueAt(selectedRow, 2).toString());
        jTextField_Tgl_Lahir.setText(tabelModel.getValueAt(selectedRow, 3).toString());
    }//GEN-LAST:event_jTable1KeyPressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int selectedRow = jTable1.getSelectedRow();
        jTextField_nama.setText(tabelModel.getValueAt(selectedRow, 0).toString());
        jTextField_alamat.setText(tabelModel.getValueAt(selectedRow, 1).toString());
        jTextField_Gaji.setText(tabelModel.getValueAt(selectedRow, 2).toString());
        jTextField_Tgl_Lahir.setText(tabelModel.getValueAt(selectedRow, 3).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField_GajiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_GajiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_GajiActionPerformed

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
            java.util.logging.Logger.getLogger(frPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                new frPegawai().setVisible(true);
            }
        });
    }
private static DateFormat dateFormat;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Hapus;
    private javax.swing.JButton btn_Tambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_Gaji;
    private javax.swing.JTextField jTextField_Tgl_Lahir;
    private javax.swing.JTextField jTextField_alamat;
    private javax.swing.JTextField jTextField_nama;
    // End of variables declaration//GEN-END:variables
}
