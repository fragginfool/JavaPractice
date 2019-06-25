import javax.swing.JOptionPane;

public class DogBoarding {
    /*
    * Auther: Josh Franke
    * Purpose: Calculate Ammount charged for boarding certain sized dogs
    * Date:    May 26 2019
    * Version: 1.0
    */
    
        public static void main (String[] args) {
            int weight = Integer.parseInt(JOptionPane.showInputDialog(null, "How many pounds is your dog?"));
            int days = Integer.parseInt(JOptionPane.showInputDialog(null, "How many days will your dog be staying with us?"));
            double total = (weight * .5 * days);
            System.out.println("It will cost " + total + " dollars to keep your dog with us for the time you requested.");
        }
    }