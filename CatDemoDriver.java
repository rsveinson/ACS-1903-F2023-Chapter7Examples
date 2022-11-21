import java.util.Scanner;
/** 
 * ACS-1903 Assignment X Question Y
 * @author 
*/

public class CatDemoDriver{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        CatDemo myCat = new CatDemo();
        CatDemo otherCat = new CatDemo(2, "Rincewind");
        
        System.out.println(myCat);
        System.out.println(otherCat);
        
        // using setters
        //myCat.name = "Mustrum";     // nope name is private
        myCat.setName("Mustrum");
        
        //or 
        
        System.out.println("enter the age and name of your cat.");
        int age = scanner.nextInt();
        String name = scanner.next();
        myCat.setAge(age);
        myCat.setName(name);
        System.out.println(myCat);
        
        
        System.out.println("end of program");
    }
}
