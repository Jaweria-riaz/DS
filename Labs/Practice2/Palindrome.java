package Practice2;
class Palindrome {
    public static boolean palindrome(String str) {
        
        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
    
            return palindrome(str.substring(1, str.length() - 1));
        }
        return false;
    }

    public static void main(String[] args) {
        String name = "racecar";
        boolean result = palindrome(name);
        
        // Print the result
        System.out.println("Is \"" + name + "\" a palindrome? " + result);
    }
}
