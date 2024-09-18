package nMulteze_Assignment1;
//Importing the Scanner class
import java.util.Scanner; 
//Importing the Random class
import java.util.Random;
/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: The following program is a simple game to test user's Extra Sensory Perception by letting 
 *              the user guess by generating a random color.
 * Due: 09/17/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Nurahmed Multezem
*/

public class ESPGame {
	
	 public static void main(String[] args) { // The main method 
	        // Defining the color constants 
	        final String BLACK = "Black";
	        final String BLUE = "Blue";
	        final String YELLOW = "Yellow";
	        final String GREEN = "Green";
	        final String BROWN = "Brown";
	        final String ORANGE = "Orange";
	        final String RED = "Red";
	        
	        //Initializing the maximum number of attempts
	        int attempts = 11;
	        int correctGuess = 0; // Total correct guesses
	        
	        // Creating the Scanner object
	        Scanner userInput = new Scanner(System.in); 
	        
	        // Asking the description questions and getting the inputs from the user
	        System.out.print("Enter your name: ");
	        String name = userInput.nextLine();
	        System.out.print("Describe yourself: ");
	        String description = userInput.nextLine();
	        System.out.print("Due Date: ");
	        String dueDate = userInput.nextLine();
	        System.out.println("CMSC203 Assignment1: Test your ESP skills");
	        
	        // Setting up the for loop 
	        for (int i = 1; i <= attempts; i++ ) {
	            
	            // Creating the Random object
	            Random random = new Random();
	            // Defining the Guessed color
	            String guessedColor;
	            
	            // Generating a random integer from 0 to 6 using the Random method
	            int guess = random.nextInt(7);
	            
	            // Mapping the random integer to the color using if statement 
	            if (guess == 0) {
	                guessedColor = BLACK;
	            }
	            else if (guess == 1) {
	                guessedColor = BLUE;
	            }
	            else if (guess == 2) {
	                guessedColor = YELLOW;
	            }
	            else if (guess == 3) {
	                guessedColor = GREEN;
	            }
	            else if (guess == 4) {
	                guessedColor = BROWN;
	            }
	            else if (guess == 5) {
	                guessedColor = ORANGE;
	            }
	            else {
	                guessedColor = RED;
	            }
	            
	            // Asking for user input
	            System.out.println("Round " + i);
	            System.out.println("I am thinking of a color.");
	            System.out.println("Is it Black, Blue, Yellow, Green, Brown, Orange, or Red? ");
	            System.out.print("Enter your guess: ");
	            String color = userInput.nextLine();
	            
	            // Determining if the GuessedColor matches the mapped colors
	            // While ignoring the case sensitivity of the user input
	            if (color.equalsIgnoreCase(guessedColor)) {
	                System.out.println("Awesome! I was thinking of " + guessedColor);
	                correctGuess++;
	            }
	            else {
	                System.out.println("Oh, I was thinking of color " + guessedColor + " Guess again.");
	            }
	            
	            // Checking if the attempts are exhausted
	            if (i == attempts) {
	                System.out.println("Oops! You are out of attempts... see you next time!");
	                System.out.println("You have a total of " + correctGuess + " correct guesses.");
	            }
	        }
	        
	        // Closing the scanner
	        userInput.close();
	    }

}
