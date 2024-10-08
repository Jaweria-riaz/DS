public class QueueInArray {
    
 private int arr[];
 private int front;
 private int rear;
 private int capacity;
 private int count;

 QueueInArray(int size){
arr = new int[size];
 capacity = size;
 front = 0;
 rear = 0;
 count = 0;
 }

 public void enqueue(int item)
 {
if(isFull()){
    System.out.println("Queue is underflow");
}
rear=(rear+1)%capacity;
arr[rear]=item;
count++;
}
 
public void dequeue()
 {
    if(isEmpty()){
        System.out.println("queue is underflow");
        return;
    }
    System.out.println("Removing"+ arr[front]);
    front=(front+1)%capacity;
    count--;


 }
 public int peek()
 {
if(isEmpty())
{
    System.out.println("queue is Empty");
    return -1;
}
return arr[front];
 }


 public int size()
 {
return count;
 }

 public Boolean isEmpty()
 {
return (count==0);
 }

 public Boolean isFull()
 {
return (count==capacity);
 }


 public static void main(String []args){
    QueueInArray q=new QueueInArray(5);
q.enqueue(1);
q.enqueue(2);
q.enqueue(3);
    System.out.println("Front element is:"+q.peek());
    q.dequeue();
    System.out.println("Front element is:"+q.peek());
    System.out.println("Front element is:"+q.size());

    q.dequeue();;
    q.dequeue();


    if(q.isEmpty()){
        System.out.println("queue is Empty");
    }
    else{
        System.out.println("queue is not Empty");
    }
 }
}