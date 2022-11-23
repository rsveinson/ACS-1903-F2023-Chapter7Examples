import java.util.Scanner;
/** 
 * ACS-1903 Assignment X Question Y
 * @Author
 * 
*/

public class CatDriver{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // create a couple of cats
        Cat myCat = new Cat();
        Cat anotherCat = new Cat(2, "Rincewind");
        
        // manipulate the cats
        //myCat.name = ("Mustrum");    // nope name is private
        myCat.setName("Mustrum");
        myCat.setAge(3);
        //myCat.getNextID();
        
        // hmm what's happening here
        System.out.println(myCat);
        System.out.println(anotherCat);
        
        // see the sate of an object
        System.out.println(myCat.getName() + ": " + myCat.getAge());
        
        System.out.println("end of program");
    }
}
