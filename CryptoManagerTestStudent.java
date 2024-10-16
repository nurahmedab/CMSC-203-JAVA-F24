package application;

import org.junit.jupiter.api.Test; // Importing JUnit 5 Test annotation
import static org.junit.jupiter.api.Assertions.*; // Importing assertion methods

public class CryptoManagerTestStudent { // Test class for CryptoManager

    @Test // Annotation to indicate a test method
    public void testIsStringInBounds() { // Test for isStringInBounds method
        assertTrue(CryptoManager.isStringInBounds("Valid String 123!")); // Valid characters
        assertFalse(CryptoManager.isStringInBounds("Invalid String \uFFFF")); // Invalid character (out of bounds)
        assertFalse(CryptoManager.isStringInBounds("")); // Empty string should return true
        assertTrue(CryptoManager.isStringInBounds("1234567890")); // Only numbers are valid
    }

    @Test // Annotation to indicate a test method
    public void testCaesarEncryption() { // Test for caesarEncryption method
        assertEquals("KHOOR", CryptoManager.caesarEncryption("HELLO", 3)); // Standard case
        assertEquals("R", CryptoManager.caesarEncryption("O", 3)); // Single character
        assertEquals("The selected string is not in bounds, Try again.", CryptoManager.caesarEncryption("Hello!", 3)); // Out of bounds
    }

    @Test // Annotation to indicate a test method
    public void testCaesarDecryption() { // Test for caesarDecryption method
        assertEquals("HELLO", CryptoManager.caesarDecryption("KHOOR", 3)); // Standard case
        assertEquals("O", CryptoManager.caesarDecryption("R", 3)); // Single character
    }

    @Test // Annotation to indicate a test method
    public void testEncryptBellaso() { // Test for encryptBellaso method
        assertEquals("ÍÏÈÊ×", CryptoManager.bellasoEncryption("HELLO", "WORLD")); // Standard case
        assertEquals("Á", CryptoManager.bellasoEncryption("A", "B")); // Single character encryption
    }

    @Test // Annotation to indicate a test method
    public void testDecryptBellaso() { // Test for decryptBellaso method
        assertEquals("HELLO", CryptoManager.bellasoDecryption("ÍÏÈÊ×", "WORLD")); // Standard case
        assertEquals("A", CryptoManager.bellasoDecryption("Á", "B")); // Single character decryption
    }
}
