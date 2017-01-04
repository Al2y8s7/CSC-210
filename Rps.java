/**
 * Alvin Nguyen
 * 9/21/2016
 * CSC-210 MWF 9-10 am
 * This program is designed to simulate the game rock, paper, scissors.
 * The user is prompted to input his/her choice of scissor (0), rock (1) or paper(2).
 * The CPU will generate a random output from zero to two, this random selection will be the CPU's choice.
 * A winner will be determined based on the following scenarios:
 * User Wins:
 * User chooses scissor and CPU chooses paper
 * User chooses rock and CPU chooses scissor
 * User chooses paper and CPU chooses rock
 * CPU wins:
 * User chooses scissor and CPU chooses rock
 * User chooses rock and CPU chooses paper
 * User chooses paper and CPU chooses scissor
 * If none of the above scenarios occur, the game results in a draw:
 * User chooses scissor and CPU chooses scissor
 * User chooses rock and CPU chooses rock
 * User chooses paper and CPU chooses paper
 *
 */
package rps;

import java.util.Scanner;
import java.util.Random;

public class Rps {

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        //Declare and initialize variables
        int playerMove = 0, cpuMove = 0;
        int playerWin = 0, cpuWin = 0;
        int gameEnd1 = 0, gameEnd2 = 0;
        // Print Welcome Message
        System.out.println("Welcome to the Rock, Paper and Scissors Game!");
        // Prompt user to select rock, paper or scissors
        System.out.print("Select scissors (0), rock (1), or scissors (2): ");
        // Extra Credit for Game Continuation loop best 2 out of 3
        while (playerWin < 2 && cpuWin < 2) {
        // Validate user input
            if (input.hasNextInt()) {
                playerMove = input.nextInt();
            } else {
                System.out.println("Not a valid input!");
                System.exit(1);
            }
        // Print user's move based on input
            switch (playerMove) {
                case 0:
                    System.out.println("You chose scissor!");
                    break;
                case 1:
                    System.out.println("You chose rock!");
                    break;
                case 2:
                    System.out.println("You chose paper!");
                    break;
                default:
                    System.out.println("Not a valid input!");
                    System.exit(1);
            }
        // Generate a random number and print CPU's move
            Random rnd = new Random();
            cpuMove = rnd.nextInt(3);
            switch (cpuMove) {
                case 0:
                    System.out.println("CPU chose scissor!");
                    break;
                case 1:
                    System.out.println("CPU chose rock!");
                    break;
                case 2:
                    System.out.println("CPU chose paper!");
                    break;
            }
        // User win scenarios
            if (playerMove == 0 && cpuMove == 2) {
                System.out.println("You win, scissors beats paper!");
                playerWin++;
                System.out.print("Player Wins: " + playerWin + "\n");
            } else if (playerMove == 1 && cpuMove == 0) {
                System.out.println("You win, rock beats scissor!");
                playerWin++;
                System.out.print("Player Wins: " + playerWin + "\n");
            } else if (playerMove == 2 && cpuMove == 1) {
                System.out.println("You win, paper beats rock!");
                playerWin++;
                System.out.print("Player Wins: " + playerWin + "\n");
            }
        // Game ends when player wins 2 games
            if (playerWin == 2){
                gameEnd1 = playerWin;
                System.out.println("Game Over!");
                break;
            }            
        // CPU win scenarios
            if (playerMove == 0 && cpuMove == 1) {
                System.out.println("You lose, rock beats scissors!");
                cpuWin++;
                System.out.print("CPU Wins: " + cpuWin + "\n");
            } else if (playerMove == 1 && cpuMove == 2) {
                System.out.println("You lose, paper beats rock!");
                cpuWin++;
                System.out.print("CPU Wins: " + cpuWin + "\n");
            } else if (playerMove == 2 && cpuMove == 0) {
                System.out.println("You lose, scissor beats paper!");
                cpuWin++;
                System.out.print("CPU Wins: " + cpuWin + "\n");
            }
        // Game ends when CPU wins 2 games
            if (cpuWin == 2){
                gameEnd2 = cpuWin;
                System.out.println("Game Over!");
                break;
            }
        // Possible draw scenarios
            if (playerMove == 0 && cpuMove == 0) {
                System.out.println("You and CPU both chose scissor, it's a draw!");
            } else if (playerMove == 1 && cpuMove == 1) {
                System.out.println("You and CPU both chose rock, it's a draw!");
            } else if (playerMove == 2 && cpuMove == 2) {
                System.out.println("You and CPU both chose paper, it's a draw!");
            }
        // If neither user or CPU have won 2 games, prompt user to select a move
            if (playerWin != 2 && cpuWin != 2){
                System.out.println("");
                System.out.print("Select scissors (0), rock (1), or scissors (2): ");
            }
        // End while loop
        }
    }
}
