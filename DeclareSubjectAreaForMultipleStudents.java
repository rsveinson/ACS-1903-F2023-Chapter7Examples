/**
 * Instead of duplicating code, use a method to 
 * perform the same action three times.
 */
public class DeclareSubjectAreaForMultipleStudents
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
        System.out.println("Math majors = "
                        +math.getMajors());
    }
    public static void declareMajors(Student s, Subject m){
        // student s declares a major in m
        s.setMajor(m);
        m.addMajor(s);
    }
}
