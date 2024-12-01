package Practice2;
public class ConvertToCircularLinkedList {
    class Node {
        int data;
        Node next;
    
        // Constructor to initialize a new node with data
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    // Method to add a node at the end of the singly linked list
    void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Method to convert the singly linked list to a circular linked list
    void convertToCircular() {
        if (head == null) {
            return; // If the list is empty, do nothing
        }

        Node temp = head;
        // Traverse to the last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Link the last node to the head, making it circular
        temp.next = head;
    }

    // Method to display the circular linked list (limited to avoid infinite loop)
    void display(int limit) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        int count = 0;

        // Display nodes up to the specified limit to show circular behavior
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
            count++;
        } while (temp != head && count < limit);

        System.out.println("...");
    }

    // Driver code
    public static void main(String[] args) {
        ConvertToCircularLinkedList list = new ConvertToCircularLinkedList();

        // Adding nodes to the singly linked list
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);

        System.out.println("Original Singly Linked List:");
        list.display(4); // Display as a singly linked list

        // Convert to a circular linked list
        list.convertToCircular();

        System.out.println("\nCircular Linked List (display limited to avoid infinite loop):");
        list.display(10); // Display circular list with limited nodes to show circular behavior
    }
}
