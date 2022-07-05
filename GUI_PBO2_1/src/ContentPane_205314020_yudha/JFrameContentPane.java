package ContentPane_205314020_yudha;

import java.awt.Container;
import javax.swing.*;
/*
Nama : FX.Bima Yudha Pratama
NIM : 205314020
*/
public class JFrameContentPane extends JFrame{
    public JFrameContentPane() {
      
        //contentPane dari JFrame
        Container contentPane = getContentPane();
        contentPane.add( new JButton("OK"));
        setSize( 400, 120 );
        setTitle("205314020_Fx.Bima Yudha Pratama <> Try Contentpane");
    }
    public static void main(String args[ ]) {
        JFrameContentPane jf = new JFrameContentPane();
        jf.setVisible(true);
    }
}