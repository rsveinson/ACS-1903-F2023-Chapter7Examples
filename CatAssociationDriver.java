import java.util.Scanner;
import java.util.ArrayList;

/** 
 * ACS-1903 Assignment X Question Y
 * @author 
*/

public class CatAssociationDriver{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<Owner> owners = new ArrayList<>();
        
        cats.add(new Cat(3, "Mittens"));
        cats.add(new Cat(5, "Fido"));
        
        Cat newCat = new Cat(4, "Stibbins");
        cats.add(newCat);

        
        Cat myCat = new Cat();
        Cat otherCat = new Cat(2, "Rincewind");
        cats.add(otherCat);
        
        
        myCat.setName("Mustrum");
        //myCat.setName("Rincewind");
        myCat.setAge(12);
        
        
        
        // do some associations
        // make an owner or two
        
        System.out.println("\n------------ Some associations ---------------");
        Owner owner1 = new Owner("Maurice");
        Owner owner2 = new Owner();
        Owner owner3 = new Owner("Angua");
        
        System.out.println(owner1);
        System.out.println(owner2);
        owner2.setName("Maladict");
        
        // i have myCat, and otherCat, and newCat from previous code.
        System.out.println(owner2);  
        //System.out.println(myCat);      // note that owner is null
        
        // set the asociation between owner2 and myCat
        adoptACat(owner2, myCat);
        System.out.println("Here's owner2:");
        System.out.println(owner2);  // note that Mal has 1 Cat
        
        System.out.println("Now here's myCat");
        System.out.println(myCat);      // note owner is now Maladict
        System.out.println();
        
        
        System.out.println("Here is the toString() of " + owner2.getName());
        
        
        for(Cat c : cats){
            adoptACat(owner2, c);
        }// end adopt a bunch of cats
        
        System.out.println(owner2);
        
        
        System.out.println("\nend of program");
    }
    
    // static method to set the association between cat and owner
    public static void adoptACat(Owner owner, Cat cat){
        owner.addCat(cat);
        cat.setOwner(owner);
    }
}
