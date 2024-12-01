public class Swap {
    Node head;
    static final int LIST_EMPTY = 1;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to add a node to the front of the list
    public void addfront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to print the list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Method to sort the list by swapping nodes
    public void sort() {
        if (head == null) {
            System.out.println(LIST_EMPTY);
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            Node prev = null;

            // Loop through the list and compare adjacent nodes
            while (current != null && current.next != null) {
                if (current.data > current.next.data) {
                    // Swap the nodes
                    Node nextNode = current.next;
                    current.next = nextNode.next;
                    nextNode.next = current;

                    if (prev == null) {
                        // Update the head if we're swapping the first two nodes
                        head = nextNode;
                    } else {
                        prev.next = nextNode;
                    }

                    // Mark that a swap happened
                    swapped = true;
                }
                // Move to the next pair of nodes
                prev = current;
                current = current.next;
            }
        } while (swapped); // Continue until no swaps occur in a pass
    }

    public static void main(String[] args) {
        Swap list = new Swap();

        // Add elements to the list
        list.addfront(7);
        list.addfront(0);
        list.addfront(5);
        list.addfront(2);
        list.addfront(4);

        System.out.println("Before swap:");
        list.printList();

        // Sort the list
        list.sort();
        System.out.println("After swap:");
        list.printList();
    }
}
