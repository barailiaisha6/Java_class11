

import java.util.Scanner;

public class Guess {
    double number;
    int count = 0;

    public Guess(double number) {
        this.number = number;
    }


    public void guessNumber() {
        Scanner input = new Scanner(System.in);
        int num = 0;

        while (num != number) {
            System.out.print("Enter the number you want to guess: ");
            num = input.nextInt();
            count++;

            if (num > number) {
                System.out.println("The number is greater than my secret number");
            } else if (num < number) {
                System.out.println("The number is lesser than my secret number");
            } else {
                System.out.println("Your guess is correct");
            }
        }

        System.out.println("Your guess count is " + count + " times");
    }

    public static void main(String[] args) {
        Guess guess = new Guess(30);
        guess.guessNumber();
    }
}
