import javax.swing.JOptionPane;

public class Coffee{
    /* Author: Josh Franke 
     * Purpose: Demonstrate decision making...
     * Date: June 3, 2019
     * Version: 1.0
     */

    public static void main(String[] args){
        double total = 0.00;
        double newTotal = 0.00;
        int count = 0;

        while(count < 3){
            newTotal = askCustomer(total);
            if (newTotal == total){
                JOptionPane.showMessageDialog(null, "Your current total is: $" + total);
                break;
            }
            else{ 
                total = newTotal;
            }
            JOptionPane.showMessageDialog(null, "Your current total is: $" + total);
            count = count + 1;
            }
        }

        public static double askCustomer(double tot){
        String userinput;
            userinput = JOptionPane.showInputDialog(null, "Please pick from the following menu options by typing 1-3 or enter 0 if finished:\n (1) American    1.99\n (2) Espresso      2.50\n  (3) Latte       2.15\n");
            System.out.println(userinput);
            switch(userinput){
                case ("0"):
                    return tot;

                case ("1"):
                //if(userinput == "1")
                    tot = tot + 1.99;
                    return tot;

                case ("2"): 
                //if(userinput == "2")
                    tot = tot + 2.50;
                    return tot;
                case ("3"):
                //if(userinput s== "3")
                    tot = tot + 2.15;
            }       return tot;
        }
}