/*
 * Date:   2/27/18
 * Author: Lauren Wiebenga
 * File:   Paycheck.java
 */
package business;

public class Paycheck {
    /*
     *  INSTANCE VARIABLES 
     */
    protected Double wageDue;
    protected String paycheck;
    
    /*
     *  CONSTRUCTORS 
     */
    public Paycheck(Double wage, Double hours) {
        wageDue = wage * hours;
        paycheck = FloatToText.getTextAmount(wageDue);
    }
    
    /*
     *  GET METHODS
     */
    public Double getWageDue() {
        return wageDue;
        
    }
    public String getPaycheck() {
        return paycheck;
    }
}
