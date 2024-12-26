public class ExceptionHandlingTryCatch {
    public static void main(String[] args) {
        try {
            // Simulating a divide by zero error
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        }

        try {
            // Simulating array index out of bounds exception
            int[] arr = new int[5];
            arr[10] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!");
        }
        
        System.out.println("Program continues...");
    }
}
