import java.util.Scanner;

public class CondoSales{
    /* Author: Josh Franke 
     * Purpose: Demonstrate decision making...
     * Ask the user to choose between three options, output is the name of the chosen view as well as the price of the condo.  
     * Date: June 3, 2019
     * Version: 1.0
     */

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int userinput;
        System.out.println("Which condo would you like? Enter a number 1,2 or 3");
        System.out.println("1. Park view");
        System.out.println("2. Golf course view");
        System.out.println("3. Lake view");
        userinput = input.nextLine();
        
        if (userinput >= 1 && userinput <= 3){
            if(userinput == 1)
                System.out.println("You selected Park view which is $150,000");
            if(userinput == 2)
                System.out.println("you selected Golf course view which is $170,000");
            if(userinput == 3)
                System.out.println("You selected Lake view which is $210,000");
        }

        else 
            System.out.println("Your selection is invalid");
    } 
}