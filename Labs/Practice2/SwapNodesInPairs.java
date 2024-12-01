package Practice2;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Method to swap nodes in pairs
    public void swapPairs() {
        if (head == null || head.next == null) {
            return; // If there's 0 or 1 node, nothing to swap
        }

        Node prev = null;
        Node current = head;
        head = head.next; // New head will be the second node

        while (current != null && current.next != null) {
            Node nextPair = current.next.next;
            Node second = current.next;

            // Swap nodes
            second.next = current;
            current.next = nextPair;

            // Link the previous pair with the current swapped pair
            if (prev != null) {
                prev.next = second;
            }

            // Move to the next pair
            prev = current;
            current = nextPair;
        }
    }

    // Helper method to add a node to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Helper method to print the list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class SwapNodesInPairs {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original List:");
        list.printList();

        list.swapPairs();

        System.out.println("List after swapping nodes in pairs:");
        list.printList();
    }
}
