import java.util.Stack;

public class PalindromeStack {
    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();

        // Push all characters of the string to the stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Pop characters from the stack and compare with original string
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.pop()) {
                return false; // If there's a mismatch, it's not a palindrome
            }
        }
        
        return true; // If all characters match, it's a palindrome
    }

    public static void main(String[] args) {
        String str = "radar"; // You can change this string to test other cases

        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}