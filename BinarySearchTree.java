import java.util.*;

class Node {
     int data;
     Node left;
     Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class BinarySearchTree {
    Node root;

    public void insert(int data) {
        root = insertNode(root, data);
    }

    private Node insertNode(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data <= root.data) {
            root.left = insertNode(root.left, data);
        } else if (data >= root.data) {
            root.right = insertNode(root.right, data);
        }

        return root;
    }

    public boolean search(int data) {
        return searchNode(root, data);
    }

    private boolean searchNode(Node root, int data) {
        if (root == null) {
            return false;
        }

        if (data == root.data) {
            return true;
        } else if (data <= root.data) {
            return searchNode(root.left, data);
        } else {
            return searchNode(root.right, data);
        }
    }

    public void delete(int data) {
        root = deleteNode(root, data);
    }

    private Node deleteNode(Node root, int data) {
        if (root == null) {
            return null;
        }

        if (data < root.data) {
            root.left = deleteNode(root.left, data);
        } else if (data > root.data) {
            root.right = deleteNode(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.data = findMin(root.right);
            root.right = deleteNode(root.right, root.data);
        }

        return root;  
    }
    
    private int findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    private int findMax(Node root) {
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }
    public void inorderTraversal() {
        inorder(root);
    }

    private void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    public void displayTree() {
        display(root, 0);
    }

    private void display(Node root, int level) {
        if (root != null) {
            display(root.right, level + 1);
            for (int i = 0; i <= level; i++) {
                System.out.print("     ");
            }
            System.out.println(root.data);
            display(root.left, level + 1);
        }
    }
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements to insert: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements to insert:");
        for (int i = 0; i < n; i++) {
            bst.insert(scanner.nextInt());
        }

        System.out.print("Enter the element to search: ");
        boolean found = bst.search(scanner.nextInt());
        if (found) {
            System.out.println("Element found in the binary search tree.");
        } else {
            System.out.println("Element not found in the binary search tree.");
        }

        System.out.print("Enter the element to delete: ");

        bst.delete( scanner.nextInt());


        System.out.println(bst.findMax(bst.root));
        
        bst.displayTree();
        bst.inorderTraversal();

        scanner.close();
    }
}