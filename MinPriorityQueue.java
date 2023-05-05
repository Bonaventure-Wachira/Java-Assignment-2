// Name 
// Email


import java.util.ArrayList;

/**
 * A min-priority queue implementation using a binary heap data structure.
 */
public class MinPriorityQueue {
    private ArrayList<DijkstraGraphNode> heap;

    /**
     * Constructor that initializes the priority queue.
     */
    public MinPriorityQueue() {
        heap = new ArrayList<>();
        heap.add(null);
    }

    /**
     * Inserts a new node into the priority queue.
     * @param node The node to be inserted.
     */
    public void insert(DijkstraGraphNode node) {
        // Add the new node and perform up-heap operation
        heap.add(node);
        int currentIndex = heap.size() - 1;

        while (currentIndex > 1) {
            int parentIndex = currentIndex / 2;

            if (heap.get(currentIndex).priority >= heap.get(parentIndex).priority) {
                break;
            }

            swap(currentIndex, parentIndex);
            currentIndex = parentIndex;
        }
    }

    /**
     * Removes and returns the highest-priority element from the priority queue.
     * @return The highest-priority element.
     */
    public DijkstraGraphNode pullHighestPriorityElement() {
        if (heap.size() <= 1) {
            return null;
        }

        // Remove the highest-priority node and perform down-heap operation
        DijkstraGraphNode highestPriorityNode = heap.get(1);
        heap.set(1, heap.remove(heap.size() - 1));
        int currentIndex = 1;

        while (true) {
            int leftChildIndex = currentIndex * 2;
            int rightChildIndex = currentIndex * 2 + 1;

            if (leftChildIndex >= heap.size()) {
                break;
            }

            int minChildIndex = leftChildIndex;

            if (rightChildIndex < heap.size() && heap.get(rightChildIndex).priority < heap.get(leftChildIndex).priority) {
                minChildIndex = rightChildIndex;
            }

            if (heap.get(currentIndex).priority <= heap.get(minChildIndex).priority) {
                break;
            }

            swap(currentIndex, minChildIndex);
            currentIndex = minChildIndex;
        }

        return highestPriorityNode;
    }

    /**
     * Checks if the priority queue is empty.
     * @return True if the priority queue is empty, false otherwise.
     */
    public boolean isEmpty() {
        return heap.size() == 1;
    }

    /**
     * Rebalances the priority queue after a node's priority has been modified.
     * @param node The node that has been modified.
     */
    public void rebalance(DijkstraGraphNode node) {
        int currentIndex = heap.indexOf(node);

        while (currentIndex > 1) {
            int parentIndex = currentIndex / 2;

            if (heap.get(currentIndex).priority >= heap.get(parentIndex).priority) {
                break;
            }

            swap(currentIndex, parentIndex);
            currentIndex = parentIndex;
        }
    }

    /**
     * Swaps two elements in the heap.
     * @param index1 The index of the first element.
     * @param index2 The index of the second element.
     */
    private void swap(int index1, int index2) {
        DijkstraGraphNode temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    /**
     * Returns the priority of a node.
     * @param node The node for which the priority is requested.
     * @return The priority of the node.
     */
    public int priority(DijkstraGraphNode node) {
        int index = heap.indexOf(node);
        return heap.get(index).priority;
    }
    
    /**
     * Checks if the priority
    priority queue contains a node.
    @param node The node to check.
    @return True if the node is in the priority queue, false otherwise.
    */
    public boolean contains(DijkstraGraphNode node) {
        return heap.contains(node);
    }

    /**
    Extracts and returns the minimum-priority element from the priority queue.
    @return The minimum-priority element.
    */
    public DijkstraGraphNode extract_min() {
        return pullHighestPriorityElement();
    }
}