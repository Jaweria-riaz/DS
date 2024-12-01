import java.util.ArrayList;
import java.util.List;

public class NextWordPrediction {

    static class Node {
        String word;
        Node next;

        Node(String word) {
            this.word = word;
            this.next = null;
        }
    }

    // Method to create linked list from data
    public Node createFromData(String data) {
        data = data.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        String[] words = data.split("\\s+");
        
        Node head = new Node(words[0]);
        Node current = head;
        
        for (int i = 1; i < words.length; i++) {
            current.next = new Node(words[i]);
            current = current.next;
        }
        
        return head;
    }

    // Method to predict the next word
    public List<String> predictNextWord(String word1, String word2, Node head) {
        List<String> nextWords = new ArrayList<>();
        Node current = head;

        while (current != null && current.next != null && current.next.next != null) {
            if (current.word.equals(word1) && current.next.word.equals(word2)) {
                nextWords.add(current.next.next.word);
            }
            current = current.next;
        }

        return nextWords;
    }

    // Main method to test the program
    public static void main(String[] args) {
        String data = "Faculty of Computer Science, Software Engineering, Electrical Engineering...";
        NextWordPrediction predictor = new NextWordPrediction();
        Node head = predictor.createFromData(data);

        // Test prediction
        List<String> predictions = predictor.predictNextWord("faculty", "of", head);
        System.out.println("Predictions: " + predictions);
    }
}