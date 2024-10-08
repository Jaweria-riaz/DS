public class StackLinkedList {
    // Node class representing each element in the linked list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Stack class implemented using linked list
    public class Stack {
        private Node head;  // Head node representing the top of the stack

        // Method to check if the stack is empty
        public boolean isEmpty() {
            return head == null;
        }

        // Method to push an element onto the stack
        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // Method to pop an element from the stack
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // Method to peek at the top element of the stack without popping it
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        StackLinkedList stackLinkedList = new StackLinkedList();  // Create instance of outer class
        Stack stack = stackLinkedList.new Stack();  // Create instance of inner class

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        // Pop and print all elements from the stack
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
