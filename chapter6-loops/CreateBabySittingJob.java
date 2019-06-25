import java.util.Scanner;

/* Author: Josh Franke 
     * Purpose: Demonstrate loops...
     * Date: June 21, 2019
     * Version: 1.0
     */
    public class CreateBabySittingJob{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int year = 0;
            int jobNumber = 0;
            int employeeCode = 0;
            int numOfChildren = 0;
            int hours = 0;
            String yearLastTwo = "";
            String jobNumString = "";

            int valid = 0;
            System.out.println("Please input the year:");

            while(valid < 1){
                year = input.nextInt();
                if(year >= 2013 && year <= 2025){
                    valid = 1;
                }
                else{
                    System.out.println("That entry is invalid!");
                }
            }

            valid = 0;
            System.out.println("Please input the job number between 1 and 9999:");
            while(valid < 1){
                jobNumber = input.nextInt();
                if(jobNumber >= 1 && jobNumber <= 9999){
                    valid = 1;
                }
                else{
                    System.out.println("That entry is invalid!");
                }
            }

            valid = 0;
            System.out.println("Please input your employee code");
            while(valid < 1){
                employeeCode = input.nextInt();
                if(employeeCode >= 1 && employeeCode <= 3){
                    valid = 1;
                }
                else{
                    System.out.println("That entry is invalid!");
                }
            }

            valid = 0;
            System.out.println("Please input the number of children watched:");
            while(valid < 1){
                numOfChildren = input.nextInt();
                if(numOfChildren >= 1 && numOfChildren <= 9){
                    valid = 1;
                }
                else{
                    System.out.println("That entry is invalid!");
                }
            }

            valid = 0;
            System.out.println("Please input the number of hours the children were watched: ");
            while(valid < 1){
                hours = input.nextInt();
                if(hours >= 1 && hours <= 12){
                    valid = 1;
                }
                else{
                    System.out.println("That entry is invalid!");
                }
            }

            yearLastTwo =  Integer.toString(year - 2000);
            jobNumString = Integer.toString(jobNumber);

            int count = jobNumString.length();
            while(count < 4){
                jobNumString = '0' + jobNumString;
                count = ++count;
            }
            jobNumString = year + jobNumString;
            BabySittingJob one = new BabySittingJob(jobNumString, employeeCode, numOfChildren, hours);
            one.displayObjects();


        }
    }