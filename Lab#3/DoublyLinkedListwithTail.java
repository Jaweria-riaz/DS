public class DoublyLinkedListwithTail {
    Node head;
    Node tail;
    int size = 0;

    class Node {
        String data;
        Node next;
        Node pre;

        Node(String data) {
            this.data = data;
            this.next = null;
            this.pre = null;
        }
    }

    // Insert at the beginning
    public void insertAtBeginning(String data) {
        Node newNode = new Node(data);
        
        if (head == null) {  // If the list is empty
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.pre = newNode;
            head = newNode;
        }
        size++;
    }

    // Insert at the end
    public void insertAtEnd(String data) {
        Node newNode = new Node(data);
        
        if (head == null) {  // If the list is empty
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.pre = tail;
            tail = newNode;
        }
        size++;
    }

    // Remove from the beginning
    public void removeFromBeginning() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head == tail) {  // If there's only one element
            head = tail = null;
        } else {
            head = head.next;
            head.pre = null;
        }
        size--;
    }

    // Remove from the end
    public void removeFromEnd() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head == tail) {  // If there's only one element
            head = tail = null;
        } else {
            tail = tail.pre;
            tail.next = null;
        }
        size--;
    }

    // Print the list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedListwithTail d = new DoublyLinkedListwithTail();

        // Insert elements
        d.insertAtBeginning("A");
        d.insertAtEnd("B");
        d.insertAtEnd("C");
        d.insertAtBeginning("D");

        // Print the list
        d.printList();  // Output: D A B C

        // Remove elements
        d.removeFromBeginning();
        d.printList();  // Output: A B C

        d.removeFromEnd();
        d.printList();  // Output: A B
    }
}
