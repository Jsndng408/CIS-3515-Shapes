// CIS-3515: Introduction to Mobile Application Development
// Assignment 0
// Jason Duong

package cis.pkg3515.assignment.pkg0;

// No instances of Shape should be made

abstract public class Shape {
    private String name;
    
    public Shape (String name) {
        this.name = name;
    }
    
    /** returns the name of the shape */
    public String getName() {
        return name;
    }
    
    /* returns the area of the shape */
    public double getArea() {
        return 0.0;
    }
    
    public void printDimensions() {
        System.out.println("No dimensions");
    }
}
