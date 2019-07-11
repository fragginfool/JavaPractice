import java.util.Scanner;

public class DistanceFromAverage{
        /*
        * Auther: Josh Franke
        * Purpose: Append an array
        * Date:    July 8, 2019
        * Version: 1.0
        */
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double userInput = 0;
        double arr [] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int index = 0;
        double av = 0;

        for(int j = 0; j < 9; j++){
            System.out.println("Please input a number! (Type 99999 to exit)");
            userInput = input.nextDouble();
            if(userInput == 99999){
                break;
            }
            else{
                arr[index] = userInput;
                index = index + 1;
            }
            
        }
        if(arr[0] != 0){
            System.out.println("Calculating!");
            av = average(arr);
            for(int i = 0; i < arr.length; i++){
                if(arr[i] != 0){
                    System.out.println(arr[i] + "is " + (av - arr[i]) + " away from the average!");
                }
            }
        }
        else{
            System.out.println("You did not enter in any values!");
        }
    }

    public static double average(double[] arr ){
        double sum = 0;
        double aver = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++ ){
            sum = sum + arr[i];
            if (arr[i] != 0){
                count = count + 1;
            }
        }
        aver = sum / count;
        return aver;

    }
}