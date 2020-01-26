// CIS-3515: Introduction to Mobile Application Development
// Assignment 0
// Jason Duong

package cis.pkg3515.assignment.pkg0;

public class Circle extends Shape {
    private String name;
    private double radius;
    
    public Circle (String name) {
        super(name);
    }
    
    public void setDimensions(double radius) {
        this.radius = radius;
    }
    
    @Override
    public void printDimensions () {
        System.out.println("Radius = " + radius);
    }
    
    @Override
    public double getArea () {
        return Math.PI * Math.pow(radius, 2);
    }
}
