import java.util.ArrayList;
/**
 * 
 * Arrange for 3 students to major in Math.
 * The method removeMajors() has 2 parameters. 
 * removeMajors() alters both parameters.
 * In the caller only the ArrayList changes, 
 * the "int" is not changed.
 * 
 */
public class ObjectModifiedByCalledMethod
{
    public static void main(String[] args){
        Subject math = new Subject("Math","Mathematics");
        Student jill = new Student("Jill","Lee",'F',true);
        Student sam = new Student("Samantha","Jones",'F',true);
        Student bob = new Student("Robert","Smith",'M',true);
        // Each student is majoring in Math
        declareMajors(jill, math);
        declareMajors(sam, math);
        declareMajors(bob, math);
        // the majors
        ArrayList<Student> majors = math.getMajors();
        // n is the number of Math majors
        int n = majors.size();
        System.out.println(n+" majors: "+majors);
        removeMajors(n, majors);
        // n is not changed
        // majors has been changed
        System.out.println(n+" majors: "+majors);
    }

    
    public static void removeMajors
        (int n, ArrayList<Student> x)
    {
        while (n>0){
            n--;         // decrement n
            x.remove(n); // remove the nth. element
        }
    }

    public static void declareMajors
        (Student s, Subject m)
    {
        // s declares a major in m
        s.setMajor(m);
        m.addMajor(s);
    }
}
