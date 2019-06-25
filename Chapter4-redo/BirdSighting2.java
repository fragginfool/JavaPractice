class BirdSighting2{ 
    /*
    * Author: Josh Franke Purpose: Class creation example 
    * Date: June 5, 2019
    * Version: 1.0
    */



private String bSpeciesSighted;
private int bNumberSeen;
private int dayOfTheYear;

BirdSighting(){
    bSpeciesSighted = null;
    bnumberSeen = 0;
    dayOfTheYear = 0;
}

BirdSighting(String species, int howManySeen, int julianDate){
    bSpeciesSighted = species;
    bNumberSeen = howManySeen;
    dayOfTheYear = julianDate;
}

public void setBSpeciesSighted(String bird){
    bSpeciesSighted = bird;
}

public String getBSpeciesSighted(){
    return bSpeciesSighted;
}

public void setbNumberSeen(int amount){
    bNumberSeen = amount;
}

public int getbNumberSeen(){
    return bNumberSeen;
}

public void setdayOfTheYear(int day){
    dayOfTheYear = day;
}

public int getdayOfTheYear(){
    return dayOfTheYear;
}

}

