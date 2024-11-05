package application;
/*
 * Class: CMSC203- 22824
 * Instructor: Ahmed Tarek
 * Description: (Give a brief description for each Class)
 * Due: 10/29/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently. I have not   
    copied the code from a student or any source. I have not given my code to any student.
 * Print your Name here: Nurahmed Multezem
*/


//Plot.java
public class Plot {
 private int x; // x-coordinate of the plot
 private int y; // y-coordinate of the plot
 private int width; // width of the plot
 private int depth; // depth of the plot

 // Default constructor
 public Plot() {
     this(0, 0, 1, 1); // Creates a default plot with width and depth of 1
 }

 // Constructor with parameters
 public Plot(int x, int y, int width, int depth) {
     this.x = x;
     this.y = y;
     this.width = width;
     this.depth = depth;
 }

 // Copy constructor
 public Plot(Plot otherPlot) {
     this(otherPlot.x, otherPlot.y, otherPlot.width, otherPlot.depth); // Calls the parameterized constructor
 }

 // Checks if this plot encompasses the given plot
 public boolean encompasses(Plot plot) {
     return (plot.x >= this.x && plot.y >= this.y && 
             (plot.x + plot.width) <= (this.x + this.width) && 
             (plot.y + plot.depth) <= (this.y + this.depth));
 }

 // Gets the depth
 public int getDepth() {
     return depth;
 }

 // Gets the width
 public int getWidth() {
     return width;
 }

 // Gets the x-coordinate
 public int getX() {
     return x;
 }

 // Gets the y-coordinate
 public int getY() {
     return y;
 }

 // Checks if this plot overlaps with the given plot
 public boolean overlaps(Plot plot) {
     return !(plot.x >= this.x + this.width || 
              plot.x + plot.width <= this.x || 
              plot.y >= this.y + this.depth || 
              plot.y + plot.depth <= this.y);
 }

 // Sets the depth
 public void setDepth(int depth) {
     this.depth = depth;
 }

 // Sets the width
 public void setWidth(int width) {
     this.width = width;
 }

 // Sets the x-coordinate
 public void setX(int x) {
     this.x = x;
 }

 // Sets the y-coordinate
 public void setY(int y) {
     this.y = y;
 }

 // String representation of the plot
 @Override
 public String toString() {
     return x + "," + y + "," + width + "," + depth; // x,y,width,depth
 }
}
