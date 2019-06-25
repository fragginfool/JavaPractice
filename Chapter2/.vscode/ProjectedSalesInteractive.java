import javax.swing.JOptionPane;

public class ProjectedSalesInteractive {
    /*
    * Auther: Josh Franke
    * Purpose: Get input and create calculation
    * Date:    May 26 2019
    * Version: 1.0
    */
    
        public static void main (String[] args) {
            double  salesIncrease = .10;
            double  salesNorth    = Double.parseDouble(JOptionPane.showInputDialog(null, "What are the current sales for the North division?"));
            double  salesSouth    = Double.parseDouble(JOptionPane.showInputDialog(null, "What are the current sales for the South division?"));
            double  salesNorthPred = ((salesNorth * salesIncrease) + salesNorth);
            double  salesSouthPred = ((salesSouth * salesIncrease) + salesSouth);
    
            System.out.println("Next years sales predictions are " + salesNorthPred + " for our North division and " + salesSouthPred + " for our South division");
        }
    }
    