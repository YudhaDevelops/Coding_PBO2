/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author ASUS
 */
public class MyPanel extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);	   // erases background
        Graphics2D g2 = (Graphics2D) g;   //cast for java2

        // my graphics:
        g2.setColor(new Color(255, 0, 0));
        g2.fillRect(10, 10, 200, 50);
        g2.setColor(new Color(0, 0, 0));
        g2.drawString("Hello World", 10, 10);
    }
}
