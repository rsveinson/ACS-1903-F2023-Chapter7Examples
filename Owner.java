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
    ArrayList<CatDemo> myCats;
    
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
    
    public ArrayList<CatDemo> getCats(){
        return myCats;
    }// end get cats
    
    // setters
    public void setName(String name){
        this.name = name;
    }// end set name
    
    // here we set the entire list of cats
    public void setCats(ArrayList<CatDemo> l){
        myCats = l;
    }// end set Cats
    
    // perhaps a more useful method to add a single 
    // cat to the existing list of cats
    public void addCat(CatDemo cat){
        myCats.add(cat);
    }// end addCat
    
    // others
    @Override
    public String toString(){
        return name + ": " + myCats.size() + " cats";
    }// end to string
    
    
    
}
