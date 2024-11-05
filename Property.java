package application;

//Property.java
public class Property {
 private String propertyName; // Name of the property
 private String city; // City where the property is located
 private double rentAmount; // Rent amount for the property
 private String owner; // Owner of the property
 private Plot plot; // Plot associated with the property

 // Default constructor
 public Property() {
     this.propertyName = "";
     this.city = "";
     this.rentAmount = 0.0;
     this.owner = "";
     this.plot = new Plot(); // Create a default Plot
 }

 // Constructor with property details
 public Property(String propertyName, String city, double rentAmount, String owner) {
     this.propertyName = propertyName;
     this.city = city;
     this.rentAmount = rentAmount;
     this.owner = owner;
     this.plot = new Plot(); // Create a default Plot
 }

 // Constructor with property details and plot details
 public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
     this.propertyName = propertyName;
     this.city = city;
     this.rentAmount = rentAmount;
     this.owner = owner;
     this.plot = new Plot(x, y, width, depth); // Create a Plot with specified values
 }

 // Copy constructor
 public Property(Property otherProperty) {
     this.propertyName = otherProperty.propertyName;
     this.city = otherProperty.city;
     this.rentAmount = otherProperty.rentAmount;
     this.owner = otherProperty.owner;
     this.plot = new Plot(otherProperty.plot); // Copy the Plot
 }

 // Gets the property name
 public String getPropertyName() {
     return propertyName;
 }

 // Gets the city
 public String getCity() {
     return city;
 }

 // Gets the rent amount
 public double getRentAmount() {
     return rentAmount;
 }

 // Gets the owner
 public String getOwner() {
     return owner;
 }

 // Gets the associated plot
 public Plot getPlot() {
     return plot;
 }

 // String representation of the property
 @Override
 public String toString() {
     return propertyName + "," + city + "," + owner + "," + rentAmount; // propertyName,city,owner,rentAmount
 }
}
