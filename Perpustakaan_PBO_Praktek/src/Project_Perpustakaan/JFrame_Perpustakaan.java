package Project_Perpustakaan;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JFrame_Perpustakaan extends javax.swing.JFrame {
    public DataPenyimpanan transaksi;
    public DataPenyimpanan data;
    File file_peminjam = new File("Data_Peminjam.txt");
    File file_koleksi = new File("Data_Koleksi.txt");
    File file_transaksi = new File("Data_Transaksi.txt");
    
    
    public JFrame_Perpustakaan() {
        initComponents();
        transaksi = new DataPenyimpanan();
        data = new DataPenyimpanan();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_EditPeminjam = new javax.swing.JMenuItem();
        jMenuItem_EditKoleksi = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem_TransaksiPinjam = new javax.swing.JMenuItem();
        jMenuItem_TransaksiKembali = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem_KoleksiBuku = new javax.swing.JMenuItem();
        jMenuItem_KoleksiDisk = new javax.swing.JMenuItem();
        jMenuItem_KoleksiMajalah = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perpustakaan PBO 2 Praktikum 2");

        jMenu1.setText("Edit");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuItem_EditPeminjam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem_EditPeminjam.setText("Peminjam");
        jMenuItem_EditPeminjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_EditPeminjamActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_EditPeminjam);

        jMenuItem_EditKoleksi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem_EditKoleksi.setText("Koleksi");
        jMenuItem_EditKoleksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_EditKoleksiActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_EditKoleksi);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Transaksi");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuItem_TransaksiPinjam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem_TransaksiPinjam.setText("Pinjam");
        jMenuItem_TransaksiPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_TransaksiPinjamActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_TransaksiPinjam);

        jMenuItem_TransaksiKembali.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem_TransaksiKembali.setText("Kembali");
        jMenuItem_TransaksiKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_TransaksiKembaliActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_TransaksiKembali);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Tampil");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenu5.setText("Koleksi");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem_KoleksiBuku.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem_KoleksiBuku.setText("Buku");
        jMenuItem_KoleksiBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_KoleksiBukuActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_KoleksiBuku);

        jMenuItem_KoleksiDisk.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem_KoleksiDisk.setText("Disk");
        jMenuItem_KoleksiDisk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_KoleksiDiskActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_KoleksiDisk);

        jMenuItem_KoleksiMajalah.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem_KoleksiMajalah.setText("Majalah");
        jMenuItem_KoleksiMajalah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_KoleksiMajalahActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_KoleksiMajalah);

        jMenu3.add(jMenu5);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Help");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuItem1.setText("Tambah Otomatis");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItem2.setText("Tampil Peminjaman");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1302, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 573, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1318, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_TransaksiPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_TransaksiPinjamActionPerformed
        JDialogTransaksiPinjam dataPinjamKoleksi = new JDialogTransaksiPinjam(this,true,data);
        dataPinjamKoleksi.setVisible(true);
    }//GEN-LAST:event_jMenuItem_TransaksiPinjamActionPerformed

    private void jMenuItem_EditPeminjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_EditPeminjamActionPerformed
        JDialogTambahDataPeminjam tambahDataPeminjam = new JDialogTambahDataPeminjam(this,true,data);
        tambahDataPeminjam.setVisible(true);
    }//GEN-LAST:event_jMenuItem_EditPeminjamActionPerformed

    private void jMenuItem_EditKoleksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_EditKoleksiActionPerformed
        JDialogTambahKoleksi tambahDatakoleksi = new JDialogTambahKoleksi(this, true,data);
        tambahDatakoleksi.setVisible(true);
    }//GEN-LAST:event_jMenuItem_EditKoleksiActionPerformed

    private void jMenuItem_TransaksiKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_TransaksiKembaliActionPerformed
        JDialogTransaksiKembali dataKembaliKoleksi = new JDialogTransaksiKembali(this,true);
        dataKembaliKoleksi.setVisible(true);
    }//GEN-LAST:event_jMenuItem_TransaksiKembaliActionPerformed

    private void jMenuItem_KoleksiBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_KoleksiBukuActionPerformed
        JDialog_KoleksiBuku koleksiBuku = new JDialog_KoleksiBuku(this,true,data);
        koleksiBuku.setVisible(true);
    }//GEN-LAST:event_jMenuItem_KoleksiBukuActionPerformed

    private void jMenuItem_KoleksiDiskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_KoleksiDiskActionPerformed
        JDialog_KoleksiDisk koleksiDisk = new JDialog_KoleksiDisk(this,true,data);
        koleksiDisk.setVisible(true);
    }//GEN-LAST:event_jMenuItem_KoleksiDiskActionPerformed

    private void jMenuItem_KoleksiMajalahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_KoleksiMajalahActionPerformed
        JDialog_KoleksiMajalah koleksiMajalah = new JDialog_KoleksiMajalah(this,true,data);
        koleksiMajalah.setVisible(true);
    }//GEN-LAST:event_jMenuItem_KoleksiMajalahActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JDialog_Help help = new JDialog_Help(this, true,data);
        help.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JDialog_OutDataFile out = null;
        out = new JDialog_OutDataFile(this,true,data);
        out.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Perpustakaan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem_EditKoleksi;
    private javax.swing.JMenuItem jMenuItem_EditPeminjam;
    private javax.swing.JMenuItem jMenuItem_KoleksiBuku;
    private javax.swing.JMenuItem jMenuItem_KoleksiDisk;
    private javax.swing.JMenuItem jMenuItem_KoleksiMajalah;
    private javax.swing.JMenuItem jMenuItem_TransaksiKembali;
    private javax.swing.JMenuItem jMenuItem_TransaksiPinjam;
    // End of variables declaration//GEN-END:variables
}
