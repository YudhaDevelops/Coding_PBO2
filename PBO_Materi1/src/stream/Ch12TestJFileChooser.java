package stream;

import java.io.*;
import javax.swing.*;

public class Ch12TestJFileChooser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFileChooser chooser;
        File         file, directory;
        int          status;

        chooser = new JFileChooser( );
        //chooser = new JFileChooser(System.getProperty("user.dir"));
        //chooser = new JFileChooser("N:/Programs");


        // status = chooser.showDialog(null,"Run"); //Customized label

        // Filter only .java files
        chooser.setFileFilter(new JavaFilter());

        status = chooser.showOpenDialog(null);

        if (status == JFileChooser.APPROVE_OPTION) {
            file      = chooser.getSelectedFile();
            directory = chooser.getCurrentDirectory();

            System.out.println("Directory: " +
                                directory.getName());

            System.out.println("File selected to open: " +
                                file.getName());

            System.out.println("Full path name: " +
                                file.getAbsolutePath());

        } else {
            JOptionPane.showMessageDialog(null, "Open File dialog canceled");
        }

        System.out.println("\n\n");

        status = chooser.showSaveDialog(null);

        if (status == JFileChooser.APPROVE_OPTION) {
            file      = chooser.getSelectedFile();
            directory = chooser.getCurrentDirectory();

            System.out.println("Directory: " +
                                 directory.getName());

            System.out.println("File selected for saving data: " +
                                 file.getName());

            System.out.println("Full path name: " +
                                file.getAbsolutePath());
        } else {
            JOptionPane.showMessageDialog(null, "Save File dialog canceled");
        }
    }
    
}
