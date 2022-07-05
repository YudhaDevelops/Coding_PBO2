package TryBoxLayoutStrut_205314020_yudha;
import java.awt.*;          //Nama : FX.Bima Yudha Pratama
import javax.swing.*;       //NIM : 205314020
import javax.swing.border.*;

public class TryBoxLayoutStrut extends JFrame {
    public TryBoxLayoutStrut(String title){
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
        right.add(new JCheckBox("Rounded"));
        JPanel leftPanel = new JPanel(new BorderLayout());
        leftPanel.setBorder(new TitledBorder(new EtchedBorder(), "Line Color"));
        leftPanel.add(left, BorderLayout.CENTER);
        JPanel rightPanel = new JPanel(new BorderLayout());
        rightPanel.setBorder(new TitledBorder(new EtchedBorder(), "Line Properties"));   
        rightPanel.add(right, BorderLayout.CENTER);
        
        Box top = Box.createHorizontalBox();
        top.add(leftPanel);
        top.add(Box.createHorizontalStrut(5));         
        top.add(rightPanel);
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBorder(new CompoundBorder(BorderFactory.createLineBorder(Color.black, 1),         
               BorderFactory.createBevelBorder(BevelBorder.RAISED)));
        JButton button;
        Dimension size = new Dimension(80,20);
        bottomPanel.add(button = new JButton("Defaults"));
        button.setPreferredSize(size);
        bottomPanel.add(button = new JButton("OK"));
        button.setPreferredSize(size);
        bottomPanel.add(button = new JButton("Cancel"));
        button.setPreferredSize(size);
  
        Container content = getContentPane();  
        BoxLayout box = new BoxLayout(content, BoxLayout.Y_AXIS); 
        content.setLayout(box);         
        content.add(top);
        content.add(bottomPanel);
	}

    public static void main(String[] args) {
        TryBoxLayoutStrut frame = new TryBoxLayoutStrut("This is a Box Layout Strut <> 205314020_Fx.Bima Yudha Pratama");
        frame.setVisible(true);
    }
    
}
