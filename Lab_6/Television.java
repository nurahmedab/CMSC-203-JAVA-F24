package nMultezem_Lab_6;

/** 
 * The purpose of this class is to model a television
 * Your name and today's date
 */
public class Television {

    // Declare constant fields
    public final String manufacturer; // Manufacturer of the TV
    public final int screenSize;      // Size of the TV screen in inches

    // Declare instance fields
    private boolean powerOn;  // Represents if the TV is on or off
    private int channel;      // Represents the current channel
    private int volume;       // Represents the volume of the TV

    /** 
     * Constructor for the Television class. Initializes the TV with a manufacturer and screen size.
     * Initializes the TV's power, volume, and channel to default values.
     */
    public Television(String manufacturer, int screenSize) {
        // Initialize the final fields (this must happen in the constructor)
        this.manufacturer = manufacturer;  // Set the manufacturer
        this.screenSize = screenSize;      // Set the screen size

        // Initialize other fields to default values
        powerOn = false;  // Power is initially off
        volume = 20;      // Default volume is 20
        channel = 2;      // Default channel is 2
    }

    // Define accessor methods
    public int getVolume() {
        return volume;
    }

    public int getChannel() {
        return channel;
    }

    public String getManufacturer() {
        return manufacturer;  // Return the constant manufacturer
    }

    public int getScreenSize() {
        return screenSize;    // Return the constant screen size
    }

    // Define mutator methods
    public void setChannel(int newChannel) {
        channel = newChannel; // Set the channel
    }

    public void power() {
        powerOn = !powerOn;  // Toggle the power state (on/off)
    }

    public void increaseVolume() {
        volume++;  // Increase volume by 1
    }

    public void decreaseVolume() {
        volume--;  // Decrease volume by 1
    }
}
