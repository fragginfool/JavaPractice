public class Week3_DemoRaise1 {
    /*
     * Author: Josh Franke 
     * Purpose: Demonstrate a method call 
     * Date: June 3, 2019
     * Version: 1.0
     */
    public static void main(String[] args) {
        double salary = 200.00;
        double startingWage = 800.00;
        System.out.println("Demonstrating some raises");
        PredictRaise(salary);
        PredictRaise(startingWage);

    }

    private static void PredictRaise(double sal) {
        double newSalary;
        final double RAISE = 1.10;
        newSalary = sal * RAISE;
        System.out.println("Current salary: " + sal + " \nAfter Raise: " + newSalary);
    
    }
}