import java.util.Scanner;

import javax.swing.JOptionPane;

public class CondoSales2{
    /* Author: Josh Franke 
     * Purpose: Demonstrate decision making...
     * Ask the user to choose between three options, output is the name of the chosen view as well as the price of the condo.  
     * Date: June 3, 2019
     * Version: 1.0
     */

    public static void main(String[] args){
        int userinput;
        int garageOrSpace = 2;
        userinput = Integer.parseInt(JOptionPane.showInputDialog(null, "Which type of condo would you like?\n 1. Parkview \n 2.Golf Course View \n 3.Lake View \n Please enter an option 1-3."));
        //if user selects first option, do not ask if they want the garage option
        if (userinput == 3 || userinput == 2)
            garageOrSpace = Integer.parseInt(JOptionPane.showInputDialog(null, "Would you like a parking garage or a parking space?\n Enter 1 for a Parking Garage or 2 for a Parking Space."));
        //Check user input for garage to see if it is valid
            System.out.println(garageOrSpace);
        if(garageOrSpace < 1 || garageOrSpace > 2)
            System.out.println("The value you entered is invalid, assuming you wanted a parking space.");
        //final output
        if (userinput >= 1 && userinput <= 3){
            if(userinput == 1)
                System.out.println("You selected Park view which is $150,000");
            if(userinput == 2){
                    if(garageOrSpace == 1)
                        System.out.println("You selected Golf course view and a parking garage which will cost $175,000");
                    else    
                        System.out.println("You selected Golf course view which is $170,000");
            }
            if(userinput == 3)
                    if(garageOrSpace == 1){
                        System.out.println("You selected Lake view with a parking garage which will cost $215,000");
                    }
                    else
                        System.out.println("You selected Lake view which is $210,000");
        }
        else 
            System.out.println("Your selection is invalid");
    } 
}