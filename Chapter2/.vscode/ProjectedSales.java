public class ProjectedSales {
/*
* Auther: Josh Franke
* Purpose: Get input and create calculation
* Date:    May 26 2019
* Version: 1.0
*/

    public static void main (String[] args) {
        double  salesIncrease = .10;
        double  salesNorth    = 4000;
        double  salesSouth    = 5500;
        double  salesNorthPred = ((salesNorth * salesIncrease) + salesNorth);
        double  salesSouthPred = ((salesSouth * salesIncrease) + salesSouth);

        System.out.println("Next years sales predictions are " + salesNorthPred + " for our North division and " + salesSouthPred + " for our South division");
    }
}


