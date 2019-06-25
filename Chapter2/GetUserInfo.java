import java.util.Scanner;

public class GetUserInfo{
    /*
    * Auther: Josh Franke
    * Purpose: Accepts value from user
    * Date:    May 26 2019
    * Version: 1.0
    */

    public static void main(String[] args) {
        String name;
        int age;
        Scanner stuff = new Scanner(System.in);
        System.out.print("Please enter your name?\n");
        name = stuff.nextLine();
        System.out.print("Please enter your age?\n");
        age = stuff.nextInt();
        System.out.println("Your name is " + name + " and you are " + age + " years old. ");
    }
}