package Latihan;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
 

public class latihan implements Serializable {
     
    private static final long serialVersionUID = 3262592736083035977L;
 
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<Employee> listEmployee = new ArrayList<Employee>();
        File fileEmployee = new File("Employee.dat");
        if(!fileEmployee.exists()) {
            Employee employee = new Employee(1,"Yoeda HP", "Programmer");
            Employee employee1 = new Employee(2,"Fernando Torres", "Football Player");
            listEmployee.add(employee);
            listEmployee.add(employee1);
 
            //create file .dat
            try {
                System.out.println("create file");
                FileOutputStream fos = new FileOutputStream(fileEmployee);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(listEmployee);
                oos.close();                
            } catch (FileNotFoundException fileNotFoundException) {             
                fileNotFoundException.printStackTrace();
            } catch (IOException ioException) {             
                ioException.printStackTrace();
            }
        }else {
            //read data from file .dat
            try {
                System.out.println("read file");
                FileInputStream fis = new FileInputStream(fileEmployee);
                ObjectInputStream ois = new ObjectInputStream(fis);
                listEmployee = (List<Employee>) ois.readObject();
                ois.close();
                 
                if(listEmployee != null && listEmployee.size() > 0){
                    for(Employee employee : listEmployee) {
                        System.out.println(employee.getNama());
                    }
                }
            }catch (IOException ioException) {
                ioException.printStackTrace();
            }catch (ClassNotFoundException classNotFoundException) {
                classNotFoundException.printStackTrace();
            }
        }
    }
}


//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//
//public class latihan {
//
//    public static void main(String[] args)  throws Exception{
////        Name counter = new Name("Aku");
//
//        File f = new File("MyFile.txt");
//        FileOutputStream fos = new FileOutputStream(f);
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
////        oos.writeObject(counter);
//        oos.close();
//
//        FileInputStream fis = new FileInputStream(f);
//        ObjectInputStream ois = new ObjectInputStream(fis);
////        Counter newCounter = (Counter) ois.readObject();
////        System.out.println(newCounter.count);
//        ois.close();
//    }
//
//}
//
//class Name{
//    String name;
//
//    public void data(String count) {
//        this.name = count;
//    }    
//}
