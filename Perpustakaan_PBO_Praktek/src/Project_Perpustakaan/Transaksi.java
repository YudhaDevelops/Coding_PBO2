package Project_Perpustakaan;
import java.io.Serializable;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class Transaksi implements Serializable{
    private static final long serialVersionUID = 1L;
    
    protected String id_transaksi;
    protected LocalDate tgl_pinjam;
    protected LocalDate tgl_kembali;
    protected float denda;
    protected Koleksi [] koleksi;
    protected Koleksi kol;
    protected Peminjam peminjam;

    public Transaksi(String id_transaksi, LocalDate tgl_pinjam, LocalDate tgl_kembali, float denda, Koleksi[] koleksi, Peminjam peminjam) {
        this.id_transaksi = id_transaksi;
        this.tgl_pinjam = tgl_pinjam;
        this.tgl_kembali = tgl_kembali;
        this.denda = denda;
        this.koleksi = koleksi;
        this.peminjam = peminjam;
    }

    public Transaksi(String id_transaksi, LocalDate tgl_pinjam, LocalDate tgl_kembali, float denda, Koleksi koleksi, Peminjam peminjam) {
        this.id_transaksi = id_transaksi;
        this.tgl_pinjam = tgl_pinjam;
        this.tgl_kembali = tgl_kembali;
        this.denda = denda;
        this.kol = koleksi;
        this.peminjam = peminjam;
    }
    
//    public Peminjam getPeminjam(){
//        //String id_peminjam, String nama, String alamat, int maks_pinjam
//        peminjam = new Peminjam(
//                peminjam.getId_peminjam()
//        );
//        return peminjam;
//    }
    
    public String getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(String id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public LocalDate getTgl_pinjam() {
        return tgl_pinjam;
    }

    public void setTgl_pinjam(LocalDate tgl_pinjam) {
        this.tgl_pinjam = tgl_pinjam;
    }

    public LocalDate getTgl_kembali() {
        return tgl_kembali;
    }

    public void setTgl_kembali(LocalDate tgl_kembali) {
        this.tgl_kembali = tgl_kembali;
    }

    public float getDenda() {
        return denda;
    }

    public void setDenda(float denda) {
        this.denda = denda;
    }

    public Koleksi getKol() {
        return kol;
    }

    public void setKol(Koleksi kol) {
        this.kol = kol;
    }
    
    
    
    public Koleksi[] getKoleksi() {
        return koleksi;
    }

    public void setKoleksi(Koleksi[] koleksi) {
        this.koleksi = koleksi;
    }

    public Peminjam getPeminjam() {
        return peminjam;
    }

    public void setPeminjam(Peminjam peminjam) {
        this.peminjam = peminjam;
    }

    
    @Override
    public String toString() {
        return "Transaksi{" + "id_transaksi=" + id_transaksi + ", tgl_pinjam=" + tgl_pinjam + ", tgl_kembali=" + tgl_kembali + ", denda=" 
                + denda + ", koleksi=" + koleksi + ", peminjam=" + peminjam + '}';
    }
    
    public void pinjam(){
        
    }
    
    public void kembali(){
        
    }
}
