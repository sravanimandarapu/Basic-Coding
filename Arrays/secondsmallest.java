
public class secondsmallest {
     public static void main(String[] args) {
        int[] arr = {10, 20, 5, 30, 5};
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element");
        } else {
            System.out.println("Second smallest: " + secondSmallest);
        }
    }

}
