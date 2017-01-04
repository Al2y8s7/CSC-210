/**
 * Alvin Nguyen
 * 11/28/2016
 * The program is designed to prompt the user to enter values
 * for the lengths of a triangle and determine if it is Scalene, Isosceles, Right, Equilateral and valid.
 * 
 */
package triangle;
import java.util.Scanner;

public class Triangle {
    //Declare variables
    private int aSide;
    private int bSide;
    private int cSide;
    
    //Create Default Constructor
    public Triangle(){  
    }
   //Create Constructor
    public Triangle(int side1, int side2, int side3){
        aSide = side1;
        bSide = side2;
        cSide = side3;
    }
    //Create getters and setters for triangle constructor 
    public int getSideA(){
        return aSide;
    }
    public void setSideA(int sideOne){
       aSide = sideOne;
    }
   public int getSideB(){
        return bSide;
    }
    public void setSideB(int sideTwo){
       bSide = sideTwo;
    }
    public int getSideC(){
        return cSide;
    }
    public void setSideC(int sideThree){
       cSide = sideThree;
    }
    // A scalene triangle has all unequal sides.
    public boolean isScalene(int sideA, int sideB, int sideC){
        return (sideA != sideB) && (sideB != sideC) && (sideC != sideA);
    }
    // A right triangle satisfies the Pythagorean theorem.
    public boolean isRight(int sideA, int sideB, int sideC){
        if((sideA * sideA) + (sideB * sideB) == (sideC * sideC)){
            return true;
        }
        else if((sideB * sideB) + (sideA * sideA) == (sideC * sideC)){
            return true;
        }
        else if((sideC * sideC) + (sideA * sideA) == (sideB * sideB)){
            return true;
        }
        return false;
    }
    // An isosceles triangle has TWO equal sides.
    public boolean isIsosceles(int sideA, int sideB, int sideC){
        return (sideA == sideB) && (sideB != sideC);
    }
    // An equilateral triangle has all equal sides.
    public boolean isEquilateral(int sideA, int sideB, int sideC){
        return (sideA == sideB) && (sideB == sideC);
    }
    // Given a Triangle object, see if the Triangle is valid
    public boolean isValid(int sideA, int sideB, int sideC){
        if(sideA + sideB > sideC && sideB + sideC > sideA && sideC + sideA > sideB){
        return true;
    }
        return false;
    }    
    public static void main(String[] args) {
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        //Declare variables
        int a, b, c;
        while (true) {
        //Print welcome message
        System.out.println("Welcome to Testing Triangles!");
        //Prompt user to enter length for side a
        System.out.println("Enter the length of side A: ");
        a = input.nextInt();
        //Prompt user to enter length of side b
        System.out.println("Enter the length of side B: ");
        b = input.nextInt();
        //Prompt user to enter lenth of side c
        System.out.println("Enter the length of side C: ");
        c = input.nextInt();
        //Create triangle object
        Triangle objectTri = new Triangle();
        //print values for triangle
        System.out.println("Scalene: " + objectTri.isScalene(a, b, c));
        System.out.println("Right: " + objectTri.isRight(a, b, c));
        System.out.println("Isosceles: " + objectTri.isIsosceles(a, b, c));
        System.out.println("Equilateral: " + objectTri.isEquilateral(a, b, c));
        System.out.println("Valid: " + objectTri.isValid(a, b, c));
        System.out.print("Read in a new triangle?(-1 for no, 1 for yes): ");
            if(input.nextInt() < 0) 
                break;
        }
    }    
}
