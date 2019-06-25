import javax.lang.model.util.ElementScanner6;

public class DigitalCamera{
    /* Author: Josh Franke 
     * Purpose: Demonstrate decision making...
     * data for brand, megapixels, price
     * make a constructor that takes arguments for the brand and megapixels. 
     * if megapixels is greater than 10 constructor sets it to 10
     * sale price is based on resoltuion, 6 megapixels or fewer is 99
     * all other cameras are 129
     * method to display digital camera details
     * write test that initiates four objects
     * prompts the user for values for the camera brand and number of megapixels and display all the values....
     * Date: June 3, 2019
     * Version: 1.0
     */

    int salePrice;
    int resolution;
    String brand;

    DigitalCamera(String bran, int res){
        if(res >= 10){
            resolution = 10;
        }
        else{
            resolution = res;
        }
        if(resolution <= 6){
            salePrice = 99;
        }
        else{
            salePrice = 129;
        }
        brand = bran;
    }

    public void displayPrice(){
        System.out.println("This camera is made by " + brand + ". It has a resolution of " + resolution + " megapixels and is on sale for " + salePrice);
    }
}