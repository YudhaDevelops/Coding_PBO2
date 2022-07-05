package kasus1;
public class Majalah extends Koleksi implements Pinjam{
    private String iSSN,volume,series;

    public Majalah() {
    }

    public Majalah(String iSSN, String volume, String Series) {
        this.iSSN = iSSN;
        this.volume = volume;
        this.series = Series;
    }

    public Majalah(String iSSN, String volume, String Series, String idKoleksi, String judul, String penerbit, String tahunTerbit) {
        super(idKoleksi, judul, penerbit, tahunTerbit);
        this.iSSN = iSSN;
        this.volume = volume;
        this.series = Series;
    }

    public String getiSSN() {
        return iSSN;
    }

    public void setiSSN(String iSSN) {
        this.iSSN = iSSN;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String Series) {
        this.series = Series;
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
