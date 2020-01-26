// CIS-3515: Introduction to Mobile Application Development
// Assignment 0
// Jason Duong

package cis.pkg3515.assignment.pkg0;

public class Square extends Shape {
    private String name;
    private double length;
    private double height;
    
    public Square (String name) {
        super(name);
    }
    
    public void setDimensions(double length, double height) {
        this.length = length;
        this.height = height;
    }
    
    @Override
    public void printDimensions () {
        System.out.println("Length = " + length + ", Height = " + height);
    }
    
    @Override
    public double getArea () {
        return length * height;
    }
}
