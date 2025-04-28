package features;

interface Shape {
    void draw();
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle class : draw() method");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square class: draw() method");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle class: draw() method");
    }
}

public class LambdaExample {

    public static void main(String[] args) {
        String str = "hello";

        // Using Lambda Expression
        Shape rectangle = () -> {
            System.out.println("Rectangle class : draw() method (from lambda)");
        };

        Shape square = () -> {
            System.out.println("Square class: draw() method (from lambda)");
        };

        Shape circle = () -> {
            System.out.println("Circle class: draw() method (from lambda)");
        };

        // Calling draw methods
        rectangle.draw();
        square.draw();
        circle.draw();
    }
}
