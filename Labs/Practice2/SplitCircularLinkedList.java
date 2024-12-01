public class SplitCircularLinkedList {
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

    // Method to add a node at the end of the circular linked list
    void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head; // Make it circular by pointing to itself
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head; 
        }
    }

    void splitList(SplitCircularLinkedList firstHalf, SplitCircularLinkedList secondHalf) {
        if (head == null) {
            return;
        }

        Node slow = head;
        Node fast = head;

      
        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }

       
        if (fast.next.next == head) {
            fast = fast.next;
        }

      
        firstHalf.head = head;

       
        secondHalf.head = slow.next;

       
        fast.next = slow.next;
        
      
        slow.next = head;
    }

   
    void display(int limit) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        int count = 0;

        
        do {
            System.out.print(temp.data + "  ");
            temp = temp.next;
            count++;
        } while (temp != head && count < limit);

        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {
        SplitCircularLinkedList list = new SplitCircularLinkedList();

      
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.addNode(50);
        list.addNode(60);

        System.out.println("Original Circular Linked List:");
        list.display(12); 
       
        

        SplitCircularLinkedList firstHalf = new SplitCircularLinkedList();
        SplitCircularLinkedList secondHalf = new SplitCircularLinkedList();

        // Split the list
        list.splitList(firstHalf, secondHalf);

        System.out.println("\nFirst Half of the Circular Linked List:");
        firstHalf.display(12); 

        System.out.println("\nSecond Half of the Circular Linked List:");
        secondHalf.display(12); 
    }
}
