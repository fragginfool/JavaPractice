import javax.swing.JOptionPane;

public class Scholarship{
    public static void main(String[] args){
    /* Author: Josh Franke 
     * Purpose: Demonstrate decision making...
     * Ask the user for GPA, # of extracurricular activities, # of service activities
     * Date: June 3, 2019
     * Version: 1.0
     */
    
     double gpa;
     int extra;
     int service;
     boolean candidate = false;
    //GPA?
    gpa = Double.parseDouble(JOptionPane.showInputDialog(null, "What is your GPA"));
    //Extracuricular
    extra = Integer.parseInt(JOptionPane.showInputDialog(null, "How many extracuricular activities were you involved in?"));
    //Service Activities
    service = Integer.parseInt(JOptionPane.showInputDialog(null, "How man service activies were you involved in?"));

    //If statements
    if(gpa > 3.8 && extra >= 1)
        candidate = true;
    else
        if(gpa >= 3.4 && (extra + service) >= 3 )
            candidate = true;
        else
            if(gpa > 3.0 && extra >= 2 && service >= 3)
                candidate = true;
            else
                candidate = false;
    if(candidate == true)
        JOptionPane.showMessageDialog(null, "Scholarship Candidate!");
    else
        JOptionPane.showMessageDialog(null, "Not a Candidate");
    }
}