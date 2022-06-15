import Graph.WeightedGraph;
import Trie.TrieArray;

public class Main {
    public static void main(String[] args) {

        var weightedGraph = new WeightedGraph();

        weightedGraph.addEdge("a", "b", 4);
        weightedGraph.addEdge("b", "c", 1);
        weightedGraph.addEdge("a", "c", 2);
        weightedGraph.addEdge("b", "d", 5);
        weightedGraph.addEdge("c", "d", 8);
        weightedGraph.addEdge("c", "e", 10);
        weightedGraph.addEdge("d", "e", 2);
        weightedGraph.addEdge("d", "z", 6);
        weightedGraph.addEdge("e", "z", 5);

        weightedGraph.print();

    }

    // 25, 15, 10, 4, 12, 22, 18, 24, 50, 35, 31, 44, 70, 66, 90 -> Pre-Order
    // 4, 10, 12, 15, 18, 22, 24, 25, 31, 35, 44, 50, 66, 70, 90 -> In-Order
    // 4, 12, 10, 18, 24, 22, 15, 31, 44, 35, 66, 90, 70, 50, 25 -> Post-Order

}
