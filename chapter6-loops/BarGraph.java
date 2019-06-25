import java.util.Scanner;

    /* Author: Josh Franke 
     * Purpose: Demonstrate loops...
     * Date: June 19, 2019
     * Version: 1.0
     */
public class BarGraph{
    public static void main(String[] args){
    int pam, leo, kim, bob;
    String pamCar, leoCar, kimCar, bobCar;

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of cars sold by Pam: ");
    pam = input.nextInt();

    System.out.println("Enter the number of cars sold by Leo: ");
    leo = input.nextInt();

    System.out.println("Enter the number of cars sold by Kim: ");
    kim = input.nextInt();

    System.out.println("Enter the number of cars sold by Bob: ");
    bob = input.nextInt();

    System.out.println("Car sales for the Month:");
    System.out.println("Pam " + graphCars(pam));
    System.out.println("Leo " + graphCars(leo));
    System.out.println("Kim " + graphCars(kim));
    System.out.println("Bob " + graphCars(bob));
    }

    public static String graphCars(int cars){
        String graphCars = "";
        int normalize = cars / 2;
        while(normalize > 0){
            graphCars = graphCars + "X";
            normalize = normalize - 1; 
        }
        return graphCars;
    }
}