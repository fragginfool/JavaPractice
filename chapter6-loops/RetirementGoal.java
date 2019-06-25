import java.util.Scanner;

    /* Author: Josh Franke 
     * Purpose: Demonstrate loops...
     * Date: June 19, 2019
     * Version: 1.0
     */

public class RetirementGoal{
    public static void main(String[] args){
        int valid = 0;
        double totalAmount;
        int years;
        double saveYearly;
        
        System.out.println("What is the number of years you have until retirement?");
        years = getInput();
        System.out.println("How much can you save annually?");
        saveYearly = getInput();
        totalAmount = saveYearly * years;
        System.out.println("You will be able to save: " + totalAmount + " dollars.");
    }
        static int getInput(){
            int in = 0;
            int valid = 0;
            Scanner input = new Scanner(System.in);
            while(valid < 1){
                in = input.nextInt();
                if(in < 1){
                    System.out.println("The number you entered is invalid.");
                }
                else{
                   valid = 1;
                }
            }
            return in;
        }
}