package SemuaLatihan;
import java.awt.*;
import javax.swing.*;
//Nama : FX.Bima Yudha Pratama
//NIM : 205314020
public class Ch14JButtonFrame extends JFrame{
    private final JButton button;
    public Ch14JButtonFrame() {
        JButton buton;
        Container contentPane = getContentPane( );
        contentPane.setLayout(new FlowLayout());
        //set the frame properties
        setSize      ( 500,300);
        setResizable ( false );
        setTitle     ( "Program Ch7JButtonFrame 205314020 FX. Bima Yudha Pratama" );
        setLocation  ( 20, 20);
        //create and place two buttons on the frame's content pane
        button = new JButton("Click Me");
        button.setSize(80, 30);
        contentPane.add(button);
        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation( EXIT_ON_CLOSE );
   }
public static void main(String[] args) {
        Ch14JButtonFrame frame = new Ch14JButtonFrame();
        frame.setVisible(true);
    }
}
