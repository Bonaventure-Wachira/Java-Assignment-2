import java.util.ArrayList;

public class MinPriorityQueue {
    private ArrayList<DijkstraGraphNode> heap;

    public MinPriorityQueue() {
        heap = new ArrayList<>();
        heap.add(null);
    }

    public void insert(DijkstraGraphNode node) {
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

    public DijkstraGraphNode pullHighestPriorityElement() {
        if (heap.size() <= 1) {
            return null;
        }

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

    public boolean isEmpty() {
        return heap.size() == 1;
    }

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

    private void swap(int index1, int index2) {
        DijkstraGraphNode temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    public int priority(DijkstraGraphNode node) {
        int index = heap.indexOf(node);
        return heap.get(index).priority;
    }
    
    public boolean contains(DijkstraGraphNode node) {
        return heap.contains(node);
    }
    
    public DijkstraGraphNode extract_min() {
        return pullHighestPriorityElement();
    }
    
}
