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

    // Function to remove the first occurrence of a specific element
    public void removeElement(int value) {
        if (head == null) {
            return; // If the list is empty, nothing to remove
        }

        // If the head node holds the value to be removed
        if (head.data == value) {
            head = head.next; // Move the head to the next node
            return;
        }

        ListNode current = head;
        ListNode prev = null;

        // Traverse the list to find the node to remove
        while (current != null && current.data != value) {
            prev = current;
            current = current.next;
        }

        // If the node was found, remove it by adjusting the pointer
        if (current != null) {
            prev.next = current.next;
        }
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

public class RemoveElementFromList {
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

        int valueToRemove = 3; // Value to remove
        list.removeElement(valueToRemove);

        System.out.println("List after removing element " + valueToRemove + ":");
        list.printList();
    }
}
