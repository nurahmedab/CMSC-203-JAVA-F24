package application;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ManagementCompanyTestStudent {
    private ManagementCompany company;

    @BeforeEach
    public void setUp() {
        company = new ManagementCompany("Dream Realty", "123456789", 10.0);
    }

    @Test
    public void testAddProperty() {
        int result = company.addProperty("Beach House", "Coastal City", 1500.00, "Bob");
        assertNotEquals(-1, result, "Property should be added successfully");
        assertEquals(1, company.getPropertiesCount(), "Company should have 1 property");

        // Adding a property that overlaps (for further testing, we assume you have set the plot properly)
        company.addProperty("Mountain Retreat", "Hilltop City", 2000.00, "Charlie", 1, 1, 3, 3);
        result = company.addProperty("Another House", "Hill Valley", 1800.00, "Doc", 0, 0, 5, 5); // Assuming this overlaps
        assertEquals(-4, result, "Adding overlapping property should return -4");
    }

    @Test
    public void testGetHighestRentProperty() {
        company.addProperty("Luxury Villa", "Metropolis", 3000.00, "Clark");
        company.addProperty("Studio Apartment", "Gotham", 1200.00, "Bruce");

        Property highestRentProperty = company.getHighestRentPropperty();
        assertEquals("Luxury Villa", highestRentProperty.getPropertyName(), "Highest rent property should be 'Luxury Villa'");
    }

    @Test
    public void testTotalRent() {
        company.addProperty("Shop", "Downtown", 2500.00, "Jack");
        company.addProperty("Warehouse", "Industrial Area", 3500.00, "Jill");

        double totalRent = company.getTotalRent();
        assertEquals(6000.00, totalRent, "Total rent should be 6000.00");
    }

    @Test
    public void testIsManagementFeeValid() {
        assertTrue(company.isMangementFeeValid(), "Management fee should be valid");
        ManagementCompany invalidFeeCompany = new ManagementCompany("Invalid Realty", "987654321", 150.0);
        assertFalse(invalidFeeCompany.isMangementFeeValid(), "Management fee should not be valid");
    }

    @Test
    public void testRemoveLastProperty() {
        company.addProperty("First House", "Suburbia", 1300.00, "Sam");
        company.removeLastProperty();
        assertEquals(0, company.getPropertiesCount(), "Company should have 0 properties after removing last property");
    }

    @Test
    public void testToString() {
        company.addProperty("City Center Flat", "City", 1800.00, "John");
        assertTrue(company.toString().contains("Dream Realty"), "toString should contain company name");
        assertTrue(company.toString().contains("City Center Flat"), "toString should contain property name");
    }
}
