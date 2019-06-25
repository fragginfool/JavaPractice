
class Employee{
    /*
     * Author: Josh Franke Purpose: Demonstrate a method call 
     * Date: June 3, 2019
     * Version: 1.0
     */
    
        private int empNum;
        private String empLastName;
        private String empFirstName;
        private double empSalary;

        public void setEmpNum(int emp){
            empNum = emp;
        }

        public int getEmpNum(){
            return empNum;
        }

        public void setEmpLastName(String lastname){
            empLastName = lastname;
        }

        public String getEmpLastName(){
            return empLastName;
        }

        public void setEmpFirstName(String firstname){
            empFirstName = firstname;
        }

        public String getEmpFirstName(){
            return empFirstName;
        }

        public void setEmpSalary(double empSal){
            empSalary = empSal;
        }

        public double getEmpSalary(){
            return empSalary;
        }
}