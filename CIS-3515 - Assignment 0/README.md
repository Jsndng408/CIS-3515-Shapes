### Assignment 0 - Shapes and Inheritance
CIS-3515
By: Jason Duong

This program is an implementation of Shape Objects, such as the Square, the Circle, the Triangle, and the Equilateral Triangle.

About Shapes:
* Each Shape created has a name associated with it, as well as its dimensions.
* Square, Circle, Triangle are all subclasses of Shape, while Equilaterial Triangle is, surprisingly enough, a subclass of Equilateral Triangle.
* To set the dimensions for the shape, the setDimensions() method is called, which takes in different arguments depending on the Shape.
  * Square: _Length_ and _Height_ (both are doubles)
  * Circle: _Radius_ (a double)
  * Triangle: 3 _Sides_ (all are doubles)
  * Equilateral Triangle: 1 _Side_ (a double)
* A printDimension() method that prints out the inputted dimensions for the Shape (which overrides the printDimension() method in Shape)
* 
