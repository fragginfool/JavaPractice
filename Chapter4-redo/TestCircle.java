public class TestCircle{
    public static void main(String[] args){
        Circle small = new Circle();
        small.setRad(4);
        Circle large = new Circle();
        large.setRad(100);
        Circle unset  = new Circle();
        
        System.out.println(small.getRad());
        System.out.println(large.getRad());
        System.out.println(unset.getRad());
    }
}