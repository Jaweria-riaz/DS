import java.util.Scanner;

public class FibonacciIterative {
    public static void fibonacciIterative(int N) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < N; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        System.out.println();
    }

  
        
}
