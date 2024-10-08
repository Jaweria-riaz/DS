import java.util.Scanner;

public class NumberPrinter {

    // Method to print numbers in ascending order using recursion
    public static void printAscending(int n) {
        if (n == 0) {
            return;  // Base case
        }
        printAscending(n - 1); // Recursive call
        System.out.print(n + " ");
    }

    // Method to print numbers in descending order using recursion
    public static void printDescending(int n) {
        if (n == 0) {
            return;  // Base case
        }
        System.out.print(n + " "); // Print first, then recursive call
        printDescending(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a number N: ");
        int N = scanner.nextInt();

        // Print numbers in ascending order
        System.out.println("Numbers in ascending order:");
        printAscending(N);
        
        System.out.println("\nNumbers in descending order:");
        // Print numbers in descending order
        printDescending(N);

        
    }
}


