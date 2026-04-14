import java.util.HashMap;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "banana";

        HashMap<Character, Integer> freq = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (freq.containsKey(ch)) {
                freq.put(ch, freq.get(ch) + 1);
            } else {
                freq.put(ch, 1);
            }
        }

        // Print frequencies
        System.out.println("Character frequencies:");
        for (char ch : freq.keySet()) {
            System.out.println(ch + " → " + freq.get(ch));
        }
    }
}
