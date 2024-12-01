public class OverAll {
    Node head;
   


    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
public void addtofront(int data){
Node newNode=new Node(data);
if(head==null){
    head=newNode;
    return;
}
newNode.next=head;
head=newNode;
}

public void addtoback(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=newNode;
        return;
    }
Node temp=head;
while(temp.next!=null){
    temp=temp.next;
}
temp.next=newNode;
}


public void addtoMiddle(int index,int data){
    Node newNode=new Node(data);

if(index==1){
    addtofront(data);
    return;
}
Node temp=head;
for(int i=0;i<index-1;i++){
temp=temp.next;
}
newNode.next=temp.next;
temp.next=newNode;
}
     
public void removeFromFront(){
    head=head.next;
}

public void removefromback(){
    Node temp=head;
    if(head==null){
        head=null;
        return;
    }
    while(temp.next.next!=null){
        temp=temp.next;
    }
    temp.next=null;

}

public void removeAt(int index){
    if(index==0){
        removeFromFront();
        return;
    }
    Node temp=head;
    Node n=null;

    for(int i=0;i<index-1;i++){
        temp=temp.next;
    }
    n=temp.next;
    temp.next=n.next;
}
public boolean isEmpty(){
    return head ==null;
}
public void printList(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
}
    




        public static void main(String[]args){
            OverAll o =new OverAll();

           o.addtofront(8);
            o.addtofront(7);
            o.addtofront(5);
            o.addtofront(4);


            o.addtoback(1);
            o.addtoback(2);

           o.addtoMiddle(2, 10);

            o.printList();
            o.removeFromFront();
            System.out.println();
            o.removefromback();
            System.out.println();
            
            o.printList();
            System.out.println();
            o.removeAt(2);
            o.isEmpty();
            o.printList();
        }
    }

