import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class CompleteBinary{
    Node root;

    // Method to check if the binary tree is complete
    boolean isCompleteBinaryTree() {
        if (root == null) {
            return true;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        boolean flag = false;

        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();

            // If we find a node with a right or left child missing after flag is set, the tree is not complete
            if (currentNode.left != null) {
                if (flag) {
                    return false;
                }
                queue.add(currentNode.left);
            } else {
                flag = true;
            }

            if (currentNode.right != null) {
                if (flag) {
                    return false;
                }
                queue.add(currentNode.right);
            } else {
                flag = true;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        CompleteBinary tree = new CompleteBinary();

        // Creating a complete binary tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);

        if (tree.isCompleteBinaryTree()) {
            System.out.println("The binary tree is complete.");
        } else {
            System.out.println("The binary tree is not complete.");
        }
    }
}
