
public class armstrong {
    public static void main(String[] args) {
        int n = 153; // Example number
        int temp = n;
        int numDigits = String.valueOf(n).length();
        int sum = 0;

        while (n > 0) {
            int r = n % 10;
            sum += Math.pow(r, numDigits); // Still returns double
            n /= 10;
        }

        // Convert sum to int before comparing OR use round
        if (temp == (int)sum) {
            System.out.println("Yes, it's an Armstrong number");
        } else {
            System.out.println("No, it's not an Armstrong number");
        }
    }
}
