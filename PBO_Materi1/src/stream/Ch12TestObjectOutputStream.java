
package stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author ASUS
 */
public class Ch12TestObjectOutputStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        //setup the streams
        File               outFile          = new File("objects.txt");
        FileOutputStream   outFileStream    = new FileOutputStream(outFile);
        ObjectOutputStream outObjectStream  = new ObjectOutputStream(outFileStream);

        //write serializable Person objects one at a time
        Person[] person=new Person[10];
        for (int i = 0; i < 10; i++) {
            person[i] = new Person("Mr. Espresso " + i, 20+i, 'M');
        }
            outObjectStream.writeObject(person);
        

        //output done, so close the stream
        outObjectStream.close();
    }
    
}
