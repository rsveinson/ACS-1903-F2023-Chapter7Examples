import java.util.Scanner;
import java.util.ArrayList;

/** 
 * ACS-1903 Assignment X Question Y
 * @author 
 */

public class BadToStringsDriver{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        OwnerBadToString emperor = new OwnerBadToString("Palpatine");

        CatBadToString cat = new CatBadToString(5, "Han");
  
        adoptACat(emperor, cat);
        
        // let's see if it worked
        System.out.println(emperor);
        System.out.println(cat);
        
        System.out.println("\nend of program");
    }

    // static method to set the association between cat and owner
    public static void adoptACat(OwnerBadToString owner, CatBadToString cat){
        
            owner.addCat(cat);
            cat.setOwner(owner);
        
    }// end adoptACat
}
