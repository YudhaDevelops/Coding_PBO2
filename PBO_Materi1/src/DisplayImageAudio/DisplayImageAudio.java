/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DisplayImageAudio;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ASUS
 */
public class DisplayImageAudio extends JFrame implements ActionListener {

    ImageIcon idIcon = new ImageIcon("D:\\KULIAH\\PBO II\\Tugas\\Netbean\\v8\\PBO_Materi\\src\\DisplayImageAudio\\gambar_dan_Audio/gambar2.jpg");
    JButton btn = new JButton(idIcon);
    File wavFile = new File("D:\\KULIAH\\PBO II\\Tugas\\Netbean\\v8\\PBO_Materi\\src\\DisplayImageAudio\\gambar_dan_Audio/laguJepang_Kokoronashi.wav");
    AudioClip sound;

    public DisplayImageAudio() {
        setTitle("205314020 - FX Bima Yudha Pratama");
        setSize(1000, 1000);
        setLocation(50, 50);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel jp = new JPanel();
        jp.setSize(40, 40);
        btn.addActionListener(this);
        jp.add(btn);
        getContentPane().add(jp);
        pack();
        try {
            sound = Applet.newAudioClip(wavFile.toURL());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent ae) {
        sound.play();
    }

    public static void main(String args[]) {
        new DisplayImageAudio().setVisible(true);
    }

}
