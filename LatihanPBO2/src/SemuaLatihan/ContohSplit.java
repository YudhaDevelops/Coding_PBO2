package SemuaLatihan;
//Nama : FX. Bima Yudha Pratama
//NIM : 205314020

import javax.swing.*;

public class ContohSplit extends JFrame {

    static JFrame f;
    static JTextArea t1, t2;

    public static void main(String[] args) {
// create a new frame
        f = new JFrame("205314020 FX. Bima Yudha Pratama");

// create a object
        ContohSplit s = new ContohSplit();
// create a panel
        JPanel p1 = new JPanel();
        JPanel p = new JPanel();
// create text areas
        t1 = new JTextArea(10, 10);
        t2 = new JTextArea(10, 10);
// set texts
        t1.setText("this is first text area");
        t2.setText("this is second text area");
// add text area to panel
        p1.add(t1);
        p.add(t2);
// create a splitpane
        JSplitPane sl = new JSplitPane(SwingConstants.HORIZONTAL, p1, p);
// add panel
        f.add(sl);

// set the size of frame
        f.setSize(300, 300);
        f.show();

    }

}
