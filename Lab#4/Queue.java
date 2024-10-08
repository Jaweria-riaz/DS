class Queue {
    int[] arr;
    int front, rear, size;

    Queue(int capacity) {
        arr = new int[capacity];
        front = rear = size = 0;
    }

    void add(int item) {
        if (size == arr.length) {
            System.out.println("Queue is full");
            return;
        }
        arr[rear] = item;
        rear = (rear + 1) % arr.length;
        size++;
    }

    int remove() {
        if (size == 0) {
            return -1; // Queue is empty
        }
        int item = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return item;
    }

    boolean isEmpty() {
        return size == 0;  }
}

class StackUsingQueue {
    Queue q1, q2;

    StackUsingQueue(int capacity) {
        q1 = new Queue(capacity);
        q2 = new Queue(capacity);
    }

    // Push an item to the stack
    public void push(int item) {
        q2.add(item); // Add new item to q2

        // Move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        // Swap q1 and q2
        Queue temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Pop an item from the stack
    public int pop() {
        if (q1.isEmpty()) {
            return -1; // Return -1 if stack is empty
        }
        return q1.remove(); // Remove and return the front of q1
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop()); // Prints 3
        System.out.println(stack.pop()); // Prints 2
        System.out.println(stack.pop()); // Prints 1
        System.out.println(stack.pop()); // Prints -1 (stack is empty)
    }
}