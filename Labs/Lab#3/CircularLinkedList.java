public class CircularLinkedList {
    // Node class for linked list
    class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to detect cycle in a linked list
    public boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false; // If the list is empty or has only one node, no cycle
        }

        Node slow = head; // Slow pointer moves one step at a time
        Node fast = head; // Fast pointer moves two steps at a time

        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow pointer one step
            fast = fast.next.next; // Move fast pointer two steps

            if (slow == fast) { // If slow and fast meet, cycle exists
                return true;
            }
        }

        return false; // If fast pointer reaches the end, no cycle exists
    }

    public static void main(String[] args) {
        // Example usage
        CircularLinkedList detector = new CircularLinkedList();

        Node head = detector.new Node(1);
        head.next = detector.new Node(2);
        head.next.next = detector.new Node(3);
        head.next.next.next = detector.new Node(4);
        head.next.next.next.next = head.next; // Creating a cycle for testing

        boolean result = detector.hasCycle(head);
        System.out.println("Cycle detected: " + result); // Output: Cycle detected: true
    }
}
