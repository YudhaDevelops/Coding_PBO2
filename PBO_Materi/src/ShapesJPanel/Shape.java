/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ShapesJPanel;

import javax.swing.JFrame;

/**
 *
 * @author ASUS
 */
public class Shape {
// execute application
   public static void main( String args[] )
   {
      // create frame for ShapesJPanel
      JFrame frame = new JFrame( "205314020 - FX Bima Yudha Pratama Drawing 2D shapes" );
      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

      // create ShapesJPanel
      ShapesJPanel shapesJPanel = new ShapesJPanel();
      
      frame.add( shapesJPanel ); // add shapesJPanel to frame
      frame.setSize( 425, 200 ); // set frame size
      frame.setVisible( true ); // display frame
   } // end main
} // end class Shapes

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