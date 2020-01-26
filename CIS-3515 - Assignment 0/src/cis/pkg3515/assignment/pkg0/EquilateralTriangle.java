// CIS-3515: Introduction to Mobile Application Development
// Assignment 0
// Jason Duong

package cis.pkg3515.assignment.pkg0;

public class EquilateralTriangle extends Triangle {
    private String name;
    private double side;
    
    public EquilateralTriangle (String name) {
        super(name);
    }
    
    public void setDimensions (double side) {
        this.side = side;
    }
    
    @Override
    public void printDimensions () {
        System.out.println("Side = " + side);
    }
    
    @Override
    public double getArea () {
        return (Math.sqrt(3)/4) * (Math.pow(side, 2));
    }
}
