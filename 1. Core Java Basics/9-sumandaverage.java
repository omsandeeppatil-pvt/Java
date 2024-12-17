import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

                    // Input the size of the array
                            System.out.print("Enter the number of elements: ");
                                    int n = sc.nextInt();
                                            int[] arr = new int[n];

                                                    // Input array elements
                                                            System.out.println("Enter the elements:");
                                                                    int sum = 0;
                                                                            for (int i = 0; i < n; i++) {
                                                                                        arr[i] = sc.nextInt();
                                                                                                    sum += arr[i];
                                                                                                            }

                                                                                                                    // Calculate average
                                                                                                                            double average = (double) sum / n;

                                                                                                                                    System.out.println("Sum: " + sum);
                                                                                                                                            System.out.println("Average: " + average);

                                                                                                                                                    sc.close();
                                                                                                                                                        }
                                                                                                                                                        }
                                                                                                                                                        