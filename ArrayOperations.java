/**
 * Alvin Nguyen
 * 10/3/2016
 * This program is designed to create an array to store 10,000 values
 * and assign random values ranging from 0 - 200. A series of loops is then
 * used to compute the sum, the average, the minimum/maximum values and its index,
 * the count of even/odd numbers and their sums.
 *
 */
package arrayoperations;
import java.util.Random;

public class ArrayOperations {

    public static void main(String[] args) {
        /** 
         * Declare and initialize variables
         * Create array and initialize array size
         * Create random object
         * For loop to assign random values ranging from 0 - 200 to array
         * For loop to compute sum of array
         * Print sum of array
         */ 
        int i;
        int sum1 = 0;
        int sum2 = 0;
        int[] myArray = new int[10000];
        Random randomNum = new Random();  
        for (i = 0; i < myArray.length; i++) {
            myArray[i] = randomNum.nextInt(201);
        } 
        for (int j = 0; j < myArray.length; j++) {
            sum1 += myArray[j];
        }
        System.out.println("The Sum is : " + sum1);
        /**
         * Compute average of array
         * Declare and initialize variable to store average of array
         * For loop used to compute average of array
         * Print average value of array
         */ 
        double average = 0.0;
        double remainder = 0.0;
        for (int k = 0; k < myArray.length; k++) {
            sum2 += myArray[k];
            average = sum2 / myArray.length;
            remainder = sum2 % myArray.length;
            remainder /= 10000;
        }
        System.out.print("The average is : ");
        System.out.print(average + remainder);
        System.out.println("");
        /**
         * Find minimum value of the array and its index
         * Declare and initialize minimum value/index to array
         * For loop used to iterate through array
         * If statement used to compare smallest value to variable in array
         * Assign smallest value to index variable
         * Print minimum value and its index
         */
        int min = myArray[0];
        int indexOfMin = 0;
        for (i = 0; i < myArray.length; i++) {
            if (myArray[i] < min) {
                min = myArray[i];
                indexOfMin = i;
            }
        } 
        System.out.println("The minimum value is : " + min + " and its index is " + indexOfMin);
        /**
         * Find maximum value of the array and its index
         * Declare and initialize variable to store largest value and index in the array
         * For loop used to assign random values ranging from 0 - 200 to array
         * If statement used to compare largest value to variable in array
         * Assign largest value to index variable
         * Print maximum value and its index
         */
        int max = myArray[0];
        int indexOfMax = 0;
        for (i = 0; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
                indexOfMax = i;
            }
        } 
        System.out.println("The maximum value is : " + max + " and its index is " + indexOfMax);;
        /**
         * Declare and initialize variables
         * for each loops to iterate through array
         * if - else if used to determine even and odd numbers
         * Count of the number of even/odd numbers in the array
         * Print the even/odd numbers and their sums
         */
        int evenNum = 0;
        int evenNumSum = 0;
        int oddNum = 0;
        int oddNumSum = 0;
        int evenCount = 0;
        int oddCount = 0;       
        for (int m : myArray) {
            if (myArray[m] % 2 == 0) {
                evenNum = myArray[m];
             } else if (myArray[m] % 2 == 1) {
                oddNum = myArray[m];
            }        
        }
        for (int k : myArray){
            if (myArray[k] % 2 == 0){
                evenNum = myArray[k];
                evenNumSum += evenNum;
            } else if (myArray[k] % 2 == 1){
                oddNum = myArray[k];
                oddNumSum += oddNum;
            }
        }
            for (int l : myArray) {
                if (myArray[l] % 2 == 0) {
                    evenCount++;
                } else if (myArray[l] % 2 == 1) {
                    oddCount++;
                }              
            } 
            System.out.println("The array contains " + evenCount + " even numbers");
            System.out.println("The array contains " + oddCount + " odd numbers");
            System.out.println("The sum of the even numbers is " + evenNumSum);
            System.out.println("The sum of the odd numbers is " + oddNumSum);       
    }
}
