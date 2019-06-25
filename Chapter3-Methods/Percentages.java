public class Percentages {
    /*
     * Author: Josh Franke Purpose: Demonstrate a method call 
     * Date: June 3, 2019
     * Version: 1.0
     */

    public static void main (String[] args) {
        double v1 = 2.0;
        double v2 = 5.0;
        double output = ComputePercentage(v1, v2);
        
        System.out.println(v1 + " is " + output + " percent of " + v2);
        output = ComputePercentage(v2, v1);
        System.out.println(v2 + " is " + output + " percent of " + v1);
    }
    public static double ComputePercentage(double v1, double v2) {
        double percentage = ((v1 / v2) * 100.0);
        return percentage;
    }
}