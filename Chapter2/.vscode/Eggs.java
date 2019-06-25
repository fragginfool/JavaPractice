import javax.swing.JOptionPane;

public class Eggs {
    /*
    * Auther: Josh Franke
    * Purpose: Provide calculations off of a remainder value
    * Date:    May 26 2019
    * Version: 1.0
    */
    
        public static void main (String[] args) {
            int eggs = Integer.parseInt(JOptionPane.showInputDialog(null, "How many eggs are you purchasing?"));
            int dozen = eggs / 12;
            int remaindereggs = eggs % 12;
            double total = ((dozen * 3.25) + (remaindereggs * .45));
            System.out.println("You ordered " + eggs + " eggs. That's " + dozen + " dozen at $3.25 per dozen and " + remaindereggs + " loose eggs at .45 cents each for a total of " + total);
        }
    }