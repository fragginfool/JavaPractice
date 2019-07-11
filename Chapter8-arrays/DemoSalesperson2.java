public class DemoSalesperson2{
    public static void main(String[] args){
        Salesperson[] salespeople = new Salesperson[10];
        //{"Doug", "Beckam", "Hallie", "James", "Millie", "Dillie", "Nillie", "Jamie", "Jerry", "Elfie"};
        
        int id = 111;
        double sales = 25000;

        for(int i = 0; i < 10; i++){
            salespeople[i] = new Salesperson(id,sales);
            System.out.println(salespeople[i] + " " + salespeople[i].getId() + " " + salespeople[i].getSales());
            id = id + 1;
            sales = sales + 5000;
        }
    }
}