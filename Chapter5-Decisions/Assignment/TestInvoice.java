public class TestInvoice{
    public static void main(String[] args){
        Invoice one = new Invoice(23423, 12, 4, 2016, 46.34);
        Invoice two = new Invoice(23, 13, 32, 2018, 50.92);
        Invoice three = new Invoice(100083, 10, 8, 2016, 100.34);
        Invoice four = new Invoice(89894, 4, 21, 2010, 67.34);
        Invoice five = new Invoice(908030, 3, 2, 2014, 24.90);

        one.displayInvoice();
        two.displayInvoice();
        three.displayInvoice();
        four.displayInvoice();
        five.displayInvoice();
        
    }
}