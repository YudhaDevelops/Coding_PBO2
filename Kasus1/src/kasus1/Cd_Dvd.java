package kasus1;
public class Cd_Dvd extends Koleksi implements Pinjam{
    private String dataISBN, format;

    public Cd_Dvd() {
    }

    public Cd_Dvd(String dataISBN, String format) {
        this.dataISBN = dataISBN;
        this.format = format;
    }

    public Cd_Dvd(String dataISBN, String format, String idKoleksi, String judul, String penerbit, String tahunTerbit) {
        super(idKoleksi, judul, penerbit, tahunTerbit);
        this.dataISBN = dataISBN;
        this.format = format;
    }
    
    public String getDataISBN() {
        return dataISBN;
    }

    public void setDataISBN(String dataISBN) {
        this.dataISBN = dataISBN;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
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
