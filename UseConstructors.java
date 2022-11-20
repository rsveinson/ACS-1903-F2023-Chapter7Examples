/**
 * Create two student objects 
 * using the two constructors
 */
public class UseConstructors
{
    public static void main(String[] args){
        // first, with the no-arg constructor
        Student jill = new Student();
        // use setters to complete the student object
        jill.setFirstName("Jill");
        jill.setLastName("Lee");
        jill.setGender('F');
        jill.setActive(true);
        // now with the other constructor
        Student sam = new Student("Samantha","Jones",'F',true);
        // display the students
        System.out.println(jill);
        System.out.println(sam);
    }
}
