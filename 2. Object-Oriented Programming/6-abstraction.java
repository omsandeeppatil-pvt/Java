// Abstract class example
abstract class Shape {
    abstract void draw(); // Abstract method
    }

    class Circle extends Shape {
        @Override
            void draw() {
                    System.out.println("Drawing a Circle.");
                        }
                        }

                        class Rectangle extends Shape {
                            @Override
                                void draw() {
                                        System.out.println("Drawing a Rectangle.");
                                            }
                                            }

                                            // Interface example
                                            interface Animal {
                                                void sound();
                                                }

                                                class Dog implements Animal {
                                                    public void sound() {
                                                            System.out.println("Dog barks.");
                                                                }
                                                                }

                                                                public class Abstraction {
                                                                    public static void main(String[] args) {
                                                                            // Abstract class
                                                                                    Shape circle = new Circle();
                                                                                            circle.draw();

                                                                                                    Shape rectangle = new Rectangle();
                                                                                                            rectangle.draw();

                                                                                                                    // Interface
                                                                                                                            Animal dog = new Dog();
                                                                                                                                    dog.sound();
                                                                                                                                        }
                                                                                                                                        }
                                                                                                                                        