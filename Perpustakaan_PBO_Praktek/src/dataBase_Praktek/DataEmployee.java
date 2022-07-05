package dataBase_Praktek;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public ResultSet getAllEmployees() {

        try {
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
//            query = "SELECT employee_id, first_name, last_name FROM employees ";
//            query = "SELECT * FROM employees e, departments d where e.department_id = d.department_id and d.department_name LIKE '%IT%'";
//            query ="select c.city_id , c.city, d.country from city c, country d where c.country_id = d.country_id";  
//            query = "select employee_id, first_name, last_name, department_id from employee";
            query = "select * from employee";
            System.out.println("\nExecuting query: " + query);
            rset = stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(DataEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rset;
    }

    public ResultSet getAllDepartments() {

        try {
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            query = "select * from department";
            System.out.println("\nExecuting query: " + query);
            rset = stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(DataEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rset;
    }

    public ArrayList searchEmployee(String keyword) {
        ArrayList result = null;
        String query = "SELECT * FROM employee e, department d where e.department_id = d.idDepartment and d.name LIKE '%" + keyword + "%'";
        try {
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            System.out.println(query);
            rset = stmt.executeQuery(query);
            result = new ArrayList();
            while (rset.next()) {
                Employee temp = new Employee(rset.getInt(1), rset.getString(2), rset.getString(3), rset.getInt("department_id"));
                result.add(temp);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataEmployee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }

        public void insertEmployee(int id, String first, String last, int dep_id) {
            PreparedStatement pst;
            try {
                query = "INSERT INTO employee VALUES ('" + id + "','" + first + "','" + last + "','" + dep_id + "')";
                System.out.println("\nExecuting query: " + query);
                pst = conn.prepareStatement(query);
                pst.execute();
                System.out.println("Berhasil di simpan");
            } catch (SQLException | HeadlessException ex) {
                Logger.getLogger(DataEmployee.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    public void insertDepartment(int id, String nama, String city) {
        PreparedStatement pst;
        try {
            query = "INSERT INTO department VALUES ('" + id + "','" + nama + "','" + city + "')";
            System.out.println("\nExecuting query: " + query);
            pst = conn.prepareStatement(query);
            pst.execute();
            System.out.println("Berhasil di simpan");
        } catch (SQLException | HeadlessException ex) {
            Logger.getLogger(DataEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateEmployee(int employee_id, int department_id) {
        PreparedStatement pst;
        try {
            query = "UPDATE employee SET department_id = '" + department_id + "' where employee_id = '" + employee_id + "'";
            System.out.println("\nExecuting query: " + query);
            pst = conn.prepareStatement(query);
            pst.execute();
            System.out.println("Berhasil di update");
        } catch (SQLException | HeadlessException ex) {
            Logger.getLogger(DataEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteEmployee(String first_name) {
        PreparedStatement pst;
        try {
            query = "DELETE from employee where first_name = '" + first_name + "';";
            System.out.println("\nExecuting query: " + query);
            pst = conn.prepareStatement(query);
            pst.execute();
            System.out.println("Berhasil di di hapus");
        } catch (SQLException | HeadlessException ex) {
            Logger.getLogger(DataEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) throws SQLException {
        DataEmployee le = new DataEmployee();
        ResultSet rset = le.getAllEmployees();
        while (rset.next()) {
            System.out.println(rset.getInt(1) + " " + rset.getString(2) + " " + rset.getString(3) + " " + rset.getInt(4));
//            System.out.println(rset.getInt("EMPLOYEE_ID") + " " + rset.getString("FIRST_NAME") + " " + rset.getString("LAST_NAME") + " " + rset.getInt("DEPARTMENT_ID"));
        }
//        memasukkan data employee
//        le.insertEmployee(10102,"Ann", "Jones",3);
//        le.insertEmployee(18316,"John", "Barrimore",3);
//        le.insertEmployee(29346,"James", "Jones",3);
//        le.insertEmployee(9031,"Elsa", "Bertoni",2);
//        le.insertEmployee(2581,"Elke", "Hansel",2);
//        le.insertEmployee(28559,"Sybill", "Moser",1);
        rset = le.getAllEmployees();
        while (rset.next()) {
            System.out.println(rset.getInt(1) + " " + rset.getString(2) + " " + rset.getString(3) + " " + rset.getInt(4));
        }

        //masukkan data department
//        INSERT INTO department VALUES ('1', 'Research', 'Dallas'); 
//        INSERT INTO department VALUES ('2', 'Accounting', 'Seattle'); 
//        INSERT INTO department VALUES ('3', 'Marketing', 'Dallas');
        rset = le.getAllDepartments();
        while (rset.next()) {
            System.out.println(rset.getInt(1) + " " + rset.getString(2) + " " + rset.getString(3));
        }
        le.insertDepartment(1, "Research", "Dallas");
        le.insertDepartment(2, "Accounting", "Seattle");
        le.insertDepartment(3, "Marketing", "Dallas");
        rset = le.getAllDepartments();
        while (rset.next()) {
            System.out.println(rset.getInt(1) + " " + rset.getString(2) + " " + rset.getString(3));
        }
        le.conn.close();

//        ArrayList rset1 = le.searchEmployee("IT");
//        for (Object n : rset1) {
//            if (n instanceof Employee) {
//                System.out.println("employee id " + ((Employee) n).getEmployee_id());
//                System.out.println("employee id " + ((Employee) n).getFirst_name());
//            }
//        }
    }

}

//update data
//        le.updateEmployee(idEmp, idDep);
//        rset = le.getAllEmployees();
//        while (rset.next()) {
//            System.out.println(rset.getInt(1) + " " + rset.getString(2) + " " + rset.getString(3) + " " + rset.getInt(4));
//        }
//delete data
//        le.deleteEmployee(first);
//        while (rset.next()) {
//            System.out.println(rset.getInt(1) + " " + rset.getString(2) + " " + rset.getString(3) + " " + rset.getInt(4));
//        }
