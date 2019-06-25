import java.text.CharacterIterator;
/* Author: Josh Franke 
     * Purpose: Count spaces
     * Date: June 24, 2019
     * Version: 1.0
     */
import java.util.Scanner;

    class CountSpaces2{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("Please input a phrase to have the number of spaces counted!");
            String phrase = input.nextLine();
            int spaces = 0;
            char c;
            for(int x = 0; x < phrase.length(); x++){
                c = phrase.charAt(x);
                if(c == (' ')){
                    spaces = ++spaces;
                } 
            }
            System.out.println(spaces);
        }
    }