// Single and Multilevel Inheritance
class Parent {
    void displayParent() {
            System.out.println("This is the Parent class.");
                }
                }

                // Single-level Inheritance
                class Child extends Parent {
                    void displayChild() {
                            System.out.println("This is the Child class.");
                                }
                                }

                                // Multilevel Inheritance
                                class GrandChild extends Child {
                                    void displayGrandChild() {
                                            System.out.println("This is the GrandChild class.");
                                                }
                                                }

                                                public class Inheritance {
                                                    public static void main(String[] args) {
                                                            GrandChild obj = new GrandChild();

                                                                    // Accessing methods from all levels
                                                                            obj.displayParent();
                                                                                    obj.displayChild();
                                                                                            obj.displayGrandChild();
                                                                                                }
                                                                                                }
                                                                                                