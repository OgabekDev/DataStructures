package Trie;

public class TrieArray {

    public class Node {
        private char value;
        private boolean isWord;
        private Node[] children;

        public Node(char value) {
            this.value = value;
            this.children = new Node[26];
            this.isWord = false;
        }
    }

    private Node root;

    public TrieArray() {
        root = new Node('\0');
    }

    // Time Complexity -> 0(n)
    public void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = Math.abs(c - 'a');

            if (curr.children[index] == null)
                curr.children[index] = new Node(c);

            curr = curr.children[index];
        }
        curr.isWord = true;
    }

    // Time Complexity -> 0(n)
    public boolean search(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = Math.abs(c - 'a');

            if (curr.children[index] == null) return false;
            curr = curr.children[index];

        }
        return curr.isWord;
    }

    // Time Complexity -> 0(n)
    public boolean startsWith(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            int index = Math.abs(c - 'a');

            if (curr.children[index] == null)
                return false;

            curr = curr.children[index];

        }
        return true;
    }

    // Time Complexity -> 0(n)
    public void traverse() {
        traverse(root);
    }

    private void traverse(Node root) {
        if (root != null) {
            System.out.print(root.value + " ");
            for (var child: root.children) {
                traverse(child);
            }
        }
    }

}
