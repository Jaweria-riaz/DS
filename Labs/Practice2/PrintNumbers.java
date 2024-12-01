class PrintNumbers {
    // Function to print numbers from 1 to N
    public static void printNumbers(int current, int N) {
        if (current > N) {
            return; // Base case: stop when current exceeds N
        }
        System.out.print(current + " ");
        printNumbers(current + 1, N); // Recursive call with incremented value
    }

    public static void main(String[] args) {
        int N = 10; // Example value
        printNumbers(1, N); // Start printing from 1 to N
    }
}
