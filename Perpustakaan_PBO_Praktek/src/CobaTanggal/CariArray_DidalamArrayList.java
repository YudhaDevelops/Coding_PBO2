package CobaTanggal;

import java.util.ArrayList;

class Barang {

    // atribut
    String kodeBarang;
    String namaBarang;
    int hargaBarang;

    // konstruktor
    public Barang(String kode, String nama, int harga) {
        this.kodeBarang = kode;
        this.namaBarang = nama;
        this.hargaBarang = harga;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    // method untuk menampilkan object Barang 
    void print() {
        System.out.println("");
        System.out.print("Kode Barang: " + this.kodeBarang);
        System.out.print("Nama Barang: " + this.namaBarang);
        System.out.print("Harga      : " + this.hargaBarang);
        System.out.println("");
    }

}

class DataBarang {

    ArrayList<Barang> dataBarang = new ArrayList<Barang>();

    public void tambahBarang(Barang data) {
        this.dataBarang.add(data);
    }

    void hapusBarang(String kode) {
        this.dataBarang.removeIf(item -> item.kodeBarang == kode);
    }

    void cariBarang(String kode) {
        boolean ditemukan = false;
        int index = -1;
        for (int i = 0; i < this.dataBarang.size(); i++) {
            if (this.dataBarang.get(i).kodeBarang == kode) {
                index = i;
                ditemukan = true;
            }
        }

        if (ditemukan == true) {
            String[] arrData = {this.dataBarang.get(index).getKodeBarang(), this.dataBarang.get(index).getNamaBarang(), Integer.toString(this.dataBarang.get(index).getHargaBarang())};

            for (String b : arrData) {
                System.out.print(b + ",");
            }
//            this.dataBarang.get(index).print();
        } else {
            System.out.println("Data barang tidak ditemukan");
        }
    }

    void tampilBarang() {
        System.out.println("-----------------");
        for (Barang item : this.dataBarang) {
            item.print();
        }
    }
}

public class CariArray_DidalamArrayList {

    public static void main(String[] args) {
        DataBarang a = new DataBarang();
        Barang brg;
        brg = new Barang("K01", "Sabun mandi", 7500);
        a.tambahBarang(brg);
        brg = new Barang("K02", "Sikat gigi", 8200);
        a.tambahBarang(brg);
        brg = new Barang("K03", "Shampoo", 15000);
        a.tambahBarang(brg);

        // menampilkan semua data barang dari array list
        a.tampilBarang();

        // mencari data barang berkode 'K03'
        System.out.println("");
        System.out.println("Cari barang code K03");
        a.cariBarang("K03");
        System.out.println("");

        // menghapus data barang berkode 'K02'
        a.hapusBarang("K02");

        // tampilkan data lagi untuk melihat perubahannya
        a.tampilBarang();
    }

}
