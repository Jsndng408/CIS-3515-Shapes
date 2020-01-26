// CIS-3515: Introduction to Mobile Application Development
// Assignment 0
// Jason Duong

package cis.pkg3515.assignment.pkg0;

public class CIS3515Assignment0 {
    public static void main(String[] args) {
        // Square Object Testing
        Square square = new Square("Block");
        square.setDimensions(10, 12);
        System.out.println("Square Object's Name is " + square.getName());
        square.printDimensions();
        String squareArea = String.format("%.2f", square.getArea());
        System.out.println("Square Object's Area = " + squareArea);
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        // Circle Object Testing
        Circle circle = new Circle("Round");
        circle.setDimensions(3);
        System.out.println("Circle Object's Name is " + circle.getName());
        circle.printDimensions();
        String circleArea = String.format("%.2f", circle.getArea());
        System.out.println("Circle Object's Area = " + circleArea);
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        // Triangle Object Testing
        Triangle triangle = new Triangle("Pointy");
        triangle.setDimensions(3, 4, 5);
        System.out.println("Triangle Object's Name is " + triangle.getName());
        triangle.printDimensions();
        String triangleArea = String.format("%.2f", triangle.getArea());
        System.out.println("Triangle Object's Area = " + triangleArea);
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        // Equilateral Triangle Object Testing
        EquilateralTriangle eqTriangle = new EquilateralTriangle("Equally Pointy");
        eqTriangle.setDimensions(4);
        System.out.println("Equilateral Triangle Object's Name is " + eqTriangle.getName());
        eqTriangle.printDimensions();
        String eqTriangleArea = String.format("%.2f", eqTriangle.getArea());
        System.out.println("Equilateral Triangle Object's Area = " + eqTriangleArea);
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
    }
    
}
