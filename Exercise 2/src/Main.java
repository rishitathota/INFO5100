public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Triangle("green", 3, 4, 5, 4, 3);
        shapes[1] = new Rectangle("red", 5, 6);
        shapes[2] = new Circle("blue", 4);
        shapes[3] = new Square("yellow", 4);

        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.getClass().getSimpleName());
            System.out.println("Color: " + shape.getColor());
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println();
        }
    }
}
