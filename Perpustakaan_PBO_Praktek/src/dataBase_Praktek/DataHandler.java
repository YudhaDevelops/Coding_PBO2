package dataBase_Praktek;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataHandler {

    // string ‘localhost’ anda ganti dengan IP server yangdigunakan
//        String jdbcURL = " jdbc:mysql://localhost:3306/[database]";
        String jdbcURL = "jdbc:oracle:thin:@//127.0.0.1:1521/xepdb1";//untuk oracle
//    String jdbcURL = "jdbc:mysql://localhost:3306/sakila"; // untuk xampp
//    String jdbcURL = "jdbc:mysql://localhost:3306/data?autoReconnect=true&useSSL=false"; //khusus untuk workbench
    String userid = "system";
    String password = "admin";
    Connection conn;

    public DataHandler() {
    }

    public void getDBConnection() {
        try {
                Class.forName("oracle.jdbc.driver.OracleDriver");// dari Driver class
//            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(jdbcURL, userid, password);
            System.out.println("Koneksi berhasil");
        } catch (Exception e) {// perform error handling here
            System.out.println("Masih belum konek");
        }
    }

    public void close() {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Tidak bisa tutup koneksi");
        }
    }
    public static void main(String[] args) {
        DataHandler datahandler = new  DataHandler();
        datahandler.getDBConnection();
        datahandler.close();
    }
}
