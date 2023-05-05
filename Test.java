import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test {
    public static void main(String[] args) {
        CustomHashMap<String, Integer> customMap = new CustomHashMap<>();
        customMap.set("Hello", 42);

        DijkstraGraphNode node1 = new DijkstraGraphNode("1", false);
        DijkstraGraphNode node2 = new DijkstraGraphNode("2", false);
        DijkstraGraphNode node3 = new DijkstraGraphNode("3", false);

        MinPriorityQueue queue = new MinPriorityQueue();
        queue.insert(node1);
        queue.insert(node2);
        queue.insert(node3);

        node1.priority = 10;
        node2.priority = 20;
        node3.priority = 30;

        try (PrintWriter writer = new PrintWriter(new File("answer.txt"))) {
            writer.println("Key: Hello, Value: " + customMap.getValue("Hello"));
            writer.println("Value of node1: " + queue.priority(node1));
            writer.println("Value of node2: " + queue.priority(node2));
            writer.println("Value of node3: " + queue.priority(node3));
            writer.println("Has node1? " + queue.contains(node1));
            writer.println("Has node2? " + queue.contains(node2));
            writer.println("Has node3? " + queue.contains(node3));
            writer.println("Is the queue empty? " + queue.isEmpty());
            writer.println("Highest priority element: " + queue.extract_min().getId());
            writer.println("New highest priority element: " + queue.extract_min().getId());
            writer.println("Has node1? " + queue.contains(node1));
            writer.println("Has node2? " + queue.contains(node2));
            writer.println("Has node3? " + queue.contains(node3));
        } catch (FileNotFoundException e) {
            System.out.println("Error: Unable to create answer.txt file");
            e.printStackTrace();
        }
    }
}
