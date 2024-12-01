import java.util.Scanner;
import java.util.Stack;

public class UndoRedoProgram {
    private Stack<String> mainStack = new Stack<>();
    private Stack<String> redoStack = new Stack<>();

    public void insert(String text) {
        mainStack.push(text);
        redoStack.clear(); // Clear redoStack on new insert
        System.out.println("Inserted: " + text);
    }

    public void undo() {
        if (!mainStack.isEmpty()) {
            redoStack.push(mainStack.pop());
            System.out.println("Undo successful");
        } else {
            System.out.println("Nothing to undo");
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            mainStack.push(redoStack.pop());
            System.out.println("Redo successful");
        } else {
            System.out.println("Redo unsuccessful");
        }
    }

    public void displayStack() {
        if (mainStack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack contents: " + String.join(" ", mainStack));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UndoRedoProgram program = new UndoRedoProgram();
        
        while (true) {
            System.out.println("Enter your choice (1 for insert, 2 for undo, 3 for redo, 4 for display stack, 0 to exit): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Input: ");
                    String text = scanner.nextLine();
                    program.insert(text);
                    break;
                case 2:
                    program.undo();
                    break;
                case 3:
                    program.redo();
                    break;
                case 4:
                    program.displayStack();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}