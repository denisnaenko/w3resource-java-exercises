package geometry;

import geometry.shapes.Circle;
import geometry.shapes.Rectangle;
import geometry.shapes.Shape;
import geometry.shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Shape shape;

        shape = new Rectangle(10, 20);
        System.out.println(shape.getArea());

        shape = new Circle(2.42);
        System.out.println(shape.getArea());

        shape = new Triangle(20.1, 57.4);
        System.out.println(shape.getArea());
    }
}
