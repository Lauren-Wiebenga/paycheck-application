/*
 * Date:   5/14/18
 * Author: Lauren Wiebenga
 * File:   PaycheckApp/src/model/Data.java
 */
package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmpDB {
    private TreeMap<Integer,Employee> empID;
    private TreeMap<String, Employee> empName;
    private String file;
    private final Pattern pattern;
    
    public EmpDB(String file) throws FileNotFoundException, IOException {
        empName = new TreeMap<>();
        empID = new TreeMap<>();
        pattern = Pattern.compile(
                "([a-zA-Z -,]{1,40}),"
              + "(\\d{1,25}),"
              + "\\$(\\d{1,3}\\.\\d{2}),"
              + "(\\d{1,3}\\.\\d{1})");
        loadData(file);
    }
    
    public Employee query(Integer id) {
        if (empID.containsKey(id)) {
            return empID.get(id);
        }
        else {
            throw new NullPointerException();
        }
    }
    public Employee query(String name) {
        if (empName.containsKey(name)) {
            return  empName.get(name);
        }
        else {
            throw new NullPointerException();
        }
    }
    
    @Override
    public String toString() {
        return "Storage Class";
    }
    
    private void loadData(String employeeFile) throws FileNotFoundException, IOException {
        BufferedReader input = new BufferedReader(new FileReader(new File(employeeFile)));
        String line = input.readLine();
        Matcher match;
        while (line != null) {
            match = pattern.matcher(line);
            if (match.find()) {
                System.out.println(match.group(1));
                Employee emp = new Employee(match.group(1),
                                            Integer.parseInt(match.group(2)),
                                            Double.parseDouble(match.group(3)),
                                            Double.parseDouble(match.group(4)));
                empID.put(Integer.parseInt(match.group(2)), emp);
                empName.put(match.group(1), emp);
            }
            line = input.readLine();
        }
    }
}
