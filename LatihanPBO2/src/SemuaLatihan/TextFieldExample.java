package SemuaLatihan;
//Nama : FX. Bima Yudha Pratama
//NIM : 205314020
import javax.swing.*;
public class TextFieldExample {
        JTextField tf1,tf2,tf3;      
        JButton b1,b2;      
        JLabel jl1, jl2, jl3;
    TextFieldExample(){  
        JFrame f= new JFrame();  
        jl1=new JLabel("X1 :");
        jl1.setBounds(20,35,30,50);
        tf1=new JTextField();  
        tf1.setBounds(50,50,150,20); 
        jl2=new JLabel("X2 :");
        jl2.setBounds(20,85,30,50); 
        tf2=new JTextField();  
        tf2.setBounds(50,100,150,20);  
        jl3=new JLabel("X3 :");
        jl3.setBounds(20,135,30,50);
        tf3=new JTextField("No edit");  
        tf3.setBounds(50,150,150,20);  
        tf3.setEditable(false);   
        b1=new JButton("+");  
        b1.setBounds(50,200,50,50);  
        b2=new JButton("-");  
        b2.setBounds(120,200,50,50);  

        f.add(jl1);f.add(tf1);f.add(jl2);f.add(tf2);
        f.add(jl3);f.add(tf3);f.add(b1);f.add(b2);  
        f.setSize(300,300);
        f.setTitle("205314020 FX. Bima Yudha Pratama");
        f.setLayout(null);  
        f.setVisible(true);  
    }         
    public static void main(String[] args) {  
        new TextFieldExample();  
    }
    
}
