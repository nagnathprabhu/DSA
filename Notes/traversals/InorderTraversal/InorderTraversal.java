package Notes.traversals.InorderTraversal;

public class InorderTraversal {
    
    private void inOrder(Node root) {
        
        if(root == null) return;

        inOrder(root.left);

        System.out.println(root.item);

        inOrder(root.right);
    }

    public static void main(String[] args) {
        // create an object of Tree
        InorderTraversal tree = new InorderTraversal();
        Node root = null;
        // create nodes of tree
        root = new Node(1);
        root.left = new Node(12);
        root.right = new Node(9);

        // create child nodes of left child
        root.left.left = new Node(5);
        root.left.right = new Node(6);

        System.out.println("In Order traversal");
        tree.inOrder(root);
    }

}

class Node {
    int item;
    Node left, right;
  
    public Node(int key) {
    item = key;
    left = right = null;
    }
}