public class CountDigits {
    public static void main(String[] args) {
        int num = 706120678;
        int count = 0;
        int temp = num;

        while (temp != 0) {
            temp = temp / 10;  // Remove last digit
            count++;           // Increase count
        }

        System.out.println("Number of digits in " + num + " is: " + count);
    }
}
// alternative using String conversionint num = 706120678;
// int count = String.valueOf(num).length();
// System.out.println("Digits: " + count);
