import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

abstract class Shape implements Serializable {
    private static final long serialVersionUID = 1L;
    private String color;
    
    public Shape(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
    
    public abstract double calculateArea();
    
    public abstract double calculatePerimeter();
    
    public void print() {
        System.out.println("Color: " + color);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

class Triangle extends Shape {
    private static final long serialVersionUID = 2L;
    private double base;
    private double height;
    
    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }
    
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
    
    @Override
    public double calculatePerimeter() {
        return base + height + Math.sqrt(base * base + height * height);
    }
}

class Rectangle extends Shape{
    private static final long serialVersionUID = 3L;
    private double length;
    private double width;
    
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double calculateArea() {
        return length * width;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Circle extends Shape {
    private static final long serialVersionUID = 4L;
    private double radius;
    public static final double PI = 3.14159;
    
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
}

class Square extends Shape{
    private static final long serialVersionUID = 5L;
    private double side;
    public static final String NAME = "Square";
    
    public Square(String color, double side) {
        super(color);
        this.side = side;
    }
    
    @Override
    public double calculateArea() {
        return side * side;
    }
    
    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}

public class Exercise3b {
    
    public static void main(String[] args) {
        Triangle triangle = new Triangle("Red", 10, 5);
        Rectangle rectangle = new Rectangle("Green", 6, 8);
        Circle circle = new Circle("Blue", 4);
        Square square = new Square("Yellow", 7);
        
        // polymorphism
        Shape[] shapes = {triangle, rectangle, circle, square};
        
        for (Shape shape : shapes) {
            shape.print();
            System.out.println();
        }
        
        // serialization and deserialization
        ObjectOutputStream out = null;
        FileOutputStream fileOut = null;
        try {
            fileOut = new FileOutputStream("shapes.ser");
            out = new ObjectOutputStream(fileOut);
            out.writeObject(triangle);
            out.writeObject(rectangle);
            out.writeObject(circle);
            out.writeObject(square);
        } catch (IOException e) {
            // handle exception
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                // handle exception
            }
            try {
                if (fileOut != null) {
                    fileOut.close();
                }
            } catch (IOException e) {
                // handle exception
            }
        }
    }
}
