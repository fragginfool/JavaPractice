public class Week3_DemoRaise2 {
    /*
     * Author: Josh Franke Purpose: Demonstrate a method call Date: June 3, 2019
     * Version: 1.0
     */

    public static void main (String[] args) {
        double salary = 200.00;
        System.out.println("Demonstrating some raises");
        System.out.println("This ouput is: " + PredictRaise(salary));
    }
    

    private static double PredictRaise(double sal) {
        final double RAISE = 1.10;
        double newSalary = sal * RAISE;
        double totalAmount = calcBonus(newSalary);

        
        //System.out.println("Current salary " + sal + " \nAfter raise: " + newSalary)
        return totalAmount;
    }
    private static double calcBonus(double sal) {
        double bonus = sal + 110;
        return bonus;
    }
}