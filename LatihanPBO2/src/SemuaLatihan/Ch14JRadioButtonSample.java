package SemuaLatihan;
//Nama : FX.Bima Yudha Pratama
//NIM : 205314020
import java.awt.*;
import javax.swing.*;
class Ch14JRadioButtonSample extends JFrame{
    public static void main(String[] args) {
        Ch14JRadioButtonSample frame = new Ch14JRadioButtonSample();
        frame.setVisible(true);
    }
    public Ch14JRadioButtonSample() {
        Container   contentPane;
        JPanel      radioPanel, okPanel;
        ButtonGroup languageGroup;

        JButton     okButton;
        String[]    btnText = {"Java", "C++", "Smalltalk", "Ada"};

        //set the frame properties
        setSize      (500,300);
        setTitle     ("Program Ch14JRadioButton 205314020 FX. Bima Yudha Pratama");
        setLocation  (20,20);

        contentPane = getContentPane( );
        contentPane.setBackground(Color.white);
        contentPane.setLayout(new BorderLayout());

        //create and place four radio buttons
        radioPanel = new JPanel(new GridLayout(0,1));
          radioPanel.setBorder(BorderFactory.createTitledBorder("Pick your favorite"));
        languageGroup = new ButtonGroup();
    JRadioButton[] radioButton = new JRadioButton[btnText.length];

        for (int i = 0; i < radioButton.length; i++) {
            radioButton[i] = new JRadioButton(btnText[i]);
//            radioButton[i].addItemListener(this);
            languageGroup.add(radioButton[i]);
            radioPanel.add(radioButton[i]);
        }

        radioButton[0].setSelected(true);

        //create and place the OK button
        okPanel = new JPanel(new FlowLayout());
        okButton = new JButton("OK");
//        okButton.addActionListener(this);
        okPanel.add(okButton);

        contentPane.add(radioPanel, BorderLayout.CENTER);
        contentPane.add(okPanel, BorderLayout.SOUTH);

        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation( EXIT_ON_CLOSE );
    }
}
