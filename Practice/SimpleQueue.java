import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue {

    private Queue<Integer> queue;

    public SimpleQueue() {
        queue = new LinkedList<>();  // LinkedList implements the Queue interface
    }

    public void enqueue(int item){
        queue.add(item);

    }

    public int dequeue(){
        if(queue.isEmpty()){
            System.out.println("queue is empty");
        }
      
         return   queue.remove();
        
    }

    public int peek(){
        if(queue.isEmpty()){
            System.out.println("queue is empty");
        }
      
         return  queue.peek();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public static void main(String[] args) {
    SimpleQueue simpleQueue = new SimpleQueue();
    simpleQueue.enqueue(10);
    simpleQueue.enqueue(20);
    simpleQueue.enqueue(30);

    System.out.println("Peek: " + simpleQueue.peek());  // Output: 10
    System.out.println("Dequeued: " + simpleQueue.dequeue());  // Output: 10
    System.out.println("Dequeued: " + simpleQueue.dequeue());  // Output: 20
    System.out.println("Is empty: " + simpleQueue.isEmpty());  // Output: false
}
}
