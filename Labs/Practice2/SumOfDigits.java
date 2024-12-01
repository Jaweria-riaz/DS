public class SumOfDigits {
    public static int sumOfDigits(int number) {
       
        if (number == 0) {
            return 0;
        }
       
        return (number % 10) + sumOfDigits(number / 10);
    }

    public static void main(String[] args) {
        int number = 311; 
        int result = sumOfDigits(number);
        System.out.println("Sum of digits of " + number + " is: " + result);
    }
}
