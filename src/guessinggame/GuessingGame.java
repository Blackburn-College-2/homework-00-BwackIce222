/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

import java.util.Scanner;

/**
 *
 * @author montreal.thomas
 */
public class GuessingGame {

    /**
     * @param args the command line arguments
     */
    /*This the main method where the majority of the work for the guessing 
    game is done.
    //This is a guessing game that lets the user guess one of three secret 
    meals. 
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] meals = new String[3];
        meals[0] = "tacos";
        meals[1] = "shrimp";
        meals[2] = "tacos";
        int food = (int) (3 * Math.random());
        String guess = "";
        int playing = 2;
        String secretFood = meals[food];
        System.out.println("Hi!");
        System.out.println("Welcome to the secret meal guessing game.");
        System.out.println("The secret food must be one of the following.");
        System.out.println("shrimp");
        System.out.println("tacos");
        System.out.println("sushi");

        System.out.print("Geuss the secret meal:");
        guess = input.nextLine();
        // This while loop allows the user to guess the secret food a maximum 
        //of two times unless they get it right the first time. If the user does
        //not guess the meal correctly in two tries the game will stop and they 
        //will lose. The user will also lose by default if they enter an option 
        //other than the provided foods.
        while (playing > 0) {
            if (guess.equalsIgnoreCase(secretFood)) {
                System.out.println("Correct! You win!");
                playing = playing - 3;
            } else if ((guess.equalsIgnoreCase("sushi")
                    || guess.equalsIgnoreCase("shrimp")
                    || guess.equalsIgnoreCase("tacos")) != true) {
                playing = 0;
            } else {
                System.out.println("Wrong!");
                playing = playing - 1;
                if (playing >= 1) {
                    System.out.println("Guess the secret meal:");
                    guess = input.nextLine();
                }
                if(guess.equalsIgnoreCase(guess) && playing<1){
                    System.out.println("You already guess that!");
                }
            }

        }
        if (playing == 0) {
            System.out.println("Sorry you lose :( ");
        }
    }

}
/*
Time estimated: 1 hour, Time taken: 28 min
*/