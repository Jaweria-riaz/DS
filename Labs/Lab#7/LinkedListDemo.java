class Node {
    int data;
    Node next;

    // Node constructor
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Method to add a new node to the linked list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // a) Iterative method to print all nodes
    public void printIterative() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // b) Recursive method to print all nodes
    public void printRecursive(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        printRecursive(node.next);
    }
}

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        // Adding some nodes to the linked list
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        // Time calculation for iterative approach
        long startIterative = System.nanoTime();
        System.out.print("Linked List (Iterative): ");
        list.printIterative();
        long endIterative = System.nanoTime();
        long timeIterative = endIterative - startIterative;

        // Time calculation for recursive approach
        long startRecursive = System.nanoTime();
        System.out.print("Linked List (Recursive): ");
        list.printRecursive(list.head);
        System.out.println();
        long endRecursive = System.nanoTime();
        long timeRecursive = endRecursive - startRecursive;

        // Output results
        System.out.println("Time taken by Iterative approach: " + timeIterative + " ns");
        System.out.println("Time taken by Recursive approach: " + timeRecursive + " ns");

        // Compare times
        if (timeIterative < timeRecursive) {
            System.out.println("Iterative approach is faster.");
        } else {
            System.out.println("Recursive approach is faster.");
        }
    }
}
