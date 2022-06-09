package Tree;

public class BinaryTree {

    private class Node {
        private int value;

        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    // Time Complexity -> 0(log n)
    public void insert(int item) {
        if (root == null) {
            root = new Node(item);
            return;
        }

        var current = root;
        while (true) {
            if (item > current.value) { // right
                if (current.right == null) {
                    current.right = new Node(item);
                    break;
                }
                current = current.right;
            } else { // left
                if (current.left == null) {
                    current.left = new Node(item);
                    break;
                }
                current = current.left;
            }
        }
    }

    // Time Complexity -> 0(n)
    public void traversePreOrder() {
        traversePreOrder(root);
    }

    private void traversePreOrder(Node root) {
        if (root == null) return;
        System.out.print(root.value + " ");
        traversePreOrder(root.left);
        traversePreOrder(root.right);
    }

    // Time Complexity -> 0(n)
    public void traverseInOrder() {
        traverseInOrder(root);
    }

    private void traverseInOrder(Node root) {
        if (root == null) return;
        traverseInOrder(root.left);
        System.out.print(root.value + " ");
        traverseInOrder(root.right);
    }

    // Time Complexity -> 0(n)
    public void traversePostOrder() {
        traversePostOrder(root);
    }

    private void traversePostOrder(Node root) {
        if (root == null) return;
        traversePostOrder(root.left);
        traversePostOrder(root.right);
        System.out.print(root.value + " ");
    }

    public int height() {
        return height(root);
    }

    private int height(Node root) {
        if (root == null)
            return 0;
        int lHeight = height(root.left);
        int rHeight = height(root.right);

        if (lHeight > rHeight)
            return (lHeight + 1);
        else
            return (rHeight + 1);
    }

    // Time Complexity -> 0(n)
    public void traverseLevelOrder() {
        int h = height();

        for (int i = 1; i <= h; i++) {
            printLevelOrder(root, i);
        }
    }

    private void printLevelOrder(Node root, int level) {
        if (root == null) return;
        if (level == 1) {
            System.out.print(root.value + " ");
        } else {
            printLevelOrder(root.left, level - 1);
            printLevelOrder(root.right, level - 1);
        }
    }

    // Time Complexity -> 0(log n)
    public boolean find(int item) {
        var current = root;
        while (current != null) {
            if (item < current.value) {
                current = current.left;
            } else if (item > current.value) {
                current = current.right;
            } else return true;
        }
        return false;
    }

}
