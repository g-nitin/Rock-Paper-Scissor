/*
Nitin Gupta
HW02
Rock Paper Scissors!
 */

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static final int ROUNDS = 3; // number of rounds
    public static void main(String[] args) {

        // creating instances...
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Welcome to Rock Paper Scissors!\nCan you beat the computer in a best " +
                "2 out of 3 rounds game?");

        Boolean wantGame = false; // initialize a boolean for while-loop

        System.out.println("Would you like to play the game? Enter \"yes\" or \"no\" ");
        String playGame = keyboard.next();

        if (playGame.equalsIgnoreCase("no")) // exit...
        {
            System.out.println("AW...");
            System.exit(0);
        }

        else if (playGame.equalsIgnoreCase("yes"))
        {
            wantGame = true;
            while (wantGame) // while true on the first try
            {

                // initialize scores...
                int humanScore = 0;
                int computerScore = 0;

                for (int i =0; i<ROUNDS; i++) // goes until the number of rounds. Increase by 1
                {

                    // Display scores...
                    System.out.println("\nHuman score = " + humanScore);
                    System.out.println("Computer score = " + computerScore );

                    System.out.println("\nEnter \"Rock\", \"Paper\", or \"Scissor\".");
                    String userInput = keyboard.next(); // user choice
                    System.out.println();

                    String[] RPS = {"rock", "paper", "scissor"}; // array of the possibilities

                    int random = r.nextInt(RPS.length);
                    String RPSrandom = RPS[random]; // computers choice generated at random

                    // show the choices...
                    System.out.println("Computer chose: " + RPSrandom);
                    System.out.println("You chose: " + userInput);

                    // if they are equal
                    if (userInput.equalsIgnoreCase(RPSrandom))
                    {
                        System.out.println("Its a tie!");
                    }

                    else if (userInput.equalsIgnoreCase("rock"))
                    {

                        if (RPSrandom.equalsIgnoreCase("paper"))
                        {
                            System.out.println("Computer wins!");
                            computerScore += 1;
                        }

                        else if (RPSrandom.equalsIgnoreCase("scissor"))
                        {
                            System.out.println("You win!");
                            humanScore += 1;
                        }
                    }

                    else if (userInput.equalsIgnoreCase("paper"))
                    {

                        if (RPSrandom.equalsIgnoreCase("scissor"))
                        {
                            System.out.println("Computer wins!");
                            computerScore += 1;
                        }

                        else if (RPSrandom.equalsIgnoreCase("rock"))
                        {
                            System.out.println("You win!");
                            humanScore += 1;
                        }
                    }

                    else if (userInput.equalsIgnoreCase("scissor"))
                    {

                        if (RPSrandom.equalsIgnoreCase("rock"))
                        {
                            System.out.println("Computer wins!");
                            computerScore += 1;
                        }

                        else if (RPSrandom.equalsIgnoreCase("paper"))
                        {
                            System.out.println("You win!");
                            humanScore += 1;
                        }
                    }

                    else
                    {
                        System.out.println("Invalid input.");
                        System.out.println("Computer gets a point");
                        computerScore ++;
                    }

                }

                System.out.println("Human score = " + humanScore);
                System.out.println("Computer score = " + computerScore);

                // tell the scores at the end...
                System.out.println("\n\nAfter " + ROUNDS +  " rounds...");
                System.out.println("Human score = " + humanScore);
                System.out.println("Computer score = " + computerScore );

                // declaring the results...
                if (computerScore > humanScore)
                {
                    System.out.println("After " + ROUNDS + " rounds, computer wins");
                }
                else if (computerScore < humanScore)
                {
                    System.out.println("After " + ROUNDS + " rounds, you win");
                }
                else if (computerScore == humanScore)
                {
                    System.out.println("After " + ROUNDS + " rounds, its a tie!");
                }

                // if they want to play again...
                System.out.println("\nDo you want to play again? " +
                        "Enter \"yes\" or \"no\" ");

                playGame = keyboard.next();

                if (playGame.equalsIgnoreCase("no")) // exit...
                {
                    wantGame = false;
                    System.out.println("Aw... See you later.");
                    System.exit(0);
                }

                else if (playGame.equalsIgnoreCase("yes"))
                {
                    wantGame = true; // so that the while loop stays true
                }

                else
                {
                    System.out.println("Invalid input.");
                    System.exit(0);
                }

            }

        }

        else // wrong input
        {
            System.out.println("Invalid input.");
            System.exit(0);

        }
    }

}
