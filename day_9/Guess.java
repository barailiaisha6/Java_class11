package day_9;

import java.util.scanner;

public class Guess{
    double number;
    int count = 0;

    public Guess(double number){
        this.number = number;
    }

        public guessNumber(){
            Scanner input = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter the number you want to guess");

        int num = input.nextInt();

         count++;
         if(num>number){
         System.out.println("The number is greater than my secret number");
        }
        else if(num<number){
            System.out.println("The number is lesser than my secret number");
        }
        else{
            System.out.println("Your guess is correct");
            break;
        }
        }  

        System.out.println("Your guess number is " +count+ "times");
    }

    public static void main(String []args){
    Guess guess = new Guess(30);
    guess.guessNumber();
}
}

