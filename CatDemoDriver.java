import java.util.Scanner;
import java.util.ArrayList;

/** 
 * ACS-1903 Assignment X Question Y
 * @author 
*/

public class CatDemoDriver{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        ArrayList<CatDemo> cats = new ArrayList<>();
        ArrayList<OwnerDemo> owners = new ArrayList<>();
        
        cats.add(new CatDemo(3, "Mittens"));
        cats.add(new CatDemo(5, "Fido"));
        
        CatDemo newCat = new CatDemo(4, "Stibbins");
        cats.add(newCat);

        
        CatDemo myCat = new CatDemo();
        CatDemo otherCat = new CatDemo(2, "Rincewind");
        cats.add(otherCat);
        
        // print using toString()
        System.out.println("The list of cats:");
        for(CatDemo c : cats){
            // default method call is to toString()
            System.out.println(c);
        }// end for cats
        System.out.println("End of the list of cats:\n");

        // call some methods
        System.out.println("Accessing fields using getters.");
        String st = cats.get(0).getName();
        System.out.println(st);
        cats.get(2).setAge(5);
        System.out.println(cats.get(1).getID());
        System.out.println("Done accessing fields using getters.\n");
        
        
        /* original examples of Cat class 
         * usages
         */
        /*
        CatDemo myCat = new CatDemo();
        CatDemo otherCat = new CatDemo(2, "Rincewind");
         */
        //System.out.println(myCat);
        //System.out.println(otherCat);
        
        // using setters
        //myCat.name = "Mustrum";     // nope name is private
        myCat.setName("Mustrum");
        //myCat.setName("Rincewind");
        myCat.setAge(12);
        
        //or 
        
        // System.out.println("enter the age and name of your cat.");
        // int age = scanner.nextInt();
        // String name = scanner.next();
        // myCat.setAge(age);
        // myCat.setName(name);
        System.out.println(myCat);
        
        boolean sameCat;
        
        sameCat = myCat.equals(otherCat);
        System.out.println(sameCat);
        if(sameCat){
            System.out.println("my cat is your cat");
        }// end cat's are the same
        else{
            System.out.println("different cats");
        }// end different cats
        
        // do some associations
        // make an owner or two
        
        System.out.println("\n------------ Some associations ---------------");
        OwnerDemo owner1 = new OwnerDemo("Maurice");
        OwnerDemo owner2 = new OwnerDemo();
        OwnerDemo owner3 = new OwnerDemo("Angua");
        
        System.out.println(owner1);
        System.out.println(owner2);
        owner2.setName("Maladict");
        
        // i have myCat, and otherCat, and newCat from previous code.
        System.out.println(owner2);  // note that Mal has 0 cats
        //System.out.println(myCat);      // note that owner is null
        
        // set the asociation between owner2 and myCat
        adoptACat(owner2, myCat);
        System.out.println(owner2);  // note that Mal has 1 Cat
        System.out.println(myCat);      // note owner is now Maladict
        System.out.println("My cat's owner: " + myCat.getOwner().getName());
        //System.out.println("My cat's owner: " + myCat.owner.name);
        
        for(CatDemo c : cats){
            adoptACat(owner2, c);
        }// end adopt a bunch of cats
        
        System.out.println(owner2);
        
        // when a cat is added it automatically sets the new owner
        
        OwnerDemo lastOwner = new OwnerDemo("Sam Vimes");
        // sam has 0 cats
         // print sam vime's toString()
        System.out.println(lastOwner.getName() + "'s toString():");
        System.out.println(lastOwner);
        
        // now lets add a cat or two
        lastOwner.addCat(new CatDemo(3, "Hermes"));
        lastOwner.addCat(new CatDemo(2, "Calaban"));
        System.out.println(lastOwner.getName() + "'s toString(): after adding some cats using the addCat() method");
        System.out.println(lastOwner);
        
        // new we see if the set owner feature in Owner.addCat() works
        System.out.println("\nNew cat's owners");
        System.out.println(lastOwner.getACat(0).getOwner().getName());
        System.out.println(lastOwner.getACat(1).getOwner().getName());
        
        
        System.out.println("\nend of program");
    }
    
    // static method to set the association between cat and owner
    public static void adoptACat(OwnerDemo owner, CatDemo cat){
        owner.addCat(cat);
        cat.setOwner(owner);
    }
}
