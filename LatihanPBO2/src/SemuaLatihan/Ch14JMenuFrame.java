package SemuaLatihan;

import java.awt.*;      //NAMA : FX. Bima Yudha Pratama
import javax.swing.*;   // NIM : 205314020
import java.awt.event.*;

public class Ch14JMenuFrame extends JFrame implements ActionListener{
    
    private JLabel   response;
    private JMenu    fileMenu;
    private JMenu    editMenu;
    
    public static void main(String[] args) {
        Ch14JMenuFrame frame = new Ch14JMenuFrame();
        frame.setVisible(true);
    }
    public Ch14JMenuFrame() {
        Container contentPane;
        //set the frame properties
        setTitle     ("Ch14JMenuFrame 205314020 FX. Bima Yudha Pratama");
        setSize      (300, 250);
        setResizable (false);
        setLocation  (200, 200);
        contentPane = getContentPane( );
        createFileMenu();
        createEditMenu();
        //and add them to the menubar
        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        //create and position reponse label
        response = new JLabel("Hello, this is your menu tester." );
        response.setSize(250, 50);
        contentPane.add(response);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent event) {
        String  menuName;
        menuName = event.getActionCommand();
        if (menuName.equals("Quit")) {
           System.exit(0);
        } else {
           response.setText("Menu Item '" + menuName + "' is selected.");
        }
    }

    private void createFileMenu( ) {
        JMenuItem    item;
        fileMenu = new JMenu("File");
        item = new JMenuItem("Baru");        //New
        item.addActionListener( this );
        fileMenu.add( item );
        item = new JMenuItem("Open...");    //Open...
        item.addActionListener( this );
        fileMenu.add( item );
        item = new JMenuItem("Save");       //Save
        item.addActionListener( this );
        fileMenu.add( item );
        
        item = new JMenuItem("Save As..."); //Save As...
        item.addActionListener( this );
        fileMenu.add( item );

        fileMenu.addSeparator();           //add a horizontal separator line
        item = new JMenuItem("Quit");       //Quit
        item.addActionListener( this );
        fileMenu.add( item );
    }
    private void createEditMenu( ) {
        JMenuItem    item;

        editMenu = new JMenu("Edit");
        item = new JMenuItem("Cut");      //Cut
        item.addActionListener( this );
        editMenu.add( item );

        item = new JMenuItem("Copy");    //Copy
        item.addActionListener( this );
        editMenu.add( item );

        item = new JMenuItem("Paste");    //Paste
        item.addActionListener( this );
        editMenu.add( item );
    }

}
