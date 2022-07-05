package Latihan_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class ObjectIOExample {
    public static ArrayList <Student> stList = new ArrayList<>();
    public static void main(String args[])  {
        
        File file = new File("D:\\KULIAH\\PBO II\\Tugas\\Netbean\\v8\\PBO_Materi\\dc/Student.txt");
        Student student = null;
        //masuk data
        student= new Student("John1", "Frost", 22);
        stList.add(student);
        student= new Student("John2", "Frost", 23);
        stList.add(student);
        student= new Student("John3", "Frost", 24);
        stList.add(student);
        student= new Student("John4", "Frost", 25);
        stList.add(student);
        student= new Student("John5", "Frost", 26);
        stList.add(student);
        student= new Student("John6", "Frost", 27);
        stList.add(student);
        student= new Student("John7", "Frost", 28);
        stList.add(student);
        
        //tulis beradasarkan banyak nya data yang ada di array list
        WriteObjectToFile(file, student);
//        for (int i = 0; i < stList.size(); i++) {
//            WriteObjectToFile(file, student);
//        }
        
//        Student p = null;
//        p = ReadObjectFromFile(file);
        ReadObjectFromFile(file);
//        for (int i = 0; i < stList.size(); i++) {
//            System.out.println();
//        }
        
    }

    public static void WriteObjectToFile(File file, Object serObj) {

        try (FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(serObj);
            oos.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ObjectIOExample.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ObjectIOExample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void ReadObjectFromFile(File file) {

        Student result = null;
        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            
            for (int i = 0; i < stList.size(); i++) {
            System.out.println(stList.get(i).getFirstName() + "     " +
                               stList.get(i).getLastName()  + "     " +
                               stList.get(i).getAge());
        }
//            result = (Student) ois.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ObjectIOExample.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ObjectIOExample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
