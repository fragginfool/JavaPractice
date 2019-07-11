import java.util.Scanner;

    /* 
     * Purpose: Test Question B. Write a program that accepts the heights and width of a rectangle and compute the perimeter and area.
     * Date: June 29, 2019
     * Author: Joshua Franke
     * Version: 1.0
     */
    
public class TestQuestion2{
    public static void main(String[] args){
        int height, width, perimeter, area;
        Scanner input = new Scanner(System.in);
        
        //Get input from the user:
        System.out.println("What is the height of the rectangle?:");
        height = input.nextInt();
        System.out.println("What is the width of the rectangle?:");
        width = input.nextInt();

        //Compute the perimeter and area with a method:
        perimeter = computePerimeter(height, width);
        area = computeArea(height, width);
        System.out.println("The perimeter of your rectangle is " + perimeter + " and the area of your rectangle is " + area);
    }

    public static int computePerimeter(int height, int width){
        int perimeter = (height * 2) + (width * 2);
        return perimeter;
    }

    public static int computeArea(int height, int width){
        int area = height * width;
        return area;
    }
}
