public class DigitToWords {

    // Array of words for each digit from 0 to 9
    private static final String[] DIGIT_WORDS = {
        "zero", "one", "two", "three", "four", 
        "five", "six", "seven", "eight", "nine"
    };

    // Recursive method to convert digits to words
    public static void digitToWords(int number) {
        // Base case: when the number becomes 0
        if (number == 0) {
            return;
        }
        // Recursive call with the number divided by 10 to process the next digit
        digitToWords(number / 10);

        // Print the word for the last digit
        int digit = number % 10;
        System.out.print(DIGIT_WORDS[digit] + " ");
    }

    public static void main(String[] args) {
        int number = 321;
        System.out.print("Output for " + number + ": ");
        
        // Handle the case when the input number is 0
        if (number == 0) {
            System.out.print(DIGIT_WORDS[0]);
        } else {
            digitToWords(number);
        }
    }
}
