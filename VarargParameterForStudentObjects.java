/**
 * 3 students declare Math - one call
 */
public class VarargParameterForStudentObjects
{
    public static void main(String[] args){
        Subject math = new Subject("Math","Mathematics");
        Student jill = new Student("Jill","Lee",'F',true);
        Student sam = new Student("Samantha","Jones",'F',true);
        Student bob = new Student("Robert","Smith",'M',true);
        // Each student is majoring in Math
        // A single call to declareMajors
        declareMajors(math, jill, sam, bob);
        System.out.println("Math majors = "
                        +math.getMajors());
    }
    // varargs used for last parameter
    public static void declareMajors(
            Subject m, Student ... s){
        // Set each student to have a major in m.
        // s is an array of Student
        for (Student student: s){
             student.setMajor(m);
             m.addMajor(student);
            }
    }
}
