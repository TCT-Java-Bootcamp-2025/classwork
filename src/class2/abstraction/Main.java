package class2.abstraction;

public class Main {

    public static void main(String[] args) {

        //TODO: Add a triangle class that implements Shape interface; Add also a calculatePerimeter() method


        Circle circle = new Circle(2);
        System.out.println("Area for circle with radius = 2: " + circle.calculateArea());

        Shape shape = new Circle(3);
        System.out.println("Area for circle with radius = 3: " + shape.calculateArea());

    }

}
