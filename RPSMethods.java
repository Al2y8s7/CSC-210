/**
 * Alvin Nguyen
 * 10/26/2016
 * CSC-210 MWF 9-10 am
 * This program simulates the game rock, paper, scissors using methods.
 * A welcome message is printed, followed by prompting the user to select
 * his/her choice of scissor (0), rock (1) or paper(2).
 * After the user's move, the CPU will generate a random move.
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
 */
package rpsmethods;

import java.util.Scanner;
import java.util.Random;

public class RPSMethods {

    public static void displayOpeningMessage() {
        System.out.println("Welcome to RPS Game 2.0!");
    }
    //Method to determine user's move
    public static int getUserMove() {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        System.out.println("");
        System.out.print("Select scissors (0), rock (1), or scissors (2): ");
        do {
            if (input.hasNextInt()) {
                choice = input.nextInt();
                if (choice < 0 || choice > 2) {
                    System.out.print("Out of range! Enter a correct integer!: ");
                }
            } else {
                System.out.print("Not a valid input! Please enter a valid input: ");
                input.next();
            }
        } while (choice < 0 || choice > 2);
         switch (choice) {
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
                            System.out.print("Select scissors (0), rock (1), or scissors (2): ");
                            choice = input.nextInt();
                    }

        return choice;
    }
    //Method to randomly generate CPU's move
    public static int getCPUMove() {
        Random rnd = new Random();
        int CPUMove = rnd.nextInt(3);
        switch (CPUMove) {
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
        return CPUMove;
    }
    /**
     * Method returns values 0, 1, or 2 based on scenario
     * @param user
     * @param cpu
     * @return 
     */
    public static int determineWinner(int user, int cpu) {
        //User win scenarios
        if (user == 0 && cpu == 2) {
            System.out.println("You win, Scissors beat Paper!");    
            return 0;
        } else if (user == 1 && cpu == 0) {
            System.out.println("You win, Rock beats Scissors!");         
            return 0;
        } else if (user == 2 && cpu == 1) {
            System.out.println("You win, Paper beats Rock!");
            return 0;
        }
        //Cpu win scenarios
        if (user == 0 && cpu == 1) {
            System.out.println("You lose, Rock beats Scissors!");
            return 1;
        } else if (user == 1 && cpu == 2) {
            System.out.println("You lose, Paper beats Rock!");
            return 1;
        } else if (user == 2 && cpu == 0) {
            System.out.println("You lose, Scissor beats Paper!");
            return 1;
        }
        //Draw scenarios
        if (user == 0 && cpu == 0) {
            System.out.println("You and CPU chose Scissor, it's a draw!");
        } else if (user == 1 && cpu == 1) {
            System.out.println("You and CPU chose Rock, it's a draw!");
        } else if (user == 2 && cpu == 2) {
            System.out.println("You and CPU chose Paper, it's a draw!");
        }
        return 2;
    }

    /**
     * Call getUserMove, getCPUMove & determineWinner methods.
     * Validate if CPU or User wins 
     */
    public static void gameLogic() {
        int userWins = 0 ;
        int cpuWins = 0;
        while(userWins < 2 && cpuWins < 2){
        int check = determineWinner(getUserMove(), getCPUMove());
        if(check == 0){
            userWins++;
            System.out.println("User Wins: " + userWins);
        }
        if(check == 1){
            cpuWins++;
            System.out.println("CPU Wins: " + cpuWins);
        }
       }
        if(userWins >= 2){
            System.out.println("Game Over! You won best 2/3");
        }
        if(cpuWins >=2){
            System.out.println("Game Over! CPU won best 2/3");
        }
    }

    public static void main(String[] args) {
        displayOpeningMessage();
        gameLogic();
    }
}
