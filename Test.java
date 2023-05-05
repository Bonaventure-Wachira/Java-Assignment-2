// Name 
// Email


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Test class to demonstrate the functionality of CustomHashMap, DijkstraGraphNode, and MinPriorityQueue classes.
 */
public class Test {
    public static void main(String[] args) {
        // Create and populate a CustomHashMap
        CustomHashMap<String, Integer> customMap = new CustomHashMap<>();
        customMap.set("Hello", 42);

        // Create DijkstraGraphNode instances
        DijkstraGraphNode node1 = new DijkstraGraphNode("1", false);
        DijkstraGraphNode node2 = new DijkstraGraphNode("2", false);
        DijkstraGraphNode node3 = new DijkstraGraphNode("3", false);

        // Create a MinPriorityQueue and insert the nodes
        MinPriorityQueue queue = new MinPriorityQueue();
        queue.insert(node1);
        queue.insert(node2);
        queue.insert(node3);

        // Set priorities for the nodes
        node1.priority = 10;
        node2.priority = 20;
        node3.priority = 30;

        // Write the test results to a file named "answer.txt"
        try (PrintWriter writer = new PrintWriter(new File("answer.txt"))) {
            // Test CustomHashMap
            writer.println("Key: Hello, Value: " + customMap.getValue("Hello"));

            // Test MinPriorityQueue priority method
            writer.println("Value of node1: " + queue.priority(node1));
            writer.println("Value of node2: " + queue.priority(node2));
            writer.println("Value of node3: " + queue.priority(node3));

            // Test MinPriorityQueue contains method
            writer.println("Has node1? " + queue.contains(node1));
            writer.println("Has node2? " + queue.contains(node2));
            writer.println("Has node3? " + queue.contains(node3));

            // Test MinPriorityQueue isEmpty method
            writer.println("Is the queue empty? " + queue.isEmpty());

            // Test MinPriorityQueue extract_min method
            writer.println("Highest priority element: " + queue.extract_min().getId());
            writer.println("New highest priority element: " + queue.extract_min().getId());

            // Test MinPriorityQueue contains method after extraction
            writer.println("Has node1? " + queue.contains(node1));
            writer.println("Has node2? " + queue.contains(node2));
            writer.println("Has node3? " + queue.contains(node3));
        } catch (FileNotFoundException e) {
            System.out.println("Error: Unable to create answer.txt file");
            e.printStackTrace();
        }
    }
}
