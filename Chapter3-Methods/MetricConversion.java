import javax.swing.JOptionPane;

public class MetricConversion {
    /*
     * Author: Josh Franke Purpose: Demonstrate a method call 
     * Date: June 3, 2019
     * Version: 1.0
     */

    public static void main (String[] args) {
        String userInput = JOptionPane.showInputDialog(null, "Please enter the value you want to convert\n");
        double centimeters = convertCentimeters(userInput);
        double liters = convertLiters(userInput);
        System.out.println("Your value converts to " + centimeters + " centimeters and " + liters + " liters.");
    }

    public static double convertCentimeters(String userInput){
        double inches = Double.parseDouble(userInput);
        double centimeters = inches * 2.54;
        return centimeters;
    }

    public static double convertLiters(String userInput){
        double gallons = Double.parseDouble(userInput);
        double liters = 3.7854 * gallons;
        return liters;
    }
}