public class LinkedList {
    Node head;
    public static int size;

    // Node class represents each element in the linked list
    public class Node {
        int data;
        Node next;

        // Constructor for Node
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to add a node with the given data to the front of the list
    void addToFront(int data) {
        Node node = new Node(data); // Create a new node with the given data
        node.next = head;           // Set the new node's next pointer to the current head
        head = node;                // Update the head to be the new node
        size++;                     // Increment the size of the list
        System.out.println("Added " + data + " to the front of the list.");
        printList();                // Print the updated list
    }

    // Method to add a node with the given data to the back of the list
    void addToBack(int data) {
        Node node = new Node(data); // Create a new node with the given data
        size++;                     // Increment the size of the list
        if (head == null) {         // If the list is empty, set head to the new node
            head = node;
        } else {                    // Otherwise, traverse to the last node and add the new node at the end
            Node n = head;
            while (n.next != null) { // Traverse to the last node
                n = n.next;
            }
            n.next = node;          // Set the next pointer of the last node to the new node
        }
     
        printList();                // Print the updated list
    }

    // Method to add a node in the middle of the list at the given index
    public void addMiddle(int index, int data) {
        
        Node newNode = new Node(data); // Create a new node with the given data
        size++;                        // Increment the size of the list

        if (index == 1) {              // If inserting at the head, use addToFront
            addToFront(data);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index - 1; i++) { // Traverse to the node just before the insertion point
            temp = temp.next;
        }

        newNode.next = temp.next; // Insert the new node
        temp.next = newNode;

        System.out.println("Added " + data + " at index " + index + ".");
        printList();             // Print the updated list
    }


  public   void removeFromFront()
 {
 head=head.next;
 System.out.print("remove from front: ");
        printList(); 
 }




 public void removeFromBack()
 {
 Node n=head;
 while(n.next.next!=null)
 n=n.next;
 n.next=null;
 System.out.print("remove from back: ");
 printList(); 
 }




 
 public void removeAt(int index)
 {
 if (index==1){
 removeFromFront();
 }
 else{
 Node n=head;
 Node temp=null;
 for(int i=1;i<index-1;i++)
 {
 n=n.next;
 }
 temp=n.next;
 n.next=temp.next;
 }
 System.out.print("remove At: ");
 printList(); 

 }



 
 boolean isEmpty(){
 return head == null;
 
 
 }


    // Method to print all elements in the linked list
    void printList() {
        if (head == null) { // Check if the list is empty
            System.out.println("The list is empty.");
            return;
        }

        Node node = head;
        System.out.print("Current list: ");
        while (node != null) { // Traverse and print all nodes
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println(); // Print a new line at the end
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add elements to the linked list
        list.addToBack(1);  // Adds 1 to the back
        list.addToBack(2);  // Adds 2 to the back
        list.addToBack(3);
        list.addToBack(4);  // Adds 3 to the back

        // Add an element to the middle of the list
        list.addMiddle(2, 200); // Adds 200 at index 2 (between 1 and 2)

        // Add an element to the front of the list
        list.addToFront(5); // Adds 5 to the front

list.removeAt(2);
list.removeFromBack();
list.removeFromFront();

        list.isEmpty();
        // Print the size of the list
        System.out.println("Size of the list: " + size);
    }
}
