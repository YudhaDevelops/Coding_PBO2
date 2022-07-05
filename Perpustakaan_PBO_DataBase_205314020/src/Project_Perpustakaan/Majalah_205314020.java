package Project_Perpustakaan;

import java.io.Serializable;

public class Majalah_205314020 extends Koleksi_205314020 implements Serializable{
    private static final long serialVersionUID = 1L;
    protected int volume;
    protected int seri;
    protected String ISSN;

    public Majalah_205314020() {
    }

    public Majalah_205314020(String id_koleksi, String judul, String penerbit, String tahunTerbit, boolean status_pinjam,int volume, int seri, String ISSN) {
        super(id_koleksi, judul, penerbit, status_pinjam, tahunTerbit);
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
