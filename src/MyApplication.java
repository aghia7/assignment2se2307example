import interfaces.Shape;
import models.Circle;
import models.Rectangle;
import models.Triangle;

import java.util.ArrayList;
import java.util.Collections;

public class MyApplication {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle("Paper", 4, 5));
        shapes.add(new Triangle("Pyramid", 3, 4, 5));
        shapes.add(new Circle("Round", 5));

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("area: " + shape.area());
            System.out.println("perimeter: " + shape.perimeter());
            System.out.println("+++++++++++++++++++++");
        }
    }
}
