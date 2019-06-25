    /* Author: Josh Franke 
     * Purpose: Demonstrate loops...
     * Date: June 21, 2019
     * Version: 1.0
     */
public class BabySittingJob{
    private String jobNum;
    private int code, childrenWatched, hours, fee;
    private String name;

    BabySittingJob(String jobNumber, int babySitterCode, int numberChildrenWatched, int hoursWatched){
    
    jobNum = jobNumber;
    code = babySitterCode;
    childrenWatched = numberChildrenWatched;
    hours = hoursWatched;

    if(code == 1){
        fee = childrenWatched * 7 * hours;
    }
    else{
        fee = 9 * hours;
        if(childrenWatched > 1){
            fee = fee + ((childrenWatched - 1) * 4 * hours);
        }
    }

    switch(code){
        case(1):
        name = "Cindy";

        case(2):
        name = "Greg";

        case(3):
        name = "Marcia";
    }
    
}

void displayObjects(){
    System.out.println("Job Number: " + jobNum + "\ncode: " + code + "\nName: " + name + "\nNumber of children watched: " + childrenWatched + "\nHours children were watched: " + hours + "\nFee for work: " + fee);
}

}