import java.util.Scanner;

public class TestDigitalCamera{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        String brandOne, brandFour, brandThree, brandTwo;
        int mFour, mOne, mThree, mTwo;

        System.out.println("Please enter brand of camera 1");
        brandOne = input.next();
        System.out.println("Please enter Resolution for camera 1");
        mOne = input.nextInt();
        
        System.out.println("Please enter brand of camera 2");
        brandTwo = input.next();
        System.out.println("Please enter Resolution for camera 2");
        mTwo = input.nextInt();
        
        System.out.println("Please enter brand of camera 3");
        brandThree = input.next();
        System.out.println("Please enter Resolution for camera 3");
        mThree = input.nextInt();

        System.out.println("Please enter brand of camera 4");
        brandFour = input.next();
        System.out.println("Please enter Resolution for camera 4");
        mFour = input.nextInt();
        

        DigitalCamera one = new DigitalCamera(brandOne, mOne);
        DigitalCamera two = new DigitalCamera(brandTwo, mTwo);
        DigitalCamera three = new DigitalCamera(brandThree, mThree);
        DigitalCamera four = new DigitalCamera(brandFour, mFour);

        one.displayPrice();
        two.displayPrice();
        three.displayPrice();
        four.displayPrice();

    }
}