class PriorityQueue {
    private int[] arr;      // Array to store elements
    private int size;       // Current size of the queue
    private int capacity;   // Maximum capacity of the queue

    // Constructor to initialize the queue
    public PriorityQueue(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.size = 0;
    }

    // Method to insert an element into the queue
    public void enqueue(int element) {
        if (size == capacity) {
            System.out.println("Priority Queue is full. Cannot enqueue " + element);
            return;
        }
        arr[size++] = element; // Add the element at the end
    }

    // Method to remove the element with the highest priority
    public int dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Priority Queue is empty.");
        }

        int highestPriorityIndex = 0;

        // Find the index of the highest priority element
        for (int i = 1; i < size; i++) {
            if (arr[i] > arr[highestPriorityIndex]) { // Assuming higher value means higher priority
                highestPriorityIndex = i;
            }
        }

        int highestPriorityElement = arr[highestPriorityIndex];

        // Shift elements to remove the highest priority element
        for (int i = highestPriorityIndex; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--; // Reduce size after removing the element
        return highestPriorityElement;
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


// Main class to test the PriorityQ
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(5);

        pq.enqueue(10);
        pq.enqueue(20);
        pq.enqueue(15);
        pq.enqueue(30);
        pq.enqueue(5);

        pq.printQueue();

        System.out.println("Dequeued element with highest priority: " + pq.dequeue());
        pq.printQueue();

        System.out.println("Dequeued element with highest priority: " + pq.dequeue());
        pq.printQueue();
    }
}
