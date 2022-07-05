/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.*;
import java.util.ArrayList;
//import javax.activation.DataHandler;

/**
 *
 * @author ASPIRE 5
 */
public class DataEmployee {

    Connection conn;
    Statement stmt;
    ResultSet rset;

    String query;

    public DataEmployee() {
        DataHandler dataHandler = new DataHandler();
        dataHandler.getDBConnection();
        //buat koneksi
        conn = dataHandler.conn;
    }

    public ResultSet getAllEmployees() throws SQLException {
        stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
        query = "SELECT employee_id, first_name, last_name"
                + " FROM employees ";
        System.out.println("\nExecuting query: " + query);
        rset = stmt.executeQuery(query);
        return rset;
    }

    public static void main(String[] args) throws SQLException {
        DataEmployee le = new DataEmployee();
        ResultSet rset = le.getAllEmployees();
        while (rset.next()) {
            System.out.println(rset.getInt(1) + " " + rset.getString(2)
                    + " " + rset.getString(3));
        }
        le.conn.close();
    }

    ArrayList searchEmployee(String keyword) throws SQLException {
        ArrayList result = null;
        stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
        String query = "SELECT * FROM Employee e, department d "
                + "where e.department_id = d.idDepartment and "
                + "d.name like '%" + keyword + "%'";
        rset = stmt.executeQuery(query);
        result = new ArrayList();
        while (rset.next()) {
            Employee temp = new Employee(rset.getInt(1), rset.getString(2),
                    rset.getString(3), rset.getInt(4));
            result.add(temp);
        }
        conn.close();
        return result;
    }


}


