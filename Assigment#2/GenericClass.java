class linkedlist<T>{
    Node<T> head;
    int size=0;
    
    class Node<T>{
    T data;
    Node<T> next;
    Node(T data){
    this.data=data;
    this.next=null;
    }
    }
    void add( T data){
    Node<T> newnode = new Node<>(data);
    if (head==null){
    head=newnode;
    }
    else {
    Node<T> temp = head;
    while(temp.next!=null){
    temp=temp.next;
    }
    temp.next = newnode;
    }
    }
    void printlist(){
    Node<T> temp=head;
    while(temp.next!= null){
    System.out.println(temp.data + " ");
    temp=temp.next;
}
System.out.println(temp.data+" ");
}
}

public class GenericClass {
public static void main(String[] args) {
linkedlist<Object> li=new linkedlist<Object>();
li.add(12);
li.add("A");
li.printlist(); 
}
}
 