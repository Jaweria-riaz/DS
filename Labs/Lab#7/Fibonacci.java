public class Fibonacci {
    public static void fibonacciIterative(int N) {
        long a = 0, b = 1;
        System.out.print(a + " " + b);
        
        for (int i = 2; i < N; i++) {
            long next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }





    
    public static long fibonacciRecursive(int N) {
        if (N <= 1) {
            return N;
        }
        return fibonacciRecursive(N - 1) + fibonacciRecursive(N - 2);
    }

    public static void printFibonacciRecursive(int N) {
        for (int i = 0; i < N; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        System.out.println();
    }







    public static void main(String[] args) {
        int N = 20; // Example user input

        // Time calculation for iterative approach
        long startIterative = System.nanoTime();
        System.out.print("Fibonacci Series (Iterative): ");
        fibonacciIterative(N);
        long endIterative = System.nanoTime();
        long timeIterative = endIterative - startIterative;

        // Time calculation for recursive approach
        long startRecursive = System.nanoTime();
        System.out.print("Fibonacci Series (Recursive): ");
        printFibonacciRecursive(N);
        long endRecursive = System.nanoTime();
        long timeRecursive = endRecursive - startRecursive;

        // Output results
        System.out.println("Time taken by Iterative approach: " + timeIterative + " ns");
        System.out.println("Time taken by Recursive approach: " + timeRecursive + " ns");

        // Compare times
        if (timeIterative < timeRecursive) {
            System.out.println("Iterative approach is faster.");
        } else {
            System.out.println("Recursive approach is faster.");
        }
    }
}
