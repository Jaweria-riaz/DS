import java.util.LinkedList;
import java.util.Queue;

class BreathFirst {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public void BFT(Node root) {
        if (root != null) {
            Queue<Node> q = new LinkedList<>();
            q.add(root);

            while (!q.isEmpty()) {
                Node l = q.remove();
                System.out.println(l.data);

                if (l.left != null) {
                    q.add(l.left);
                }
                if (l.right != null) {
                    q.add(l.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        BreathFirst b = new BreathFirst();
        Node root = b.new Node(1);
        root.left = b.new Node(2);
        root.right = b.new Node(3);
        root.right.left = b.new Node(4);
        root.right.right = b.new Node(5);
        root.right.right.right = b.new Node(6);

        System.out.println("Breadth-First Traversal:");
        b.BFT(root);
    }
}
