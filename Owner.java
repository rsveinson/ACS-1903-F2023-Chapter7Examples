import java.util.ArrayList;

/** 
 * ACS-1903 Assignment X Question Y
 * @author 
*/

public class Owner{
    // class variables
    
    // instance variables
    private String name;
    
    // for associating with a bunch of cats
    ArrayList<Cat> myCats;
    
    // constructors
    public Owner(){
        name = "Unknown";
        
        // note that here is where the ArrayList is intantiated
        myCats = new ArrayList<>();
    }// end no-arg
    
    public Owner(String name){
        this.name = name;
        myCats = new ArrayList<>();
    }// end full-arg
    
    // getters
    public String getName(){
        return name;
    }// end get name
    
    
    public ArrayList<Cat> getCats(){
        return myCats;
    }// end get cats
    
    
    // setters
    public void setName(String name){
        this.name = name;
    }// end set name
    
    
    // here we set the entire list of cats
    public void setCats(ArrayList<Cat> l){
        myCats = l;
    }// end set Cats
    
    
    // perhaps a more useful method to add a single 
    // cat to the existing list of cats
    public void addCat(Cat cat){
        myCats.add(cat);
    }// end addCat
    
    
    // others
    // get an individual cat/
    public Cat getACat(int index){
        return myCats.get(index);
    }// end a specific cat from the list
    
    @Override
    public String toString(){
        String st = name+"'s Cats:\n";
        
        for(Cat c : myCats){
            st += c.getName() + "\n";
        }//end for
        return st;
    }// end to string
    
    
    
}
