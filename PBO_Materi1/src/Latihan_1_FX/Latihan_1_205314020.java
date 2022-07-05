package Latihan_1_FX;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Latihan_1_205314020 {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        File outFile = new File("Jawaban.txt");
        FileOutputStream outFileStream = new FileOutputStream(outFile);
        PrintWriter outStream = new PrintWriter(outFileStream);
        String nama;
        int count;
        
        
        //write serializable Person objects one at a time
        for (int i = 0; i < 5; i++) {
            outStream.print('T'); 
        }
        outStream.println();
        System.out.println("Mau Brapa Data? :");
        count = s.nextInt();
        outStream.println(count);
        
        for (int i = 0; i < count; i++) {
            System.out.println("");
            System.out.print("Masukkan Nama    :");
            outStream.println(s.next());
            System.out.print("Masukkan Jawaban :");
            outStream.println(s.next());
        }
        outStream.close();
    }

}
