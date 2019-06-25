public class TestInvoice2{
        //class is written in format invoice, day, month, year, amount. 
    public static void main(String[] args){
        Invoice2 one = new Invoice2(23423, 29, 2, 2016, 46.34);
        Invoice2 two = new Invoice2(23, 4, 13, 2018, 50.92);
        Invoice2 three = new Invoice2(100083, 32, 10, 2016, 100.34);
        Invoice2 four = new Invoice2(89894, 21, 4, 2010, 67.34);
        Invoice2 five = new Invoice2(908030, 32, 1, 2014, 24.90);

        one.displayInvoice2();
        two.displayInvoice2();
        three.displayInvoice2();
        four.displayInvoice2();
        five.displayInvoice2();
        
    }
}