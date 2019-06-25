import java.util.Scanner;

/* Author: Josh Franke 
     * Purpose: Demonstrate loops...
     * Date: June 21, 2019
     * Version: 1.0
     */
    public class CreatePurchase{
        public static void main(String[] args){
            double saleAmount;
            int invoiceNum;
            Purchase one = new Purchase();
            Scanner input = new Scanner(System.in);

            System.out.println("Please enter invoice number in between 1000 - 8000:");
            int valid = 0;
            while(valid == 0){
                invoiceNum = input.nextInt();
                if(invoiceNum >= 1000 && invoiceNum <= 8000){
                    valid =1;
                }
                else{ 
                    System.out.println("That number is invalid....please input a number between 1000 and 8000.");
                }
                one.setInvoiceNumber(invoiceNum);
            }
            System.out.println("How much does your purchase cost?");
            valid = 0;
            while(valid == 0){
                saleAmount = input.nextDouble();
                if(saleAmount >=0){
                    valid = 1;
                }
                else{
                    System.out.println("The price you entered is invalid. Please enter a valid purchase amount.");
                }
                one.setSale(saleAmount);
            }
            one.displaySale();
    }
}