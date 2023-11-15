/* **********************************************************
 * Programmer:  Rob Sveinson
 * Class:       ACS-1903
 * 
 * Assignment:  OOP Circle example
 *
 * Description:	class for a circle object 
 * *************************************************************/
public class Circle {
    // *** class variables *****
    
    private static int nextID = 1000;       // unique id of the next circle object created
    
    // **** instance variables ****
    
    private double radius = 0.0;
    private final double PI = 3.14159;
    private int id = 0;
    
// ***** behaviours *****
    
    // ** constructors **
 
    /*****************************************
     * Description: create a new circle object with a radius of 0
     * 
     * Interface:
     * NA
     *********************************************/
    public Circle(){
        this.id = nextID++;      // assign id and incremnt next id
        this.radius = 0.0;
    } // end default constructor
    
    /*****************************************
     * Description: create a new circle object with a defined radius
     * 
     * Interface:
     * 
     * @param   r the radius of the new circle
     *********************************************/      
    public Circle(double r){
        this.id = nextID++;
        this.radius = r;
    } // end initialized constructor
    
// **** getters *****
    /*****************************************
     * Description: return unique id of circle
     * 
     * Interface:
     * 
     * @return  returns circle id number
     *********************************************/    
    public int getId(){
        return this.id;
    } //
    
    /*****************************************
     * Description: return unique radius of circle
     * 
     * Interface:
     * 
     * @return  returns circle radius
     *********************************************/    
    public double getRadius(){
        return this.radius;
    } // end getRadius
    
    /*****************************************
     * Description: return unique area of circle
     * 
     * Interface:
     * 
     * @return  returns circle area
     *********************************************/    
    public double getArea(){
        //return  this.radius * this.radius * this.PI;
        
        // or even better
        
        return Math.pow(this.radius, 2) * this.PI;
    } // end getArea
    
    /*****************************************
     * Description: return unique diameter of circle
     * 
     * Interface:
     * 
     * @return  returns circle diameter
     *********************************************/     
    public double getDiameter(){
        return this.radius * 2;
    } // end getDiameter
    
    /*****************************************
     * Description: return unique circumference of circle
     * 
     * Interface:
     * 
     * @return  returns circle circumference
     *********************************************/    
    public double getCircumference(){
        return 2 * this.PI * this.radius;
    } // end get Circumference
    
    @Override
    public String toString(){
        String summary = "";
        
        summary = this.getId() + "\n";
        summary += this.getRadius() + "\n";
        summary += this.getArea() + "\n";
        summary += this.getDiameter() + "\n";
        summary += this.getCircumference() + "\n";
        
        return summary;       
    } // end toString
    
// **** setters ****
    /*****************************************
     * Description: set new radius
     * 
     * Interface:
     * 
     * @param   r new radius of circle
     *********************************************/    
    public void setRadius(double r){
        this.radius = r;
    } // end setRadius
    
} // end class
