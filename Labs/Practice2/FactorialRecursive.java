package Practice2;

public class FactorialRecursive {
    public static long factorialRecursive(int N) {
        if (N == 0 || N == 1) {
            return 1;
        }
        return N * factorialRecursive(N - 1);
    }

    public static void main(String[] args) {
        int N = 5; // Example user input, you can change it as needed

        // Calculate factorial of N using recursive approach
        long result = factorialRecursive(N);

        // Output the result
        System.out.println("Factorial of " + N + " (Recursive): " + result);
    }
}
