import java.util.Arrays;

public class PriorityQueueHeap {
    private int[] heap;   // Array to store the heap elements
    private int size;     // Current number of elements in the heap
    private int capacity; // Maximum capacity of the heap

    // Constructor to initialize the heap with a given capacity
    public PriorityQueueHeap(int capacity) {
        this.capacity = capacity;
        this.heap = new int[capacity];
        this.size = 0;
    }

    // Insert a new element into the priority queue
    public void insert(int value) {
        if (size == capacity) {
            throw new IllegalStateException("Priority Queue is full.");
        }
        heap[size] = value; // Place the value at the end of the heap
        size++;
        heapifyUp(size - 1); // Restore heap property
    }

    // Get the maximum value without removing it
    public int getMax() {
        if (size == 0) {
            throw new IllegalStateException("Priority Queue is empty.");
        }
        return heap[0]; // Root of the max-heap is the largest element
    }

    // Extract the maximum value and remove it from the priority queue
    public int extractMax() {
        if (size == 0) {
            throw new IllegalStateException("Priority Queue is empty.");
        }
        int maxValue = heap[0]; // Store the root value to return later
        heap[0] = heap[size - 1]; // Replace root with the last element
        size--;
        heapifyDown(0); // Restore heap property
        return maxValue;
    }

    // Restore the heap property moving up from the given index
    private void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;
        while (index > 0 && heap[index] > heap[parentIndex]) {
            // Swap the current element with its parent
            swap(index, parentIndex);
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
    }

    // Restore the heap property moving down from the given index
    private void heapifyDown(int index) {
        int largest = index;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;

        // Check if the left child is larger
        if (leftChild < size && heap[leftChild] > heap[largest]) {
            largest = leftChild;
        }

        // Check if the right child is larger
        if (rightChild < size && heap[rightChild] > heap[largest]) {
            largest = rightChild;
        }

        // If the largest is not the current index, swap and recurse
        if (largest != index) {
            swap(index, largest);
            heapifyDown(largest);
        }
    }

    // Swap two elements in the heap
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Check if the priority queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Get the current size of the priority queue
    public int getSize() {
        return size;
    }

    // Display the elements of the priority queue
    public void display() {
        if (size == 0) {
            System.out.println("Priority Queue is empty.");
            return;
        }
        System.out.println("Priority Queue (Heap): " + Arrays.toString(Arrays.copyOfRange(heap, 0, size)));
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        PriorityQueueHeap pq = new PriorityQueueHeap(10);

        pq.insert(10);
        pq.insert(5);
        pq.insert(20);
        pq.insert(15);

        pq.display();
        System.out.println("Max Value: " + pq.getMax());

        System.out.println("Extract Max: " + pq.extractMax());
        pq.display();

        System.out.println("Extract Max: " + pq.extractMax());
        pq.display();

        System.out.println("Is Empty: " + pq.isEmpty());
        System.out.println("Current Size: " + pq.getSize());
    }
}
