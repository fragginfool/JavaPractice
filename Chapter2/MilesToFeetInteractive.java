import static javax.swing.JOptionPane.showMessageDialog;

import javax.swing.JOptionPane;

public class MilesToFeetInteractive {
/*
* Auther: Josh Franke
* Purpose: Get input and create calculation
* Date:    May 26 2019
* Version: 1.0
*/
    public static void main(String[] args) {
        int feetInMile = 5280;
        int distanceToUncle = Integer.parseInt(JOptionPane.showInputDialog(null, "How many miles is it to your Uncle's house?\n"));
        int distToUncleFeet = (distanceToUncle * feetInMile);
        System.out.println("Distance to my uncle's house is " + distanceToUncle + " miles or " + distToUncleFeet + " feet" );
    }
}