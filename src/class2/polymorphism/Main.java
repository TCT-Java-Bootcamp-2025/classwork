package class2.polymorphism;

public class Main {

    public static void main(String[] args) {

        //TODO: Create a cat class
        // Create an array of Animal objects containing Dog and Cat objects,
        // and call speak() on each.

        Animal animal2 = new Dog();
        animal2.speak();

        Dog dog = new Dog();
        dog.speak();
    }
}
