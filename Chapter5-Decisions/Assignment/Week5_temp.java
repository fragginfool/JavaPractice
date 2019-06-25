import java.util.Scanner;

import jdk.jshell.Diag;

public class Week5_temp{
/* Author: Josh Franke 
     * Purpose: Demonstrate decision making...
     * Date: June 14, 2019
     * Version: 1.0
     */
    public static void main(String[] args){
        int high, low, diff;
        final int HIGH_THRESHOLD = 90;
        final int LOW_THRESHOLD = 32; 
        final int DIFF_THRESHOLD = 40;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the day's high temperature: ");
        high = keyboard.nextInt();
        System.out.println("Enter the day's lowest temperature: ");
        low = keyboard.nextInt();
        if (high >= HIGH_THRESHOLD)
            System.out.println("There is a heat warning!!");
        
        if (low <= LOW_THRESHOLD)
            System.out.println("There is a freeze warning!!");
        
        if ((high - low) > DIFF_THRESHOLD)
            System.out.println("Large temperature swing!");
        
    }

    }
