import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

                    // Input the number
                            System.out.print("Enter a number for the multiplication table: ");
                                    int num = sc.nextInt();

                                            // Print the table
                                                    System.out.println("Multiplication Table for " + num + ":");
                                                            for (int i = 1; i <= 10; i++) {
                                                                        System.out.println(num + " x " + i + " = " + (num * i));
                                                                                }

                                                                                        sc.close();
                                                                                            }
                                                                                            }
                                                                                            