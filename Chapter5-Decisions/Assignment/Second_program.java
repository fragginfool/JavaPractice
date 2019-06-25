import java.util.Scanner;

public class Second_program{
/* Author: Josh Franke 
     * Purpose: Demonstrate decision making...
     * Date: June 14, 2019
     * Version: 1.0
     */


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Please input a number:");
        number = input.nextInt();
        if(isEven(number)){
            System.out.println(number + " is even!");
        }
        else{
            System.out.println(number + " is odd!");
        }

    }
    public static boolean isEven(int num){
        if((num % 2) == 1)
            return false;
        else
            return true;  
    }

}