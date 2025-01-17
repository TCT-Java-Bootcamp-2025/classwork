package class2.abstraction;

public class Triangle implements Shape {

    private double baze;
    private double lartesi;

    public Triangle(double baze, double lartesi) {
        this.baze = baze;
        this.lartesi = lartesi;
    }

    @Override
    public double calculateArea() {
        return this.baze * this.lartesi /2;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }
}
