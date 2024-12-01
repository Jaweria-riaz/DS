public class Factorial {

    // Iterative method to calculate factorial of N
    public static long factorialIterative(int N) {
        long result = 1;
        for (int i = 1; i <= N; i++) {
            result *= i;
        }
        return result;
    }

    // Recursive method to calculate factorial of N
    public static long factorialRecursive(int N) {
        if (N == 0 || N == 1) {
            return 1;
        }
        return N * factorialRecursive(N - 1);
    }

    public static void main(String[] args) {
        int N = 20; // Example user input for factorial

        // Time calculation for iterative approach
        long startIterative = System.nanoTime();
        long iterativeResult = factorialIterative(N);
        long endIterative = System.nanoTime();
        long timeIterative = endIterative - startIterative;

        // Time calculation for recursive approach
        long startRecursive = System.nanoTime();
        long recursiveResult = factorialRecursive(N);
        long endRecursive = System.nanoTime();
        long timeRecursive = endRecursive - startRecursive;

        // Output results
        System.out.println("Factorial of " + N + " (Iterative): " + iterativeResult + ", Time: " + timeIterative + " ns");
        System.out.println("Factorial of " + N + " (Recursive): " + recursiveResult + ", Time: " + timeRecursive + " ns");

        // Compare times
        if (timeIterative < timeRecursive) {
            System.out.println("Iterative approach is faster.");
        } else {
            System.out.println("Recursive approach is faster.");
        }
    }
}
