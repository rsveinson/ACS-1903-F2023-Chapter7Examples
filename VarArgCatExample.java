import java.util.Scanner;
import java.util.ArrayList;

/** 
 * ACS-1903 Assignment X Question Y
 * @author 
 */

public class VarArgCatExample{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Owner emperor = new Owner("Palpatine");

        Cat myCat = new Cat(5, "Han");
        Cat otherCat = new Cat(2, "Rincewind");
        Cat newCat = new Cat(4, "Luke");
        Cat jediCat = new Cat(900, "Yoda");

        // each cat has an empty owner field at this point
        // and the emmperors cats array list is of size 0
        // they've all been adopted by the emperor so we can set all of their 
        // associations at once using vararg (variable arguments0

        adoptACat(emperor, myCat, otherCat, newCat, jediCat);
        
        // let's see if it worked
        System.out.println(emperor);
        
        System.out.println("\nend of program");
    }

    // static method to set the association between cat and owner
    public static void adoptACat(Owner owner, Cat... c){
        for(Cat cat : c){
            owner.addCat(cat);
            cat.setOwner(owner);
        }
    }
}
