/*
 * Date:   5/14/18
 * Author: Lauren Wiebenga
 * File:   PaycheckApplication/src/control/Controller.java
 */
package control;

import java.io.FileNotFoundException;
import java.io.IOException;
import model.EmpDB;
import model.Employee;

public class Controller {
    private EmpDB database;
    
    public Employee getEmployee(String emp) throws NullPointerException {
        return database.query(emp);
    }
    
    public Employee getEmployee(Integer emp) throws NullPointerException {
        return database.query(emp);
    }
    
    public void createDB(String file) {
        try {
            database = new EmpDB(file);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
