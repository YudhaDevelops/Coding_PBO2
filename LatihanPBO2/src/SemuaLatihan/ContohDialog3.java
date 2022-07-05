package SemuaLatihan;
//Nama : FX. Bima Yudha Pratama
//NIM : 205314020

import javax.swing.*;

public class ContohDialog3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contoh Frame 205314020 FX. Bima Yudha Pratama");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.show();

	int result =JOptionPane.showConfirmDialog(frame,
	"Contoh dialog konfirmasi ...","Judul Dialog 205314020 FX. Bima Yudha Pratama",
        JOptionPane.OK_CANCEL_OPTION,
	JOptionPane.QUESTION_MESSAGE);

	String message;
	if (result==JOptionPane.OK_OPTION) 
            message = "Anda memilih ok";
	else if (result==JOptionPane.CANCEL_OPTION) 
            message = "Anda memilih cancel";
	else
            message = "Anda tidak memilih apapun";

	JOptionPane.showMessageDialog(frame,message,"Pilihan Anda",
	JOptionPane.INFORMATION_MESSAGE);

    }
    
}
