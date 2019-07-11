import java.util.Scanner;

public class TestQuestion1{
    /* 
     * Purpose: Test Question #1, add two numbers
     * Date: June 29, 2019
     * Author: Joshua Franke
     * Version: 1.0
     */

    public static void main(String[] args){
        int input1, input2, theAnswer;
        Scanner input = new Scanner(System.in);
        
        //Get input from the user:
        System.out.println("Please enter a number to be added:");
        input1 = input.nextInt();
        System.out.println("Please enter another number to be added:");
        input2 = input.nextInt();
        
        //Call the method to add the numbers:
        theAnswer = addNumbers(input1, input2);
        System.out.println(input1 + " + " + input2 + " equals " + theAnswer);
    } 

    public static int addNumbers(int in1, int in2){
        //This Method adds the two numbers:
        int answer = in1 + in2;
        return answer;
    }
}