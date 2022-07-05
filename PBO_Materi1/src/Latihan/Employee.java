package Latihan;


public class Employee {
    String nama,pekerjaan;
    int id;
    public Employee() {
    }

    public Employee(int id, String nama, String pekerjaan ) {
        this.nama = nama;
        this.pekerjaan = pekerjaan;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
    
}
