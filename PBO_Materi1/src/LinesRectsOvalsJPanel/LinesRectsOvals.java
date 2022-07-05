
package LinesRectsOvalsJPanel;

import java.awt.Color;
import javax.swing.JFrame;

public class LinesRectsOvals {

    // execute application
   public static void main( String args[] )
   {
      // create frame for LinesRectsOvalsJPanel
      JFrame frame = new JFrame( "205314020 - FX Bima Yudha Pratama Drawing lines, rectangles and ovals" );
      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   
      LinesRectsOvalsJPanel linesRectsOvalsJPanel = new LinesRectsOvalsJPanel(); 
      linesRectsOvalsJPanel.setBackground( Color.WHITE ); 
      frame.add( linesRectsOvalsJPanel ); // add panel to frame
      frame.setSize( 400, 210 ); // set frame size
      frame.setVisible( true ); // display frame
   } // end main
} // end class LinesRectsOvals

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