public class CountNumberOfNodes {
    class Node {
        int data;
        Node next;
    
        // Constructor to initialize a new node with data
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    // Method to insert a node at the end of the circular linked list
    void addNode(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            head.next = head; // Point the new node to itself to form a circular link
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head; // Link the new node back to the head
        }
    }

    // Method to count the number of nodes in a circular linked list
    int countNodes() {
        if (head == null) {
            return 0; // If the list is empty
        }

        int count = 1;
        Node temp = head;

        // Traverse the list until we return back to the head node
        while (temp.next != head) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    // Driver code
    public static void main(String[] args) {
        CountNumberOfNodes cll = new CountNumberOfNodes();

        // Adding nodes to the circular linked list
        cll.addNode(10);
        cll.addNode(20);
        cll.addNode(30);
        cll.addNode(40);

        // Counting nodes in the circular linked list
        System.out.println("Number of nodes in the circular linked list: " + cll.countNodes());
    }
}
