public class SearchElement {
    class Node {
        int data;
        Node next;

        // Constructor to initialize a new node with data
        Node(int new_data) {
            data = new_data;
            next = null;
        }
    }

    Node head; // Head of the linked list

    // Method to add a node at the beginning of the linked list
    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    static boolean searchKey(Node head, int key) {
        // Initialize curr with the head of linked list
        Node curr = head;

        // Iterate over all the nodes
        while (curr != null) {
            // If the current node's value is equal to key, return true
            if (curr.data == key)
                return true;

            // Move to the next node
            curr = curr.next;
        }

        // If there is no node with value as key, return false
        return false;
    }

    // Driver code
    public static void main(String[] args) {
        SearchElement s = new SearchElement();

        // Add elements to the linked list
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        // Key to search in the linked list
        int key = 14;

        // Search for the key in the linked list
        if (searchKey(s.head, key))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
