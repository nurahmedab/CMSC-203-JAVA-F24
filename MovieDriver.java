package nMulteze_Lab1;

//Import the Scanner class for user input
import java.util.Scanner; 

public class MovieDriver {

    public static void main(String[] args) {
        // Creating a new Scanner object to get input from the User 
        Scanner scanner = new Scanner(System.in);
        
        // Start the loop by allowing movie entry
        boolean continueEntering = true;

        // While-Loop to allow multiple movie entries as long as the condition stays true
        while (continueEntering) {
            // Creating a new Movie object
            Movie movie = new Movie();

            // Ask the user to enter the title of a movie
            System.out.print("Enter the title of the movie: ");
            // Get the title from user
            String title = scanner.nextLine(); 
            // Set the title in the movie object
            movie.setTitle(title); 

            // Ask the user to enter the movie’s rating
            System.out.print("Enter the movie's rating: ");
            // Get the rating from user input
            String rating = scanner.nextLine(); 
            // Set the rating in the movie object
            movie.setRating(rating); 

            // Ask the user to enter the number of tickets sold
            System.out.print("Enter the number of tickets sold: ");
            // Read the integer from user input
            int soldTickets = scanner.nextInt(); 
            // Consume the leftover newline character
            scanner.nextLine(); 
            // Set the number of tickets sold in the movie object
            movie.setSoldTickets(soldTickets); 

            // Display out the information using the movie's toString method
            System.out.println("\nMovie Information:");
            // Display the movie information
            System.out.println(movie.toString()); 

            // Ask if the user wants to enter another movie
            System.out.print("Do you want to enter another movie? (yes/no): ");
            // Read the user’s response
            String response = scanner.nextLine(); 

            // Check if the user wants to continue
            if (!response.equalsIgnoreCase("yes")) {
                continueEntering = false; // Exit the loop if response is not "yes"
            }
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
