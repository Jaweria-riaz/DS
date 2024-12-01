import java.util.Stack;
public class QueueStack {
  Stack s1,s2;

  QueueStack(){
    s1=new Stack();
    s2=new Stack();
  }  


  public void enqueue(int item){
    s1.push(item);
    System.out.println("added to queue"+item);
  }

  public int dequeue(){
if(s1.isEmpty()&& s2.isEmpty()){
    return -1;
}
if(s2.isEmpty()){
while(!s1.isEmpty()){
    s2.push(s1.pop());
}
}
return(int) s2.pop();
  }

  public static void main(String []args){
    QueueStack q = new QueueStack();
q.enqueue(1);
q.enqueue(2);
q.enqueue(3);
q.enqueue(4);
q.enqueue(5);

System.out.println(q.dequeue());
System.out.println(q.dequeue());
System.out.println(q.dequeue());
System.out.println(q.dequeue());
System.out.println(q.dequeue());
System.out.println(q.dequeue());
  }
}
