package Latihan_1_FX;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Latihan_1_Baca_205314020 {

    public static void main(String[] args) throws IOException{
        File inFile = new File("Jawaban.txt");
        FileReader fileReader = new FileReader(inFile);
        BufferedReader bufReader = new BufferedReader(fileReader);
        String str, jawaban, nama;
        int count,jumlahData;
        
        str = bufReader.readLine();
        System.out.println("Jawaban : " + str);
        System.out.println("");
        
        jumlahData = Integer.parseInt(bufReader.readLine());
        
        for (int i = 0; i < jumlahData; i++) {
            count = 0;
            nama = bufReader.readLine();
            System.out.println(nama);
            jawaban = bufReader.readLine();
            
            for (int j = 0; j < 5; j++) {
                if (str.charAt(j) == jawaban.charAt(j)) {
                    count++;
                }
            }
            System.out.println(jawaban + " " + count);
        }
        bufReader.close();
    }
}
