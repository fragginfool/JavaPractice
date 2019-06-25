import java.util.Scanner;

/* Author: Josh Franke 
     * Purpose: Count spaces
     * Date: June 24, 2019
     * Version: 1.0
     */
class CountMatches{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a phrase:");
        String phrase1 = input.nextLine();
        System.out.println("Please input another phrase:");
        String phrase2 = input.nextLine();
        String output = "";
        char c,d;

        for(int x = 0; x < phrase1.length(); x++){
            c = phrase1.charAt(x);
            if(c != (' ')){
                for(int y = 0; y < phrase2.length(); y++){
                    d = phrase2.charAt(y);
                    if(d == c){
                        output = output + d;
                        break;
                    } 
                } 
            }
        }
        System.out.println("The character in " + phrase1 + " that are also in " + phrase2 + ":\n" + output);
    }
}