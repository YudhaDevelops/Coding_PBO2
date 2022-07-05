package SemuaLatihan;
//Nama : FX.Bima Yudha Pratama
//NIM : 205314020
import java.awt.*;
import javax.swing.*;
public class Ch14JListSample extends JFrame{
    public Ch14JListSample() {
        Container   contentPane;
        JPanel      listPanel, okPanel;
        JList list;
        JButton     okButton;
        String[]    names = {"Ape", "Bat", "Bee", "Cat",
                            "Dog", "Eel", "Fox", "Gnu",
                            "Hen", "Man", "Sow", "Yak"};

        //set the frame properties
        setSize      (500,300);
        setTitle     ("Program Ch14JListSample2 205314020 FX. Bima Yudha Pratama");
        setLocation  (20,20);

        contentPane = getContentPane( );
        contentPane.setBackground(Color.white);
        contentPane.setLayout(new BorderLayout());

        //create and place a JList
        listPanel = new JPanel(new GridLayout(0,1));
        listPanel.setBorder(BorderFactory.createTitledBorder("Three-letter Animal Names"));
                list = new JList(names);
        listPanel.add(new JScrollPane(list));
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
            //this is default, so the explicit call is not necessary

        //create and place the OK button
        okPanel = new JPanel(new FlowLayout());
        okButton = new JButton("OK");
         okPanel.add(okButton);

        contentPane.add(listPanel, BorderLayout.CENTER);
        contentPane.add(okPanel, BorderLayout.SOUTH);

        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation( EXIT_ON_CLOSE );
    }
    public static void main(String[] args) {
        Ch14JListSample frame = new Ch14JListSample();
        frame.setVisible(true);
    }

    
}
