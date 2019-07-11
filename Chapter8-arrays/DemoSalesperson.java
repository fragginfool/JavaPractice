public class DemoSalesperson{
    public static void main(String[] args){
        Salesperson[] salespeople = new Salesperson[10];
        //{"Doug", "Beckam", "Hallie", "James", "Millie", "Dillie", "Nillie", "Jamie", "Jerry", "Elfie"};
        

        for(int i = 0; i < 10; i++){
            salespeople[i] = new Salesperson(99999,0);
            System.out.println(salespeople[i] + " " + salespeople[i].getId() + " " + salespeople[i].getSales());
        }
    }
}