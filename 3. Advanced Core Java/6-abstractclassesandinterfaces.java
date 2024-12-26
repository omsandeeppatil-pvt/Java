// Abstract class example
abstract class Animal {
    abstract void sound(); // Abstract method

    void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

// Interface example
interface Shape {
    void draw(); // Abstract method
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}

public class AbstractClassesAndInterfaces {
    public static void main(String[] args) {
        // Using abstract class
        Animal dog = new Dog();
        dog.sound();
        dog.sleep();

        // Using interface
        Shape circle = new Circle();
        circle.draw();
    }
}
