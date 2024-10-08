public class Duplicate {
    Node head;
    static final int LIST_EMPTY=1;
    
        class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
                this.next=null;
            }
        }
        
        public void addfront(int data){
            Node newNode =new Node(data);
            newNode.next=head;
            head=newNode;
                }
            
                public void printList(){
                    Node temp=head;
                    while(temp!=null){
                       System.out.print(temp.data+" ");
                        temp=temp.next;
                    }
                }


             public void removeDuplicates(){
                if(head==null){
                    System.out.println(LIST_EMPTY);
                      return ;
             }
             Node current = head;

             // Traverse the list with the current node
             while (current != null) {
                 Node runner = current;
                 
                 // Check for duplicates of the current node
                 while (runner.next != null) {
                     if (runner.next.data == current.data) {
                         // Remove the duplicate node
                         runner.next = runner.next.next;
                     } else {
                         runner = runner.next;
                     }
                 }
                 
                 // Move to the next node
                 current = current.next;
             }
         }
                public static void main(String []args){
                    Duplicate list=new Duplicate();
            
                    list.addfront(7);
                    list.addfront(4);
                    list.addfront(0);
                    list.addfront(5);
                    list.addfront(2);
                    list.addfront(4);
            
                    System.out.println("Original List:");
                    list.printList();
                    
                    list.removeDuplicates();
                    System.out.println();
                    System.out.println("List after removing duplicates:");
                    list.printList();
                }
            
                }
            
            
            

