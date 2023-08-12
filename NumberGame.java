package CodsotProject;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        
        int score = 0;
        boolean playAgain = true;
        
        System.out.println("Welcome to the Number Guessing Game!");
        
        while (playAgain) {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("I have selected a number between " + minRange + " and " + maxRange + ". You have " + maxAttempts + " attempts.");
            
            int attempts = 0;
            boolean guessedCorrectly = false;
            
            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                
                if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > targetNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number: " + targetNumber);
                    guessedCorrectly = true;
                    score++;
                }
                
                attempts++;
            }
            
            if (!guessedCorrectly) {
                System.out.println("Out of attempts. The correct number was: " + targetNumber);
            }
            
            System.out.print("Play again? (yes/no): ");
            String playAgainChoice = scanner.next();
            playAgain = playAgainChoice.equalsIgnoreCase("yes");
        }
        
        System.out.println("Game over! Your final score: " + score);
    }
}



