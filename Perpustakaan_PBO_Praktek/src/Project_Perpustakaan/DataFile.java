package Project_Perpustakaan;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DataFile {
    DataPenyimpanan dataPerpus;
    
    public DataFile(DataPenyimpanan data){
        this.dataPerpus = data;
    }
    
    public DataFile(){
        
    }
    
    public void isiPeminjamFile(){
        File file = new File("Data_Peminjam.txt");
        try (FileOutputStream fileOut = new FileOutputStream(file);
                ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(dataPerpus.peminjamList);
            JOptionPane.showMessageDialog(null, "Semua Data Peminjam Telah Di Simpan Ke Dalam File", "Info",JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JDialogTransaksiPinjam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JDialogTransaksiPinjam.class.getName()).log(Level.SEVERE, null, ex);
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data Peminjam Gagal Di Simpan Ke Dalam File", "Info Peringatan",JOptionPane.WARNING_MESSAGE);
            Logger.getLogger(JDialogTransaksiPinjam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void isiKoleksiFile(){
        File file = new File("Data_Koleksi.txt");
        try (FileOutputStream fileOut = new FileOutputStream(file);
                ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(dataPerpus.koleksiList);
            JOptionPane.showMessageDialog(null, "Semua Data Koleksi Telah Di Simpan Ke Dalam File", "Info",JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JDialogTransaksiPinjam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JDialogTransaksiPinjam.class.getName()).log(Level.SEVERE, null, ex);
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data Koleksi Gagal Di Simpan Ke Dalam File", "Info Peringatan",JOptionPane.WARNING_MESSAGE);
            Logger.getLogger(JDialogTransaksiPinjam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void delete_File() {
        String FOLDER_FILE = "D:\\KULIAH\\PBO II\\Tugas\\Netbean\\v8\\Perpustakaan_PBO_Praktek/";// folder/tempat penyimpanan file
        String NAMA_FILE = "Data_Transaksi.txt";// file yang akan dihapus
        File file = new File(FOLDER_FILE + "" + NAMA_FILE);
        if (file.delete())// method delete() yang digunakan untuk menghapus file
        {
            System.out.println("file berhasil dihapus !");
        } else {
            System.out.println("file gagal dihapus !");
        }
    }
    
    public ArrayList<Peminjam> tampilDataFilePeminjam(File file) {
        ArrayList<Peminjam>result = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis)) {
                result = (ArrayList<Peminjam>) ois.readObject();
            ois.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JDialog_OutDataFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JDialog_OutDataFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDialogTransaksiPinjam.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public ArrayList<Koleksi> tampilDataFileKoleksi(File file) {
        
        ArrayList<Koleksi>result = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis)) {
                result = (ArrayList<Koleksi>) ois.readObject();
            ois.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JDialog_OutDataFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JDialog_OutDataFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDialogTransaksiPinjam.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
}
