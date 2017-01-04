/**
 * Alvin Nguyen
 * 9/9/2016
 * CSC-210 MWF 9-10 am
 * This program is designed to calculate the Body Mass Index (BMI) of a user.
 * The user is prompted to enter the following information: Name, Height and Weight.
 * BMI is defined as Weight (lbs) divided by height (inches) multiplied by the constant 703:
 * BMI = Weight / (height * height) * 703.
 * The results display the user's information and his/her BMI status based on the BMI Categories:
 * BMI is less than or equal to 18.5 is defined as Underweight,
 * BMI ranges between 18.5 and 24.9 is defined as Normal weight,
 * BMI ranges between 25 and 29.9 is defined as Overweight,
 * BMI is greater than or equal to 30 is defined as Obesity.
 *
 */
package bmicalculator;

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        // Create a Scanner for user input
        Scanner input = new Scanner(System.in);

        //Declare variables
        String firstName; // First Name
        String lastName; // Last Name
        int height; // Height in inches
        double weight; // Weight in pounds

        // Prompt user to enter information
        System.out.print("Enter your first and last name: ");
        firstName = input.next();
        lastName = input.next();
        System.out.print("Enter your height in inches: ");
        height = input.nextInt();
        System.out.print("Enter your weight in pounds: ");
        weight = input.nextDouble();

        // Calculate BMI 
        double BMI = weight / (height * height) * 703;

        // Print users input information and BMI status
        System.out.printf("%-10s-10s\n", "Hello World");
        System.out.println("");
        System.out.printf("%-4s%-10s%-10s\n", "  Name: " , firstName , lastName);
        System.out.printf("%-2s%-4s%-4s\n", "Height: ", height / 12 + " ft ", height % 12 + " in");
        System.out.printf("%-8s", "Weight:");
        System.out.printf("%.3f%-4s\n", weight ,  " lb");
        System.out.printf("%-7s", "   BMI: ", BMI);

        // BMI Categories determines user's BMI Status
        if (BMI <= 18.5) {
            System.out.println("Underweight");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Normal weight");
        } else if (BMI >= 25 && BMI <= 29.9) {
            System.out.println("Overweight");
        } else if (BMI >= 30) {
            System.out.println("Obesity");
        }
    }
}
