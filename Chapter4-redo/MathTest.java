public class MathTest{
    public static void main(String[] args){
        System.out.println("a. " + Math.sqrt(37));
        System.out.println("b. sine of 300 " + Math.sin(300) + " and cosine of 300: " + Math.cos(300));
        System.out.println("c. floor of 22.8: " + Math.floor(22.8)+ " ceiling of 22.8: " + Math.ceil(22.8) + "rounded 22.8: " +  Math.round(22.8));
        System.out.println("d. Question was very unclear. I tried both 'smaller/larger' and 'max' but when comparing an integer to string simply errored out. \n If they wanted me to convert it ascii first they should say so");
        System.out.println("e. Random number between 0 and 20: " + Math.round(Math.random() * 20) );
    }

}