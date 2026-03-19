import java.util.*;

class ShapeCalculator {

    void area(int side) {
        int square = side * side;
        System.out.println("Area of Square: " + square);
    }

    void area(int length, int width) {
        int rectangle = length * width;
        System.out.println("Area of Rectangle: " + rectangle);
    }

    void area(double radius) {
        double circle = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + circle);
    }
}

class ShapeCalculator1 {
    public static void main(String[] args) {

        ShapeCalculator sc = new ShapeCalculator();

        sc.area(5);
        sc.area(10, 4);
        sc.area(3.5);
    }
}