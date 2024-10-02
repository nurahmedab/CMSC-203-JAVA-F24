package nMultezem_Assignment2;

public class PatientDriverApp { // Define the main class for the application

    public static void main(String[] args) { // Main method, entry point of the program
        // Create an instance of Patient with sample data
        Patient patient1 = new Patient("Adrian", "Marcus"); // Instantiate a new Patient object with first and last name
        patient1.setPhoneNumber("123-456-7890"); // Set the patient's phone number
        patient1.setEmailAddress("adrian.marcus@gmail.com"); // Set the patient's email address
        patient1.setStreetName("123 Elm St"); // Set the patient's street address
        patient1.setCity("Anytown"); // Set the patient's city
        patient1.setState("CA"); // Set the patient's state
        patient1.setCountry("USA"); // Set the patient's country
        patient1.setZipCode("12345"); // Set the patient's zip code
        patient1.setEmergencyContactFullName("Jane Doe"); // Set the emergency contact's full name
        patient1.setEmergencyContactPhone("098-765-4321"); // Set the emergency contact's phone number

        // Create instances of Procedure
        Procedure procedure1a = new Procedure("X-Ray", "2024-10-01", "Dr. Smith", 150); // Create a procedure object for X-Ray
        Procedure procedure1b = new Procedure("Blood Test", "2024-10-02", "Dr. Jones", 100); // Create a procedure object for Blood Test
        Procedure procedure1c = new Procedure("MRI", "2024-10-03", "Dr. Brown", 500); // Create a procedure object for MRI

        // Display patient information
        displayPatient(patient1); // Call method to display the patient's information

        // Display procedures (each already formatted with a tab in toString)
        System.out.println(procedure1a); // Print the first procedure
        System.out.println(procedure1b); // Print the second procedure
        System.out.println(procedure1c); // Print the third procedure

        // Calculate and display total charges
        double totalCharges = calculateTotalCharges(procedure1a, procedure1b, procedure1c); // Calculate total charges for the procedures
        System.out.printf("Total Charges: $%.2f\n", totalCharges); // Print total charges formatted to two decimal places
        System.out.println(); // Print a blank line for better readability

        //////////////////////////////////////////////////

        // Create a second patient instance with sample data
        Patient patient2 = new Patient("Alice", "Smith"); // Instantiate a new Patient object with first and last name
        patient2.setPhoneNumber("555-1234"); // Set the second patient's phone number
        patient2.setEmailAddress("alice.smith@example.com"); // Set the second patient's email address
        patient2.setStreetName("456 Maple Ave"); // Set the second patient's street address
        patient2.setCity("Springfield"); // Set the second patient's city
        patient2.setState("IL"); // Set the second patient's state
        patient2.setCountry("USA"); // Set the second patient's country
        patient2.setZipCode("62701"); // Set the second patient's zip code
        patient2.setEmergencyContactFullName("Bob Smith"); // Set the second patient's emergency contact full name
        patient2.setEmergencyContactPhone("555-5678"); // Set the second patient's emergency contact phone number

        // Create procedures for the second patient
        Procedure procedure2a = new Procedure("Physical Exam", "2024-10-01", "Dr. White", 200); // Create a procedure for a physical exam
        Procedure procedure2b = new Procedure("X-Ray", "2024-10-05", "Dr. Green", 150); // Create a procedure for an X-Ray
        Procedure procedure2c = new Procedure("Blood Test", "2024-10-10", "Dr. Black", 100); // Create a procedure for a blood test

        displayPatient(patient2); // Call method to display the second patient's information
        
        // Print the procedures for the second patient
        System.out.println(procedure2a); // Print the first procedure
        System.out.println(procedure2b); // Print the second procedure
        System.out.println(procedure2c); // Print the third procedure
        
        // Calculate and display total charges for the second patient
        double totalCharges2 = calculateTotalCharges(procedure2a, procedure2b, procedure2c); // Calculate total charges
        System.out.printf("Total Charges: $%.2f\n", totalCharges2); // Print total charges formatted to two decimal places
        System.out.println(); // Print a blank line for better readability

        //////////////////////////////////////////////////////////

        // Create a third patient instance with sample data
        Patient patient3 = new Patient("John", "Doe"); // Instantiate a new Patient object with first and last name
        patient3.setPhoneNumber("123-456-7890"); // Set the third patient's phone number
        patient3.setEmailAddress("john.doe@example.com"); // Set the third patient's email address
        patient3.setEmergencyContactFullName("Jane Doe"); // Set the third patient's emergency contact full name
        patient3.setEmergencyContactPhone("098-765-4321"); // Set the third patient's emergency contact phone number

        // Create procedures for the third patient
        Procedure procedure3a = new Procedure("X-Ray", "2024-10-01", "Dr. Smith", 150); // Create a procedure for an X-Ray
        Procedure procedure3b = new Procedure("Blood Test", "2024-10-02", "Dr. Jones", 100); // Create a procedure for a blood test
        Procedure procedure3c = new Procedure(); // Create a procedure object with default values

        System.out.println(); // Print a blank line for better readability
        displayPatient(patient3); // Call method to display the third patient's information
        // Print the procedures for the third patient
        System.out.println(procedure3a); // Print the first procedure
        System.out.println(procedure3b); // Print the second procedure
        System.out.println(procedure3c); // Print the third procedure
        // Calculate and display total charges for the third patient
        double totalCharges3 = calculateTotalCharges(procedure3a, procedure3b, procedure3c); // Calculate total charges
        System.out.printf("Total Charges: $%.2f\n", totalCharges3); // Print total charges formatted to two decimal places
        System.out.println(); // Print a blank line for better readability
        
        // For clarity
        System.out.println(); // Print a blank line for separation
        // Print out the details of the programmer
        System.out.println("Student: Nurahmed Multezem"); // Print student's name
        System.out.println("MC#: 21163498"); // Print student MC number
        System.out.println("Due Date: 10/01/2024"); // Print due date
    }

    // Method to display patient's information
    public static void displayPatient(Patient patient) { // Method definition for displaying patient information
        System.out.println(patient); // Print the patient object, which should call the toString method
    }

    // Method to calculate total charges of three procedures
    public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) { // Method definition for calculating total charges
        return p1.getChargesOfProceduer() + p2.getChargesOfProceduer() + p3.getChargesOfProceduer(); // Return sum of charges for the three procedures
    }
}
