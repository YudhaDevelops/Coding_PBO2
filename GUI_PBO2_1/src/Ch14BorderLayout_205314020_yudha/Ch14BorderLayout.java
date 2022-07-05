package Ch14BorderLayout_205314020_yudha;
import java.awt.*;
import javax.swing.*;
public class Ch14BorderLayout extends JFrame{
    private static final int FRAME_WIDTH    = 300;   //Nama : FX.Bima Yudha Pratama
    private static final int FRAME_HEIGHT   = 200;   //NIM : 205314020
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    public static void main(String[] args) {
        Ch14BorderLayout frame = new Ch14BorderLayout();
        frame.setVisible(true);
    }
    public Ch14BorderLayout() {
        Container contentPane;
        JButton   button1, button2, button3, button4, button5;

        //set the frame properties
        setSize      (FRAME_WIDTH, FRAME_HEIGHT);
        setTitle     ("Program Ch14BorderLayoutSample 205314020_FX.Bima Yudha Pratama");
        setLocation  (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        contentPane = getContentPane( );
        contentPane.setBackground( Color.white );
        contentPane.setLayout(new BorderLayout());
        contentPane.add(new JButton("NORTH"), BorderLayout.NORTH); //create and place four buttons on the content pane
        contentPane.add(new JButton("SOUTH"),  BorderLayout.SOUTH);
        contentPane.add(new JButton("EAST"),  BorderLayout.EAST);
        contentPane.add(new JButton("WEST"),  BorderLayout.WEST);
        contentPane.add(new JButton("CENTER"),  BorderLayout.CENTER);
    }
}
