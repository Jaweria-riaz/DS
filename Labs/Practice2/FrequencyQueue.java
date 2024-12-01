import java.util.LinkedList;

public class FrequencyQueue {
    
    private LinkedList<Integer> queue;

    
    public FrequencyQueue() {
        queue = new LinkedList<>();
    }

    
    public void insert(int element) {
        queue.add(element); 
    }

    
    public int findFrequency(int element) {
        int count = 0;
       
        for (int num : queue) {
            if (num == element) {
                count++;
            }
        }
        return count;
    }

    
    public static void main(String[] args) {
        FrequencyQueue fq = new FrequencyQueue();
        
       
        fq.insert(5);
        fq.insert(10);
        fq.insert(5);
        fq.insert(20);
        fq.insert(10);
        
        
        System.out.println("Frequency of 5: " + fq.findFrequency(5)); 
        System.out.println("Frequency of 10: " + fq.findFrequency(10)); 
        System.out.println("Frequency of 20: " + fq.findFrequency(20)); 
        System.out.println("Frequency of 15: " + fq.findFrequency(15)); 
    }
}
