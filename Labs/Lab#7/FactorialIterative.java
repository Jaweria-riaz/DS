public class FactorialIterative {

    // Iterative method to calculate factorial of N
    public static long factorialIterative(int N) {
        long result = 1;
        for (int i = 1; i <= N; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int N = 5; // Example user input, you can change it as needed

        // Calculate factorial of N using iterative approach
        long result = factorialIterative(N);

        // Output the result
        System.out.println("Factorial of " + N + " (Iterative): " + result);
    }
}
