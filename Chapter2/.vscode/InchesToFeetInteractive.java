import javax.swing.JOptionPane;

public class InchesToFeetInteractive {
    /*
    * Auther: Josh Franke
    * Purpose: Convert Inches to Feet Interactively
    * Date:    May 26 2019
    * Version: 1.0
    */
    
        public static void main (String[] args) {
            int inches = Integer.parseInt(JOptionPane.showInputDialog(null, "How many inches is your measurement?"));
            int feet = inches / 12;
            int remainderInches = inches % 12;
            System.out.println("The measurement is " + feet + " feet and " + remainderInches + " inches");
        }
    }
    