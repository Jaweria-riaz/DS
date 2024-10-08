package Practice;
public class MergeLinkedList {
    Node head;  // head of the list

    // Define a simple Node class
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to merge two sorted linked lists
    public static Node merge(Node head1, Node head2) {
        // Check if one of the lists is empty
        if (head1 == null) return head2;
        if (head2 == null) return head1;

        // Start with an empty merged list
        Node Head = null;
        Node Tail = null;

        // Pick the first node (smallest) to start the merged list
        if (head1.data <= head2.data) {
            Head = head1;
            head1 = head1.next;
        } else {
            Head = head2;
            head2 = head2.next;
        }
        
        // Set the merged tail to the starting node
        Tail = Head;

        // Traverse both lists and merge them
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                Tail.next = head1;
                head1 = head1.next;
            } else {
                Tail.next = head2;
                head2 = head2.next;
            }
            // Move the tail pointer forward
            Tail = Tail.next;
        }

        // Attach the remaining nodes from either list
        if (head1 != null) {
            Tail.next = head1;
        } else {
            Tail.next = head2;
        }

        return Head;
    }

    // Helper function to print the linked list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create first sorted linked list: 1 -> 3 -> 5
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);

        // Create second sorted linked list: 2 -> 4 -> 6
        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);

        // Merge the two lists
        Node mergedHead = merge(head1, head2);

        // Print the merged linked list
        printList(mergedHead);  // Output: 1 2 3 4 5 6
    }
}
 