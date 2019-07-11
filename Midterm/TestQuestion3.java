import java.util.Scanner;
    /* 
     * Purpose: Test Question C. Write a program that accepts three numbers as input to calculate and print the average of the numbers.
     * Date: June 29, 2019
     * Author: Joshua Franke
     * Version: 1.0
     */
public class TestQuestion3{
    public static void main(String[] args){
        int input1, input2, input3, averag;
        Scanner input = new Scanner(System.in);
        
        //Get input from the user:
        System.out.println("Please enter your first number:");
        input1 = input.nextInt();
        System.out.println("Please enter your second number:");
        input2 = input.nextInt();
        System.out.println("Please enter your third number:");
        input3 = input.nextInt();
        //Calculate the average with a method:
        averag = AvgNumbers(input1, input2, input3);
        System.out.println("The average of the three numbers you entered, rounded to the nearest integer, is " + averag);
    }

    public static int AvgNumbers(int num1, int num2, int num3){
        //This method calculates the average of three provided numbers:
        int aver = (num1 + num2 + num3)/3;
        return aver;
    }
}

