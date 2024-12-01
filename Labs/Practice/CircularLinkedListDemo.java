package Practice;


class CircularLinkedList {
    class Node {
        int data;
        Node next;
    
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    // Method to add a new node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head; // Point to itself
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode; // Link last node to new node
            newNode.next = head; // New node points to head
        }
    }

    // Method to display the circular linked list
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}

public class CircularLinkedListDemo {
    public static void main(String[] args) {
        CircularLinkedList circularList = new CircularLinkedList();
        
        // Adding nodes to the circular linked list
        circularList.add(1);
        circularList.add(2);
        circularList.add(3);
        circularList.add(4);
        
        // Displaying the circular linked list
        System.out.println("Circular Linked List:");
        circularList.display();
    }
}
