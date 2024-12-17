import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

                    // Input a number
                            System.out.print("Enter a number: ");
                                    int num = sc.nextInt();
                                            int reverse = 0;

                                                    // Reverse the number
                                                            while (num != 0) {
                                                                        int digit = num % 10; // Get last digit
                                                                                    reverse = reverse * 10 + digit; // Add to reversed number
                                                                                                num = num / 10; // Remove last digit
                                                                                                        }

                                                                                                                System.out.println("Reversed Number: " + reverse);

                                                                                                                        sc.close();
                                                                                                                            }
                                                                                                                            }
                                                                                                                            