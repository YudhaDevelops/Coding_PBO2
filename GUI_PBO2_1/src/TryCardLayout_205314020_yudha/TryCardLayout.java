package TryCardLayout_205314020_yudha;
import java.awt.*;  
import java.awt.event.*; //Nama : FX.Bima Yudha Pratama
import javax.swing.*;    //NIM : 205314020
public class TryCardLayout extends JFrame implements ActionListener{
    public static void main(String[] args) {
        TryCardLayout jf=new TryCardLayout();
        jf.setSize(500, 500);
        jf.setTitle("This is a CardLayout <> 205314020_Fx.Bima Yudha Pratama");
        jf.setVisible(true);
    }
    
    Container content;
    CardLayout card = new CardLayout(50,50); // Create layout
    public TryCardLayout()
    {
        content = getContentPane();
        content.setLayout(card);
        JButton button; // Stores a button
        for(int i = 1; i <= 6; i++) 
        {
            content.add(button = new JButton(" Press " + i), "Card" + i); // Add a button
            button.addActionListener(this); // Add listener for button
        }
    }
    // Handle button events
    public void actionPerformed(ActionEvent e) 
    {
        card.next(getContentPane()); // Switch to the next card
    }
}
