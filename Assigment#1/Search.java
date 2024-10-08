public class Search {
    Node head;
    class Node{
        int data;
        Node next;


        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void add(int data){
Node node=new Node(data);
node.next=head;
head=node;

}
    



public void printList(){
    Node temp=head;
while(temp!=null){
    System.out.print(temp.data+"->");
    temp=temp.next;
}


}


    public boolean searchNode(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
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
    public static void main(String []args){
Search s=new Search();
s.add(1);
s.add(2);
s.add(3);
s.add(4);
s.add(5);
s.printList();
System.out.println();
System.out.println(s.searchNode(2));
System.out.println(s.searchNode(6));
System.out.println(s.getLength());
    }

    }
