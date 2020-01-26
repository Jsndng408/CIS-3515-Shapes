// CIS-3515: Introduction to Mobile Application Development
// Assignment 0
// Jason Duong

package cis.pkg3515.assignment.pkg0;

public class Triangle extends Shape {
    private String name;
    private double side1;
    private double side2;
    private double side3;
    
    public Triangle (String name) {
        super(name);
    }
    
    public void setDimensions (double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    @Override
    public void printDimensions () {
        System.out.println("Side 1 = " + side1 + ", Side 2 = " + side2 + ", Side 3 = " + side3);
    }
    
    @Override
    public double getArea () {
        // Heron's Formula
        double s = (side1+side2+side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
