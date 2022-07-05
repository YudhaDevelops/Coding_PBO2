
package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author ASUS
 */
public class Ch12TestObjectInputStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws ClassNotFoundException,IOException  {
        //setup file and stream
        File              inFile  = new File("objects.txt");

        FileInputStream   inFileStream = new FileInputStream(inFile);

        ObjectInputStream inObjectStream = new ObjectInputStream(inFileStream);

        //read the Person objects from a file
        Person[] person=new Person[10];
 
        person = (Person[]) inObjectStream.readObject();
        for (int i = 0; i < 10; i++) {
            System.out.println(person[i].getName() + "     " +
                               person[i].getAge()  + "     " +
                               person[i].getGender());
        }

        //input done, so close the stream
        inObjectStream.close();
    }
    
}
