/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DisplayImage;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ASUS
 */
public class DisplayImage extends JFrame {

    public DisplayImage() {
        add(new ImageCanvas());
    }

    public static void main(String[] args) {
        JFrame frame = new DisplayImage();
        frame.setTitle("205314020 - FX Bima Yudha Pratama DisplayImage");
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class ImageCanvas extends JPanel {

    ImageIcon imageIcon = new ImageIcon("D:\\KULIAH\\PBO II\\Tugas\\Netbean\\v8\\PBO_Materi\\src\\DisplayImage\\gambar/gambar.jpg");
    Image image = imageIcon.getImage();

    /**
     * Draw image on the panel
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
