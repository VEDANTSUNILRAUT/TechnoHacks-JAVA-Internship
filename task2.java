import java.util.Scanner;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int secretNumber = rand.nextInt(100) + 1;
        int userGuess = 0;
        int guessCount = 0;
        boolean isCorrect = false;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("Can you guess it?");

        while (!isCorrect) {
            System.out.print("Enter your guess: ");
            userGuess = input.nextInt();
            guessCount++;
            if (userGuess == secretNumber) {
                isCorrect = true;
                System.out.println("Congratulations! You guessed the number in " + guessCount + " guesses.");
            } else if (userGuess > secretNumber) {
                System.out.println("The number is smaller than " + userGuess + ".");

            } else if (userGuess < secretNumber) {
                System.out.println("The number is larger than " + userGuess + ".");
            }
        }

        input.close();
    }
}
