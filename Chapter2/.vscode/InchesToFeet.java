public class InchesToFeet {
    /*
    * Auther: Josh Franke
    * Purpose: Convert Inches to Feet
    * Date:    May 26 2019
    * Version: 1.0
    */
    
        public static void main (String[] args) {
            int inches = 25;
            int feet = inches / 12;
            int remainderInches = inches % 12;
            System.out.println("The measurement is " + feet + " feet and " + remainderInches + " inches");
        }
    }
    