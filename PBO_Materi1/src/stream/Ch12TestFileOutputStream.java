
package stream;

import java.io.*;

/**
 *
 * @author ASUS
 */
public class Ch12TestFileOutputStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException  {
        //setup file and stream
      File             outFile   = new File( "sample1.data" );
      FileOutputStream outStream = new FileOutputStream( outFile );

      //data to output
      byte byteArray[] = {10, 20, 30, 40, 50, 60, 70, 80};

//      DataOutputStream outfile = new DataOutputStream(FileOutputStream("out.dat"));
      DataOutputStream outfile = new DataOutputStream(new FileOutputStream("out.dat"));
//      DataOutputStream outfile = new DataOutputStream(new File("out.dat"));
      //write data to the stream
      outStream.write(byteArray);

      //output done, so close the stream
      outStream.close();
    }
    
}
