// A linked list node
class Node {
    int data; // integer data
    Node next; // pointer to the next node

    Node(int data) {  // Constructor to create a new node
        this.data = data;
        this.next = null;
    }
}

class StackusingLinkedlist {
    private Node top;

    // Constructor to initialize the stack
    public StackusingLinkedlist() {
        this.top = null;
    }

    // Utility function to add an element in the stack (push operation)
    public void push(int x) {
        // Create a new node with the given data
        Node newNode = new Node(x);

        // Make the new node point to the current top node
        newNode.next = top;

        // Update top to point to the new node
        top = newNode;

        System.out.println("Pushed " + x);
    }

    // Utility function to check if the stack is empty
    public boolean isEmpty() {
        return top == null; // If top is null, stack is empty
    }

    // Utility function to return the top element of the stack (peek operation)
    public int top() {
        if (!isEmpty()) {
            return top.data; // Return data of the top node
        } else {
            System.out.println("Stack is empty");
            return -1; // Return a value indicating stack is empty
        }
    }

    // Utility function to pop the top element from the stack
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return;
        }

        // Update the top to point to the next node
        System.out.println("Popped " + top.data);
        top = top.next;
    }
}

class StackImpl {
    public static void main(String[] args) {
        StackusingLinkedlist stack = new StackusingLinkedlist();

        // Push elements into the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Print the top element
        System.out.println("Top element is " + stack.top());

        // Pop elements from the stack
        stack.pop();
        stack.pop();
        stack.pop();

        // Check if the stack is empty
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }
}
