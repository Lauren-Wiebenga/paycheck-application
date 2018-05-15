/*
 * Date:   5/14/18
 * Author: Lauren Wiebenga
 * File:   PaycheckApplication/src/control/Controller.java
 */
package control;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.EmpDB;
import model.Employee;

public class Controller {
    private EmpDB database;
    
    public void createDB(String file) throws FileNotFoundException, IOException {
        database = new EmpDB(file);
    }
    
    public Employee getEmployee(String emp) throws NullPointerException {
        return database.query(emp);
    }
    
    public Employee getEmployee(Integer emp) throws NullPointerException {
        return database.query(emp);
    }
    
    public void buildTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        database.buildTable(model);
    }
}
