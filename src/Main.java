import HashMap.HashTable;
import Queue.StackQueue;
import Tree.BinaryTree;

public class Main {
    public static void main(String[] args) {

        var tree = new BinaryTree();

        tree.insert(25);
        tree.insert(15);
        tree.insert(10);
        tree.insert(4);
        tree.insert(12);
        tree.insert(22);
        tree.insert(18);
        tree.insert(24);
        tree.insert(50);
        tree.insert(35);
        tree.insert(31);
        tree.insert(44);
        tree.insert(70);
        tree.insert(66);
        tree.insert(90);

        tree.traversePreOrder();
        System.out.println();
        tree.traverseInOrder();
        System.out.println();
        tree.traversePostOrder();
        System.out.println();
        tree.traverseLevelOrder();
        System.out.println();
        System.out.println("tree.height() = " + tree.height());
        System.out.println("tree.find(10) = " + tree.find(99));

    }

    // 25, 15, 10, 4, 12, 22, 18, 24, 50, 35, 31, 44, 70, 66, 90 -> Pre-Order
    // 4, 10, 12, 15, 18, 22, 24, 25, 31, 35, 44, 50, 66, 70, 90 -> In-Order
    // 4, 12, 10, 18, 24, 22, 15, 31, 44, 35, 66, 90, 70, 50, 25 -> Post-Order

}
