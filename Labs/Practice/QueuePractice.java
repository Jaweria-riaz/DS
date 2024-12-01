public class QueuePractice {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node rear= null;
    Node front= null;


    public boolean isEmpty(){
        return front==null;
    }

    public void enqueue(int item){
Node newNode =new Node(item);
if(rear==null){
    front=rear=newNode;
}
else{
    rear.next=newNode;
  rear=newNode;
}
    }


    public int dequeue(){
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int frontdata=front.data;
        front=front.next;
    
    if(front==null){
        rear=null;
    }
    return frontdata;
}

public int peek(){

    if (isEmpty()) {
        System.out.println("Queue is empty");
        return -1;
    }
    return front.data;  // Return front element data
}

public void displayQueue(){
    if(isEmpty()){
        System.out.println("Queue is empty");
} else {
    System.out.println("Queue is not empty");
}


Node temp=front;
while(temp!=null){
    System.out.print(temp.data+"  ");
    temp=temp.next;
}
System.out.println();
    }



public static void main(String[]args){
QueuePractice q=new QueuePractice();
 q.enqueue(1);
 q.enqueue(3);
 q.enqueue(5);
 q.enqueue(7);
 q.enqueue(0);

 System.out.println("Front element:"+q.peek());


 q.dequeue();
 q.dequeue();
 q.dequeue();
 q.dequeue();
 q.dequeue();
 if (q.isEmpty()) {
    System.out.println("Queue is empty");
} else {
    System.out.println("Queue is not empty");
}

q.displayQueue();
}
}


