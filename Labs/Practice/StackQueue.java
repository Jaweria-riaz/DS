import java.util.Queue;
import java.util.LinkedList;

public class StackQueue {
    // Define queues with type Integer for type safety
    private Queue<Integer> q1, q2;

    // Constructor
    public StackQueue() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    // Push an item onto the stack
    public void push(int item) {
        // Add the new item to q2
        q2.add(item);

        // Transfer all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        // Swap the names of q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Pop the top element from the stack
    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        // Remove and return the front element from q1 (which is the top of the stack)
        return q1.remove();
    }

    // Peek the top element without removing it
    public int top() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        // Peek the front element of q1
        return q1.peek();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }

    // Main method for testing
    public static void main(String[] args) {
        StackQueue stack = new StackQueue();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Display and pop the top element
        System.out.println("Top element: " + stack.top());  // Output: 30
        System.out.println("Popped: " + stack.pop());       // Output: 30
        System.out.println("Top element after pop: " + stack.top());  // Output: 20

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());  // Output: false

        // Pop remaining elements
        stack.pop();  // Output: 20
        stack.pop();  // Output: 10
        System.out.println("Is stack empty? " + stack.isEmpty());  // Output: true
    }
}
