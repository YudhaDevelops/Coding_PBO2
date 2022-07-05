package dataBase_Praktek;
public class Employee {

    private int employee_id;
    private String first_name;
    private String last_name;
    private int department_id;
    private String name_Department;

    public Employee() {
    }

    public Employee(int id, String first, String last, int dep_id) {
        this.employee_id = id;
        this.first_name = first;
        this.last_name = last;
        this.department_id = dep_id;
    }
    
    public String getName_Department() {
        return name_Department;
    }

    public void setId_Department(String name_Department) {
        this.name_Department = name_Department;
    }

    
    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }
    
}
