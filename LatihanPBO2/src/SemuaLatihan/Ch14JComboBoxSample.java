package SemuaLatihan;
//Nama : FX. Bima Yudha Pratama
//NIM : 205314020
import java.awt.*;
import javax.swing.*;
public class Ch14JComboBoxSample extends JFrame {
    public Ch14JComboBoxSample() {
        Container   contentPane;
        JPanel      comboPanel, okPanel;
        JComboBox   comboBox;
        JButton     okButton;
        String[]    comboBoxItem = {"Java", "C++", "Smalltalk", "Ada"};

        //set the frame properties
        setSize      (500, 300);
        setTitle     ("Program Ch14JComboBoxSample 205314020 FX. Bima Yudha Pratama");
        setLocation  (20, 20);

        contentPane = getContentPane( );
        contentPane.setBackground(Color.white);
        contentPane.setLayout(new BorderLayout());

        //create and place a combo box
        comboPanel = new JPanel(new FlowLayout());
        comboPanel.setBorder(BorderFactory.createTitledBorder("Pick your favorite"));
        comboBox = new JComboBox(comboBoxItem);
        comboPanel.add(comboBox);

        //create and place the OK button
        okPanel = new JPanel(new FlowLayout());
        okButton = new JButton("OK");
        okPanel.add(okButton);

        contentPane.add(comboPanel, BorderLayout.CENTER);
        contentPane.add(okPanel, BorderLayout.SOUTH);

        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation( EXIT_ON_CLOSE );
    }
    public static void main(String[] args) {
        Ch14JComboBoxSample frame = new Ch14JComboBoxSample();
        frame.setVisible(true);
    }

    
}
