import java.util.HashSet;
public class removeduplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1};

        HashSet<Integer> unique = new HashSet<>();
        for (int num : arr) {
            unique.add(num);
        }
        System.out.println("Array without duplicates: " + unique);
    }
}
