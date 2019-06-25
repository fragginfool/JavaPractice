import java.util.Scanner;
import javax.swing.JOptionPane;

public class Pay{
    /* Author: Josh Franke 
     * Purpose: Demonstrate decision making...
     * Calculate netpay for a factory worker
     * 
     * Date: June 14, 2019
     * Version: 1.0
     */
    
    public static void main(String[] args){
        final double oneLevel = 17.00;
        final double twoLevel = 20.00;
        final double threeLevel = 22.00;
        final double medicalInsurance = 32.50;
        final double dentalInsurance = 20.00;
        final double longtermDisability = 10.00;
        final double retirment = .03;
        double hours;
        int skillLevel;
        boolean med, dent, lon, retire = false;
        Scanner input = new Scanner(System.in);
        double netPay = 0.00;
        System.out.println("Please input hours worked: ");
        hours = input.nextDouble();
        System.out.println("Please enter employee's skill level: ");
        skillLevel = input.nextInt();

        switch(skillLevel){
            case(1):
                netPay = hours * oneLevel;
                break;

            case(2):
                netPay = hours * twoLevel;
                break;

            case(3):
                netPay = hours * threeLevel;
                break;
        }

        System.out.println(netPay);
        if(skillLevel > 1){
            System.out.println("Type 1 if employee is enrolled in Medical Insurance");
            if (input.nextInt() == 1){
                netPay = netPay - medicalInsurance;
                System.out.println(netPay);
            }

            System.out.println("Type 1 if employee is enrolled in Dental Insurance");
            if (input.nextInt() == 1){
                netPay = netPay - dentalInsurance;
                System.out.println(netPay);
            }

            System.out.println("Type 1 if employee enrolled in Long-term Disability Insurance?");
            if (input.nextInt() == 1){
                netPay = netPay - longtermDisability;
                System.out.println(netPay);
            }
        }

        if(skillLevel > 2){
            System.out.println("Type 1 if employee enrolled in a retirement plan?");
            
            if (input.nextInt() == 1){
            netPay = netPay - (netPay * retirment);
            System.out.println(netPay);
            }
        
        }
        
        System.out.println("The employee's net pay is: " + netPay);
    }
}
