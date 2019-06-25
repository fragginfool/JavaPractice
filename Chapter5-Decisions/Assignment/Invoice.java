public class Invoice{
    int invoiceNumber, month, day, year;
    double balanceDue;
    
    Invoice(int num, int mon, int da, int yea, double bal){
        if(num < 1000){
            invoiceNumber = 0;
        }
        else{
            invoiceNumber = num;
        }

        if(mon < 1 || mon > 12){
            month = 0;
        }
        else{
            month = mon;
        }
        if(da < 1 || da > 31){
            day = 0;
        }
        else{
            day = da;
        }
        if(yea < 2011 || yea > 2017){
            year = 0;
        }
        else{
            year = yea;
        }
        balanceDue = bal;
    }

    public void displayInvoice(){
        System.out.println("This is invoice " + invoiceNumber + " for " + balanceDue + " dollars and is due " + day + "/" + month + "/" + year);
    }
}