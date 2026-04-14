import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        // Step 1: If lengths differ, not anagram
        if (str1.length() != str2.length()) {
            System.out.println("Not an anagram");
            return;
        }

        // Step 2: Convert to char array and sort both
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 3: Compare sorted arrays
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Yes, it's an anagram");
        } else {
            System.out.println("No, not an anagram");
        }
    }
}
