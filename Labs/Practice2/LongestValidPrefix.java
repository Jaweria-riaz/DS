public class LongestValidPrefix{
    
    public static int longestValidPrefix(String expression) {
        int balance = 0;
        int validLength = 0;
        
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            
            // Update balance
            if (ch == '<') {
                balance++;
            } else if (ch == '>') {
                balance--;
            }
            
            // If balance goes negative, we stop, as it's an invalid sequence
            if (balance < 0) {
                break;
            }
            
            // If balance is zero, we've found a valid prefix up to this point
            if (balance == 0) {
                validLength = i + 1;
            }
        }
        
        return validLength;
    }
    
    public static void main(String[] args) {
        // Example test cases
        System.out.println(longestValidPrefix("<<>>")); // Output: 4
        System.out.println(longestValidPrefix("<>"));   // Output: 2
        System.out.println(longestValidPrefix("<><>")); // Output: 4
        System.out.println(longestValidPrefix(">>"));   // Output: 0
        System.out.println(longestValidPrefix("><><")); // Output: 0
    }
}