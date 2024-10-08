public class DoublyLinkedList {
    Node head;
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

    Node insertAtBeginning(String data, Node head) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.pre = newNode;
            head = newNode;
        }
        return head;
    }

    Node insertAtEnd(String data, Node head) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.pre = temp;
        }
        return head;
    }

    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList d = new DoublyLinkedList();
        Node head = null;  // Initialize head

        // Insert elements at the beginning and end
        head = d.insertAtBeginning("jaweria", head);  // Update head
        head = d.insertAtEnd("riaz", head);           // Update head

        // Print the list
        d.printList(head);

        
    }
}
