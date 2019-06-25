    /* Author: Josh Franke 
     * Purpose: Demonstrate loops...
     * Date: June 19, 2019
     * Version: 1.0
     */
public class Population{
    public static void main(String[] args){
        double popMexico = 114000000;
        double popUS = 312000000;
        double popIncreaseMexico = .0101;
        double popDecreaseUS = .0015;
        int year = 0;

        while(popUS > popMexico){
            popMexico = (popMexico * popIncreaseMexico) + popMexico;
            popUS = popUS - (popUS * popDecreaseUS);
            ++year;
            System.out.println("It is year " + year + " and the population of Mexico is: " + popMexico + " while the population of the US is: " + popUS);
        }
    }
}