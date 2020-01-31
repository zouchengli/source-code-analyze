package site.clzblog.source.code.analyze.tree;

public class RedBlackTree {
    private Node root;

    class Node {
        private int value;
        private Node left;
        private Node right;
        private Color color;
        private Node parent;
    }

    public void insert(int value) {
        if (root == null) {
            Node node = new Node();
            node.parent = null;
            node.color = Color.BLACK;
            node.value = value;
            root = node;
        } else {
            Node node = insertValue(value);
            repair(node);
        }
    }

    private Node insertValue(int value) {
        return getPos(root, value);
    }

    private void repair(Node node) {
        if (node.parent.color == Color.RED) {
            Node g = node.parent.parent;
            Node p = node.parent;
            if ((g.left != null && Color.RED == g.left.color) && (g.right != null && Color.RED == g.right.color)) {
                g.left.color = Color.BLACK;
                p.color = Color.BLACK;
            }

            if ((g.left == null || Color.BLACK == g.left.color) && (p.right == node)) {
                rotateLeft(g);
                p.color = Color.BLACK;
                g.color = Color.RED;
            }
        }
    }

    private void rotateLeft(Node x) {
        Node y = x.right;
        x.right = y.left;
        if (y.left != null) y.left.parent = x;
        if (x.parent == null) root = y;
        else {
            if (x.parent.left == x) x.parent.left = y;
            else x.parent.right = y;
        }
        y.left = x;
        x.parent = y;
    }

    private Node getMax(Node node) {
        if (node != null) {
            if (node.right != null) return getMax(node.right);
            else return node;
        }
        return null;
    }

    public Node getPos(Node node, int value) {
        if (value > node.value) {
            if (node.right == null) {
                Node newNode = new Node();
                newNode.parent = node;
                newNode.color = Color.RED;
                newNode.value = value;
                node.right = newNode;
                return newNode;
            } else return getPos(node.right, value);
        } else {
            if (node.left == null) {
                Node newNode = new Node();
                newNode.parent = node;
                newNode.color = Color.RED;
                newNode.value = value;
                node.left = newNode;
                return newNode;
            } else return getPos(node.left, value);
        }
    }

    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        System.out.println("~~");
    }
}
