class BinaryTree2 {
    // Root of Binary Tree
    Node root;

    // Node class to represent each node in the tree
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Constructors
    public BinaryTree2(int key) {
        root = new Node(key);
    }

    public BinaryTree2() {
        root = null;
    }

    // Method to add a node to the binary search tree
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

    // Method to search a node in the binary search tree
    public boolean searchNode(int data) {
        return searchNodeRecursively(root, data);
    }

    private boolean searchNodeRecursively(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        }
        if (data < root.data) {
            return searchNodeRecursively(root.left, data);
        } else {
            return searchNodeRecursively(root.right, data);
        }
    }

    // Method to count the number of nodes in the binary tree
    public int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + countOfNodes(root.left) + countOfNodes(root.right);
    }

    // Method to get the height of the binary tree
    public int balanceheight(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = balanceheight(root.left);
        int rightHeight = balanceheight(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        BinaryTree2 tree = new BinaryTree2();

        // Adding nodes to the tree
        tree.addNode(50);
        tree.addNode(30);
        tree.addNode(70);
        tree.addNode(20);
        tree.addNode(40);
        tree.addNode(60);
        tree.addNode(80);

        // Testing searchNode method
        System.out.println("Searching for 40: " + tree.searchNode(40)); // Should return true
        System.out.println("Searching for 90: " + tree.searchNode(90)); // Should return false

        // Testing countOfNodes method
        System.out.println("Number of nodes: " + tree.countOfNodes(tree.root)); // Should return the total number of nodes

        // Testing height method
        System.out.println("Height of tree: " + tree.balanceheight(tree.root)); // Should return the height of the tree
    }
}
