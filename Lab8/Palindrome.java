package Lab8;
class Palindrome {
    public static boolean palindrome(String str) {
        // Base case: if the string has 0 or 1 character, it's a palindrome
        if (str.length() <= 1) {
            return true;
        }

        // Check if the first and last characters are the same
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            // Recursive case: check the substring without first and last characters
            return palindrome(str.substring(1, str.length() - 1));
        }

        // If characters don't match, it's not a palindrome
        return false;
    }

    public static void main(String[] args) {
        String name = "racecar";
        boolean result = palindrome(name);
        
        // Print the result
        System.out.println("Is \"" + name + "\" a palindrome? " + result);
    }
}
