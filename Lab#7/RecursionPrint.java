public class RecursionPrint {

    
    public static void printForward(char[] arr, int index) {
        if (index == arr.length) {
            return; 
        }
        System.out.print(arr[index] + " "); 
        printForward(arr, index + 1); 
    }

   
    public static void printReverse(char[] arr, int index) {
        if (index == arr.length) {
            return; 
        }
        printReverse(arr, index + 1); 
        System.out.print(arr[index] + " "); 
    }

    public static void main(String[] args) {
        char[] arr = {'A', 'B', 'C', 'D', 'E'};
        
      
        System.out.print("Forward: ");
        printForward(arr, 0);
        System.out.println();

       
        System.out.print("Reverse: ");
        printReverse(arr, 0);
        System.out.println();
    }
}
