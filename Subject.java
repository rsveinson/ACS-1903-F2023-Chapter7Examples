import java.util.ArrayList;
/**
 * Subject area in which a  
 * student may declare a major.
 */
public class Subject
{
    // fields
    private String code;
    private String name;
    private ArrayList<Student> majors;
    //constructor
    public Subject(String code, String name)
    {
        this.code = code;
        this.name = name;
        majors = new ArrayList();
    }
    // getters
    public String getCode(){
        return code;
    }

    public String getName(){
        return name;
    }

    public ArrayList<Student> getMajors(){
        return majors;
    }
    // setters
    public void setCode(String code){
        this.code = code;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setMajors(ArrayList<Student> majors){
        this.majors = majors;
    }
    // add a student to those majoring in this area
    public void addMajor(Student newMajor){
        majors.add(newMajor);
        
    }
    // toString()
    public String toString(){
        return code+" ("+name+")";
    }
    // equals(...)
    public boolean equals(Subject other){
        return this.code == other.code;
    }
}
