package SemuaLatihan;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class JDialogLabel extends JDialog{
    public JDialogLabel(String text) throws IOException {
        Container contentPane=getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.setBackground(Color.white);
        setTitle     (text);
        setSize      (500,350);
        setLocation  (400,100);
        //buat label
        Image img = ImageIO.read(new File("D:\\Pictures/44778.jpg"));
        Image resizedImage = img.getScaledInstance(450,250, 1);
        
        JLabel jlb2=new JLabel(new ImageIcon(resizedImage));
        JLabel jlb1=new JLabel("205314020 FX. Bima Yudha Pratama");

        contentPane.add(jlb2);
        contentPane.add(jlb1);
        
    }
    public static void main(String[] args) throws IOException {
        JDialogLabel jdb=new JDialogLabel("Tampil Label 205314020 FX. Bima Yudha Pratama");
        jdb.setVisible(true);
    }

    
}
