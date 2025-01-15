package class1.abstraction;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println("Area for circle with radius = 2: " + circle.calculateArea());

        Shape shape = new Circle(3);
        System.out.println("Area for circle with radius = 3: " + shape.calculateArea());

//        Circle circle2 = new Shape();
//        System.out.println(circle2.calculateArea());
    }

}
