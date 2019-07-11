import java.util.Scanner;

public class DivideStrings{
    public static void main(String[] args){
        int entriesLeft = 20;
        Scanner userInput = new Scanner(System.in);
        String [] longlist = new String[20];
        String [] shortlist = new String[20];
        int longIndex = 0;
        int shortIndex = 0;
        String input;
        String exit = "exit";
        while(entriesLeft > 0){
            System.out.println("Please input a string");
            input = userInput.nextLine();
            if(input.equals(exit)){
                break;
            }
            if(input.length() <= 5){
                shortlist[shortIndex] = input;
                shortIndex++;
            }
            else{
                longlist[longIndex] = input;
                longIndex++;
            }
            entriesLeft--;
        }
        System.out.println("Which list do you want to see? Enter 1 for long list or 2 for short list?");
        int intInput = userInput.nextInt();
        if(intInput == 1){
            if(longIndex == 0){
                System.out.println("There are not any strings in this list!");
            }
            for(int i = longIndex - 1; i >= 0; i--){
                System.out.println(longlist[i]);
            }
        }
        else{
            if(shortIndex == 0){
                System.out.println("There are not any strings in this list!");
            }
            for(int i = shortIndex - 1; i >= 0; i--){
                System.out.println(shortlist[i]);
            }

        }
    }
}