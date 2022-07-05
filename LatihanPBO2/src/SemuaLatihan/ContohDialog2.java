package SemuaLatihan;

import javax.swing.*;
//Nama : FX. Bima Yudha Pratama
//NIM : 205314020
public class ContohDialog2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contoh Frame FX. Bima Yudha Pratama");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(400,150);
	frame.show();
		
	JDialog dlg = new JDialog (frame,"Dialog 1 205314020 FX.Bima Yudha Pratama",true);
	dlg.setSize(200,100);
	dlg.show();

    }
    
}
