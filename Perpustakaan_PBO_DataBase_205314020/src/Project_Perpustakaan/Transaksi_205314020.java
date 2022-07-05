package Project_Perpustakaan;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Transaksi_205314020 implements Serializable{
    private static final long serialVersionUID = 1L;
    
    protected String id_transaksi;
    protected LocalDate tgl_pinjam;
    protected LocalDate tgl_kembali;
    protected float denda;
    public Koleksi_205314020 kol;
    public ArrayList<Koleksi_205314020>arrKoleksi = new ArrayList<Koleksi_205314020>();
    protected static float hargaDenda = 2000;
    protected Peminjam_205314020 peminjam;

    public Transaksi_205314020(String id_transaksi, LocalDate tgl_pinjam, LocalDate tgl_kembali, float denda, ArrayList<Koleksi_205314020> arkoleksi, Peminjam_205314020 peminjam) {
        this.id_transaksi = id_transaksi;
        this.tgl_pinjam = tgl_pinjam;
        this.tgl_kembali = tgl_kembali;
        this.denda = denda;
        this.arrKoleksi = arkoleksi;
        this.peminjam = peminjam;
    }
    
    public Transaksi_205314020(String id_transaksi, LocalDate tgl_pinjam, LocalDate tgl_kembali, float denda, Koleksi_205314020 kol, Peminjam_205314020 peminjam) {
        this.id_transaksi = id_transaksi;
        this.tgl_pinjam = tgl_pinjam;
        this.tgl_kembali = tgl_kembali;
        this.denda = denda;
        this.kol = kol;
        this.peminjam = peminjam;
    }

    public Koleksi_205314020 getKol() {
        return kol;
    }

    public void setKol(Koleksi_205314020 kol) {
        this.kol = kol;
    }

    
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


    public Peminjam_205314020 getPeminjam() {
        return peminjam;
    }

    public void setPeminjam(Peminjam_205314020 peminjam) {
        this.peminjam = peminjam;
    }

    public ArrayList<Koleksi_205314020> getArrKoleksi() {
        return arrKoleksi;
    }

    public void setArrKoleksi(ArrayList<Koleksi_205314020> arrKoleksi) {
        this.arrKoleksi = arrKoleksi;
    }

    public static float getHargaDenda() {
        return hargaDenda;
    }

    public static void setHargaDenda(float hargaDenda) {
        Transaksi_205314020.hargaDenda = hargaDenda;
    }

    
    public void pinjam(String id_transaksi, ArrayList<Koleksi_205314020> arkoleksi, Peminjam_205314020 peminjam){
        this.id_transaksi = id_transaksi;
        tgl_pinjam = LocalDate.now();
        tgl_kembali = tgl_pinjam.plusDays(30);
        this.denda = 0;
        this.setArrKoleksi(arkoleksi);
        this.peminjam = peminjam;
    }
    
    public void kembali(){
        LocalDate harini = LocalDate.now();
        this.tgl_kembali = harini;
        long telat =  ChronoUnit.DAYS.between(tgl_pinjam, harini);
        if (telat > 30) {
            denda = (telat - 30)* getHargaDenda();
        }
    }
}
