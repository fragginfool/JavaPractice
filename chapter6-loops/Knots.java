    /* Author: Josh Franke 
     * Purpose: Demonstrate loops...
     * Date: June 3, 2019
     * Version: 1.0
     */
public class Knots{
    public static void main(String[] args){
        double milePerKnot = 1.151;
        double kmPerKnot   = 1.852;
        double mile;
        double km;
        

        for (int x = 15; x<= 30; x++){
            mile = x * milePerKnot;
            km = x * kmPerKnot;
            System.out.println("Knots: " + x + "\nmiles: " + mile + "\nKilometers: " + km);
        }
    }
}