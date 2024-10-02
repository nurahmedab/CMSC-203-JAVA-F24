package nMultezem_Assignment2;
/*
 * Class: CMSC203 
 * Instructor:Ahmed Tarek
 * Description: (Give a brief description for each Class)
 * Due: 10/01/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here:Nurahmed Multezem
*/




public class Procedure { // Declaration of the Procedure class

    // Private member variables to store procedure information
	private String nameOfProcedure; // Name of the procedure
	private String dateOfProcedure; // Date when the procedure is performed
	private String fullNameOfPractitioner; // Full name of the practitioner performing the procedure
	private Integer chargesOfProcedure; // Charges associated with the procedure
	
	// No-argument constructor initializes attributes to default values
	public Procedure() {
		this.nameOfProcedure = "Unknown"; // Default name of procedure
		this.dateOfProcedure = "Unknown"; // Default date of procedure
		this.fullNameOfPractitioner = "Unknown"; // Default practitioner's name
		this.chargesOfProcedure = 0; // Default charges set to zero
	}
	
	// Parameterized constructor to initialize all attributes
	public Procedure(String nameOfProcedure, String dateOfProcedure, String fullNameOfPractitioner, Integer chargesOfProcedure) {
		this.nameOfProcedure = nameOfProcedure; // Assigns provided name of procedure
		this.dateOfProcedure = dateOfProcedure; // Assigns provided date of procedure
		this.fullNameOfPractitioner = fullNameOfPractitioner; // Assigns provided practitioner's name
		this.chargesOfProcedure = chargesOfProcedure; // Assigns provided charges for the procedure
	}
	
	// Getter methods for accessing private variables
	public String getNameOfProcedure() {
		return nameOfProcedure; // Returns the name of the procedure
	}
	
	public String getDateofProcedure() {
		return dateOfProcedure; // Returns the date of the procedure
	}
	
	public String getFullNameOfPractitioner() {
		return fullNameOfPractitioner; // Returns the full name of the practitioner
	}
	
	public Integer getChargesOfProceduer() {
		return chargesOfProcedure; // Returns the charges of the procedure
	}
	
	// Mutator (Setter) methods for modifying private variables
	public void setNameofProcedure(String nameOfProcedure) {
		this.nameOfProcedure = nameOfProcedure; // Sets the name of the procedure
	}
	
	public void setDateofProceduer(String dateOfProcedure) {
		this.dateOfProcedure = dateOfProcedure; // Sets the date of the procedure
	}
	
	public void setFullNameOFPractitioner(String fullNameOfPractitioner) {
		this.fullNameOfPractitioner = fullNameOfPractitioner; // Sets the practitioner's full name
	}
	
	public void setCharegesOfProcedure(Integer chargesOfProcedure) {
		this.chargesOfProcedure = chargesOfProcedure; // Sets the charges for the procedure
	}
	
	// Method to return a string representation of the procedure
	public String toString() {
		return "\tName of Procedure: " + this.nameOfProcedure + "\n" +
			   "\tDate of Procedure: " + this.dateOfProcedure + "\n" +
			   "\tFull Name Of Practitioner: " + this.fullNameOfPractitioner + "\n" +
			   "\tCharges of Procedure: $" + this.chargesOfProcedure + "\n"; // Formats the output
	}
}
