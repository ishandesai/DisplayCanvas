# Java Shape Factory and Canvas

## Project Overview

This Java project demonstrates the use of object-oriented programming (OOP) concepts through a shape factory and canvas application. It includes several classes representing geometric shapes - Circle, Oval, Rectangle, and Square - along with a canvas class that contains these shapes. The application generates a set of random, non-duplicate shapes and displays them on the canvas.

## Key Concepts Demonstrated

- **Inheritance and Abstraction:** Shapes like Circle and Square inherit properties from their respective parent classes.
- **Composition:** The Canvas class contains a collection of shapes.
- **Unique Identification:** Each shape is assigned a unique identifier.

## Classes

- `CShape`: An abstract base class for all shapes.
- `COval`: Represents an oval shape.
- `CCircle`: Inherits from `COval`, representing a circle.
- `CRectangle`: Represents a rectangle.
- `CSquare`: Inherits from `CRectangle`, representing a square.
- `CCanvas`: Holds a collection of shapes.

## How to Run

1. Clone this repository to your local machine.
2. Compile the Java files. You can use a command like `javac *.java` in the terminal (assuming you have the Java Development Kit installed).
3. Run the `Main` class using the command `java Main`.

## Output

The program will output a list of 10 random shapes with their dimensions, displayed on the canvas. Each shape will have a unique ID and description.

