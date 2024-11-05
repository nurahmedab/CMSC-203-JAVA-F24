package application;

//ManagementCompany.java
public class ManagementCompany {
 // Constants for maximum properties and default plot dimensions
 public static final int MAX_PROPERTY = 5; // Maximum number of properties
 public static final int MGMT_WIDTH = 100; // Default plot width
 public static final int MGMT_DEPTH = 100; // Default plot depth

 private String name; // Management company name
 private String taxID; // Tax ID of the management company
 private double mgmFee; // Management fee percentage
 private Plot plot; // Plot managed by the company
 private Property[] properties; // Array of properties managed by the company
 private int propertiesCount; // Current count of properties in the array

 // Default constructor
 public ManagementCompany() {
     this.name = "";
     this.taxID = "";
     this.mgmFee = 0.0;
     this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH); // Default plot
     this.properties = new Property[MAX_PROPERTY]; // Initialize properties array
     this.propertiesCount = 0; // No properties initially
 }

 // Constructor with name, tax ID, and management fee
 public ManagementCompany(String name, String taxID, double mgmFee) {
     this.name = name;
     this.taxID = taxID;
     this.mgmFee = mgmFee;
     this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH); // Default plot
     this.properties = new Property[MAX_PROPERTY]; // Initialize properties array
     this.propertiesCount = 0; // No properties initially
 }

 // Constructor with all parameters
 public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth) {
     this.name = name;
     this.taxID = taxID;
     this.mgmFee = mgmFee;
     this.plot = new Plot(x, y, width, depth); // Create plot with specified dimensions
     this.properties = new Property[MAX_PROPERTY]; // Initialize properties array
     this.propertiesCount = 0; // No properties initially
 }

 // Copy constructor
 public ManagementCompany(ManagementCompany otherCompany) {
     this.name = otherCompany.name;
     this.taxID = otherCompany.taxID;
     this.mgmFee = otherCompany.mgmFee;
     this.plot = new Plot(otherCompany.plot); // Copy the plot
     this.properties = new Property[MAX_PROPERTY]; // Initialize properties array
     this.propertiesCount = otherCompany.propertiesCount; // Copy property count

     // Copy each property
     for (int i = 0; i < propertiesCount; i++) {
         this.properties[i] = new Property(otherCompany.properties[i]);
     }
 }

 // Method to add a property by name, city, rent, and owner
 public int addProperty(String name, String city, double rent, String owner) {
     return addProperty(name, city, rent, owner, 0, 0, 1, 1); // Default plot size
 }

 // Method to add a property with specific plot dimensions
 public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
     if (isPropertiesFull()) return -1; // Check if the array is full

     Property newProperty = new Property(name, city, rent, owner, x, y, width, depth);
     if (newProperty == null) return -2; // Check for null property
     if (!plot.encompasses(newProperty.getPlot())) return -3; // Check if plot is within bounds

     // Check for overlaps with existing properties
     for (int i = 0; i < propertiesCount; i++) {
         if (properties[i] != null && properties[i].getPlot().overlaps(newProperty.getPlot())) {
             return -4; // Overlap found
         }
     }

     // Add the property
     properties[propertiesCount++] = newProperty;
     return propertiesCount - 1; // Return the index where added
 }

 // Method to add a property from a Property object
 public int addProperty(Property property) {
     if (property == null) return -2; // Check for null property
     if (!plot.encompasses(property.getPlot())) return -3; // Check if plot is within bounds

     // Check for overlaps with existing properties
     for (int i = 0; i < propertiesCount; i++) {
         if (properties[i] != null && properties[i].getPlot().overlaps(property.getPlot())) {
             return -4; // Overlap found
         }
     }

     if (isPropertiesFull()) return -1; // Check if the array is full
     properties[propertiesCount++] = new Property(property); // Copy and add property
     return propertiesCount - 1; // Return the index where added
 }

 // Removes the last property in the properties array
 public void removeLastProperty() {
     if (propertiesCount > 0) {
         properties[--propertiesCount] = null; // Nullify the last property
     }
 }

 // Checks if properties array is full
 public boolean isPropertiesFull() {
     return propertiesCount >= MAX_PROPERTY; // True if full
 }

 // Gets the total rent of the properties
 public double getTotalRent() {
     double totalRent = 0.0;
     for (int i = 0; i < propertiesCount; i++) {
         if (properties[i] != null) {
             totalRent += properties[i].getRentAmount(); // Sum rent amounts
         }
     }
     return totalRent;
 }

 // Gets the property with the highest rent
 public Property getHighestRentPropperty() {
     Property highestRentProperty = null;
     for (int i = 0; i < propertiesCount; i++) {
         if (properties[i] != null) {
             if (highestRentProperty == null || properties[i].getRentAmount() > highestRentProperty.getRentAmount()) {
                 highestRentProperty = properties[i]; // Update highest rent property
             }
         }
     }
     return highestRentProperty; // Return the highest rent property
 }

 // Gets the management fee percentage
 public double getMgmFeePer() {
     return mgmFee; // Return management fee
 }

 // Gets the name of the management company
 public String getName() {
     return name; // Return company name
 }

 // Gets the tax ID of the management company
 public String getTaxID() {
     return taxID; // Return tax ID
 }

 // Gets the properties array
 public Property[] getProperties() {
     return properties; // Return properties array
 }

 // Gets the count of existing properties
 public int getPropertiesCount() {
     return propertiesCount; // Return properties count
 }

 // Checks if the management fee is valid (0-100)
 public boolean isMangementFeeValid() {
     return mgmFee >= 0 && mgmFee <= 100; // Validity check
 }

 // Gets the plot managed by the company
 public Plot getPlot() {
     return plot; // Return plot
 }

 // String representation of the management company
 @Override
 public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("Management Company: ").append(name)
       .append("\nTax ID: ").append(taxID)
       .append("\nManagement Fee: ").append(mgmFee)
       .append("\nProperties:\n");

     for (int i = 0; i < propertiesCount; i++) {
         if (properties[i] != null) {
             sb.append(properties[i].toString()).append("\n"); // Append property details
         }
     }

     return sb.toString(); // Return complete string
 }
}
