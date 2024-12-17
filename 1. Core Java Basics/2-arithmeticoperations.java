import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
                    
                            // Input two numbers
                                    System.out.print("Enter first number: ");
                                            int num1 = sc.nextInt();
                                                    System.out.print("Enter second number: ");
                                                            int num2 = sc.nextInt();
                                                                    
                                                                            // Perform arithmetic operations
                                                                                    System.out.println("Addition: " + (num1 + num2));
                                                                                            System.out.println("Subtraction: " + (num1 - num2));
                                                                                                    System.out.println("Multiplication: " + (num1 * num2));
                                                                                                            
                                                                                                                    // Avoid division by zero
                                                                                                                            if (num2 != 0) {
                                                                                                                                        System.out.println("Division: " + (num1 / num2));
                                                                                                                                                } else {
                                                                                                                                                            System.out.println("Division by zero is not allowed.");
                                                                                                                                                                    }
                                                                                                                                                                            
                                                                                                                                                                                    sc.close();
                                                                                                                                                                                        }
                                                                                                                                                                                        }
                                                                                                                                                                                        