/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;
import java.sql.*;
/**
 *
 * @author ASPIRE 5
 */
public class DataHandler {
    // string ‘localhost’ anda ganti dengan IP server yangdigunakan 
    String jdbcUrl = "jdbc:oracle:thin:@//127.0.0.1:1521/xe";
    String userid = "hr";
    String password = "admin";
    Connection conn;

    public DataHandler() {
    }

    public void getDBConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
// dari Driver class
            conn = DriverManager.getConnection(jdbcUrl, userid,password);
            System.out.println("Koneksi berhasil");
        } catch (Exception e) {
            // perform error handling here
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
}
