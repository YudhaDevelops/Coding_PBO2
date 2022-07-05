package Project_Perpustakaan;
public class Koleksi {
    protected String id_koleksi;
    protected String judul;
    protected String penerbit;
    protected boolean status_pinjam;
    protected String tahunTerbit;
    protected String tipeKoleksi;

    public Koleksi() {
    }

    
    public Koleksi(String id_koleksi, String judul, String penerbit,String tahunTerbit, boolean status_pinjam,String tipeKoleksi) {
        this.id_koleksi = id_koleksi;
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
        this.status_pinjam = status_pinjam;
        this.tipeKoleksi = tipeKoleksi;
    }

    
    @Override
    public String toString() {
        return "Koleksi{" + "id_koleksi=" + id_koleksi + ", judul=" + judul + ", penerbit=" + penerbit + ", status_pinjam=" + status_pinjam + '}';
    }

    public String getId_koleksi() {
        return id_koleksi;
    }

    public void setId_koleksi(String id_koleksi) {
        this.id_koleksi = id_koleksi;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public boolean isStatus_pinjam() {
        return status_pinjam;
    }

    
    public void setStatus_pinjam(boolean status_pinjam) {
        this.status_pinjam = status_pinjam;
    }

    public String getTipeKoleksi() {
        return tipeKoleksi;
    }

    public void setTipeKoleksi(String tipeKoleksi) {
        this.tipeKoleksi = tipeKoleksi;
    }

    
    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
    
}
