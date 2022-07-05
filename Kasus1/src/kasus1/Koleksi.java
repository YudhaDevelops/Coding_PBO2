package kasus1;
public class Koleksi {
    private String idKoleksi,judul, penerbit,tahunTerbit;

    public Koleksi() {
    }

    public Koleksi(String idKoleksi, String judul, String penerbit, String tahunTerbit) {
        this.idKoleksi = idKoleksi;
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
    }

    public String getIdKoleksi() {
        return idKoleksi;
    }

    public void setIdKoleksi(String idKoleksi) {
        this.idKoleksi = idKoleksi;
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

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
    
    
}
