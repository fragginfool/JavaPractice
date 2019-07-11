import java.util.Scanner;

    /* 
     * Purpose: Test Question D. Write a program that calculate the area of a triangle ( area = (height * base)/2
     * Date: June 29, 2019
     * Author: Joshua Franke
     * Version: 1.0
     */

    public class TestQuestion4{
        public static void main(String[] args){
            int height, base, area;
            Scanner input = new Scanner(System.in);
            
            //Get input from the user:
            System.out.println("What is the height of the triangle?:");
            height = input.nextInt();
            System.out.println("What is the base of your triangle?:");
            base = input.nextInt();
    
            //Compute the area with a method:
            area = areaTriag(height, base);
            System.out.println("The area of your triangle is, rounnded to the nearest integer, is: " + area);
        }
    
        public static int areaTriag(int height, int base){
            //This module calculates the area of a triangle
            int area = (height * base)/2;
            return area;
        }
    }