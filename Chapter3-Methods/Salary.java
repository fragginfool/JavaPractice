import javax.swing.JOptionPane;

public class Salary{
    /*
     * Author: Josh Franke Purpose: Demonstrate a method call 
     * Date: June 3, 2019
     * Version: 1.0
     */
    public static void main (String[] args) {
        double payRate = Double.parseDouble(JOptionPane.showInputDialog(null, "Hourly pay rate?:\n"));
        double hoursWorked = Double.parseDouble(JOptionPane.showInputDialog(null, "Regular hours worked?:\n"));
        double overtimeWorked = Double.parseDouble(JOptionPane.showInputDialog(null, "Overtime hours worked?:\n"));
        double totalPay = calcOvertime(overtimeWorked, payRate, hoursWorked);
        System.out.println("Your total pay is " + totalPay + " dollars.");
    }
    public static double calcOvertime(double overtimeWorked, double payRate, double hoursWorked) {
        double totalPay = (1.5 * overtimeWorked * payRate) + (payRate * hoursWorked);
        return totalPay;
    }

}