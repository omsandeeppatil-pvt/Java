// Method Overloading (Compile-time Polymorphism)
class Calculator {
    // Method with two int parameters
        int add(int a, int b) {
                return a + b;
                    }

                        // Overloaded method with three int parameters
                            int add(int a, int b, int c) {
                                    return a + b + c;
                                        }
                                        }

                                        // Method Overriding (Runtime Polymorphism)
                                        class Animal {
                                            void sound() {
                                                    System.out.println("Animals make sound.");
                                                        }
                                                        }

                                                        class Dog extends Animal {
                                                            @Override
                                                                void sound() {
                                                                        System.out.println("Dog barks.");
                                                                            }
                                                                            }

                                                                            public class MethodOverloadingOverriding {
                                                                                public static void main(String[] args) {
                                                                                        // Method Overloading
                                                                                                Calculator calc = new Calculator();
                                                                                                        System.out.println("Addition of 2 numbers: " + calc.add(5, 10));
                                                                                                                System.out.println("Addition of 3 numbers: " + calc.add(5, 10, 15));

                                                                                                                        // Method Overriding
                                                                                                                                Animal myDog = new Dog();
                                                                                                                                        myDog.sound(); // Calls the overridden method in Dog
                                                                                                                                            }
                                                                                                                                            }
                                                                                                                                            