package SemuaLatihan;
import javax.swing.*;
import java.awt.*;

public class ColorChooserDemo extends JPanel{
    JColorChooser Jcc;
    JLabel label;
    public ColorChooserDemo(){
        super(new BorderLayout());
        label = new JLabel("Welcome to GeeksforGeeks", JLabel.CENTER);

        label.setForeground(Color.green);
        label.setOpaque(true);
        label.setFont(new Font("SansSerif", Font.BOLD, 30));

        // set size of the label
        label.setPreferredSize(new Dimension(100, 65));
        // create a Panel and set its layout
        JPanel bannerPanel = new JPanel(new BorderLayout()); 
        bannerPanel.add(label, BorderLayout.CENTER);
        bannerPanel.setBorder(BorderFactory.createTitledBorder("Label"));
        
        // Set up color chooser for setting text color
        Jcc = new JColorChooser(label.getForeground());
        Jcc.setBorder(BorderFactory.createTitledBorder("Choose Text Color"));
        
        add(bannerPanel, BorderLayout.CENTER);
        add(Jcc, BorderLayout.PAGE_END);
    }
    
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        
        ColorChooserDemo framecolor = new ColorChooserDemo();
        frame.setContentPane(framecolor);
        frame.setSize(400,300);
        frame.setTitle("205314020 FX. Bima Yudha Pratama");
        frame.setVisible(true);
    }
}