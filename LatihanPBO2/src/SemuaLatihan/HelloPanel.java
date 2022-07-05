package SemuaLatihan;

import javax.swing.*;
//Nama : FX. Bima Yudha Pratama
//NIM : 205314020

public class HelloPanel extends JFrame{
    public HelloPanel()
    {
        this.setSize(1000,500); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Hello World! 205314020 FX.Bima Yudha Pratama"); 
        this.setVisible(true);
        
        JPanel jp=new JPanel();
        JButton but1=new JButton();
        but1.setText("Okay");
        jp.add(but1);
        this.add(jp);  
    }
    
    public static void main(String[] args) 
    {
        HelloPanel hf=new HelloPanel(); 
    }
    
}
