class AVLTree {

    class Node {
        int data;
        Node left, right;
        int height;

        Node(int data) {
            this.data = data;
            this.height = 1;
        }
    }

    private Node root;

    // Get the height of the tree
    int height(Node node) {
        return (node == null) ? 0 : node.height;
    }

    // Get the balance factor of a node
    int getBalance(Node node) {
        return (node == null) ? 0 : height(node.left) - height(node.right);
    }

    // Right Rotation
    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x; // New root
    }

    // Left Rotation
    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y; // New root
    }

    // Insert a node
    Node insert(Node node, int data) {
        // 1. Perform the normal BST insertion
        if (node == null) return new Node(data);

        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        } else {
            return node; // Duplicate data is not allowed
        }

        // 2. Update height of this ancestor node
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // 3. Get the balance factor of this node
        int balance = getBalance(node);

        // If this node becomes unbalanced, then there are 4 cases

        // Left Left Case
        if (balance > 1 && data < node.left.data) {
            return rightRotate(node);
        }

        // Right Right Case
        if (balance < -1 && data > node.right.data) {
            return leftRotate(node);
        }

        // Left Right Case
        if (balance > 1 && data > node.left.data) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left Case
        if (balance < -1 && data < node.right.data) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node; // return the (unchanged) node pointer
    }

    // Pre-order traversal
    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    // Utility function to insert a new node
    void insert(int data) {
        root = insert(root, data);
    }

    // Utility function to print the preorder traversal of the tree
    void preOrder() {
        preOrder(root);
    }
}

public class Main {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        // Test cases: Inserting values into the AVL tree
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(25);

        // Print preorder traversal of the tree
        System.out.println("Preorder traversal of the constructed AVL tree is:");
        tree.preOrder();
    }
}
