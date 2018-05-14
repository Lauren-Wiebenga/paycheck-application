/*
 * Date:   5/14/18
 * Author: Lauren Wiebenga
 * File:   PaycheckApplication/src/model/DoubleToText.java
 */
package model;

public interface DoubleToText {
    String[] PLACES = {
        "Hundred", "Thousand", "Million"  
    };
    String[][] NUMBERS = {
        {
            "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
            "Nine"
        },
        {
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
            "Seventeen", "Eighteen", "Nineteen"
        },
        {
            "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixy", "Seventy",
            "Eighty", "Ninety"
        }
    };
    
    int setDollars(Double amount);
    int setCents(Double amount);
    String getTextAmount(Double amount);
    String toTextAmount(int amount);
}
