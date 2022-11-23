import java.util.Scanner;
/** 
 * ACS-1903 Simple Class Example Cat
 * @author 
 */

public class CatDemo{

    private int age;
    private String name;

    // constructors
    public CatDemo(){
        age = 0;
        name = "unknown";
    }// end no-arg constructor

    public CatDemo(int age, String name){
        this.age = age;
        this.name = name;
    }// end full-arg

    //getters
    public int getAge(){
        return age;
    }// end get age
    
    public String getName(){
        return name;
    }// end get name
    
    // setters
    public void setAge(int a){
        age = a;
    }// end setage
    
    public void setName(String n){
        name = n;
    }// end set name
    
    // other methods
    @Override
    public String toString(){
        String st;
        
        st = this.getName() + ", " + this.getAge();
        return st;
    }// end toString
    
    public boolean equals(CatDemo oc){
        // String me = this.name;
        // String you = oc.getName();
        // System.out.println(me);
        // System.out.println(you);
        return this.name.equals(oc.name);
    }
}
