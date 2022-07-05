package Project_Perpustakaan;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DataPenyimpanan_205314020 {

    ArrayList<Peminjam_205314020> peminjamList = new ArrayList<>(); //dosen mahasiswa umum
    ArrayList<Koleksi_205314020> koleksiList = new ArrayList<>(); // buku majalah disk
    ArrayList<Transaksi_205314020> transaksiList = new ArrayList<>();
    String jdbcURL = "jdbc:mysql://localhost:3306/aplikasi_perpustakaan?autoReconnect=true&useSSL=false"; //khusus untuk workbench
    String userid = "root";
    String password = "admin";
    Connection conn;
    Statement stmt;
    ResultSet rset;
    String query;
    DBPerpus_205314020 dbPerpus;
    

    public DataPenyimpanan_205314020() {
        dbPerpus = new DBPerpus_205314020("root","admin");
        try {
            peminjamList = dbPerpus.getPeminjam();
            koleksiList = dbPerpus.getKoleksi();
        } catch (SQLException ex) {
            Logger.getLogger(DataPenyimpanan_205314020.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void refreshPeminjam() {
        peminjamList.clear();
        try {
            peminjamList = dbPerpus.getPeminjam();
        } catch (Exception ex) {
            Logger.getLogger(DataPenyimpanan_205314020.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void refreshKoleksi() {
        koleksiList.clear();
        try {
            koleksiList = dbPerpus.getKoleksi();
        } catch (Exception ex) {
            Logger.getLogger(DataPenyimpanan_205314020.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void refreshTransaksi() {
        transaksiList.clear();
        try {
            transaksiList = dbPerpus.getTransaksi();
        } catch (Exception ex) {
            Logger.getLogger(DataPenyimpanan_205314020.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void isiDataPeminjam(Peminjam_205314020 value) {
        try {
            peminjamList.add(value);
        } catch (Exception e) {
            Logger.getLogger(DataPenyimpanan_205314020.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void isiDataKoleksi(Koleksi_205314020 value) {
        try {
            koleksiList.add(value);
        } catch (Exception e) {
            Logger.getLogger(DataPenyimpanan_205314020.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void isiDataTransaksi(Transaksi_205314020 value) {
        try {
            transaksiList.add(value);
        } catch (Exception e) {
            Logger.getLogger(DataPenyimpanan_205314020.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public Connection getDBConnection() {
        try {
            conn = DriverManager.getConnection(jdbcURL, userid, password);
            this.conn = conn;
            System.out.println("Koneksi berhasil");
        } catch (Exception e) {// perform error handling here
            System.out.println("Masih belum konek");
        }
        return conn;
    }

    public void closeConnection() {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Tidak bisa tutup koneksi");
        }
    }
    
    public void tambahDataPeminjam(String id_peminjam, String nmr_identitas, String nama, String alamat, int maks_pinjam) {
        DataPenyimpanan_205314020 c = new DataPenyimpanan_205314020();
        
        PreparedStatement pst;
        try {
            String query = "INSERT INTO peminjam VALUES ('" + id_peminjam + "','" + nmr_identitas + "','" + nama + "','" + alamat + "','" + maks_pinjam + "');";
            System.out.println("\nExecuting query: " + query);
            pst = c.getDBConnection().prepareStatement(query);
            pst.execute();
            System.out.println("Berhasil di simpan");
        } catch (SQLException | HeadlessException ex) {
            Logger.getLogger(DataPenyimpanan_205314020.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void hapusDataPeminjam_semua(){
        DataPenyimpanan_205314020 c = new DataPenyimpanan_205314020();
        PreparedStatement pst;
        try {
            String query = "DELETE FROM peminjam;";
            System.out.println("\nExecuting query: " + query);
            pst = c.getDBConnection().prepareStatement(query);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Peminjam Berhasil Di Hapus","Info",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException | HeadlessException ex) {
            Logger.getLogger(DataPenyimpanan_205314020.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tambahDataKoleksi(String id_koleksi, String judul, String penerbit, String tahunTerbit, int status_pinjam,String tipeKoleksi, String ISBN_ISSN,int halaman,String format,int volume,int seri) {
        DataPenyimpanan_205314020 c = new DataPenyimpanan_205314020();
        
        PreparedStatement pst;
        try {
            query = "INSERT INTO koleksi VALUES ('"+id_koleksi+"','"+judul+"','"+penerbit+"','"+tahunTerbit+"','"+status_pinjam+"','"+tipeKoleksi+"','"+ISBN_ISSN+"','"+halaman+"','"+format+"','"+volume+"','"+seri+"')";
            System.out.println("\nExecuting query: " + query);
            pst = c.getDBConnection().prepareStatement(query);
            pst.execute();
            System.out.println("Berhasil di simpan");
        } catch (SQLException | HeadlessException ex) {
            Logger.getLogger(DataPenyimpanan_205314020.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void hapusDataKoleksi_semua(){
        DataPenyimpanan_205314020 c = new DataPenyimpanan_205314020();
        PreparedStatement pst;
        try {
            String query = "DELETE FROM koleksi;";
            System.out.println("\nExecuting query: " + query);
            pst = c.getDBConnection().prepareStatement(query);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Koleksi Berhasil Di Hapus","Info",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException | HeadlessException ex) {
            Logger.getLogger(DataPenyimpanan_205314020.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet tampilKoleksiBuku(){
        DataPenyimpanan_205314020 c = new DataPenyimpanan_205314020();
        try {
            stmt = c.getDBConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);  
            //"ID Koleksi_205314020", "Nomor ISBN", "Judul", "Penerbit", "Tahun Terbit", "Status Peminjam_205314020", "Jumlah Halaman"
            query = "select idKoleksi,ISBN_ISSN,judul, penerbit,tahunTerbit,status_pinjam,jumlahHalaman from koleksi where idKoleksi LIKE 'B%';";
            System.out.println("\nExecuting query: " + query);
            rset = stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(DataPenyimpanan_205314020.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rset;
    }
}
