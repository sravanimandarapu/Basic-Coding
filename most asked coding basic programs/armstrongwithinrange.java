import java.util.Scanner;

public class armstrongwithinrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lower and upper ranges: ");
        int lower = sc.nextInt();
        int upper = sc.nextInt();

        System.out.println("Armstrong numbers between " + lower + " and " + upper + " are:");

        for (int i = lower; i <= upper; i++) {
            int n = i;
            int numDigits = String.valueOf(n).length();
            int sum = 0;
            int temp = n;

            while (n > 0) {
                int r = n % 10;
                sum += Math.pow(r, numDigits); // raise to power of number of digits
                n /= 10;
            }

            if (temp == sum) {
                System.out.print(temp + " ");
            }
        }
    }
}
