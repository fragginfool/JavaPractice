public class Billing { 
    /*
    * Author: Josh Franke Purpose: Class creation example 
    * Date: June 5, 2019
    * Version: 1.0
    */
    public static void main(String[] args){
        System.out.println(computeBill(2.00));
        System.out.println(computeBill(2.00, 4.00));
        System.out.println(computeBill(2.00, 4.00, 1.00));
    }

    public static double computeBill(double price){
        double finalPrice = (.08 * price) + price;
        return finalPrice;
    }

    public static double computeBill(double price, Double quantity){
        price = price * quantity;
        double finalprice = (.08 * price) + price;
        return finalprice;
    }

    public static double computeBill(double price, double quantity, double coupon){
        price = quantity * price;
        price = price - coupon;
        double finalprice = (price * .08) + price;
        return finalprice;
    }
}
   