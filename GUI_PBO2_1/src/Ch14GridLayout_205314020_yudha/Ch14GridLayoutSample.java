package Ch14GridLayout_205314020_yudha;
import java.awt.*;
import javax.swing.*;
//Nama : FX.Bima Yudha Pratama
// NIM : 205314020
public class Ch14GridLayoutSample extends JFrame {
    public static void main(String[] args) {
        Ch14GridLayoutSample frame = new Ch14GridLayoutSample();
        frame.setVisible(true);
    }

    public Ch14GridLayoutSample() {
        Container contentPane;
        
        //set the frame properties
        setSize      (300, 200);
        setTitle     ("Program Ch14GridLayoutSample <> 205314020_Fx.Bima Yudha Pratama");
        setLocation  (150, 250);

        contentPane = getContentPane( );
        contentPane.setBackground( Color.white );
        contentPane.setLayout(new GridLayout(2,3));

        //create and place four buttons on the content pane
        //create and place four buttons on the content pane
        for (int i=1;i<=6;i++)
            contentPane.add(new JButton("button "+i));
        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation( EXIT_ON_CLOSE );
    }
}