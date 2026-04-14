import java.util.HashMap;

public class countduplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1, 1};
        HashMap<Integer, Integer> freq = new HashMap<>();
        int duplicateCount = 0;

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int value : freq.values()) {
            if (value > 1) {
                duplicateCount += (value - 1); // extra appearances
            }
        }

        System.out.println("Number of duplicate elements: " + duplicateCount);
    }
}
