// Name 
// Email


import java.util.HashMap;
import java.util.Map;

/**
 * DijkstraGraphNode is an extension of GraphNode that represents a node in a weighted graph.
 * It contains a list of neighbors and the corresponding edge weights.
 */
public class DijkstraGraphNode extends GraphNode {
    private Map<GraphNode, Integer> neighbors;

    /**
     * Constructs a DijkstraGraphNode with a given ID and goal status.
     *
     * @param id   the unique identifier of the node
     * @param goal indicates if the node is a goal node
     */
    public DijkstraGraphNode(String id, boolean goal) {
        super(id, goal);
        neighbors = new HashMap<>();
    }

    /**
     * Adds a neighbor with a corresponding edge weight to this node.
     *
     * @param neighbor the neighboring node
     * @param weight   the weight of the edge between this node and the neighbor
     */
    public void addNeighbor(GraphNode neighbor, int weight) {
        neighbors.put(neighbor, weight);
    }

    /**
     * Returns a map of neighboring nodes and their corresponding edge weights.
     *
     * @return the map of neighbors and edge weights
     */
    public Map<GraphNode, Integer> getNeighbors() {
        return neighbors;
    }
}
