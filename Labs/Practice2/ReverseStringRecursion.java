public class ReverseStringRecursion {

    
    public static String reverse(String str) {
        
        if (str == null || str.length() <= 1) {
            return str;
        }
       
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        String reversed = reverse(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }
}
