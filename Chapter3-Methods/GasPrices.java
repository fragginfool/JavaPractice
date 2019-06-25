import javax.swing.JOptionPane;

public class GasPrices {
    /*
     * Author: Josh Franke Purpose: Demonstrate a method call 
     * Date: June 3, 2019
     * Version: 1.0
     */

    public static void main (String[] args) {
        String pricePerBarrel = JOptionPane.showInputDialog(null, "Please enter price per barrel:\n");
        String range = calRange(pricePerBarrel); 
        System.out.println("With gasoline priced at " + pricePerBarrel + " dollars a barrel, gas will be priced at about " + range + " dollars a gallon");
    }

    public static String calRange(String price){
        double doublePrice = (Double.parseDouble(price));
        double range1 = ((doublePrice / 100) * 3.50); 
        double range2 =  range1 + .50;
        String stringRange = range1 + " - " + range2;
        return stringRange;
    }
}
