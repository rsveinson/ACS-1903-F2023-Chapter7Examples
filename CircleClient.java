// **********************************************************************
// Programmer:    Rob Sveinson
// Class:    ACS-1903
// ***********************************************************************

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class CircleClient/*CHANGE THIS TO THE NAME OF THE FILE*/
{  // begin class
    public static void main(String args[])
    {  // begin main
        // ***** declaration of constants *****

        // ***** declaration of variables *****

        ArrayList<Circle> circles = new ArrayList<>();

        Random rn = new Random();

        // ***** create objects *****

        Circle c1 = new Circle();           // create a new circle with default properties
        System.out.println(c1);
        c1.setRadius(4.0);
        System.out.println(c1);
        System.out.println(c1.getRadius());
        Circle c2 = new Circle(4.5);      // create a new circle with an initialized radius
        //System.out.println(c2.radius);
            
        
        Circle myCircle = new Circle(3.0);
        double radius = myCircle.getRadius();
        System.out.println(radius);

        System.out.println("C2:");
        System.out.println(c2);
        // ***** create input stream *****

        //ConsoleReader console = new ConsoleReader(System.in);

        // ***** Print Banner *****

        System.out.println("**********************************");
        System.out.println("NAME:        Sveinson");
        System.out.println("Class:       ACS-1903");
        System.out.println("**********************************");

        // ***** get input *****

        // all input is gathered in this section
        // remember to put ConsoleReader.class into the
        // same folder.

        Circle c3 = new Circle(Double.parseDouble(JOptionPane.showInputDialog("enter radius")));
        System.out.println("C3 details: radius = " + c3.getRadius() + " area = " + c3.getArea());

        // ***** processing *****

        // create a random number of circles with random radii

        int listSize = rn.nextInt(15) + 5;
        System.out.println("number of circles will be: " + listSize);

        for(int i = 0; i < listSize; i++){
            double r = (Math.random() * 10);
            circles.add(new Circle(r));
        } // end for

        for(int i = 0; i < circles.size(); i++){
            System.out.println("circle " + i);
            System.out.println("Id: " + circles.get(i).getId());
            System.out.println(" radius = " + circles.get(i).getRadius());
            System.out.println(" area = " + circles.get(i).getArea());
            System.out.println(" circumference = " + circles.get(i).getCircumference());
            System.out.println(" diameter = " + circles.get(i).getDiameter());
            System.out.println("\n");
        } // end for

        // ***** closing message *****

        System.out.println("end of processing");

    }  // end main    
}  // end class