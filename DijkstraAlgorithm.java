// Name 
// Email


import java.util.HashMap;
import java.util.Map;

/**
 * DijkstraAlgorithm is an implementation of Dijkstra's shortest path algorithm.
 * It calculates the shortest path from a source node to all other nodes in a graph.
 */
public class DijkstraAlgorithm {
    private Graph graph;

    /**
     * Constructs a DijkstraAlgorithm instance with a given graph.
     *
     * @param graph the graph for which the shortest paths are to be calculated
     */
    public DijkstraAlgorithm(Graph graph) {
        this.graph = graph;
    }

    /**
     * Computes the shortest path from the source node to all other nodes in the graph.
     *
     * @param source the source node from which the shortest paths are calculated
     * @return a CustomHashMap mapping GraphNode to their shortest path distances from the source node
     */
    public CustomHashMap<GraphNode, Integer> shortestPath(DijkstraGraphNode source) {
        MinPriorityQueue queue = new MinPriorityQueue();
        CustomHashMap<GraphNode, Integer> distances = new CustomHashMap<>();
        CustomHashMap<GraphNode, GraphNode> previousNodes = new CustomHashMap<>();

        for (GraphNode node : graph.getNodes()) {
            distances.set(node, Integer.MAX_VALUE);
            previousNodes.set(node, null);
        }

        distances.set(source, 0);
        queue.insert(source);

        while (!queue.isEmpty()) {
            DijkstraGraphNode currentNode = queue.pullHighestPriorityElement();

            for (Map.Entry<GraphNode, Integer> entry : currentNode.getNeighbors().entrySet()) {
                GraphNode neighbor = entry.getKey();
                int weight = entry.getValue();
                int alternativePathDistance = distances.getValue(currentNode) + weight;

                if (alternativePathDistance < distances.getValue(neighbor)) {
                    distances.set(neighbor, alternativePathDistance);
                    previousNodes.set(neighbor, currentNode);
                    queue.insert((DijkstraGraphNode) neighbor);
                }
            }
        }

        return distances;
    }
}
