import java.util.ArrayList;
import java.util.List;

public class Graph {
    private List<DijkstraGraphNode> nodes;

    public Graph() {
        nodes = new ArrayList<>();
    }

    public void addNode(DijkstraGraphNode node) {
        nodes.add(node);
    }

    public List<DijkstraGraphNode> getNodes() {
        return nodes;
    }
}
