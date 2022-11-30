/**
 * Create a student Sam and a subject area Math
 * and then code the action of 
 * Sam declaring a major in Math
 */
public class SamDeclaresMathMajor
{
    public static void main(String[] args){
        Subject math = new Subject("Math","Mathematics");
        Student sam = new Student("Samantha","Jones",'F',true);
        
        // two actions for the "declare major" transaction
        sam.setMajor(math);
        math.addMajor(sam);
        
        System.out.println("Math majors = " + math.getMajors());
                        
        System.out.println("Sam's major is: " + sam.getMajor());
        
        System.out.println("Sam's major " + sam.getMajor().getCode());
    }
}
