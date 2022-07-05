package Project_Perpustakaan;

import java.io.Serializable;

public class Umum extends Peminjam implements Serializable{
    private static final long serialVersionUID = 1L;
    protected String nik;

    public Umum() {
    }

    public Umum(String id_peminjam,String nik, String nama, String alamat, int maks_pinjam) {
        super(id_peminjam, nama, alamat, maks_pinjam);
        this.nik = nik;
    }

    
    @Override
    public String toString() {
        return "Umum{" + "nik=" + nik + '}';
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }
}
