package application;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PropertyTestStudent {
    private Property property;

    @BeforeEach
    public void setUp() {
        property = new Property("Dream House", "Wonderland", 1200.00, "Alice");
    }

    @Test
    public void testGetters() {
        assertEquals("Dream House", property.getPropertyName(), "Property name should be 'Dream House'");
        assertEquals("Wonderland", property.getCity(), "Property city should be 'Wonderland'");
        assertEquals(1200.00, property.getRentAmount(), "Property rent amount should be 1200.00");
        assertEquals("Alice", property.getOwner(), "Property owner should be 'Alice'");
    }

    @Test
    public void testConstructor() {
        Property defaultProperty = new Property();
        assertEquals("", defaultProperty.getPropertyName(), "Default property name should be empty");
        assertEquals("", defaultProperty.getCity(), "Default property city should be empty");
        assertEquals(0.0, defaultProperty.getRentAmount(), "Default property rent amount should be 0.0");
        assertEquals("", defaultProperty.getOwner(), "Default property owner should be empty");
    }

    @Test
    public void testCopyConstructor() {
        Property copyProperty = new Property(property);
        assertEquals(property.getPropertyName(), copyProperty.getPropertyName(), "Copy property name should match original");
        assertEquals(property.getCity(), copyProperty.getCity(), "Copy property city should match original");
        assertEquals(property.getRentAmount(), copyProperty.getRentAmount(), "Copy property rent amount should match original");
        assertEquals(property.getOwner(), copyProperty.getOwner(), "Copy property owner should match original");
    }

    @Test
    public void testToString() {
        assertEquals("Dream House,Wonderland,Alice,1200.00", property.toString(), "String representation of property is incorrect");
    }
}
