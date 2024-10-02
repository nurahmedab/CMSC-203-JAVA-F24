package nMultezem_Assignment2; // Package declaration for organizing classes

public class Patient { // Declaration of the Patient class

    // Private member variables to store patient information
	private String firstName; // Patient's first name
	private String lastName; // Patient's last name
	private String phoneNumber; // Patient's phone number
	private String emailAddress; // Patient's email address
	private String streetName; // Patient's street address
	private String city; // Patient's city
	private String state; // Patient's state
	private String country; // Patient's country
	private String zipCode; // Patient's zip code
	private String emergencyContactFullName; // Full name of emergency contact
	private String emergencyContactPhone; // Phone number of emergency contact
	
	// No-argument constructor initializes attributes to default values
	public Patient () {
		// Setting default values for all attributes
		this.firstName = "unknown"; // Default first name
		this.lastName = "unknown"; // Default last name
		this.phoneNumber = "defualt"; // Default phone number (typo: should be "default")
		this.emailAddress = "defualt"; // Default email address (typo)
		this.streetName = "defualt"; // Default street name (typo)
		this.city = "defualt"; // Default city (typo)
		this.state = "defualt"; // Default state (typo)
		this.country = "defualt"; // Default country (typo)
		this.zipCode = "defualt"; // Default zip code (typo)
		this.emergencyContactFullName = "defualt"; // Default emergency contact name (typo)
		this.emergencyContactPhone = "defualt"; // Default emergency contact phone (typo)
	}
	
	// Parameterized constructor to initialize first and last name
	public Patient(String firstName, String lastName) {
		this.firstName = firstName; // Assigning parameter to instance variable
		this.lastName = lastName; // Assigning parameter to instance variable
	}
	
	// Getter methods for accessing private variables
	public String getFirstName() {
		return firstName; // Returns the patient's first name
	}
	
	public String getLastName() {
		return lastName; // Returns the patient's last name
	}
	
	public String getPhoneNumber() {
		return phoneNumber; // Returns the patient's phone number
	}
	
	public String getEmailAddress() {
		return emailAddress; // Returns the patient's email address
	}
	
	public String getStreetName() {
		return streetName; // Returns the patient's street name
	}
	
	public String getCity() {
		return city; // Returns the patient's city
	}
	
	public String getState() { // Fixed the method name (was "getStete")
		return state; // Returns the patient's state
	}
	
	public String getCountry() {
		return country; // Returns the patient's country
	}
	
	public String getZipCode() {
		return zipCode; // Returns the patient's zip code
	}
	
	public String getEmergencyContactName() {
		return emergencyContactFullName; // Returns the emergency contact's full name
	}
	
	public String getEmergencyContactPhone() {
		return emergencyContactPhone; // Returns the emergency contact's phone number
	}
	
	// Setter methods for modifying private variables
	public void setFirstName(String firstName) {
		this.firstName = firstName; // Sets the patient's first name
	}
	
	public void setLastName(String lastname) {
		this.lastName = lastname; // Sets the patient's last name
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber; // Sets the patient's phone number
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress; // Sets the patient's email address
	}
	
	public void setStreetName(String streetName) {
		this.streetName = streetName; // Sets the patient's street name
	}
	
	public void setCity(String city) {
		this.city = city; // Sets the patient's city
	}
	
	public void setState(String state) {
		this.state = state; // Sets the patient's state
	}
	
	public void setCountry(String country) {
		this.country = country; // Sets the patient's country
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode; // Sets the patient's zip code
	}
	
	public void setEmergencyContactFullName(String emergencyContactFullName) {
		this.emergencyContactFullName = emergencyContactFullName; // Sets emergency contact's full name
	}
	
	public void setEmergencyContactPhone(String emergencyContactPhone) {
		this.emergencyContactPhone = emergencyContactPhone; // Sets emergency contact's phone number
	}
	
	// Method to build full name of the patient
	public String buildFullName() {
		return firstName + " " + lastName; // Returns concatenated first and last name
	}
	
	// Method to build full address of the patient
	public String fullAddress() {
		// Returns the complete address by concatenating address components
		return streetName + " " + city + " " + state + " " + country + " " + zipCode; 
	}
	
	// Method to build emergency contact information
	public String buildEmergencyContact() {
		// Returns the emergency contact's name and phone number
		return emergencyContactFullName + " " + emergencyContactPhone;
	}
	
	// Override toString method for custom string representation
	@Override 
	public String toString() {
		// Returns a formatted string with all the patient's information
		return "Patient Information: \n" + 
				"First Name: " + firstName + "\n" +
				"Last Name: " + lastName + "\n" + 
				"Phone Number: " + phoneNumber + "\n" + 
				"Email Address: " + emailAddress + "\n" +
				"Address: " + streetName + " " + city + " " + state + " " + country + " " + zipCode + "\n" +
				"Emergency Contact Full Name: " + emergencyContactFullName + "\n" + 
				"Emergency Contact Phone: " + emergencyContactPhone + "\n"; // Note: Corrected "Emergenct" to "Emergency"
	}
}
