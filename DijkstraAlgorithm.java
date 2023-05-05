import java.util.HashMap;
import java.util.Map;

public class DijkstraAlgorithm {
    private Graph graph;

    public DijkstraAlgorithm(Graph graph) {
        this.graph = graph;
    }

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
