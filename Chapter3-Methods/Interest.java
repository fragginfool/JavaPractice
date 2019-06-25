import javax.swing.JOptionPane;

public class Interest{
    /*
     * Author: Josh Franke Purpose: Demonstrate a method call 
     * Date: June 3, 2019
     * Version: 1.0
     */
    public static void main (String[] args) {
        double investedAmount = getAmount();
        double predictedTot = calcAmount(investedAmount);
        System.out.println("Your year long investment would return " + predictedTot + " dollars.");
    }
    public static double getAmount(){
        double investedAmount = Double.parseDouble(JOptionPane.showInputDialog(null, "How much are you investing?:\n"));
        return investedAmount;
    }
    public static double calcAmount(double investedAmount) {
        double totalPay = (investedAmount * .05) + investedAmount;
        return totalPay;
    }

}