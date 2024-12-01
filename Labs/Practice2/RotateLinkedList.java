class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    ListNode head;

    // Function to rotate the list to the right by k positions
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Step 1: Find the length of the list and make it circular
        ListNode current = head;
        int length = 1;
        while (current.next != null) {
            current = current.next;
            length++;
        }
        current.next = head; // Connect last node to the head to make it circular

        // Step 2: Calculate the new head's position
        k = k % length; // Reduce k if greater than length
        int skip = length - k;

        // Step 3: Find the new head and break the circular connection
        current = head;
        for (int i = 1; i < skip; i++) {
            current = current.next;
        }
        head = current.next;
        current.next = null;

        return head;
    }

    // Helper function to add a new node at the end
    public void addToEnd(int data) {
        if (head == null) {
            head = new ListNode(data);
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new ListNode(data);
    }

    // Helper function to print the linked list
    public void printList() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class RotateLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        list.addToEnd(1);
        list.addToEnd(2);
        list.addToEnd(3);
        list.addToEnd(4);
        list.addToEnd(5);

        System.out.println("Original list:");
        list.printList();

        int k = 2; // Number of rotations
        list.head = list.rotateRight(list.head, k);

        System.out.println("List after rotating by " + k + " positions:");
        list.printList();
    }
}
