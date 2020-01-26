// CIS-3515: Introduction to Mobile Application Development
// Assignment 0
// Jason Duong

package cis.pkg3515.assignment.pkg0;

import java.util.*;

public class CIS3515Assignment0 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        // Square Object Testing
        System.out.println("Enter the name of a Square");
        String squareName = scn.nextLine();
        Square square = new Square(squareName);
        
        System.out.println("Enter the length of " + squareName);
        double length = scn.nextDouble();
        System.out.println("Enter the height of " + squareName);
        double height = scn.nextDouble();
        square.setDimensions(length, height);
        scn.nextLine(); // Used to consume the new line leftover from scn.nextDouble()
        
        System.out.println("Square Object's Name is " + square.getName());
        square.printDimensions();
        //System.out.println("Square Object's Area = " + square.getArea());
        String squareArea = String.format("%.2f", square.getArea());
        System.out.println("Square Object's Area = " + squareArea);
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        // Circle Object Testing
        System.out.println("Enter the name of a Circle");
        String circleName = scn.nextLine();
        Circle circle = new Circle(circleName);
        
        System.out.println("Enter the radius of " + circleName);
        double radius = scn.nextDouble();
        circle.setDimensions(radius);
        scn.nextLine(); // Used to consume the new line leftover from scn.nextDouble()
        
        System.out.println("Circle Object's Name is " + circle.getName());
        circle.printDimensions();
        String circleArea = String.format("%.2f", circle.getArea());
        System.out.println("Circle Object's Area = " + circleArea);
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        // Triangle Object Testing
        System.out.println("Enter the name of a Triangle");
        String triangleName = scn.nextLine();
        Triangle triangle = new Triangle(triangleName);
        
        System.out.println("Enter the length of the first side of " + triangleName);
        double side1 = scn.nextDouble();
        System.out.println("Enter the length of the second side of " + triangleName);
        double side2 = scn.nextDouble();
        System.out.println("Enter the length of the third side of " + triangleName);
        double side3 = scn.nextDouble();
        triangle.setDimensions(side1, side2, side3);
        scn.nextLine(); // Used to consume the new line leftover from scn.nextDouble()
        
        System.out.println("Triangle Object's Name is " + triangle.getName());
        triangle.printDimensions();
        String triangleArea = String.format("%.2f", triangle.getArea());
        System.out.println("Triangle Object's Area = " + triangleArea);
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        // Equilateral Triangle Object Testing
        System.out.println("Enter the name of an Equilateral Triangle");
        String eqTriangleName = scn.nextLine();
        EquilateralTriangle eqTriangle = new EquilateralTriangle(eqTriangleName);
        
        System.out.println("Enter the length of the side of " + eqTriangleName);
        double side = scn.nextDouble();
        eqTriangle.setDimensions(side);
        scn.nextLine(); // Used to consume the new line leftover from scn.nextDouble()
        
        System.out.println("Equilateral Triangle Object's Name is " + eqTriangle.getName());
        eqTriangle.printDimensions();
        String eqTriangleArea = String.format("%.2f", eqTriangle.getArea());
        System.out.println("Equilateral Triangle Object's Area = " + eqTriangleArea);
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
    }
    
}
