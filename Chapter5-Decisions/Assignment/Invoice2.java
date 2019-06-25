public class Invoice2{
    int invoiceNumber, day, month, year;
    double balanceDue;
    
    Invoice2(int num, int da, int mon, int yea, double bal){
        if(num < 1000){
            invoiceNumber = 0;
        }
        else{
            invoiceNumber = num;
        }

        //day correction
        if(mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 9 || mon ==11){
            if(da > 31){
                day = 31;
            }
            else{
                day = da;
            }
        }
        if(mon == 2 || mon == 4 || mon == 6 || mon == 8 || mon == 10 || mon == 12){
            if(da > 30){
                    day = 30;
                }
            else{
                day = da;
            }
            if(mon == 2 && day > 28){
                day = 28;
            }
        }
        if(mon < 1 || mon > 12){
            month = 0;
            day = 0;
        }
        
        else{
            month = mon;
        }
        if(yea < 2011 || yea > 2017){
            year = 0;
        }
        else{
            year = yea;
        }
        balanceDue = bal;
    }

    public void displayInvoice2(){
       System.out.println("This is invoice " + invoiceNumber + " for " + balanceDue + " dollars and is due " + day + "/" + month + "/" + year);
    }
}