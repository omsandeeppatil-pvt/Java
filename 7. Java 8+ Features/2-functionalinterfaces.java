@FunctionalInterface
interface Calculator {
    int calculate(int a, int b); // Abstract method
}

public class FunctionalInterfaces {
    public static void main(String[] args) {
        // Using lambda expression to define the abstract method for addition
        Calculator add = (a, b) -> a + b;
        System.out.println("Addition: " + add.calculate(10, 5));

        // Using lambda expression for multiplication
        Calculator multiply = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiply.calculate(10, 5));
    }
}
