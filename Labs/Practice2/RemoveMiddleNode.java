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

    // Function to remove the middle node
    public void removeMiddle() {
        if (head == null || head.next == null) {
            head = null; // If the list is empty or has only one node, remove the head
            return;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        // Move fast by 2 steps and slow by 1 step
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        // Slow is now pointing to the middle node, and prev is the node before it
        if (prev != null) {
            prev.next = slow.next; // Remove the middle node
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

public class RemoveMiddleNode {
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

        // Remove the middle node
        list.removeMiddle();

        System.out.println("List after removing the middle node:");
        list.printList();
    }
}
