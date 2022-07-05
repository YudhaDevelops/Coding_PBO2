package kasus1;
public class Buku extends Koleksi implements Pinjam{
    private String dataISBN;
    private int jumlahHalaman;

    public Buku() {
    }

    public Buku(String dataISBN, int jumlahHalaman) {
        this.dataISBN = dataISBN;
        this.jumlahHalaman = jumlahHalaman;
    }

    public Buku(String dataISBN, int jumlahHalaman, String idKoleksi, String judul, String penerbit, String tahunTerbit) {
        super(idKoleksi, judul, penerbit, tahunTerbit);
        this.dataISBN = dataISBN;
        this.jumlahHalaman = jumlahHalaman;
    }

    public String getDataISBN() {
        return dataISBN;
    }

    public void setDataISBN(String dataISBN) {
        this.dataISBN = dataISBN;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }
    
    @Override
    public String peminjam() {
        return("Peminjam");
    }

    @Override
    public void pencarian() {
        System.out.println("Pencarian");
    }
}
