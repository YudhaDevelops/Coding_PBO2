/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestImageIcon;

import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author ASUS
 */
public class TestImageIcon extends JFrame {

    private ImageIcon usIcon = new ImageIcon("D:\\KULIAH\\PBO II\\Tugas\\Netbean\\v8\\PBO_Materi\\src\\TestImageIcon\\image/gambar1.jpg");
    private ImageIcon myIcon = new ImageIcon("D:\\KULIAH\\PBO II\\Tugas\\Netbean\\v8\\PBO_Materi\\src\\TestImageIcon\\image/gambar2.jpg");
    private ImageIcon frIcon = new ImageIcon("D:\\KULIAH\\PBO II\\Tugas\\Netbean\\v8\\PBO_Materi\\src\\TestImageIcon\\image/gambar3.jpg");
    private ImageIcon ukIcon = new ImageIcon("D:\\KULIAH\\PBO II\\Tugas\\Netbean\\v8\\PBO_Materi\\src\\TestImageIcon\\image/gambar4.jpg");

    public TestImageIcon() {
        setLayout(new GridLayout(1, 4, 5, 5));
        add(new JLabel(usIcon));
        add(new JLabel(myIcon));
        add(new JButton(frIcon));
        add(new JButton(ukIcon));
    }

    /**
     * Main method
     */
    public static void main(String[] args) {
        TestImageIcon frame = new TestImageIcon();
        frame.setTitle("205314020 - FX Bima Yudha Pratama TestImageIcon");
        frame.setLocationRelativeTo(null);
        // Center the frame 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
