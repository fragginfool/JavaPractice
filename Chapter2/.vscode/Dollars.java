import javax.swing.JOptionPane;

public class Dollars {
    /*
    * Auther: Josh Franke
    * Purpose: Cash and change from entered ammount
    * Date:    May 26 2019
    * Version: 1.0
    */
    
        public static void main (String[] args) {
            int total = Integer.parseInt(JOptionPane.showInputDialog(null, "What is your dollar ammount you want broken down?"));
            int twenties = total / 20;
            int tens  =  (total % 20) / 10;
            int fives = ((total % 20) % 10) / 5; 
            int ones  =  (((total % 20) % 10) % 5) / 1; 
            System.out.println("You will need " + twenties + " twenties, " + tens + " tens, " + fives + " fives, and " + ones + " ones.");
        }
    }