public class FormLetterWriter{
/*
     * Author: Josh Franke Purpose: Class creation practic 
     * Date: June 5, 2019
     * Version: 1.0
     */
    public static void main (String[] args){
        displaySalutation("Franke");
        displaySalutation("Josh", "Franke");

    }
    public static void displaySalutation(String lastname){
        System.out.println("Dear Mr. or Ms. " + lastname);
        System.out.println("Thank you for your recent order.");
    }

    public static void displaySalutation(String firstname, String lastname){
        System.out.println("Dear " + firstname + " " + lastname);
        System.out.println("Thank you for your recent order.");
        
    }
}