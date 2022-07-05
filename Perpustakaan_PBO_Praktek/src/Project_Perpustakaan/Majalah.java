package Project_Perpustakaan;

import java.io.Serializable;

public class Majalah extends Koleksi implements Serializable{
    private static final long serialVersionUID = 1L;
    protected int volume;
    protected int seri;
    protected String ISSN;

    public Majalah() {
    }

    public Majalah( String id_koleksi, String judul, String penerbit, String tahunTerbit, boolean status_pinjam,String tipeKoleksi,String ISSN,int volume, int seri) {
        super(id_koleksi, judul, penerbit, tahunTerbit, status_pinjam,tipeKoleksi);
        this.volume = volume;
        this.seri = seri;
        this.ISSN = ISSN;
    }
    @Override
    public String toString() {
        return "Majalah{" + "volume=" + volume + ", seri=" + seri + ", ISSN=" + ISSN + '}';
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getSeri() {
        return seri;
    }

    public void setSeri(int seri) {
        this.seri = seri;
    }

    public String getISSN() {
        return ISSN;
    }

    public void setISSN(String ISSN) {
        this.ISSN = ISSN;
    }
}
