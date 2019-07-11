public class Inclass1{
    /*
    * Auther: Josh Franke
    * Purpose: Learn Arrays
    * Date:    July 8 2019
    * Version: 1.0
    */

    public static void main(String[] args) {
        int[] numbers = {15,10,34,55,23,25,45,89};

        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        for(int i=numbers.length - 1; i>=0; i--){
            System.out.print(numbers[i] + " ");
        }
    }
}
