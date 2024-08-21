
class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTree {
    TreeNode root;

    void Insert(int value) {
        root = InsertRecord(root, value);
    }

    TreeNode InsertRecord(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.value) {
            root.left = InsertRecord(root.left, value);
        } else if (value > root.value) {
            root.right = InsertRecord(root.right, value);
        }

        return root;
    }

    boolean Search(int value) {
        return SearchRecord(root, value);

    }

    boolean SearchRecord(TreeNode root, int value) {
        if (root == null) {
            return false;
        } else if (value == root.value) {
            return true;
        } else if (value < root.value) {
            return SearchRecord(root.left, value);
        } else if (value > root.value) {
            return SearchRecord(root.right, value);
        }
        return true;
    }

    // pre order traversel
    void Preorder() {
        PreorderTraversal(root);
    }

    void PreorderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.value + " ");
            PreorderTraversal(root.left);
            PreorderTraversal(root.right);
        }
    }

    // in order traversel

    void Inorder() {
        InorderTraversal(root);
    }

    void InorderTraversal(TreeNode root) {
        if (root != null) {
            InorderTraversal(root.left);
            System.out.print(root.value + " ");
            InorderTraversal(root.right);
        }
    }

    // post order traversel

    void Postorder() {
        PostorderTraversal(root);
    }

    void PostorderTraversal(TreeNode root) {
        if (root != null) {
            PostorderTraversal(root.left);
            PostorderTraversal(root.right);
            System.out.print(root.value + " ");
        }
    }

    void Delete(int value) {
        root = InsertRecord(root, value);
    }

    TreeNode DeleteRecord(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.value) {
            root.left = DeleteRecord(root.left, value);
        } else if (value > root.value) {
            root.right = DeleteRecord(root.right, value);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.value = minValue(root.right);
            root.right = DeleteRecord(root.right, root.value);
        }

        return root;
    }

    int minValue(TreeNode root) {
        int current = root.value;
        while (root.left != null) {
            current = root.left.value;
            root = root.left;
        }
        return current;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.Insert(10);
        bst.Insert(16);
        bst.Insert(8);
        bst.Insert(13);
        bst.Search(5);
        bst.Delete(8);
        System.out.println("preorder:");
        bst.Preorder();
        System.out.println(" ");
        System.out.println("inorder:");
        bst.Inorder();
        System.out.println(" ");
        System.out.println("Postorder:");
        bst.Postorder();

    }
}
