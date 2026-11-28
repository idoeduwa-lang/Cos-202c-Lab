//Edu/lis/24/128
// Bala Ediwa Ido 
//Library and information science

//LAB 5
//Task 5.7: Guessing game. Generate a secret number from 1 to 100 using (int) (Math.random() * 100) + 1. Let the player guess until correct, giving "too high" or "too low" hints and counting attempts.


import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int secret = (int) (Math.random() * 100) + 1;
        int attempts = 0;
        int guess = 0;

        System.out.println("Guess the number (1 to 100):");

        while (guess != secret) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            attempts++;

            if (guess < secret) {
                System.out.println("Too low!");
            } else if (guess > secret) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
            }
        }

        input.close();
    }
}