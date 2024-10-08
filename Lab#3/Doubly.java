public class Doubly {
    Node head;
    Node tail;

    class Node{
        int data;
        Node next;
        Node pre;

        Node(int data){
this.data=data;
this.next=null;
this.pre=null;
        }
    }


   public void Addtofront(int data){
Node newNode=new Node(data);
if(head==null){
    head=newNode;
    tail=newNode;
    return;
}
newNode.next=head;
head.pre=newNode;
head=newNode;

    }

    public void addtolast(int data){
Node newNode =new Node(data);
if(tail==null){
    tail=newNode;
    head=newNode;
    return;
}

tail.next=newNode;
newNode.pre=tail;
tail=newNode;
    }
    

    public void removefromfront(){
        
    }
    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[]args){
Doubly d=new Doubly();
d.Addtofront(1);
d.Addtofront(2);
d.Addtofront(3);
d.addtolast(4);
d.printList();

    }
}
