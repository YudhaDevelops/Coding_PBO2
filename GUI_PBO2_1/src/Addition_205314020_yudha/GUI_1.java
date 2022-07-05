package Addition_205314020_yudha;
import javax.swing.JOptionPane;
/*
Nama : Fx. Bima Yudha Pratama
NIM : 205314020
*/

public class GUI_1 {
    public static void main(String[] args) 
    {
        /*menyediakan user input dari JOptionpane input dialog*/
        String angka1 = JOptionPane.showInputDialog("205314020 FX.Bima Yudha Pratama \n Masukkan Bilangan Bulat Pertama");
        String angka2 = JOptionPane.showInputDialog("205314020 FX.Bima Yudha Pratama \n Masukkan Bilangan Bulat Kedua");
        
        //konversi String input ke nilai integer untuk di operasikan 
        int bil1 = Integer.parseInt(angka1);
        int bil2 = Integer.parseInt(angka2);
        
        int hasil = bil1 + bil2; //hasil dari penjumlahan bilangan 1 dengan bilangan 2
        
        //menampilkan hasil perhitungan di JOptionpane message dialog
        JOptionPane.showMessageDialog( null, 
                "205314020 FX.Bima Yudha Pratama \n " + 
                "=============================== \n " + 
                "Hasil Penjumlahannya Adalah " + hasil,"Penjumlahan 2 Bilangan Bulat", JOptionPane.PLAIN_MESSAGE );   
    }
}
