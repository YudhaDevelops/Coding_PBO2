package MySwing_205314020_yudha;

import javax.swing.*;
import java.awt.*;
/*
Nama : FX.Bima Yudha Pratama
NIM : 205314020
*/
public class MySwing extends JFrame {
    public MySwing(){
        initComponents();
    }
    
    private void initComponents(){
        //buat JPanel sebagai contentpane
        JPanel contentPane = new JPanel(new FlowLayout());
        contentPane.add(new JButton("OK"));
        
        //set sebagai content-pane dari Jframe
        contentPane.setOpaque(true);
        setContentPane(contentPane);
    }
    public static void main(String[] args) {
        JFrame frame = new MySwing();
        frame.setSize(400,120);
        frame.setTitle("Try Contentpane <> 205314020_Fx.Bima Yudha Pratama");
        frame.setVisible(true);
        //halaman 28
    }
    
}
