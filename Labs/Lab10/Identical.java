public class Identical {
   
        static class Node {
            int data;
            Node left, right;
    
            Node(int data) {
                this.data = data;
                left = right = null;
            }
        }
    
        // Method to check if two binary trees are identical
        public boolean isIdentical(Node x, Node y) {
            // If both nodes are null, the trees are identical
            if (x == null && y == null) {
                return true;
            }
    
            // If one of them is null, the trees are not identical
            if (x == null || y == null) {
                return false;
            }
    
            // Check if the data matches and recursively check the left and right subtrees
            return (x.data == y.data) && isIdentical(x.left, y.left) && isIdentical(x.right, y.right);
        }
    
        public static void main(String[] args) {
            Identical tree = new Identical();
    
            // Creating first binary tree
            Node root1 = new Node(1);
            root1.left = new Node(2);
            root1.right = new Node(3);
    
            // Creating second binary tree
            Node root2 = new Node(1);
            root2.left = new Node(2);
            root2.right = new Node(3);
    
            // Check if the trees are identical
            if (tree.isIdentical(root1, root2)) {
                System.out.println("The binary trees are identical.");
            } else {
                System.out.println("The binary trees are not identical.");
            }
        }
    }
    

