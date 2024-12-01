public class LL {
    Node head;
   
    class Node{
int data;
Node next;

Node(int data){
    this.data=data;
    this.next=null;
}
    }

public void addFirst(int data){
    Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
       newNode .next=head;
       head=newNode;
    }
public void printList(){
    Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }







    public static void main(String []args){
LL list =new LL();
list.addFirst(2);
list.addFirst(1);
list.printList();

    }
}

