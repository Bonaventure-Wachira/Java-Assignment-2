import java.util.HashMap;
import java.util.Map;

public class DijkstraGraphNode extends GraphNode {
    private Map<GraphNode, Integer> neighbors;

    public DijkstraGraphNode(String id, boolean goal) {
        super(id, goal);
        neighbors = new HashMap<>();
    }

    public void addNeighbor(GraphNode neighbor, int weight) {
        neighbors.put(neighbor, weight);
    }

    public Map<GraphNode, Integer> getNeighbors() {
        return neighbors;
    }
}
