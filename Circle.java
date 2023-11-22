/* **********************************************************
 * Programmer:  Rob Sveinson
 * Class:       ACS-1903
 * 
 * Assignment:  OOP Circle example
 *
 * Description:    class for a circle object 
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
        this.id = getNextID();      // assign id and incremnt next id
        this.radius = 0.0;
    } // end default constructor

    /*****************************************
     * Description: create a new circle object with a defined radius
     * 
     * Interface:
     * 
     * @param   r the radius of the new circle
     *********************************************/      
    public Circle(double radius){
        this.id = getNextID();
        this.radius = radius;
    } // end initialized constructor

    // other methods
    private int getNextID(){
       return nextID++; 
    }// end get next id
    
    // **** getters *****

    public int getId(){
        return this.id;
    } //

    public double getRadius(){
        return this.radius;
    } // end getRadius

    // **** setters ****

    public void setRadius(double r){
        this.radius = r;
    } // end setRadius

    // *** utility methods ***
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
        double rad = this.getRadius() * 2;
        //return this.radius * 2;
        return rad;
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
    
    // public boolean equals(Circle oc){
        // boolean eq = false;
        
        // //eq = this.radius == oc.radius;
        // eq = this.radius == oc.getRadius();
        
        // return eq;
    // }// end equals
    
    public boolean equals(Circle oc){
         return this.radius == oc.getRadius();
    }// end equals


} // end class

/*****************************************
 * Description: return unique id of circle
 * 
 * Interface:
 * 
 * @return  returns circle id number
 *********************************************/

/*****************************************
 * Description: return unique radius of circle
 * 
 * Interface:
 * 
 * @return  returns circle radius
 *********************************************/

/*****************************************
 * Description: set new radius
 * 
 * Interface:
 * 
 * @param   r new radius of circle
 *********************************************/
