public class FactorialCalculator {

    public static long calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int number = 5; // Example input
        long result = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}