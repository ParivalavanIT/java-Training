import java.util.*;

class Node {
    int val ;
    Node right;
    Node left ;
    public Node(int val){
        this.val = val;
        this.right = null;
        this.left = null;
    }
}
public class TreeWithQueue {
    Node root;
    public TreeWithQueue(){
        this.root = null;
    }
    void insert(int data){
        Node newNode  = new Node(data);
        if(root==null){
            root=newNode;
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while (!q.isEmpty()) {

            Node current = q.poll();

            if (current.left == null) {
                current.left = newNode;
                return;
            } else if (current.right == null) {
                current.right = newNode;
                return;
            }

            q.add(current.left);
            q.add(current.right);
        }
    }
    
    public void displayTree() {
        display(root, 0);
    }

    private void display(Node root, int level) {
        if (root != null) {
            display(root.right, level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("    ");
            }
            System.out.println(root.val);
            display(root.left, level + 1);
        }
    }
    public static void main(String[] args) {
        TreeWithQueue tree = new TreeWithQueue();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);
        tree.displayTree();
    }
}
