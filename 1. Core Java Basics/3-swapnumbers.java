public class SwapNumbers {
        public static void main(String[] args) {
                int a = 5, b = 10;

                        // Swapping using a third variable
                                System.out.println("Before Swap: a = " + a + ", b = " + b);
                                        int temp = a;
                                                a = b;
                                                        b = temp;
                                                                System.out.println("After Swap (Using Third Variable): a = " + a + ", b = " + b);

                                                                        // Swapping without a third variable
                                                                                a = 5; b = 10; // Reset values
                                                                                        System.out.println("\nBefore Swap: a = " + a + ", b = " + b);
                                                                                                a = a + b; // Step 1
                                                                                                        b = a - b; // Step 2
                                                                                                                a = a - b; // Step 3
                                                                                                                        System.out.println("After Swap (Without Third Variable): a = " + a + ", b = " + b);
                                                                                                                            }
                                                                                                                            }
