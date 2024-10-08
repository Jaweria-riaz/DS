class StackArrayy {
    private int arr[];
    private int top;
    private int capacity;

    // Constructor to initialize stack
    StackArrayy(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Utility function to add an element x in the stack and check for stack overflow
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    // Utility function to pop the top element from the stack and check for stack underflow
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        System.out.println("Removing " + arr[top]);
        return arr[top--];
    }

    // Utility function to return the top element in a stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    // Utility function to return the size of the stack
    public int size() {
        return top + 1;
    }

    // Utility function to check if the stack is empty or not
    public Boolean isEmpty() {
        return top == -1;
    }

    // Utility function to check if the stack is full or not
    public Boolean isFull() {
        return top == capacity - 1;
    }

    public static void main(String[] args) {
        StackArrayy stack = new StackArrayy(3);

        stack.push(1);  // Inserting 1 in the stack
        stack.push(2);  // Inserting 2 in the stack
        stack.pop();    // removing the top 2
        stack.pop();    // removing the top 1
        stack.push(3);  // Inserting 3 in the stack

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is " + stack.size());

        stack.pop();    // removing the top 3

        // check if the stack is empty
        if (stack.isEmpty())
            System.out.println("Stack Is Empty");
        else
            System.out.println("Stack Is Not Empty");
    }
}
