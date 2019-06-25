    /* Author: Josh Franke 
     * Purpose: Demonstrate loops...
     * Date: June 21, 2019
     * Version: 1.0
     */
public class Purchase{
    private int invoiceNumber;
    private double sale;
    private double salesTax = .05;
    private double salesTaxTotal;
    
    void setInvoiceNumber(int invoiceNum){
        invoiceNumber = invoiceNum;
    }

    void setSale(double saleAmount){
        sale = saleAmount;
        salesTaxTotal = saleAmount * salesTax;
    }

    void displaySale(){
        System.out.println("Invoice number: " + invoiceNumber + "\nSale amount: " + sale + "\nSales tax: " + salesTaxTotal);
    }


}