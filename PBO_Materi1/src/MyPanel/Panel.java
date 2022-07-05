/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPanel;

import javax.swing.JFrame;

/**
 *
 * @author ASUS
 */
public class Panel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("205314020 - FX Bima Yudha Pratama Demonstrating My Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyPanel MyPanel = new MyPanel();
        frame.add(MyPanel); // add Panel to frame
        frame.setSize(510, 250); // set frame size
        frame.setVisible(true); // display frame
    }

}
