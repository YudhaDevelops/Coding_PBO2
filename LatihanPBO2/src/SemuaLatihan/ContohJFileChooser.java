package SemuaLatihan;

import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.*;
//Nama : FX. Bima Yudha Pratama
//NIM : 205314020
public class ContohJFileChooser {
    public static void main(String[] args) {
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

        int returnValue = jfc.showOpenDialog(null);
        // int returnValue = jfc.showSaveDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jfc.getSelectedFile();
            System.out.println(selectedFile.getAbsolutePath());
        }
    }
}
