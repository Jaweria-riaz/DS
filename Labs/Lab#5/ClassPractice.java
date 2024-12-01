public class ClassPractice {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this .data=data;
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

    public void printlist(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;

        }
        System.out.println();
    }

    public void reverse(){
        Node temp=head;
        Node next=null;
        Node pre=null;
while(temp!=null){
        next=temp.next;
        temp.next=pre;
        pre=temp;
        temp=next;
}
head=pre;
    }

    public static void main(String []args){
        ClassPractice c=new ClassPractice();

        c.addtofront(1);
        c.addtofront(2);
        c.addtofront(3);
        c.addtofront(4);
        c.addtofront(5);

        System.out.println("before: ");
        c.printlist();

        System.out.println("After");
        c.reverse();
        c.printlist();

        
    }
}
