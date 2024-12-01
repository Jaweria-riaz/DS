public class MergeSort {

    // Function to merge two sorted subarrays (left[] and right[]) into the main array
    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return; // Base case: Array is already sorted
        }

        // Find the middle index
        int middle = array.length / 2;

        // Create left and right subarrays
        int[] left = new int[middle];
        int[] right = new int[array.length - middle];

        // Copy the first half of the array into left[]
        for (int i = 0; i < middle; i++) {
            left[i] = array[i];
        }

        // Copy the second half of the array into right[]
        for (int i = middle; i < array.length; i++) {
            right[i - middle] = array[i];
        }

        // Recursively sort both halves
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves
        merge(array, left, right);
    }

    // Helper function to merge two sorted arrays (left and right) into the original array
    public static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merge elements from left[] and right[] into the array
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from left[]
        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }

        // Copy any remaining elements from right[]
        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }
    }

    // Main method to test the merge sort
    public static void main(String[] args) {
        int[] arr = {30, 45, 12, 65, 76, 22, 11}; // Corrected array initialization

        // Sort the array using mergeSort
        mergeSort(arr);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
