/*
 * Date:   2/27/18
 * Author: Lauren Wiebenga
 * File:   Company.java
 */
package business;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Company {
    /*
     *  INSTANCE VARIABLES 
     */
    protected String name;
    protected String address;
    protected File employeeFile;
    protected HashMap<Integer, Employee> employees = new HashMap<>();
    
    /*
     *  CONSTRUCTORS 
     */
    public Company(String name, String address, String file) {
        this.name = name;
        this.address = address;
        try {
            employeeFile = new File(file);
        }
        catch (Exception e) {
            System.out.println("File Error");
        }
    }
    
    /*
     *  GET AND SET METHODS
     */
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
    /*
     *  FUNCTIONAL METHODS 
     */
    public File generatePayroll() {
        return new File("");
    }
    public void loadEmployees() {
        try {
            Scanner input = new Scanner(employeeFile);
            while (input.hasNext()) {
                String[] temp = input.nextLine().split(",");
                String inName = temp[0];
                Integer id = Integer.parseInt(temp[1]);
                Double wage = Double.parseDouble(temp[2]);
                Double hours = Double.parseDouble(temp[3]);
                employees.put(id, new Employee(inName, id, wage, hours));
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }
    }
    // to string
    @Override
    public String toString() {
        String textOut = String.format("%s\n%s\n\n", name, address);
        for (HashMap.Entry<Integer, Employee> e : employees.entrySet()) {
            textOut += e.getValue().toString() + "\n";
        }
        return textOut;
    }
}
