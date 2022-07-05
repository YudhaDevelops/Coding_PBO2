package TrySpringLayout_205314020_yudha;
import java.awt.*;      //Nama : FX.Bima Yudha Pratama
import javax.swing.*;   //NIM : 205314020
public class TrySpringLayout {
    public static JFrame aWindow = new JFrame("This is a Spring Layout <> 205314020_Fx.Bima Yudha Pratama"); 
    public static void main(String[] args) {
        Toolkit theKit = aWindow.getToolkit();         
        Dimension wndSize = theKit.getScreenSize();   
        aWindow.setBounds(wndSize.width/4, wndSize.height/4, wndSize.width/2, wndSize.height/2);  
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SpringLayout layout = new SpringLayout();      
        Container content = aWindow.getContentPane();  
        content.setLayout(layout);
        JButton[] buttons = new JButton[6];            
        
        for(int i = 0; i < buttons.length; i++) {
          buttons[i] = new JButton("Press " + (i+1));
          content.add(buttons[i]);      
        }
        
        Spring xSpring = Spring.constant(5,15,25);    
        Spring ySpring = Spring.constant(10,30, 50);  
        Spring wSpring = Spring.constant(30,80,130);  
        SpringLayout.Constraints buttonConstr = layout.getConstraints(buttons[0]);
        buttonConstr.setX(xSpring); 
        buttonConstr.setY(ySpring); 
        
        for(int i = 0 ; i< buttons.length ; i++) {
          buttonConstr = layout.getConstraints(buttons[i]);
          buttonConstr.setHeight(ySpring); 
          buttonConstr.setWidth(wSpring);       
          if(i>0) {                    
            layout.putConstraint(SpringLayout.WEST, buttons[i], xSpring,SpringLayout.EAST, buttons[i-1]);    
            layout.putConstraint(SpringLayout.NORTH, buttons[i], ySpring,SpringLayout.SOUTH, buttons[i-1]);
          }
        }
        aWindow.setVisible(true);                      
    }
}
