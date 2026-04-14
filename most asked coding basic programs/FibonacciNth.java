import java.util.Scanner;

public class FibonacciNth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position of Fibonacci number to find (0-based index): ");   
        int n = scanner.nextInt(); // Take input directly into 'n'

        if (n == 0) {
            System.out.println("Fibonacci number at position " + n + " is 0");
        } else if (n == 1) {
            System.out.println("Fibonacci number at position " + n + " is 1");
        } else {
            int a = 0, b = 1;
            for (int i = 2; i <= n; i++) {
                int temp = a + b;
                a = b;
                b = temp;
            }
            System.out.println("Fibonacci number at position " + n + " is " + b);
        }

        scanner.close();
    }
}
