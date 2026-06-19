package NumberGame;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        char playAgain;

        do {
            int number = random.nextInt(100) + 1;
            int attempts = 5;
            boolean guessedCorrectly = false;

            System.out.println("\n=== Number Guessing Game ===");
            System.out.println("Guess a number between 1 and 100");
            System.out.println("You have 5 attempts.");

            while (attempts > 0) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();

                if (guess == number) {
                    System.out.println("Correct! You guessed the number.");
                    score++;
                    guessedCorrectly = true;
                    break;
                } else if (guess > number) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Too low!");
                }

                attempts--;
                System.out.println("Attempts left: " + attempts);
            }

            if (!guessedCorrectly) {
                System.out.println("You lost! The number was: " + number);
            }

            System.out.println("Current Score: " + score);

            System.out.print("Play again? (y/n): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'y' || playAgain == 'Y');

        System.out.println("Thanks for playing!");
        sc.close();
    }
}