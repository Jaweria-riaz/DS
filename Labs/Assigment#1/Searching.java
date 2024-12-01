public class Searching {
    Node head;
    static final int LIST_EMPTY=-1;
    class Node{
        int data;
        Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

    public void addtofront(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

public void reverse(){
if(head==null){
   System.out.println(LIST_EMPTY);
    return ;
}
Node temp=head;
Node pre=null;
Node next=null;

while(temp!=null)
{
next=temp.next;
temp.next=pre;
pre=temp;
temp=next;
}
head=pre;
}
public void printlist(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
}
public static void main(String []args){
    Searching s=new Searching();
    s.addtofront(1);
    s.addtofront(2);
    s.addtofront(3);
    System.out.println("original");
    s.printlist();
    s.reverse();
    System.out.println();
    System.out.println("reversed");
    s.printlist();


    

}
}
