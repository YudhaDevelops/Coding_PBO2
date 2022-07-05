package Project_Perpustakaan;

import java.io.Serializable;

public class Disk_205314020 extends Koleksi_205314020 implements Serializable{
    private static final long serialVersionUID = 1L;
    protected String format;
    protected String ISBN;

    public Disk_205314020() {
    }
    //id_koleksi, judul, penerbit, tahun_terbit, status_pinjam, format, isbn
    public Disk_205314020(String id_koleksi, String judul, String penerbit, String tahunTerbit, boolean status_pinjam,String format, String ISBN) {
        super(id_koleksi, judul, penerbit, status_pinjam, tahunTerbit);
        this.format = format;
        this.ISBN = ISBN;
    }

    
    @Override
    public String toString() {
        return "Disk{" + "format=" + format + ", ISBN=" + ISBN + '}';
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
