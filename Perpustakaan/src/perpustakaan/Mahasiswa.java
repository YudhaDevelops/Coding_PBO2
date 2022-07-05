
package perpustakaan;

public class Mahasiswa extends Orang implements Pinjaman {
    private int nim;

    public Mahasiswa() {
    }

    public Mahasiswa(int nim) {
        this.nim = nim;
    }
    
    public Mahasiswa(int nim, String nama, String alamat ){
        super(nama, alamat);
        this.nim = nim;
    }


    public int getNim() {
        return nim;
    }

    public void setNim(int  nim) {
        this.nim = nim;
    }
    
    public void printPengembalian(){
        System.out.println(" \"Mahasiswa\" ");
        System.out.println("Nomor Induk Mahasiswa = " + nim);
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
