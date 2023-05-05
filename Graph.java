// Name 
// Email


import java.util.ArrayList;
import java.util.List;


/**
 * A class representing a Graph, which consists of DijkstraGraphNodes.
 */
public class Graph {
    private List<DijkstraGraphNode> nodes;

    /**
     * Constructs an empty Graph with no nodes.
     */
    public Graph() {
        nodes = new ArrayList<>();
    }

    /**
     * Adds a DijkstraGraphNode to the Graph.
     *
     * @param node the node to be added
     */
    public void addNode(DijkstraGraphNode node) {
        nodes.add(node);
    }

    /**
     * Returns the list of DijkstraGraphNodes in the Graph.
     *
     * @return the list of DijkstraGraphNodes in the Graph
     */
    public List<DijkstraGraphNode> getNodes() {
        return nodes;
    }
}
