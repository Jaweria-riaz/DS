public class Practice{
    Node head;
    int size=0;
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
        size++;
        if(head==null){
            head =newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

public void addtoback(int data){
    Node newNode =new Node(data);
    size++;
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

public void addtomiddle(int index,int data){
    Node newNode=new Node(data);
    size++;
    if(index==0){
        addtofront(data);
        return;
    }
    Node temp=head;
    for(int i=0;i<index-1;i++){
        temp=temp.next;
    }
   newNode.next= temp.next;
   temp.next=newNode;
}
public void removeFromFront(){
    head=head.next;
}
public void removefromback(){
    
    if(head==null){
head=null;
return;
    }
    Node temp=head;
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
public Boolean search(int key){
    Node temp=head;
while(temp!=null){
if(temp.data==key){
        return true;
    }
    temp=temp.next;
}
return false;
}

public int getLength(){
    int length=0;
    Node temp=head;
    if(temp!=null){
        length++;
        temp=temp.next;
    }
    return length;
}


public boolean isEmpty(){
    return head==null;
}
public int size(){
    return size;
}
    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String []args){
        Practice p=new Practice();
        p.addtofront(1);
        p.addtofront(2);
        p.addtoback(3);
        p.printList();
        p.addtomiddle(0, 7);
        System.out.println();
        p.printList();
        System.out.println();
        System.out.println( p.getLength());
        
        p.removefromback();
        p.printList();
        System.out.println();
        p.removeFromFront();
        p.printList();
        System.out.println();
        p.removeAt(1);
        System.out.println();
        p.printList();
        p.isEmpty();
        System.out.println( p.size());
        System.out.println(p.search(5));

       
   

    }
}