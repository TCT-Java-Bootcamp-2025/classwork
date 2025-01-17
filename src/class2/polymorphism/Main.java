package class2.polymorphism;

public class Main {

    public static void main(String[] args) {

        //TODO: Create a cat class
        // Create an array of Animal objects containing Dog and Cat objects,
        // and call speak() on each.

        Animal [] animals = new Animal[3];

        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Cat();

        for(int i = 0; i<animals.length; i++){
            animals[i].speak();
        }

//        animals[0].speak();
//        animals[1].speak();
//        animals[2].speak();


//        Animal animal2 = new Dog();
//        animal2.speak();
//
//        Dog dog = new Dog();
//        dog.speak();
    }
}
