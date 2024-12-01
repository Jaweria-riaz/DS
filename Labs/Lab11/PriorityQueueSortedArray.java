class PriorityQueueSortedArray {
    
    private int[] arr;      // Array to store elements
    private int size;       // Current size of the queue
    private int capacity;   // Maximum capacity of the queue

    // Constructor to initialize the queue
    public  PriorityQueueSortedArray(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.size = 0;
        
    }

    // Method to insert an element into the queue in sorted order
    public void enqueue(int element) {
        if (size == capacity) {
            System.out.println("Priority Queue is full. Cannot enqueue " + element);
            return;
        }

        // Insert the element in its correct position to maintain ascending order
        int i = size - 1;
        while (i >= 0 && arr[i] > element) {
            arr[i + 1] = arr[i]; // Shift elements to the right
            i--;
        }
        arr[i + 1] = element; // Insert the new element
        size++;
    }

    // Method to remove and return the element with the highest priority (maximum element)
    public int extractMax() {
        if (size == 0) {
            throw new IllegalStateException("Priority Queue is empty.");
        }

        int maxElement = arr[size - 1]; // Last element is the max in sorted array
        size--; // Reduce size after removing the element
        return maxElement;
    }

    // Method to get the element with the highest priority without removing it
    public int getMax() {
        if (size == 0) {
            throw new IllegalStateException("Priority Queue is empty.");
        }
        return arr[size - 1]; // Last element is the max in sorted array
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to get the size of the queue
    public int getSize() {
        return size;
    }

    // Method to print the queue
    public void printQueue() {
        if (size == 0) {
            System.out.println("Priority Queue is empty.");
            return;
        }

        System.out.print("Priority Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


// Main class to test the PriorityQueue

    public static void main(String[] args) {
        PriorityQueueSortedArray pq = new  PriorityQueueSortedArray(5);

        pq.enqueue(10);
        pq.enqueue(20);
        pq.enqueue(15);
        pq.enqueue(30);
        pq.enqueue(5);

        pq.printQueue();

        System.out.println("Maximum element (getMax): " + pq.getMax());

        System.out.println("Extracted element with highest priority (extractMax): " + pq.extractMax());
        pq.printQueue();

        System.out.println("Extracted element with highest priority (extractMax): " + pq.extractMax());
        pq.printQueue();
    }

}