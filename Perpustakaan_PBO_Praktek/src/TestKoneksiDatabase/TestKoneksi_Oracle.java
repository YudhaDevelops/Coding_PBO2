package TestKoneksiDatabase;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestKoneksi_Oracle {

    private static final String jdbcURL = "jdbc:oracle:thin:@//127.0.0.1:1521/xepdb1";
    private static String user = "hr";
    private static String password = "admin";
    private static Connection connection = null;

    public static void main(String[] args) {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(jdbcURL, user, password);
            System.out.println("koneksi berhasil");
        } catch (Exception ex) {
            System.out.println("message: " + ex.getMessage());
        }
        
        Statement stmt = null;
        String query = "SELECT employee_id, first_name, last_name  FROM employees";
        System.out.println("\nExecuting query: " + query);
        ResultSet rset = null;
        try {
            stmt = connection.createStatement();
            rset = stmt.executeQuery(query);
            while (rset.next()) {
                System.out.println("Id Employee : " + rset.getInt(1));
                System.out.println("First Name  : " + rset.getString(2));
                System.out.println("Last Name   : " + rset.getString(3));
                System.out.println("");
//                System.out.println(rset.getInt("employee_id") + ":" + rset.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(TestKoneksi_Oracle.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
