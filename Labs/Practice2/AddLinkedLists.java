
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

    // Function to add two linked lists
    public static ListNode addTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // Dummy node to simplify result list creation
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.data : 0;
            int y = (l2 != null) ? l2.data : 0;

            int sum = x + y + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;

            // Move to the next nodes in each list
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // If there's a carry left, add a new node for it
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummyHead.next; // Return the result list
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

public class AddLinkedLists {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        // Number 342 represented in reverse as 2 -> 4 -> 3
        list1.addToEnd(2);
        list1.addToEnd(4);
        list1.addToEnd(3);

        // Number 465 represented in reverse as 5 -> 6 -> 4
        list2.addToEnd(5);
        list2.addToEnd(6);
        list2.addToEnd(4);

        System.out.println("First number:");
        list1.printList();

        System.out.println("Second number:");
        list2.printList();

        // Add the two lists
        LinkedList result = new LinkedList();
        result.head = LinkedList.addTwoLists(list1.head, list2.head);

        System.out.println("Sum:");
        result.printList();
    }
}
