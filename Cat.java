import java.util.Scanner;
/** 
 * ACS-1903 Assignment X Question Y
 * @Author
 * 
*/

public class Cat{
    
    // instance variables a.k.a. fields
    private int age;
    private String name;
    
    // constructors
    public Cat(){
        age = 0;
        name = "unknow";
    }// end no-arg constructor
    
    public Cat(int age, String name){
        this.age = age;
        this.name = name;
    }// end full arg
    
    // getters
    public int getAge(){
        return this.age;
    }// end get age
    
    public String getName(){
        return this.name;
    }// end get name
    
    // setters
    public void setAge(int a){
        this.age = a;
    }// end set age
    
    public void setName(String n){
        this.name = n;
    }//end set name
    
    // other methods
    @Override
    public String toString(){
       String st;
       //st = this.getName() + ", " + this.getAge();
       st = name + ", " + age;
       return st;
    }//

}// end Car
