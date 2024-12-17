class Parent {
        void display() {
                System.out.println("Parent class display method.");
                    }
                    }

                    class Child extends Parent {
                        @Override
                            void display() {
                                    super.display(); // Calling parent method
                                            System.out.println("Child class display method.");
                                                }
                                                }

                                                public class RuntimePolymorphism {
                                                    public static void main(String[] args) {
                                                            Parent obj = new Child();
                                                                    obj.display();
                                                                        }
                                                                        }
           