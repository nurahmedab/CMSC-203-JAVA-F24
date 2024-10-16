/*Class: CMSC203 CRN 22824
 Program: Assignment 3
 Instructor: Ahmed Tarek
 Summary of Description: This java program (cryptomanager class) implements encryption and decryption methods using the Caesar and Bellaso ciphers. It ensures that input strings are within specified ASCII bounds before processing. The class includes functionalities to adjust encryption keys and extend them for use with the Bellaso cipher, allowing for secure string manipulation.
 Due Date: 10/15/2024 
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
Student’s Name: Nurahmed Multezem */




package application;

public class CryptoManager { // Class for cryptographic operations. // Your Name

    private static final int LOWER_BOUND_RANGE = 32; // Minimum ASCII value for allowable characters
    private static final int UPPER_BOUND_RANGE = 126; // Maximum ASCII value for allowable characters

    // Method to check if a string is within ASCII bounds
    public static boolean isStringInBounds(String plainText) { // Check if the input string is valid
        for (char c : plainText.toCharArray()) { // Loop through each character in the string
            if (c < LOWER_BOUND_RANGE || c > UPPER_BOUND_RANGE) { // to check if the character is out of bounds
                return false; // Return false if any character is out of bounds
            }
        }
        return true; // Return true if all characters are within the allowable range
    }

    // Method to encrypt a string using the Caesar Cipher
    public static String caesarEncryption(String plainText, int key) { // Encrypt the input string
        if (!isStringInBounds(plainText)) { // Check if the input string is in bounds
            return "The selected string is not in bounds, Try again."; // Return error message if out of bounds
        }
        StringBuilder encrypted = new StringBuilder(); // Create a StringBuilder for the encrypted text
        for (char c : plainText.toCharArray()) { // Loop through each character in the plaintext
            char encryptedChar = (char) ((c - 'A' + key) % 26 + 'A'); // Calculate the encrypted character
            encrypted.append(encryptedChar); // Append the encrypted character to the result
        }
        return encrypted.toString(); // Return the final encrypted string
    }

    // Method to decrypt a string using the Caesar Cipher
    public static String caesarDecryption(String encryptedText, int key) { // Decrypt the input string
        StringBuilder decrypted = new StringBuilder(); // Create a StringBuilder for the decrypted text
        for (char c : encryptedText.toCharArray()) { // Loop through each character in the encrypted text
            char decryptedChar = (char) ((c - 'A' - key + 26) % 26 + 'A'); // Calculate the decrypted character
            decrypted.append(decryptedChar); // Append the decrypted character to the result
        }
        return decrypted.toString(); // Return the final decrypted string
    }

    // Method to encrypt a string using the Bellaso Cipher
    public static String bellasoEncryption(String plainText, String bellasoStr) { // Encrypt the input string with Bellaso
        StringBuilder encrypted = new StringBuilder(); // Create a StringBuilder for the encrypted text
        for (int i = 0; i < plainText.length(); i++) { // Loop through each character of the plaintext
            char encryptedChar = (char) ((plainText.charAt(i) + bellasoStr.charAt(i % bellasoStr.length())) % 256); // Encrypt character using Bellaso
            encrypted.append(encryptedChar); // Append the encrypted character to the result
        }
        return encrypted.toString(); // Return the final encrypted string
    }

    // Method to decrypt a string using the Bellaso Cipher
    public static String bellasoDecryption(String encryptedText, String bellasoStr) { // Decrypt the input string with Bellaso
        StringBuilder decrypted = new StringBuilder(); // Create a StringBuilder for the decrypted text
        for (int i = 0; i < encryptedText.length(); i++) { // Loop through each character of the encrypted text
            char decryptedChar = (char) ((encryptedText.charAt(i) - bellasoStr.charAt(i % bellasoStr.length()) + 256) % 256); // Decrypt character using Bellaso
            decrypted.append(decryptedChar); // Append the decrypted character to the result
        }
        return decrypted.toString(); // Return the final decrypted string
    }
}

