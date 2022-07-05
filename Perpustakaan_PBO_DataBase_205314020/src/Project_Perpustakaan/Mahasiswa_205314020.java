package Project_Perpustakaan;

import java.io.Serializable;

public class Mahasiswa_205314020 extends Peminjam_205314020 implements Serializable{
    private static final long serialVersionUID = 1L;
    protected String nim;

    public Mahasiswa_205314020(String id_peminjam,String nim, String nama, String alamat, int maks_pinjam) {
        super(id_peminjam, nama, alamat, maks_pinjam);
        this.nim = nim;
    }
    
    public Mahasiswa_205314020() {
    }
    
    @Override
    public String toString() {
        return "\nID Peminjam  : " + getId_peminjam()+
               "\nNIM          : " + getNim() +
               "\nNama Lengkap : " + getNama()+
               "\nAlamat       : " + getAlamat()+
               "\nMaks Pinjam Saat Ini : " + getMaks_pinjam();
    }


    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}
