import java.util.LinkedList;

public class LinkedListIntersection {
    
    public static Integer findIntersection(LinkedList<Integer> listA, LinkedList<Integer> listB) {
        int lenA = listA.size();
        int lenB = listB.size();
        
        // Find the difference in lengths
        int diff = Math.abs(lenA - lenB);
        
        // Set starting indices based on length difference
        int indexA = 0;
        int indexB = 0;
        
        if (lenA > lenB) {
            indexA = diff; // Move pointer A forward
        } else {
            indexB = diff; // Move pointer B forward
        }
        
        // Traverse both lists simultaneously
        while (indexA < lenA && indexB < lenB) {
            if (listA.get(indexA).equals(listB.get(indexB))) {
                return listA.get(indexA); // Intersection found
            }
            indexA++;
            indexB++;
        }
        
        return null; // No intersection found
    }

    public static void main(String[] args) {
        // Creating two intersecting linked lists
        LinkedList<Integer> listA = new LinkedList<>();
        LinkedList<Integer> listB = new LinkedList<>();

        // Adding elements to listA
        listA.add(1);
        listA.add(2);
        listA.add(3);
        listA.add(4);
        listA.add(5);

        // Adding elements to listB with intersection starting from node with value 3
        listB.add(9);
        listB.add(8);
        listB.addAll(listA.subList(2, listA.size())); // Start intersecting at 3

        // Find intersection point
        Integer intersection = findIntersection(listA, listB);
        if (intersection != null) {
            System.out.println("Intersection at node with data: " + intersection);
        } else {
            System.out.println("No intersection found.");
        }
    }
}
