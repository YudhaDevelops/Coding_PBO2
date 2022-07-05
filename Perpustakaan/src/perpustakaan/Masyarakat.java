package perpustakaan;

public class Masyarakat extends Orang implements Pinjaman{
    
    private int noKtp;

    public Masyarakat() {
    }

    public Masyarakat(int noKtp) {
        this.noKtp = noKtp;
    }

    public Masyarakat(int noKtp, String nama, String alamat) {
        super(nama, alamat);
        this.noKtp = noKtp;
    }
    

    public int getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(int noKtp) {
        this.noKtp = noKtp;
    }

    public void printPengembalian(){
        System.out.println(" \"Masyarakat\" ");
        System.out.println("Nomor Induk Pegawai = " + noKtp);
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
