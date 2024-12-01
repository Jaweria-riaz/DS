public class LinkedSingle {
    Node head;
    static final int LIST_EMPTY = -1;

  
    class Node {
        int data;   
        Node next;  

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    
    public void addFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head; 
        head = newNode;       
    }

    
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " "); 
            temp = temp.next;
        }
        System.out.println();  
    }

   
    public int nthFromLast(int n) {
        if(head==null){
            return LIST_EMPTY;
        }
     
        int length=0;
        Node temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }

        if(n>length|| n<=0){
            return LIST_EMPTY;
        }
        temp=head;
for(int i=0;i<length-n;i++){
    temp=temp.next;
   
}
return temp.data;
       }
       
        public static void main(String[] args) {
        LinkedSingle s = new LinkedSingle();

       
        s.addFront(1);
        s.addFront(2);
        s.addFront(3);
        s.addFront(4);

        
        s.printList();  

        
       int n=3;
       int result=s.nthFromLast(n);

       if(result!=LIST_EMPTY){
        System.out.println(result);
       }
       else{
        System.out.println("the list is empty");
       }
    }

}
