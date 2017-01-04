/**
 * Alvin Nguyen
 * 9/27/2016
 * CSC 210 MWF 9 - 10 am
 * This program is designed to compile and build a series of
 * various loops described below.
 *
 *
 */
package loops;

public class Loops {

    public static void main(String[] args) {
        /**
         * For loop that counts from 0 - 110 by 2
         */
        System.out.println("-------- Loop 1 --------");
        for (int i = 0; i <= 110; i += 2) {
            System.out.println(i);
        }
        /**
         * While loop that counts down from 100 - 0 by half each iteration
         */
        System.out.println("-------- Loop 2 --------");
        int i = 100;
        while (i >= 0) {
            if (i != 0) {
                System.out.println(i);
                i /= 2;
            } else if (i == 0) {
                System.out.println(i);
                break;
            }
        }
        /**
         * Do-while loop that prints the first 15 powers of 2
         */
        System.out.println("--------- Loop 3 --------");
        int powerOf2 = 1;
        int maxPowerOf2 = 32768;
        do {
            System.out.println(powerOf2);
            powerOf2 *= 2;
        } while (powerOf2 <= maxPowerOf2 && powerOf2 > 0);

        /**
         * For loop that prints all numbers divisible by 3 and 4 between 100 and 250
         */
        System.out.println("-------- Loop 4 --------");
        for (int x = 100; x >= 100 && x <= 250; x++) {
            if (x % 3 == 0 && x % 4 == 0) { //Use modulo for no remainder 
                System.out.println(x);
            }
        }
        /**
         * While loop that prints out multiples of 9 between 0 and 150
         */
        System.out.println("-------- Loop 5 --------");
        int j = 0;
        int k = 150;
        while (j < k) {
            System.out.println(j);
            j = j + 9;
        }
        /**
         * For loop that computes 2^30 power
         */
        System.out.println("-------- Loop 6 --------");
        for (long z = 2; z < maxPowerOf2; z++) {
            z = maxPowerOf2 * maxPowerOf2; // Variable used in Loop 3
            System.out.println(z);
        }
        /**
         * Do-while loop that computes the sum of 1/n 5000 times
         */
        System.out.println("-------- Loop 7 --------");
        int denominator = 1;
        double total = 0;
        do {
            total = total + 1. / denominator; // Store value to total, add 1 to rational number
            denominator++; // Increment denominator by 1
        } while (denominator <= 5000);
        System.out.println(total);
        /**
         * While loop that takes 574837 and reverses it
         */
        System.out.println("-------- Loop 8 --------");
        int number = 574837, reverseConstant = 0;
        System.out.println("Current value before reversal: " + number);
        while (number != 0){
            reverseConstant =  reverseConstant * 10; //Store value to variable, multiply current value by 10 
            reverseConstant = number % 10 + reverseConstant; // Use modulo to get remainder and add to current value
            number = number / 10; // Divide by 10 to move decimal place of current value
        }
        System.out.println("Current value after reversal: " + reverseConstant);
    }
}
