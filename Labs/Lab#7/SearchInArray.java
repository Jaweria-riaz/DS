import java.util.Random;
import java.util.Scanner;

public class SearchInArray {
    // Method to generate an array of random integers
    public static int[] generateRandomArray(int size, int bound) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(bound); // Random integers from 0 to bound - 1
        }
        return array;
    }

    // a) Iterative method to search for a value in the array
    public static int iterativeSearch(int[] array, int value) {
        for (int num : array) {
            if (num == value) {
                return 1; // Value found
            }
        }
        return 0; // Value not found
    }

    // b) Recursive method to search for a value in the array
    public static int recursiveSearch(int[] array, int value, int index) {
        if (index >= array.length) {
            return 0; // Value not found
        }
        if (array[index] == value) {
            return 1; // Value found
        }
        return recursiveSearch(array, value, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Generate an array of random integers
        int size = 10000; // Example size of the array
        int bound = 100;  // Example upper limit for random values
        int[] array = generateRandomArray(size, bound);

        // User input for the search value
        System.out.print("Enter a value to search: ");
        int searchValue = scanner.nextInt();

        // Time calculation for iterative approach
        long startIterative = System.nanoTime();
        int iterativeResult = iterativeSearch(array, searchValue);
        long endIterative = System.nanoTime();
        long timeIterative = endIterative - startIterative;

        // Time calculation for recursive approach
        long startRecursive = System.nanoTime();
        int recursiveResult = recursiveSearch(array, searchValue, 0);
        long endRecursive = System.nanoTime();
        long timeRecursive = endRecursive - startRecursive;

        // Output results
        System.out.println("Iterative Search Result: " + iterativeResult);
        System.out.println("Time taken by Iterative approach: " + timeIterative + " ns");
        
        System.out.println("Recursive Search Result: " + recursiveResult);
        System.out.println("Time taken by Recursive approach: " + timeRecursive + " ns");

        // Compare times
        if (timeIterative < timeRecursive) {
            System.out.println("Iterative approach is faster.");
        } else {
            System.out.println("Recursive approach is faster.");
        }

       
    }
}

