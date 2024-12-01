package Practice2;
public class RecursiveBinarySearch {
    
    public static int binarySearch(int[] arr, int target) {
        return binarySearchHelper(arr, target, 0, arr.length - 1);
    }
    
    private static int binarySearchHelper(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1; 
        }
        
        int mid = left + (right - left) / 2; 
        
       
        if (arr[mid] == target) {
            return mid; 
        }
        
      
        if (target < arr[mid]) {
            return binarySearchHelper(arr, target, left, mid - 1);
        } else {
           
            return binarySearchHelper(arr, target, mid + 1, right);
        }
    }

    
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;

        int result = binarySearch(sortedArray, target);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
