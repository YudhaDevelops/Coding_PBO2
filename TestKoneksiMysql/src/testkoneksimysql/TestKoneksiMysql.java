package testkoneksimysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestKoneksiMysql {

    Connection conn = null;
    Statement stmt;
    ResultSet rset;
    String query;

    public static Connection KoneksiHandler() {
        Connection conn = null;
        String jdbcURL = "jdbc:mysql://localhost:3306/sakila"; // pake mysql xampp
        String user = "root";
        String password = "admin";
        try {
//            Class.forName(“com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(jdbcURL, user, password);
            System.out.println("Koneksi berhasil");
            conn.close();
        } catch (Exception e) {
            // perform error handling here
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void getAllData() {
        Statement stmt = null;
        ResultSet rset = null;
        String query;
        try {
//            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
//            query = "SELECT employee_id, first_name, last_name FROM employees ";
            query = "select c.city_id , c.city, d.country from city c, country d where c.country_id = d.country_id";
            System.out.println("\nExecuting query: " + query);
            rset = stmt.executeQuery(query);
        } catch (SQLException ex) {
            System.out.println("error : " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rset = null;

        conn = KoneksiHandler();
        String query;
        try {
//            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
//            query = "SELECT employee_id, first_name, last_name FROM employees ";
            query = "select c.city_id , c.city, d.country from city c, country d where c.country_id = d.country_id";
            System.out.println("\nExecuting query: " + query);
            rset = stmt.executeQuery(query);
        } catch (SQLException ex) {
            System.out.println("error : " + ex.getMessage());
        }
        try {
            while(rset.next()){
                System.out.println("ID City     : " +rset.getInt(1) + 
                                  ",Nama Kota   : " +rset.getString(2) + 
                                  ",Nama Negara : " +rset.getString(3));
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(TestKoneksiMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
