class Node 
{ 
    int data;        
    Node next;   
       
    public Node(int data) 
    {   
        this.data = data; 
        this.next = null; 
    } 
} 
public class Exercise4Lab4  {

     static Node rear = null;
     static Node front = null;

   void enqueue(int item)      
    { 
           Node newNode = new Node (item);
           if (front == null)   {
            front = newNode;
            rear = newNode;
         }
         else {
            rear.next= newNode;
            rear = newNode;
         }
         System.out.println("item" + " " + item);
    }

     int dequeue()       
    { 
     if (front == null) // or if (isEmpty())  
      {
        System.out.println("queue is khalli");
        return 0;
     }
     else {
        int k = front.data;
        front = front.next;
        return k;       }
     } 

    int peek() 
    { 
       if (front == null)   {
        System.out.println("Queue is empty");
       }
       else {
        System.out.println(front.data);
       }
       return front.data;
    }

     boolean isEmpty() 
    { 
          return front == null;
    } 

    public static void main(String[] args) 
    { 
        Exercise4Lab4  q = new Exercise4Lab4  (); 
        q.enqueue(1); 
        q.enqueue(2); 
        q.enqueue(3); 
        q.enqueue(4); 

        System.out.printf("Front element is %d\n", q.peek()); 

        System.out.println(q.dequeue()) ; 
        System.out.println(q.dequeue()) ; 
        System.out.println(q.dequeue()) ; 
        System.out.println(q.dequeue()) ; 

        if (q.isEmpty()) { 
            System.out.print("Queue is empty"); 
        } else { 
            System.out.print("Queue is not empty"); 
        } 
    }
}

