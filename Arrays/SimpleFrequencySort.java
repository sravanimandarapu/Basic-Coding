import java.util.*;

public class SimpleFrequencySort {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 3, 3, 5, 1};

        // Step 1: Count frequency
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            if (freq.containsKey(num)) {
                freq.put(num, freq.get(num) + 1);
            } else {
                freq.put(num, 1);
            }
        }

        // Step 2: Convert map to list
        List<Integer> keys = new ArrayList<>(freq.keySet());

        // Step 3: Sort keys by frequency (descending)
        Collections.sort(keys, (a, b) -> freq.get(b) - freq.get(a));
         //What are (a, b) in sorting?
        // They are just 2 elements being compared during sorting.


        // Step 4: Print result
        System.out.println("Sorted by frequency:");
        for (int key : keys) {
            System.out.println(key + " -> " + freq.get(key));
        }
    }
}
