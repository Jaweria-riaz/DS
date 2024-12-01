
class ListNode {
    int data;
    ListNode next;

    // Constructor
    ListNode(int value) {
        this.data = value;
        this.next = null;
    }
}

class LinkedList {
    ListNode head;

    // Constructor for an empty list
    LinkedList() {
        this.head = null;
    }

    // Method to add a node to the front of the list
    void addFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    // Method to deep copy the linked list
    LinkedList deepCopy() {
        if (head == null) {
            return null;  // If the list is empty, return null
        }

        // Create a new list to store the copy
        LinkedList copyList = new LinkedList();
        ListNode current = head;  // Start from the head of the original list

        while (current != null) {
            // Add the node's data to the copied list
            copyList.addFirst(current.data);
            current = current.next;
        }

        return copyList;
    }

    // Method to display the linked list
    void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class DeepCopy {
    public static void main(String[] args) {
        // Create an original linked list
        LinkedList obj1 = new LinkedList();
        obj1.addFirst(1);
        obj1.addFirst(2);
        obj1.addFirst(3);
        obj1.addFirst(4);

        System.out.println("Original List (obj1):");
        obj1.display();

        // Deep copy the linked list
        LinkedList obj2 = obj1.deepCopy();

        System.out.println("Copied List (obj2):");
        obj2.display();
    }
}
