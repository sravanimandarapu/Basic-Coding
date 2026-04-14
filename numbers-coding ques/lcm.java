public class lcm {
    public static void main(String[] args) {
        int a = 36, b = 60;
        int x = a, y = b; // store originals for LCM

        // Compute GCD using Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a;
        int lcm = (x * y) / gcd;

        System.out.println("GCD of 36 and 60 is: " + gcd);
        System.out.println("LCM of 36 and 60 is: " + lcm);
    }
}

// LCM = (a * b) / GCD