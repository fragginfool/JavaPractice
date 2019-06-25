public class TestBirdSighting{
    public static void main(String[] args){
        BirdSighting2 sparrow = new BirdSighting("sparrow", 4, 23);
        //BirdSighting dove = new BirdSighting();
        
        //test constructor
        //System.out.println("Testing constructor for class. dove object before changing is: species: " + dove.getBSpeciesSighted() + " " + dove.getdayOfTheYear());
        
        //test methods
        //dove.setBSpeciesSighted("dove");
        //dove.setbNumberSeen(3);
        //dove.setdayOfTheYear(4);
        System.out.println("Testing overloaded constructor: " + sparrow.getBSpeciesSighted() + " " + sparrow.getbNumberSeen() + " " + sparrow.getdayOfTheYear());

        
    }
}