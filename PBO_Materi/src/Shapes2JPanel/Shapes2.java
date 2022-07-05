/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Shapes2JPanel;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author ASUS
 */
public class Shapes2 extends Thread
{
   // execute application
   private static Shapes2JPanel shapes2JPanel;
   public static void main( String args[] )
   {
      // create frame for Shapes2JPanel
      JFrame frame = new JFrame( "205314020 - FX Bima Yudha Pratama Drawing 2D Shapes" );
      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

      shapes2JPanel = new Shapes2JPanel();
      frame.add( shapes2JPanel ); // add shapes2JPanel to frame
      frame.setBackground( Color.WHITE ); // set frame background color
      frame.setSize( 400, 400 ); // set frame size
      frame.setVisible( true ); // display frame
      Shapes2 sh=new Shapes2();
      sh.start();
   } // end main


    public void run(){
        while (true){
            try{
                this.sleep(1000);
            }
            catch(InterruptedException ie){break;}
            shapes2JPanel.repaint();
        }
    }
} // end class Shapes2

/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/