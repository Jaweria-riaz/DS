package Lab8;
public class MergedSortedList {
    // Make the Node class static to be accessible from static methods
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to merge two sorted linked lists
    public static Node MergeList(Node head1, Node head2) {
        // Create a dummy node to simplify merging
        Node dummy = new Node(0);
        Node current = dummy;

        // Traverse both lists and append the smaller node to the merged list
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }

        // Attach the remaining nodes if any
        if (head1 != null) {
            current.next = head1;
        } else {
            current.next = head2;
        }

        // Return the head of the merged list (skip the dummy node)
        return dummy.next;
    }

    // Method to print a linked list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
    
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);

        // Create second sorted list: 2 -> 4 -> 6
        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);

        // Merge the two sorted lists
        Node mergedHead = MergeList(head1, head2);

        // Print the merged list
        System.out.print("Merged List: ");
        printList(mergedHead);
    }
}
