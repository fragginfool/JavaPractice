import java.util.Scanner;

public class CarpentryChoice{
    public static void main(String[] args){
        String[] items = {"table", "desk", "dresser", "entertainmentcenter"};
        String [] prices = {"$250", "$325", "$420", "$600"};
        Scanner input = new Scanner(System.in);
        String userInput;
        System.out.print("Please type in the item you would like to see the price of:\n1: table\n 2: desk\n 3: dresser\n4: entertainmentcenter");
        userInput = input.nextLine();
        for(int i = 0; i < 4; i++){
            if(userInput.equals(items[i])){
                System.out.println("That item costs " + prices[i]);
                break;
            }
            if(i == 3){
                System.out.println("You did not input a valid item!");
            }
        }
    }
}