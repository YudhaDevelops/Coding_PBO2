package Project_Perpustakaan;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataPenyimpanan {
    
    ArrayList<Peminjam>peminjamList = new ArrayList<>(); //dosen mahasiswa umum
    ArrayList<Koleksi>koleksiList = new ArrayList<>(); // buku majalah disk
    ArrayList<Transaksi>transaksiList = new ArrayList<>();
    
    ArrayList<Koleksi>bukuList = new ArrayList<>();
    ArrayList<Koleksi>diskList = new ArrayList<>();
    ArrayList<Koleksi>majalahList = new ArrayList<>();
    
    public DataPenyimpanan() {
    }
    
    public void isiDataPeminjam(Peminjam value){
        try{
            peminjamList.add(value);
        }catch(Exception e){
            Logger.getLogger(DataPenyimpanan.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void isiDataKoleksi(Koleksi value){
        try{
            koleksiList.add(value);
        }catch(Exception e){
            Logger.getLogger(DataPenyimpanan.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void isiDataTransaksi(Transaksi value){
        try{
            transaksiList.add(value);
        }catch(Exception e){
            Logger.getLogger(DataPenyimpanan.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void isiDataBuku(Koleksi value){
        try{
            bukuList.add(value);
        }catch(Exception e){
            Logger.getLogger(DataPenyimpanan.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void isiDataDisk(Koleksi value){
        try{
            diskList.add(value);
        }catch(Exception e){
            Logger.getLogger(DataPenyimpanan.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void isiDataMajalah(Koleksi value){
        try{
            majalahList.add(value);
        }catch(Exception e){
            Logger.getLogger(DataPenyimpanan.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
