package SemuaLatihan;
//Nama : FX.Bima Yudha Pratama
//NIM : 205314020

import java.awt.*;
import javax.swing.*;

public class Ch14JCheckBoxSample1 extends JFrame{
    private final JCheckBox[] checkBox;
    public Ch14JCheckBoxSample1() {
        Container   contentPane;
        JPanel      checkPanel, okPanel;

        JButton     okButton;
        String[]    btnText = {"Java", "C++", "Smalltalk", "Ada"};

        //set the frame properties
        setSize      (500,300);
        setTitle     ("Program Ch14JCheckBoxSample1 205314020 FX. Bima Yudha Pratama");
        setLocation  (20,20);

        contentPane = getContentPane( );
        contentPane.setBackground(Color.white);
        contentPane.setLayout(new BorderLayout());

        //create and place four checkboxes
        checkPanel = new JPanel(new GridLayout(0,1));
        checkPanel.setBorder(BorderFactory.createTitledBorder("Can Program In"));
        checkBox = new JCheckBox[btnText.length];
        for (int i = 0; i < checkBox.length; i++) {
            checkBox[i] = new JCheckBox(btnText[i]);
            checkPanel.add(checkBox[i]);
        }

        //create and place the OK button
        okPanel = new JPanel(new FlowLayout());
        okButton = new JButton("OK");
        okPanel.add(okButton);

        contentPane.add(checkPanel, BorderLayout.CENTER);
        contentPane.add(okPanel, BorderLayout.SOUTH);

        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation( EXIT_ON_CLOSE );
    }
    public static void main(String[] args) {
        Ch14JCheckBoxSample1 frame = new Ch14JCheckBoxSample1();
        frame.setVisible(true);
    }

    
}
