import java.util.Scanner;

public class CarpentryChoice2{
    public static void main(String[] args){
        String[] items = {"table", "desk", "dresser", "entertainmentcenter"};
        String [] prices = {"$250", "$325", "$420", "$600"};
        Scanner input = new Scanner(System.in);
        String userInput;
        System.out.print("Please type in the item you would like to see the price of:\n1: table\n 2: desk\n 3: dresser\n4: entertainmentcenter\n");
        userInput = input.nextLine();
        for(int i = 0; i < 4; i++){
            char [] in = userInput.toCharArray();
            char [] comp = items[i].toCharArray();
            int test = 0;

            for(int j = 0; j < 3; j++){
                if(in[j] != comp[j]){
                    break;
                }
                else{
                    test = test + 1;
                    if(test == 3){
                        System.out.println("That item costs " + prices[i]);
                    }
                }
            }
        }
    }
}