public class Assignment {
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
}
else{
newNode.next=head;
head=newNode;
}
    }

    public void printlist(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
}

public int nthNodefromLast(int n){
    if(head==null){
        return LIST_EMPTY;
    }

    Node temp=head;
    int length=0;
while(temp!=null){
    length++;
    temp=temp.next;
}
temp=head;

for(int i=0;i<length-n;i++){
    temp=temp.next;
}
return temp.data;
}

public boolean search(int key){
Node temp=head;
while (temp!=null) {
    if(temp.data==key){
        return true;
    }
    temp=temp.next;
}
return false;
}

public void removeFromFront(){
   
        head=head.next;
    

}
public void removeFromBack(){
    Node temp=head;
    if(head==null){
        head=null;
    }
    while(temp.next.next!=null){
        temp=temp.next;
    }
    temp.next=null;
}

public void reverse(){
    if(head==null){
        System.out.println(LIST_EMPTY);
         return;
    }

    Node temp=head; 
    Node next=null;
   Node pre=null;

   while(temp!=null){
   next=temp.next;
   temp.next=pre;
   pre=temp;
   temp =next;
   }
   head=pre;
}

public void removeDuplicate(){
    if(head==null){
        System.out.println(LIST_EMPTY);
        return;
    }
    Node temp=head;
    while(temp!=null){
        Node current=temp;

        while(current.next!=null){
            if(current.next.data==temp.data){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
        }
        temp=temp.next;
    }
}
    public static void main(String []args){
        Assignment a=new Assignment();

        a.addtofront(1);
        a.addtofront(2);
        a.addtofront(3);
        a.addtofront(4);
        a.addtofront(3);
        a.addtofront(2);
System.out.println(a.search(4));
        a.printlist();
a.removeFromFront();
System.out.println();
a.printlist();
System.out.println();
        int n=2;
        int result=a.nthNodefromLast(n);

        if(result!=LIST_EMPTY){
            System.out.println(result);
        }
else{
    System.out.println("list is empty");
}

    
    System.out.println("reversed list");
a.reverse();
a.printlist();
    
    System.out.println();
    a.removeDuplicate();
    a.printlist();
    }

}
