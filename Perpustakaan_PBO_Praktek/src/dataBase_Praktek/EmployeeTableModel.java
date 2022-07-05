package dataBase_Praktek;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class EmployeeTableModel extends AbstractTableModel {
    String columNames[] = {"Id", "First Name", "Last Name", "Department Name"};
    ArrayList data;

    public EmployeeTableModel(String keyword) throws SQLException {
        DataEmployee r = new DataEmployee();
        data = r.searchEmployee(keyword);
    }

    public int getRowCount() {
        return data.size();
    }

    public int getColumnCount() {
        return columNames.length;
    }

    @Override
    public String getColumnName(int col) {
        return columNames[col];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Employee temp = (Employee) data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return temp.getEmployee_id();
            case 1:
                return temp.getFirst_name();
            case 2:
                return temp.getLast_name();
            case 3:
                return temp.getDepartment_id();
        }
        return null;
    }

    @Override
    public Class getColumnClass(int c) {
        System.out.println(c);
        return getValueAt(0, c).getClass();
    }

    public static void main(String[] args) throws SQLException {
        EmployeeTableModel test = new EmployeeTableModel("Accounting");
        for (int i = 0; i < test.getRowCount(); i++) {
            System.out.println("nama :" + test.getValueAt(i, 1));
        }
    }

}
