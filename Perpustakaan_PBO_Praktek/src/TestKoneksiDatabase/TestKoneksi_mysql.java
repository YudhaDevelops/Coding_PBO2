package TestKoneksiDatabase;
import java.sql.*;
public class TestKoneksi_mysql {
    
    public static void main(String[] args){
//        String jdbcURL = “jdbc:mysql://localhost:3306/po_maju_lancar";
//        String user = "root";
        //"jdbc:oracle:thin:@//127.0.0.1:1521/xepdb1l";
        String jdbcURL = "jdbc:mysql://localhost:3306/coba_PBO_dataBase"; // pake mysql xampp
        String user = "root";
        String password = "";
        Connection conn = null;
        
        try {
//            Class.forName(“com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(jdbcURL, user, password);
            System.out.println("Koneksi berhasil");
             conn.close();
        } catch (Exception e) {
            // perform error handling here
            System.out.println(e.getMessage());
        }
    }
    
}
