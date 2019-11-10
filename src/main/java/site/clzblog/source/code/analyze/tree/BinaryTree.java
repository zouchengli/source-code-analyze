package site.clzblog.source.code.analyze.tree;

public class BinaryTree {
    private int leaf;
    private BinaryTree left;
    private BinaryTree right;

    private BinaryTree(int leaf) {
        this.leaf = leaf;
    }

    private static void insert(BinaryTree root, int leaf) {
        if (leaf > root.leaf) {
            if (root.right == null) root.right = new BinaryTree(leaf);
            else insert(root.right, leaf);
        } else {
            if (root.left == null) root.left = new BinaryTree(leaf);
            else insert(root.left, leaf);
        }
    }

    private static void search(BinaryTree root) {
        if (null != root) {
            search(root.left);
            System.out.println(root.leaf);
            search(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(0);
        insert(root, 1);
        insert(root, 2);
        search(root);
    }
}
