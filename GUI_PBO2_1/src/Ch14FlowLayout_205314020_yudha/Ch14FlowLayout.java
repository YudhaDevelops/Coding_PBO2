package Ch14FlowLayout_205314020_yudha;
import java.awt.*;
import javax.swing.*;
public class Ch14FlowLayout extends JFrame{
    private static final int FRAME_WIDTH    = 300;  //Nama : FX. Bima Yudha Pratama
    private static final int FRAME_HEIGHT   = 200;  //NIM : 205314020
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    
    public static void main(String[] args) {
        Ch14FlowLayout frame = new Ch14FlowLayout();
        frame.setVisible(true);
    }
    public Ch14FlowLayout() {
        Container contentPane;
      
        //set the frame properties
        setSize      (FRAME_WIDTH, FRAME_HEIGHT);
        setTitle     ("205314020_Fx.Bima Yudha Pratama <> Program Ch14FlowLayoutSample");
        setLocation  (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        contentPane = getContentPane( );
        contentPane.setBackground( Color.white );
        contentPane.setLayout(new FlowLayout());

        //create and place four buttons on the content pane
        for (int i=1;i<=6;i++)
            contentPane.add(new JButton("button "+i));
    }
    
}
