import java.util.Scanner;

/* Author: Josh Franke 
     * Purpose: Count spaces
     * Date: June 24, 2019
     * Version: 1.0
     */

     class FiveLettersAndFiveDigits{
         public static void main(String[] args){
             Scanner input = new Scanner(System.in);
             System.out.println("Please input a phrase with five numbers and five letters");
             
             int valid = 0;
             while(valid == 0){
                String phrase = input.nextLine();
                int digits = 0;
                int characters = 0;
                char c;
                for(int x = 0; x < phrase.length(); x++){
                    c = phrase.charAt(x);
                    if(Character.isDigit(c)){
                        digits = ++digits;
                    }
                    if(Character.isAlphabetic(c)){
                        characters = ++characters;
                    }
                }
                if(characters >= 5 && digits >= 5){
                        System.out.println("That phrase is valid!!");
                        valid = 1;
                    }
                else{
                        System.out.println("That phrase is not valid! Please try again!");
                    }
             
         }
        }
    }