import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

                    // Input a number
                            System.out.print("Enter a number: ");
                                    int num = sc.nextInt();

                                            // Check if the number is prime
                                                    boolean isPrime = true;
                                                            if (num <= 1) {
                                                                        isPrime = false;
                                                                                } else {
                                                                                            for (int i = 2; i <= Math.sqrt(num); i++) {
                                                                                                            if (num % i == 0) {
                                                                                                                                isPrime = false;
                                                                                                                                                    break;
                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                        }

                                                                                                                                                                                                // Output the result
                                                                                                                                                                                                        if (isPrime) {
                                                                                                                                                                                                                    System.out.println(num + " is a Prime number.");
                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                        System.out.println(num + " is not a Prime number.");
                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                        sc.close();
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            