public class Test {
    public static void main(String[] args) {
        // Test Entry class
        Entry<String, Integer> entry = new Entry<>("Hello", 42);
        System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());

        // Test CustomHashMap class
        CustomHashMap<DijkstraGraphNode, Integer> hashMap = new CustomHashMap<>();

        // Create some DijkstraGraphNode instances for testing
        DijkstraGraphNode node1 = new DijkstraGraphNode("1", true);
        DijkstraGraphNode node2 = new DijkstraGraphNode("2", true);
        DijkstraGraphNode node3 = new DijkstraGraphNode("3", false);

        // Test set method
        hashMap.set(node1, 10);
        hashMap.set(node2, 20);
        hashMap.set(node3, 30);

        // Test getValue method
        System.out.println("Value of node1: " + hashMap.getValue(node1));
        System.out.println("Value of node2: " + hashMap.getValue(node2));
        System.out.println("Value of node3: " + hashMap.getValue(node3));

        // Test hasKey method
        System.out.println("Has node1? " + hashMap.hasKey(node1));
        System.out.println("Has node2? " + hashMap.hasKey(node2));
        System.out.println("Has node3? " + hashMap.hasKey(node3));

        // Test MinPriorityQueue class
        MinPriorityQueue queue = new MinPriorityQueue();

        // Insert DijkstraGraphNodes into the MinPriorityQueue
        queue.insert(node1);
        queue.insert(node2);
        queue.insert(node3);

        // Test isEmpty() method
        System.out.println("Is the queue empty? " + queue.isEmpty());

        // Test pullHighestPriorityElement() method
        DijkstraGraphNode highestPriority = queue.pullHighestPriorityElement();
        System.out.println("Highest priority element: " + highestPriority.getId());

        // Test rebalance() method (change priority and rebalance)
        node1.priority = 5;
        queue.rebalance(node1);
        highestPriority = queue.pullHighestPriorityElement();
        System.out.println("New highest priority element: " + highestPriority.getId());

        // Test if CustomHashMap contains nodes
        System.out.println("Has node1? " + hashMap.hasKey(node1));
        System.out.println("Has node2? " + hashMap.hasKey(node2));
        System.out.println("Has node3? " + hashMap.hasKey(node3));
    }
}
