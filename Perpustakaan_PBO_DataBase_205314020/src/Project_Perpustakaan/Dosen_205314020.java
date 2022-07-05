package Project_Perpustakaan;

import java.io.Serializable;

public class Dosen_205314020 extends Peminjam_205314020 implements Serializable{
    private static final long serialVersionUID = 1L;
    protected String nip;

    public Dosen_205314020() {
    }

    public Dosen_205314020(String id_peminjam,String nip, String nama, String alamat, int maks_pinjam) {
        super(id_peminjam, nama, alamat, maks_pinjam);
        this.nip = nip;
    }

    
    @Override
    public String toString() {
        return "Dosen{" + "nip=" + nip + '}';
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
}
