class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class Tree {
    TreeNode root;

    public Tree() {
        this.root = null;
    }

    public void insert(int val) {
        root = insertNode(root, val);
    }

    private TreeNode insertNode(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (val < root.val) {
            root.left = insertNode(root.left, val);
        } else if (val > root.val) {
            root.right = insertNode(root.right, val);
        }

        return root;
    }

    public void inorderTraversal() {
        inorder(root);
        System.out.println();
    }
    
    private void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    public void postorderTraversal() {
        postorder(root);
        System.out.println();
    }

    private void postorder(TreeNode root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.val + " ");
        }
    }
    public void displayTree() {
        display(root, 0);
    }

    private void display(TreeNode root, int level) {
        if (root != null) {
            display(root.right, level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("    ");
            }
            System.out.println(root.val);
            display(root.left, level + 1);
        }
    }
    public void preorderTraversal() {
        preorder(root);
        System.out.println();
    }

    private void preorder(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public boolean search(int val) {
        return searchNode(root, val);
    }

    private boolean searchNode(TreeNode root, int val) {
        if (root == null) {
            return false;
        }

        if (val == root.val) {
            return true;
        } else if (val < root.val) {
            return searchNode(root.left, val);
        } else {
            return searchNode(root.right, val);
        }
    }
    
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);

        System.out.println("Inorder traversal of the tree:");
        tree.inorderTraversal();
        System.out.println("Preorder traversal of the tree:");
        tree.preorderTraversal();
        System.out.println("Postorder traversal of the tree:");
        tree.postorderTraversal();
        int searchValue = 6;
        boolean found = tree.search(searchValue);
        if (found) {
            System.out.println(searchValue + " is found in the tree.");
        } else {
            System.out.println(searchValue + " is not found in the tree.");
        }
        tree.displayTree();
    }
}