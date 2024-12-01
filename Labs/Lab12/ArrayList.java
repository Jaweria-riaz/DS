import java.util.ArrayList;

public class ArrayList {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("ArrayList after adding elements: " + list);

        // Accessing elements
        System.out.println("Element at index 1: " + list.get(1));

        // Updating an element
        list.set(1, 25);
        System.out.println("ArrayList after updating index 1: " + list);

        // Removing an element
        list.remove(2);
        System.out.println("ArrayList after removing index 2: " + list);

        // Checking the size
        System.out.println("Size of ArrayList: " + list.size());

        // Iterating over the ArrayList
        System.out.print("Iterating through ArrayList: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
