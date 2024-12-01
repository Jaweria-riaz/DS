
    
    class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTree {
Node root;
    // Preorder Traversal
    public void preorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " "); // Visit the root node
        preorderTraversal(root.left);      // Traverse the left subtree
        preorderTraversal(root.right);     // Traverse the right subtree
    }

    // Inorder Traversal
    public void inorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);        // Traverse the left subtree
        System.out.print(root.data + " ");  // Visit the root node
        inorderTraversal(root.right);       // Traverse the right subtree
    }

    // Postorder Traversal
    public void postorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        postorderTraversal(root.left);      // Traverse the left subtree
        postorderTraversal(root.right);     // Traverse the right subtree
        System.out.print(root.data + " ");  // Visit the root node
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.print("Preorder traversal: ");
        tree.preorderTraversal(tree.root);

        System.out.print("\nInorder traversal: ");
        tree.inorderTraversal(tree.root);

        System.out.print("\nPostorder traversal: ");
        tree.postorderTraversal(tree.root);
    }
}


