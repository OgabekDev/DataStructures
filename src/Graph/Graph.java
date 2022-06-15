package Graph;

import java.util.*;

public class Graph {

    private class Node {
        private String value;

        public Node(String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

    }

    private Map<String, Node> nodes = new HashMap<>();
    private Map<Node, ArrayList<Node>> adjacencyList = new HashMap<>();

    public void print() {
        for (var source: adjacencyList.keySet()) {
            var targets = adjacencyList.get(source);
            if (!targets.isEmpty()) {
                System.out.println(source.value + " is connected to " + targets.toString());
            }
        }
    }

    public void addNode(String label) {
        var node = new Node(label);
        nodes.putIfAbsent(label, node);
        adjacencyList.put(node, new ArrayList<>());
    }

    public void addEdge(String from, String to) {
        var fromNode = nodes.get(from);
        if (fromNode == null) throw new IllegalArgumentException();
        var toNode = nodes.get(to);
        if (toNode == null) throw new IllegalArgumentException();

        adjacencyList.get(fromNode).add(toNode);
    }

    public void traverseBreadthFirst(String root) {
        var node = nodes.get(root);

        if (node == null) return;

        Set<Node> visited = new HashSet<>();
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            var current = queue.remove();
            if  (visited.contains(current)) {
                return;
            }
            System.out.println(current);
            visited.add(current);

            for (var neighbour: adjacencyList.get(current)) {
                if (!visited.contains(neighbour)) {
                    queue.add(neighbour);
                }
            }
        }

    }

}
