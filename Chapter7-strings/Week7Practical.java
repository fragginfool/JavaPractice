import java.util.Scanner;

    /* Author: Josh Franke 
     * Purpose: Compares a string against another string.
     * Date: June 3, 2019
     * Version: 1.0
     */

    public class Week7Practical{

        public static void main(String[] args){
            String aName = "Carmen";
            String anotherName;
            System.out.println("Please enter your name");
            Scanner input = new Scanner(System.in);
            anotherName = input.nextLine();
            if(aName.equals(anotherName)){
                System.out.println(aName + " equals " + anotherName);
            }
            else{
                System.out.println(aName + " does not equal " + anotherName);
            }
            
        }
    }
