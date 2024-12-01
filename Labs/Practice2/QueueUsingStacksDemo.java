import java.util.Stack;

class QueueUsingStacks {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public QueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Enqueue operation
    public void enqueue(int value) {
        // Push the element onto stack1
        stack1.push(value);
    }

    // Dequeue operation
    public int dequeue() {
        // If stack2 is empty, transfer all elements from stack1 to stack2
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        // Pop the top element from stack2
        return stack2.pop();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    // Get the front element without removing it
    public int peek() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }
}

public class QueueUsingStacksDemo {
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();

        // Enqueue elements
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Dequeue: " + queue.dequeue()); // Should print 1
        System.out.println("Front element: " + queue.peek()); // Should print 2
        queue.enqueue(4);
        System.out.println("Dequeue: " + queue.dequeue()); // Should print 2
        System.out.println("Dequeue: " + queue.dequeue()); // Should print 3
        System.out.println("Dequeue: " + queue.dequeue()); // Should print 4
    }
}
