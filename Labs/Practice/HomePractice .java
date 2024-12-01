package Practice;
import java.util.Stack;
 class HomePractice {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(80);
        stack.push(30);
        stack.push(60);

        // Display stack after push operations
        System.out.println("Stack after push operations: " + stack);

        // Display the top element
        System.out.println("Top element is: " + stack.peek());

        // Pop the top element and display it
        System.out.println("Popped element is: " + stack.pop());

        // Display stack after pop operation
        System.out.println("Stack after pop operations: " + stack);

        // Check if the stack is empty
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }
}
