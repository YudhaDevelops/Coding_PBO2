package SemuaLatihan;

import javax.swing.*;
//Nama : FX.Bima Yudha Pratama
//NIM : 205314020

public class ContohDialog1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contoh Frame 205314020 FX.Bima Yudha Pratama");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.show();

	JOptionPane.showConfirmDialog(frame,"Contoh dialog konfirmasi ...",
                "Judul Dialog 205314020 FX. Bima Yudha Pratama",
	JOptionPane.OK_CANCEL_OPTION, 	//Jenis Tombol
	JOptionPane.QUESTION_MESSAGE);	//Icon

    }
    
}
