/*
 * Date:   3/30/18
 * Author: Lauren Wiebenga
 * File:   FloatToText.java
 */
package business;

public class FloatToText {
    /*
     *  STATIC VARIABLES 
     */
    final private static String[] PLACES = {
        "Hundred", "Thousand", "Million"  
    };
    final private static String[][] NUMBERS = {
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
    
    /*
     *  CONSTRUCTORS 
     */
    public FloatToText() { // default constructor
    }
    
    /*
     *  GET AND SET METHODS 
     */
    private static int setDollars(Double amount) {
        int wholeAmount = (int)(amount * 100);
        return wholeAmount / 100;
    }
    private static int setCents(Double amount) {
        int wholeAmount = (int)(amount * 100);
        return wholeAmount % 100;
    }
    
    /*
     *  FUNCTIONAL METHODS 
     */
    public static String getTextAmount(Double amount) {
        int dollars = setDollars(amount);
        int cents = setCents(amount);
        return toTextAmount(dollars) + " Dollars and " + toTextAmount(cents) + " Cents";
    }
    // convert numeric amount to text amount
    private static String toTextAmount(int amount) {
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
