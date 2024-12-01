public class QuickSort {

        // Method to perform quicksort
        public static void quickSort(int[] arr, int low, int high) {
            if (low < high) {
                // Find the partition index
                int pivotIndex = partition(arr, low, high);
                
                // Recursively sort elements before and after partition
                quickSort(arr, low, pivotIndex - 1);  // Left half
                quickSort(arr, pivotIndex + 1, high); // Right half
            }
        }
    
        // Method to partition the array
        public static int partition(int[] arr, int low, int high) {
            int pivot = arr[high]; // Pivot element
            int i = (low - 1);     // Index of smaller element
    
            for (int j = low; j < high; j++) {
                // If current element is smaller than the pivot
                if (arr[j] < pivot) {
                    i++;
                    
                    // Swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
    
            // Swap arr[i+1] and arr[high] (or pivot)
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;
    
            return i + 1; // Return the partition index
        }
    
        // Utility method to print the array
        public static void printArray(int[] arr) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    
        // Main method to test the quick sort implementation
        public static void main(String[] args) {
            int[] arr = {10, 80, 30, 90, 40, 50, 70};
            System.out.println("Original Array:");
            printArray(arr);
    
            quickSort(arr, 0, arr.length - 1);
    
            System.out.println("Sorted Array:");
            printArray(arr);
        }
    }
    

