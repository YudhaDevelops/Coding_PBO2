package TryBoxLayout_205314020_yudha;
import javax.swing.*;  //Nama : FX.Bima Yudha Pratama
import java.awt.*;     //NIM : 205314020
import javax.swing.border.Border;

public class TryBoxLayout extends JFrame {
    public TryBoxLayout(String title){
        setSize      (300, 200);
        setTitle     (title);
        setLocation  (150, 250);

        Box left = Box.createVerticalBox();
        ButtonGroup radioGroup = new ButtonGroup();             
        JRadioButton rbutton;                                   
        radioGroup.add(rbutton = new JRadioButton("Red"));      
        left.add(rbutton);                                      
        radioGroup.add(rbutton = new JRadioButton("Green"));
        left.add(rbutton);
        radioGroup.add(rbutton = new JRadioButton("Blue"));
        left.add(rbutton);
        radioGroup.add(rbutton = new JRadioButton("Yellow"));
        left.add(rbutton);
        Box right = Box.createVerticalBox();
        right.add(new JCheckBox("Dashed"));
        right.add(new JCheckBox("Thick"));
        right.add(new JCheckBox("Rounded"));Box top = Box.createHorizontalBox();  
        top.add(left);
        top.add(right);
        JPanel bottomPanel = new JPanel();
        Border edge = BorderFactory.createRaisedBevelBorder();  
        JButton button;
        Dimension size = new Dimension(80,20);
        bottomPanel.add(button = new JButton("Defaults"));
        button.setBorder(edge);
        button.setPreferredSize(size);
        bottomPanel.add(button = new JButton("OK"));
        //button.setBorder(edge);
        button.setPreferredSize(size);
        bottomPanel.add(button = new JButton("Cancel"));
        button.setBorder(edge);
        button.setPreferredSize(size);
        Container content = getContentPane();    
        content.setLayout(new BorderLayout());           
        content.add(top, BorderLayout.CENTER);
        content.add(bottomPanel, BorderLayout.SOUTH);
      }

    public static void main(String[] args) {
        TryBoxLayout frame = new TryBoxLayout(" This is a Box Layout <> 205314020_Fx.Bima Yudha Pratama");
        frame.setVisible(true);
    }

}
