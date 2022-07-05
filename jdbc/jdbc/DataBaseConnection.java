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
public class DataBaseConnection {

    public static void main(String[] args) throws SQLException {
        String jdbcURL = "jdbc:oracle:thin:@//127.0.0.1:1521/xe";

        String user = "hr";
        String password = "admin";
        Connection connection = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(jdbcURL, user, password);
            System.out.println("koneksi berhasil");
        } catch (Exception ex) {
            System.out.println("message: " + ex.getMessage());
        }
        //Connection con = DriverManager.getConnection(url, "alex", "8675309");
        Statement st = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet results = st.executeQuery("SELECT Employee_ID, Last_Name, First_Name FROM Employees");
        //String query = "SELECT employee_id, first_name, last_name  FROM employee  ";
        //System.out.println("\nExecuting query: " + query);
        while (results.next()) {
            System.out.println(results.getInt("employee_id") + ":" + results.getString(2));
        }

    }
}
