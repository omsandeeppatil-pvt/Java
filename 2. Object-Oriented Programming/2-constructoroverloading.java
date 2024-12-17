// Program to demonstrate constructor overloading
class Rectangle {
    int length, breadth;

        // Default constructor
            Rectangle() {
                    length = 0;
                            breadth = 0;
                                }

                                    // Parameterized constructor
                                        Rectangle(int l, int b) {
                                                length = l;
                                                        breadth = b;
                                                            }

                                                                // Method to calculate area
                                                                    int calculateArea() {
                                                                            return length * breadth;
                                                                                }
                                                                                }

                                                                                public class ConstructorOverloading {
                                                                                    public static void main(String[] args) {
                                                                                            // Using default constructor
                                                                                                    Rectangle rect1 = new Rectangle();
                                                                                                            System.out.println("Area with default constructor: " + rect1.calculateArea());

                                                                                                                    // Using parameterized constructor
                                                                                                                            Rectangle rect2 = new Rectangle(10, 5);
                                                                                                                                    System.out.println("Area with parameterized constructor: " + rect2.calculateArea());
                                                                                                                                        }
                                                                                                                                        }
                                                                                                                                        