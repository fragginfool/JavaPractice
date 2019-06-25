import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

/* Author: Josh Franke 
     * Purpose: Count spaces
     * Date: June 24, 2019
     * Version: 1.0
     */

    class CountSpaces{
        public static void main(String[] args){
            String phrase = "The person who says something is impossible should not interrupt the person who is doing it.";
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