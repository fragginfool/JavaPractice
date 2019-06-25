
public class week4_employee { 
     /*
     * Author: Josh Franke Purpose: Class creation example 
     * Date: June 5, 2019
     * Version: 1.0
     */
    
    public static void main (String[] args) {
    Employee e1 = new Employee();
    Employee e2 = new Employee();
    e1.setEmpNum(1234);
    e2.setEmpNum(5678);
    e1.setEmpLastName("Smith");
    e1.setEmpFirstName("John");
    e1.setEmpSalary(75000);

    e2.setEmpLastName("Johnson");
    e2.setEmpFirstName("Sarah");
    e2.setEmpSalary(120000);




    System.out.println("The output of my object are - ");
    System.out.println(e1.getEmpNum() + " " + e1.getEmpLastName() + " " + e1.getEmpFirstName() + " " + e1.getEmpSalary());
    System.out.println(e2.getEmpNum() + " " + e2.getEmpLastName() + " " + e2.getEmpFirstName() + " " + e2.getEmpSalary());
    }
}