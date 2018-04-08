/*
 * Date:   2/27/18
 * Author: Lauren Wiebenga
 * File:   Employee.java
 */
package business;

public class Employee {
    /*
     *  INSTANCE VARIABLES 
     */
    protected String name;
    final protected int id; // immutable
    protected Double wage;
    protected Double hours;
    protected Paycheck paycheck;
    
    /*
     *  CONSTRUCTORS
     */
    public Employee(String name, int id, Double wage, Double hours) {
        this.name = name;
        this.id = id;
        this.wage = wage;
        this.hours = hours;
        paycheck = new Paycheck(wage, hours);
    }
    
    /*
     *  GET AND SET METHODS
     */
    public String getName() {
        return name;
    }
    public String getId() {
        return Integer.toString(id);
    }
    
    /*
     *  FUNCTIONAL METHODS 
     */
    // toString method
    @Override
    public String toString() {
        return String.format("%-15s\n$%.2f : %s\n", name, paycheck.getWageDue(), paycheck.getPaycheck());
    }
}
