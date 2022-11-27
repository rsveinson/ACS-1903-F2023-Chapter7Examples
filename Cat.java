import java.util.Scanner;
/** 
 * ACS-1903 Assignment X Question Y
 * @Author
 * 
*/

public class Cat{
    // static/class variables
    private static int nextID = 1000;
    
    // instance variables a.k.a. fields
    private int age;
    private String name;
    private int id;
    
    // constructors
    public Cat(){
        age = 0;
        name = "unknow";
        id = getNextID();
    }// end no-arg constructor
    
    public Cat(int age, String name){
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
    
    public int getId(){
        return this.id;
    }// end get id
    
    // setters
    public void setAge(int a){
        this.age = a;
    }// end set age
    
    public void setName(String n){
        this.name = n;
    }//end set name
    
    // other methods
    public boolean equals(Cat c){
        return this.name.equals(c.name);
    }// end equals
    private int getNextID(){
        return nextID++;
    }// end get next id
    
    @Override
    public String toString(){
       String st;
       //st = this.getName() + ", " + this.getAge();
       st = name + ", " + id + ", " + age;
       return st;
    }//

}// end Car
