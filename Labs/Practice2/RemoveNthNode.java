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

    // Function to remove the nth node from the end of the list
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0); // Create a dummy node to simplify edge cases
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;

        // Move first pointer n+1 steps ahead so there is a gap of n between first and second
        for (int i = 0; i <= n; i++) {
            if (first == null) return head; // In case n is greater than the length of the list
            first = first.next;
        }

        // Move both pointers until the first reaches the end of the list
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Second pointer is now at the node before the one to remove
        second.next = second.next.next; // Remove the nth node

        return dummy.next; // Return the new head
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

public class RemoveNthNode {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addToEnd(1);
        list.addToEnd(2);
        list.addToEnd(3);
        list.addToEnd(4);
        list.addToEnd(5);

        System.out.println("Original list:");
        list.printList();

        int n = 2; // Node to remove from the end
        list.head = list.removeNthFromEnd(list.head, n);

        System.out.println("List after removing " + n + "th node from end:");
        list.printList();
    }
}
