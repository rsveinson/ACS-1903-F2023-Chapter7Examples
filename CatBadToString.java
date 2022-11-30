import java.util.Scanner;
/** 
 * ACS-1903 Assignment X Question Y
 * @Author
 * 
*/

public class CatBadToString{
    // static/class variables
    private static int nextID = 1000;   // shared by all instances of CatBadToString
    private static final int PEOPLEYEARS = 7;  // human year factor
    
    // instance variables a.k.a. fields
    private int age;
    private String name;
    private int id;             // the unique id is an instance varialbe
    
    //the association field
    OwnerBadToString owner;                // A CatBadToString has an owner
    
    // constructors
    public CatBadToString(){
        age = 0;
        name = "unknow";
        id = getNextID();
    }// end no-arg constructor
    
    public CatBadToString(int age, String name){
        this.age = age;
        this.name = name;
        id = getNextID();
    }// end full arg
    
    // getters
    public int getAge(){
        return this.age;
    }// end get age
    
    public String getName(){
        return this.name;
    }// end get name
    
    public int getID(){
        return this.id;
    }// end get id
    
    public OwnerBadToString getOwner(){
        return this.owner;
    }// end get owner
    
    // setters
    // no setter for id, we don't want to allow any chnages once the unique id has been assigned
    public void setAge(int a){
        this.age = a;
    }// end set age
    
    public void setName(String n){
        this.name = n;
    }//end set name
    
    
    public void setOwner(OwnerBadToString owner){
        this.owner = owner;
    }// end set owner
    
    // other methods
    
    
    // get the cat's age in human years.
    public int getHumanYears(){
        return age * PEOPLEYEARS;
    }// end get people years
    
    
    public boolean equals(CatBadToString c){
        // using the String implementation of
        // .equals
        return this.name.equals(c.name);
        
        // we could
        //boolean equal = this.name.equals(c.name) && this.age == c.age;
        //return equal;
        
        // we could also set equal if their id are equal
        //return this.id == c.id;
        // direct access to c.id is possible because
        // the object is in scope in this method
    }// end equals
    
    private int getNextID(){
        return nextID++;
    }// end get next id
    
    
    @Override
    public String toString(){
       String st;
       //st = this.getName() + ", " + this.getAge();
       st = name + ", " + id + ", " + age + ", " + owner;
       return st;
    }//end toString

}// end Car
