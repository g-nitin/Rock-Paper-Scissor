/*
Nitin Gupta
Rock Paper Scissors using GUI!
 */

import javax.swing.*;
import java.util.Random;

public class RPS_JOptionPane {

    public static final int ROUNDS = 3; // number of rounds
    public static void main(String[] args) {

        // creating instances...
        Random r = new Random();

        JOptionPane.showMessageDialog(null,
                "Welcome to Rock Paper Scissors!\nCan you beat the computer in a best " +
                                "2 out of 3 rounds game?" +
                        "\nPress \"OK\" to continue.");

        Boolean wantGame = false; // initialize a boolean for while-loop

        int playGame =
                JOptionPane.showConfirmDialog(null,
                        "Would you like to play the game? Enter \"yes\" or \"no\"",
                        "Click Yes or No:", JOptionPane.YES_NO_OPTION);

        if (playGame == JOptionPane.NO_OPTION) // exit...
        {
            JOptionPane.showMessageDialog(null,
                    "AW...");
            System.exit(0);
        }

        else if (playGame == JOptionPane.YES_OPTION)
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
                    JOptionPane.showMessageDialog(null,
                            "\nHuman score = " + humanScore +
                    "\nComputer score = " + computerScore );

                    String userInput = JOptionPane.showInputDialog("Enter \"rock\", \"paper\", or "
                            + "\"scissor\"? \n");

                    if (userInput == null) // if the user clicks 'cancel' on the GUI
                    {
                        JOptionPane.showMessageDialog(null,
                                "Aw... See you later.");
                        System.exit(0);
                    }

                    String[] RPS = {"rock", "paper", "scissor"}; // array of the possibilities

                    int random = r.nextInt(RPS.length);
                    String RPSrandom = RPS[random]; // computers choice generated at random

                    // show the choices...
                    JOptionPane.showMessageDialog(null,
                            "Computer chose: " + RPSrandom +
                                    "\nYou chose: " + userInput);

                    // if they are equal
                    if (userInput.equalsIgnoreCase(RPSrandom))
                    {
                        JOptionPane.showMessageDialog(null,"Its a tie!");
                    }

                    else if (userInput.equalsIgnoreCase("rock"))
                    {

                        if (RPSrandom.equalsIgnoreCase("paper"))
                        {
                            JOptionPane.showMessageDialog(null,
                                    "Computer wins!");
                            computerScore += 1;
                        }

                        else if (RPSrandom.equalsIgnoreCase("scissor"))
                        {
                            JOptionPane.showMessageDialog(null,
                                    "You win!");
                            humanScore += 1;
                        }
                    }

                    else if (userInput.equalsIgnoreCase("paper"))
                    {

                        if (RPSrandom.equalsIgnoreCase("scissor"))
                        {
                            JOptionPane.showMessageDialog(null,
                                    "Computer wins!");
                            computerScore += 1;
                        }

                        else if (RPSrandom.equalsIgnoreCase("rock"))
                        {
                            JOptionPane.showMessageDialog(null,
                                    "You win!");
                            humanScore += 1;
                        }
                    }

                    else if (userInput.equalsIgnoreCase("scissor"))
                    {

                        if (RPSrandom.equalsIgnoreCase("rock"))
                        {
                            JOptionPane.showMessageDialog(null,
                                    "Computer wins!");
                            computerScore += 1;
                        }

                        else if (RPSrandom.equalsIgnoreCase("paper"))
                        {
                            JOptionPane.showMessageDialog(null,
                                    "You win!");
                            humanScore += 1;
                        }
                    }

                    else
                    {
                        JOptionPane.showMessageDialog(null,"Invalid input. " +
                                "\nComputer gets a point");
                        computerScore ++;
                    }

                }

                JOptionPane.showMessageDialog(null,
                        "Human score = " + humanScore +
                                "\nComputer score = " + computerScore);

                // tell the scores at the end...
                JOptionPane.showMessageDialog(null,
                "\n\nAfter " + ROUNDS +  " rounds..." +
                "\nHuman score = " + humanScore +
                "\nComputer score = " + computerScore );

                // declaring the results...
                if (computerScore > humanScore)
                {
                    JOptionPane.showMessageDialog(null,
                            "After " + ROUNDS + " rounds, computer wins");
                }
                else if (computerScore < humanScore)
                {
                    JOptionPane.showMessageDialog(null,
                            "After " + ROUNDS + " rounds, you win");
                }
                else if (computerScore == humanScore)
                {
                    JOptionPane.showMessageDialog(null,
                            "After " + ROUNDS + " rounds, its a tie!");
                }

                // if they want to play again...
                playGame =
                        JOptionPane.showConfirmDialog(null,
                                "\nDo you want to play again? " +
                                        "Enter \"yes\" or \"no\" ",
                                "Click Yes or No:", JOptionPane.YES_NO_OPTION);


                if (playGame == JOptionPane.NO_OPTION) // exit...
                {
                    wantGame = false;
                    JOptionPane.showMessageDialog(null,
                            "Aw... See you later.");
                    System.exit(0);
                }

                if (playGame == JOptionPane.YES_OPTION)
                {
                    wantGame = true; // so that the while loop stays true
                }

                else
                {
                    JOptionPane.showMessageDialog(null,
                            "Invalid input.");
                    System.exit(0);
                }

            }

        }

        else // wrong input
        {
            JOptionPane.showMessageDialog(null,
                    "Invalid input. \nSorry");
            System.exit(0);

        }
    }

}
