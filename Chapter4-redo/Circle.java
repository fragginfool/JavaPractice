public class Circle{

    private double rad;
    private double dia;
    private double area;
    double pi = Math.PI;

   Circle(){
    rad = 1;
    dia = 2 * rad;
    area = pi * (rad * rad);
   }

    public void setRad(double newRad){
       rad = newRad;
       dia = 2 * rad;
       area = pi * (rad * rad);
       
   } 

   public double getRad(){
    return rad;   
   }
}