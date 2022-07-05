package Project_Perpustakaan;

import java.io.Serializable;

public class Buku extends Koleksi implements Serializable{
    private static final long serialVersionUID = 1L;
    int halaman;
    String ISBN;

    public Buku() {
    }

    public Buku(String id_koleksi, String judul, String penerbit, String tahunTerbit, boolean status_pinjam,String tipeKoleksi,int halaman, String ISBN) {
        super(id_koleksi, judul, penerbit, tahunTerbit, status_pinjam,tipeKoleksi);
        this.halaman = halaman;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
//        return new StringBuffer(" First Name: ").append(this.first_name).append(" Last Name : ").append(this.last_name).append(" Age : ").append(this.age).toString();
        return new StringBuffer("Buku = ").append(this.id_koleksi).append(",judul = ").append(this.judul).append(",penerbit = ").append(this.penerbit).append(",tahunTerbit").append(this.tahunTerbit).append(",status_pinjam = ").append(this.status_pinjam)
                .append(",tipeKoleksi = ").append(this.tipeKoleksi).append(",halaman = ").append(",ISBN =").append(this.ISBN).append(this.halaman).toString();
    }

    public int getHalaman() {
        return halaman;
    }

    public void setHalaman(int halaman) {
        this.halaman = halaman;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isStatus_pinjam() {
        return status_pinjam;
    }
}
