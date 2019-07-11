public class NumberListDemo{
    public static void main(String[] args){

        int testArray [] = {1,2,3,4,5,6,7,8};
        for(int i = 0; i < testArray.length; i++){
            System.out.print(testArray[i] + " ");
        }
        for(int i = testArray.length - 1; i >= 0; i--){
            System.out.print(testArray[i] + " ");
        }
        int sum = 0;
        for(int i = 0; i < testArray.length; i++){
            sum = sum + testArray[i];
        }
        System.out.println("The sum of the array is " + sum);
        System.out.println("Numbers less than five: ");
        for(int i = 0; i < testArray.length; i++){
            if(testArray[i] < 5){
                System.out.print(testArray[i] + " ");
            }
        }   
        int lowest = testArray[0];
        for(int i = 0; i < testArray.length; i++){
            if(testArray[i] < lowest){
                lowest = testArray[i];
            }
        }
        System.out.println("The lowest number is " + lowest);
        int highest = testArray[0];
        for(int i = 0; i < testArray.length; i++){
            if(testArray[i] > highest){
            highest = testArray[i];
            }
        }
        System.out.println("The highest number is " + highest);
        int aver = sum / testArray.length;
        System.out.println("The average rounded to the nearest integer is " + aver);
        System.out.println("Numbers that are larger than the average in the array are: ");
        for(int i = 0; i < testArray.length; i++){
            if(testArray[i] > aver){
                System.out.print(testArray[i] + " ");
            }
        }   
    }
}