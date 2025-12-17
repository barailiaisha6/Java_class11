package day_9;

import java.util.Scanner;

public class AdvanceCase {

    int secretNumber;

    AdvanceCase() {
        secretNumber = 50;
    }

    void checkGuess(int guess) {
        int difference = Math.abs(secretNumber - guess);

        if (guess == secretNumber) {
            System.out.println("Correct! You guessed the number.");
        } else if (difference == 1) {
            System.out.println("Too near!");
        } else if (difference <= 3) {
            System.out.println("Near! Try again.");
        } else if (guess < secretNumber) {
            System.out.println("Too low!");
        } else {
            System.out.println("Too high!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AdvanceCase g = new AdvanceCase();
        int userGuess;

        System.out.println("Guess a number between 1 and 100");

        do {
            System.out.println("Enter your guess: ");
            userGuess = sc.nextInt();
            g.checkGuess(userGuess);
        } while (userGuess != g.secretNumber);

        sc.close();
    }
}
