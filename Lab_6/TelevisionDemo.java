package nMultezem_Lab_6;

import java.util.Scanner;

public class TelevisionDemo {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner keyboard = new Scanner(System.in);
        
        // Declare variables
        int station; // the user's channel choice
        
        // Create and instantiate a Television object for a big screen TV
        Television bigScreen = new Television("Toshiba", 55);
        
        // Turn the power on
        bigScreen.power();
        
        // Display the current state of the big screen television
        System.out.println("A " + bigScreen.getScreenSize() + " inch " + bigScreen.getManufacturer() + " has been turned on.");
        
        // Prompt the user to choose a channel and store their input
        System.out.print("What channel do you want? ");
        station = keyboard.nextInt();
        
        // Set the channel to the user’s choice
        bigScreen.setChannel(station);
        
        // Increase the volume of the television
        bigScreen.increaseVolume();
        
        // Display the current channel and volume of the television
        System.out.println("Channel: " + bigScreen.getChannel() + " Volume: " + bigScreen.getVolume());
        
        // Check if the volume is too loud and adjust it
        System.out.println("Too loud!! I am lowering the volume.");
        
        // Decrease the volume several times to bring it to a lower level
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        
        // Display the final channel and volume
        System.out.println("Channel: " + bigScreen.getChannel() + " Volume: " + bigScreen.getVolume());
        System.out.println(); // Blank line for separation
        
        // Task #5: Create another Television object and simulate more interactions
        // Declare and instantiate a new Television object for a portable TV
        Television portable = new Television("Sharp", 19);
        
        // Turn the portable TV on
        portable.power();
        
        // Display the current state of the portable television
        System.out.println("A " + portable.getScreenSize() + " inch " + portable.getManufacturer() + " has been turned on.");
        
        // Prompt the user for a channel and store their input
        System.out.print("What channel do you want? ");
        station = keyboard.nextInt();
        
        // Set the channel on the portable TV
        portable.setChannel(station);
        
        // Decrease the volume by 2
        portable.decreaseVolume();
        portable.decreaseVolume();
        
        // Display the current channel and volume of the portable TV
        System.out.println("Channel: " + portable.getChannel() + " Volume: " + portable.getVolume());
        
        // Close the Scanner object to prevent resource leak
        keyboard.close();
    }
}
