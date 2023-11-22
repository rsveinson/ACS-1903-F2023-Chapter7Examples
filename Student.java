/**
 * A student.
 */
public class Student {
    // class fields
    private static int lastId = 999;
    
    // instance fields
    private int id;
    private String firstName;
    private String lastName;
    private char gender;
    private boolean active;
    private Subject major;
    
    // first constructor, no arguments
    public Student(){ 
        id = nextId();
        // default values for a student:
        firstName = "unknown";
        lastName = "unknown";
        gender = '?';
        active = false;
    }
    
    // second constructor, four arguments
    public Student (String firstName, String lastName, char gender, boolean active){
        id = nextId();
        // 
        // when parameters and fields have the same 
        // name they are distinquished this way:
        // a field name alone refers to the parameter
        // a field name prefixed with "this." 
        // refers to an object's fields.
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.active = active;
    }

    private int nextId(){
        // increment lastId and return the new value
        // to be used for the new student.
        return ++lastId;
    }

    // getters
    public int getId(){
        return id;
    }

    public static int getLastId(){
        return lastId;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public char getGender(){
        return gender;
    }

    public boolean isActive(){
        return active;
    }

    public Subject getMajor(){
        return major;
    }

    // setters
    public void setLastId(int newLastId){
        lastId = newLastId;
    }

    // no setter for the student's id field
    //     private void setId(int newId){
    //         id = newId;
    //     }

    public void setFirstName(String newFirstName){
        firstName = newFirstName;
    }

    public void setLastName(String newLastName){
        lastName = newLastName;
    }

    public void setGender(char newGender){
        gender = newGender;
    }

    public void setActive(boolean newActive){
        active = newActive;
    }

    public void setMajor(Subject newMajor){
        major = newMajor;
    }

    // other methods
    @Override
    public String toString(){
        return id+" "+firstName+" "+lastName;
    }

    
    public boolean equals(Student s){
        //System.out.println("equals");
        //return id == s.id;
        boolean same = false;
        same = this.lastName.equals(s.getLastName()) && this.firstName.equals(s.getFirstName());
        return same;
    }
}
