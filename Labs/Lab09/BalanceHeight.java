public class BalanceHeight{
    Node root;
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public void addNode(int data) {
        root = addNodeRecursively(root, data);
    }

    private Node addNodeRecursively(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = addNodeRecursively(root.left, data);
        } else if (data > root.data) {
            root.right = addNodeRecursively(root.right, data);
        } else {
            System.out.println("Duplicate value found: " + data);
        }
        return root;
    }

   public int isBalanced(Node root) {
        if (root == null) {
            return 0; // Height of an empty tree is 0
        }

        int leftHeight = isBalanced(root.left);
        if (leftHeight == -1) return -1; // Left subtree is not balanced

        int rightHeight = isBalanced(root.right);
        if (rightHeight == -1) return -1; // Right subtree is not balanced

        // Check if the current node is balanced
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1; // Current node is not balanced
        }

        // Return height of the current subtree
        return 1 + Math.max(leftHeight, rightHeight);
    }


    public static void main(String[]args){
        BalanceHeight b=new BalanceHeight();

        b.addNode(4);
        b.addNode(10);
        b.addNode(9);
        b.addNode(34);

        System.out.println("Is the tree balanced? " + b.isBalanced(b.root));
    }

}
