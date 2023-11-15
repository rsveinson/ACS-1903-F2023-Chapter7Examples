// **********************************************************************
// Programmer:  Rob Sveinson
// Class:   ACS-1903
// ***********************************************************************

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class ArrayListCircleClientStart
{  // begin class
    public static void main(String args[])
    {  // begin main
    // ***** declaration of constants *****

    // ***** declaration of variables *****
        
        // create a new arraylist to hold a bunch of Circles
        Random rn = new Random();
        
        // create a random number of circles with random radii
        
        int listSize = rn.nextInt(16) + 5;
        System.out.println("number of circles will be: " + listSize);
        
        // for(int i = 0; i < listSize; i++){
           // double r = (Math.random() * 10);
           // circles.add(new Circle());
        // } // end for
        
        // for(int i = 0; i < circles.size(); i++){
            // System.out.println("circle " + i);
            // System.out.println(" radius = " + circles.get(i).getRadius());
            // System.out.println(" area = " + circles.get(i).getArea());
            // System.out.println(" circumference = " + circles.get(i).getCircumference());
            // System.out.println(" diameter = " + circles.get(i).getDiameter());
            // System.out.println("\n");
        // } // end for


    // ***** closing message *****

            System.out.println("end of processing");

    }  // end main  
}  // end class
