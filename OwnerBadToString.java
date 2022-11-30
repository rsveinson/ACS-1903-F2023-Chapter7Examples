import java.util.ArrayList;

/** 
 * ACS-1903 Assignment X Question Y
 * @author 
*/

public class OwnerBadToString{
    // class variables
    
    // instance variables
    private String name;
    
    // for associating with a bunch of cats
    ArrayList<CatBadToString> myCats;
    
    // constructors
    public OwnerBadToString(){
        name = "Unknown";
        
        // note that here is where the ArrayList is intantiated
        myCats = new ArrayList<>();
    }// end no-arg
    
    public OwnerBadToString(String name){
        this.name = name;
        myCats = new ArrayList<>();
    }// end full-arg
    
    // getters
    public String getName(){
        return name;
    }// end get name
    
    
    public ArrayList<CatBadToString> getCats(){
        return myCats;
    }// end get cats
    
    
    // setters
    public void setName(String name){
        this.name = name;
    }// end set name
    
    
    // here we set the entire list of cats
    public void setCats(ArrayList<CatBadToString> l){
        myCats = l;
    }// end set Cats
    
    
    // perhaps a more useful method to add a single 
    // cat to the existing list of cats
    public void addCat(CatBadToString cat){
        myCats.add(cat);
    }// end addCat
    
    
    // others
    @Override
    public String toString(){
        String st = name+"'s Cats:\n";
        
        for(CatBadToString c : myCats){
            st += c + "\n";
        }//end for
        return st;
    }// end to string
    
    
    
}
