package Lab6;
import java.util.Arrays;

public class TwoSumBinarySearch {
    public static boolean findTwoSum(int[] arr, int K) {
        // Sort the array
        Arrays.sort(arr);
        
        // For each element, search for the complement using binary search
        for (int i = 0; i < arr.length; i++) {
            int Current = K - arr[i];
            if (binarySearch(arr, Current, i + 1)) {
                return true;
            }
        }
        return false;
    }
    
    // Simple binary search function
    private static boolean binarySearch(int[] arr, int target, int start) {
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if  (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] arr = {8, 4, 1, 6};
        int K = 10;
        System.out.println(findTwoSum(arr, K));  // Output: true
    }
}