/*
 * Date:   2/27/18
 * Author: Lauren Wiebenga
 * File:   PaycheckApplication/src/business/Employee.java
 */
package model;

public class Employee implements DoubleToText {
    /*
     *  INSTANCE VARIABLES 
     */
    private final String name;
    final private int empID; // immutable
    private final Double wage;
    private final Double hours;
    private String payDue;
    private String amount;
    
    /*
     *  CONSTRUCTORS
     */
    public Employee(String name, int id, Double wage, Double hours) {
        this.name = name;
        this.empID = id;
        this.wage = wage;
        this.hours = hours;
        this.payDue = String.format("$%.2f", wage * hours);
        this.amount = getTextAmount(Double.parseDouble(this.payDue.substring(1)));
    }
    
    /*
     *  GET AND SET METHODS
     */
    public String getName() {
        return this.name;
    }
    public String getEmpID() {
        return Integer.toString(this.empID);
    }
    public String getWage() {
        return Double.toString(this.wage);
    }
    public String getHours() {
        return Double.toString(this.hours);
    }
    public String getPayDue() {
        return this.payDue;
    }
    public String getAmount() {
        return this.amount;
    }
    
    /*
     *  FUNCTIONAL METHODS 
     */
    @Override
    public int setDollars(Double amount) {
        int wholeAmount = (int)(amount * 100);
        return wholeAmount / 100;
    }
    @Override
    public int setCents(Double amount) {
        int wholeAmount = (int)(amount * 100);
        return wholeAmount % 100;
    }
    @Override
    public String getTextAmount(Double amount) {
        int dollars = setDollars(amount);
        int cents = setCents(amount);
        return toTextAmount(dollars) + " Dollars and " + toTextAmount(cents) + " Cents";
    }
    @Override
    public String toTextAmount(int amount) {
        if (amount == 0) { // handle 0 amount
            return "Zero";
        }
        if (amount < 10) { // handle 1-9 amount
            return NUMBERS[0][amount - 1];
        }
        String result = "";
        int i = 0;
        while (amount > 0) {
            // set up variables
            String buffer = "";
            int temp = 0;
            if (i % 2 == 0) { // for handling two digits at once
                temp = amount % 10;
                amount /= 10;
            }
            int current = amount % 10;
            amount /= 10;
            // convert numbers
            if (i % 2 == 0) {
                if (temp == 0 && current == 0) { // both digits are zero
                    // do nothing
                }
                else if (temp == 0) { // digits are 1-9 and 0
                    buffer += NUMBERS[2][current - 1];
                }
                else if (current == 0) { // digits are 0 and 1-9
                    buffer += NUMBERS[0][temp - 1];
                }
                else if (current == 1) { // digits are 1 and 1-9
                    buffer += NUMBERS[1][temp - 1];
                }
                else { // digits are 1-9 and 1-9
                    buffer += NUMBERS[2][current - 1] + " " 
                            + NUMBERS[0][temp - 1];
                }
            }
            else { // handle single digit 1-9
                if (current != 0) {
                    buffer += NUMBERS[0][current - 1];
                }
            }
            // add place values
            if ((i == 1 || i == 3 || i == 5) && current != 0) { // add "hundred"
                buffer += " " + PLACES[0];
                if (i == 1) {
                    buffer += " ";
                }
            }
            if (i == 2) {
                buffer += " " + PLACES[1] + " "; // add "thousand"
            }
            if (i == 4) {
                buffer += " " + PLACES[2]; // add "million"
            }
            result = buffer + result;
            i++;
        }
        return result.trim();
    }
}
