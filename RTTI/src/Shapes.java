import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by riven_chris on 15/6/12.
 */
abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    public abstract String toString();
}

class Circle extends Shape {

    @Override
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    @Override
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    @Override
    public String toString() {
        return "Triangle";
    }
}

class Rhomboid extends Shape {
    @Override
    public String toString() {
        return "Rhomboid";
    }
}

public class Shapes {

    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle());
        for (Shape shape : shapeList) {
            shape.draw();
            System.out.println(shape.getClass().getSimpleName());
        }

        Shape shape = new Rhomboid();
        System.out.println(shape.getClass().getSimpleName());//output: Rhomboid
        shape.draw();

//        if (shape instanceof Rhomboid) {
//            Rhomboid rhomboid = (Rhomboid) shape;
//            rhomboid.draw();
//        }
//
//        if (shape instanceof Circle) {
//            Circle circle = (Circle) shape;
//            circle.draw();
//        }

    }
}
