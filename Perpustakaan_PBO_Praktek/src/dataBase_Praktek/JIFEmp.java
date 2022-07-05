package dataBase_Praktek;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class JIFEmp extends javax.swing.JInternalFrame implements ActionListener {
    static int openFrameCount = 0;
    static final int xOffset = 30, yOffset = 30;
    JPanel pa, pb, p1, p2;
    JLabel label1;
    JButton but1;
    JTextField text1;
    JTable jtabel1;

    public JIFEmp(String title) {
        super(title + (++openFrameCount),
                true, //resizable
                true, //closable
                true, //maximizable
                true);//iconifiable
        setSize(800, 600);
        addPanel();
        //Set the window's location.
        setLocation(xOffset * openFrameCount,yOffset * openFrameCount);
    }

    public void addPanel() {
        pa = new JPanel();
        pa.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.red), "Employee"));
        jtabel1 = new JTable();
        jtabel1.setPreferredScrollableViewportSize(new Dimension(700, 350));
        JScrollPane scrollPane = new JScrollPane(jtabel1);
        pa.add(scrollPane);
        pb = new JPanel();
        pb.setLayout(new GridLayout(2, 1));
        p1 = new JPanel();
        p1.setLayout(new GridLayout(2, 1));
        p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        label1 = new JLabel("Masukkan nama department : ");
        p1.add(label1);
        text1 = new JTextField();
        p1.add(text1);
        but1 = new JButton("Tampil");
        but1.addActionListener(this);
        p2.add(but1);
        pb.add(p1);
        pb.add(p2);
        this.setLayout(new GridLayout(2, 1));
        this.add(pa);
        this.add(pb);
    }

    public void actionPerformed(ActionEvent event) {
        JButton clickedButton = (JButton) event.getSource();
        if ((clickedButton.getText()).compareTo("Tampil") == 0) {
            EmployeeTableModel e;
            try {
                System.out.println(text1.getText());
                e = new EmployeeTableModel(text1.getText());
                jtabel1.setModel(e);
                jtabel1.revalidate();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "SQL error");
            }
        }
    }

    public static void main(String[] args) {
        JFrame jf = new JFrame("Tampil Employee");
        jf.setSize(800, 600);
        JIFEmp jemp = new JIFEmp("Tampil");
        jf.getContentPane().add(jemp);
        jf.setVisible(true);
        jemp.setVisible(true);
    }

}
