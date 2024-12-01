import java.util.Stack;

public class SortedStack {
    
    // Main function to insert element in sorted order
    public static void sortedInsert(Stack<Integer> stack, int element) {
        // Base case: if stack is empty or top element is less than or equal to element
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }
        
        // Remove the top element
        int temp = stack.pop();
        
        // Recur to insert element in the correct position
        sortedInsert(stack, element);
        
        // Push the temporarily removed element back to the stack
        stack.push(temp);
    }
    
    // Function to print stack (for verification)
    public static void printStack(Stack<Integer> stack) {
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        // Initial stack
        stack.push(2);
        stack.push(4);
        stack.push(9);
        
        System.out.println("Initial Stack:");
        printStack(stack);
        
        // Insert elements
        int[] inputs = {4, 9, 2, 3, 7, 8};
        
        for (int input : inputs) {
            sortedInsert(stack, input);
            System.out.println("After inserting " + input + ":");
            printStack(stack);
        }
    }
}