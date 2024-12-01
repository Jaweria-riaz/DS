public class MinMaxBinary {
    Node root;

class Node{
int data;
Node left;
Node right;

Node(int data){
this.data=data;
this.left=null;
this.right=null;
    }
}


public void addNode(int data){
    root=addNodeRecursively(root,data);
}

public Node addNodeRecursively(Node root,int data ){
    if(root==null){
        return new Node(data);
    }
if(data<root.data){
    root.left=addNodeRecursively(root.left, data);
}
else if(data>root.data){
    root.right=addNodeRecursively(root.right, data);
}
else{
    System.out.println(data);
}
return root;
}


public int minNumber() {
    return minNumberRecursive(root);
}

private int minNumberRecursive(Node root) {
    if (root == null) {
        return Integer.MIN_VALUE; 
    }
    if (root.left == null) {
        return root.data; 
    }
    return minNumberRecursive(root.left);
}

public int maxNumber(){
return maxNumberRecursive(root);
}

public int maxNumberRecursive(Node root){
    if(root==null){
        return Integer.MAX_VALUE;
    }

  if(root.right==null){
    return root.data;
  }  
  return maxNumberRecursive(root.right);
}


public static void main(String[]args){
    MinMaxBinary b=new MinMaxBinary();

    b.addNode(23);
    b.addNode(12);
    b.addNode(6);
    b.addNode(89);

    System.out.println("Minimum value in the tree: " + b.minNumber());
    System.out.println("Maximum value in the tree: " + b.maxNumber());
}
}
