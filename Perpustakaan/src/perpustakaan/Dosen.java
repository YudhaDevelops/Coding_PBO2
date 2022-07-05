package perpustakaan;

public class Dosen extends Orang implements Pinjaman{
    private int nip;

    public Dosen() {
    }

    public Dosen(int nip) {
        this.nip = nip;
    }
    public Dosen(int nip, String nama, String alamat) {
        super(nama, alamat);
        this.nip = nip;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }
    
    public void printPengembalian(){
        System.out.println(" \"Dosen\" ");
        System.out.println("Nomor Induk Pegawai = " + nip);
        System.out.println("Nama                  = " + super.getNama());
        System.out.println("Alamat                = " + super.getAlamat());
    }
    @Override
    public double getDenda() {
        return 0; 
    }

    @Override
    public String getTanggalKembali() {
        return("Tanggal Kembali"); 
    }
    
    
}
