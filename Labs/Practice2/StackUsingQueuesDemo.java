
import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueues {
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public StackUsingQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    // Push operation
    public void push(int value) {
        // Add the new element to queue2
        queue2.add(value);

        // Transfer all elements from queue1 to queue2
        while (!queue1.isEmpty()) {
            queue2.add(queue1.remove());
        }

        // Swap the names of queue1 and queue2
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    // Pop operation
    public int pop() {
        if (queue1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return queue1.remove();
    }

    // Peek operation
    public int top() {
        if (queue1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return queue1.peek();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return queue1.isEmpty();
    }
}

public class StackUsingQueuesDemo {
    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();

        // Push elements
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.top()); // Should print 3
        System.out.println("Pop: " + stack.pop()); // Should print 3
        System.out.println("Top element: " + stack.top()); // Should print 2
        stack.push(4);
        System.out.println("Pop: " + stack.pop()); // Should print 4
        System.out.println("Pop: " + stack.pop()); // Should print 2
        System.out.println("Pop: " + stack.pop()); // Should print 1
    }
}
