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

    // Function to reverse nodes in groups of size k
    public ListNode reverseInGroups(ListNode head, int k) {
        if (head == null || k <= 1) return head;

        ListNode prev = null, curr = head, next = null;
        int count = 0;

        // Reverse first k nodes of the linked list
        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        // Recursively call for the next k-group and connect it with the reversed part
        if (next != null) {
            head.next = reverseInGroups(next, k);
        }

        // prev is now the head of the reversed group
        return prev;
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

public class ReverseInGroups {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addToEnd(1);
        list.addToEnd(2);
        list.addToEnd(3);
        list.addToEnd(4);
        list.addToEnd(5);
        list.addToEnd(6);
        list.addToEnd(7);
        list.addToEnd(8);

        System.out.println("Original list:");
        list.printList();

        int k = 3; // size of groups
        list.head = list.reverseInGroups(list.head, k);

        System.out.println("List after reversing in groups of " + k + ":");
        list.printList();
    }
}
