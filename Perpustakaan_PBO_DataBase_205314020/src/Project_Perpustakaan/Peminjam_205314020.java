package Project_Perpustakaan;
public class Peminjam_205314020 {
    protected String id_peminjam;
    protected String nama;
    protected String alamat;
    protected int maks_pinjam;

    public Peminjam_205314020() {
    }

    
    public Peminjam_205314020(String id_peminjam, String nama, String alamat, int maks_pinjam) {
        this.id_peminjam = id_peminjam;
        this.nama = nama;
        this.alamat = alamat;
        this.maks_pinjam = maks_pinjam;
    }

    
    @Override
    public String toString() {
        return "Peminjam{" + "id_peminjam=" + id_peminjam + ", nama=" + nama + ", alamat=" + alamat + ", maks_pinjam=" + maks_pinjam + '}';
    }

    void setIdPeminjam(String id) {
        
    }

    public String getId_peminjam() {
        return id_peminjam;
    }

    public void setId_peminjam(String id_peminjam) {
        this.id_peminjam = id_peminjam;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getMaks_pinjam() {
        return maks_pinjam;
    }

    public void setMaks_pinjam(int maks_pinjam) {
        this.maks_pinjam = maks_pinjam;
    }
}
