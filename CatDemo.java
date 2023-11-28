import java.util.Scanner;
/** 
 * ACS-1903 Simple Class Example Cat
 * @author 
 */

public class CatDemo{
    // static variables
    private static int nextID = 1000;

    private int age;
    private String name;
    private int id;         // this will be a unique id nuber

    private Owner owner;

    // constructors
    public CatDemo(){
        age = 0;
        name = "unknown";
        id = getNextID();
    }// end no-arg constructor

    public CatDemo(int age, String name){
        this.age = age;
        this.name = name;
        id = getNextID();
    }// end full-arg

    //getters
    public int getAge(){
        return age;
    }// end get age

    public String getName(){
        return name;
    }// end get name

    public int getID(){
        return this.id;
    }// end get id

    public Owner getOwner(){
        return this.owner;
    }// end get owner

    // setters
    // no setter for id, we don't want to allow any chnages once the unique id has been assigned
    public void setAge(int a){
        age = a;
    }// end setage

    public void setName(String n){
        name = n;
    }// end set name

    public void setOwner(Owner owner){
        this.owner = owner;
    }// end set owner

    // other methods
    // get the next available id and increment nextID
    // so the next cat gets a unique id number
    private int getNextID(){
        return nextID++;
    }// end getNextID

    @Override
    public String toString(){
        String st;

        st = this.getName() + ", " + this.getID() + ", " + this.getAge();
        st += ": " + this.getOwner();
        return st;
    }// end toString

    public boolean equals(CatDemo oc){
        //return this.name.equals(oc.name);
        //return this.age == oc.age;
        boolean e;
        e = this.name.equals(oc.name) && this.age == oc.age;
        return e;
    }// end equals 

}
