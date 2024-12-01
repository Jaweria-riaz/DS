
import java.util.Stack;

class PrintReverse {
class Node {
    String data;
    Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }
}

    Node head;

    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void printInReverse() {
        Stack<String> stack = new Stack<>();
        Node temp = head;

        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        PrintReverse list = new PrintReverse();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println("Linked list in reverse order:");
        list.printInReverse();
    }
}