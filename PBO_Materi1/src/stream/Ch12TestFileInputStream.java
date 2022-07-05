
package stream;

import java.io.*;

/**
 *
 * @author ASUS
 */
public class Ch12TestFileInputStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException  {
        //setup file and stream
      File inFile = new File("sample1.data");
        
      FileInputStream inStream = new FileInputStream(inFile);

      
      //set up an array to read data in
      int    fileSize  = (int)inFile.length();
      byte[] byteArray = new byte[fileSize];

      //read data in and display them
      inStream.read(byteArray);
      for (int i = 0; i < fileSize; i++) {
         System.out.println(byteArray[i]);
      }

      inStream.close();
      
    }
    
}
