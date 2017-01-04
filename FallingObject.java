/**
 * Alvin Nguyen
 * 9/1/2016
 * CSC-210 MWF 9-10 am
 * This program is designed to compute the distance of an object falling under 
 * Earth's gravity for 15 seconds.
 */
package fallingobject;

/**
 * The following equation will be used to evaluate an object's
 * distance: x(t) = 0.5 * a * (t * t) + (vi * t) + xi. Where a is acceleration (-9.8 m/s*s),
 * t is time (15 seconds), vi is the initial velocity, and xi is the initial position.
 * First step is to declare 4 variables to store the values for a, vi, t, and xi.
 * The initial values are -9.8, 15.0, 0.0, and 0.0 and the data type of the variables will be
 * double.
 * The following output will be printed to the console: "The distance of an object
 * falling under Earth's gravity for 15 seconds is : " + x + " meters / second"
 * where x is the distance variable.
 * Since operator precedence is evaluated the same way as arithmetic expressions,
 * parentheses will be applied where multiplication occurs first:
 * time (15 seconds) is multiplied by itself then multiplied by a (-9.8 m/s/s)
 * followed by the constant 0.5.  This computation takes care of the first half of the equation:
 * (15 * 15) * (-9.8) * 0.5 = -1102.5.  For the second half, vi is multiplied by t then added to xi:
 * (0 * 15) + 0 = 0.  We then take the sum of these two parts to get the result: -1102.5 + 0 = -1102.5
 * and the unit of measure is meters.  Thus, x(15) = -1102.5 meters per second.
 *
 * 
 */
public class FallingObject {

    
    public static void main(String[] args) {
        
        // Declare variables
        double t = 15.0, //time variable
                initialVelocity = 0.0, // vi variable
                initialPosition = 0.0; // xi variable
        final double ACCELERATION = -9.8; // a variable
      
        // Distance Equation: x(15) = 0.5 * (-9.8 m/s/s)(15.0 sec * 15.0 sec) + (0.0 * 15.0) + 0.0
        double x = 0.5 * ACCELERATION * (t * t) + (initialVelocity * t) + initialPosition; 
        
       // Print distance result to console
       System.out.println("The distance of an object falling under Earth's gravity for 15 seconds is : " + x + " meters / second");
    }
    
}
