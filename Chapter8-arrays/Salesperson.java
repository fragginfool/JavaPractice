public class Salesperson{
    private int identification = 99999; 
    private double totalSales = 0;
    Salesperson(int id, double sales){
        identification = id;
        totalSales = sales;
    }

    public void setSales(double sales){
    totalSales = sales;
    }

    public double getSales(){
        return totalSales;
    }

    public void setId(int id){
        identification = id;
    }

    public int getId(){
        return identification;
    }
}