
public class largestelement {
   public static void main(String[] args) {
        int a[] = {1, 3, 4, 5, 2, 9};
        int lar = a[0];
        int small = a[0]; // Initialize smallest to first element

        for (int i = 1; i < a.length; i++) {
            if (a[i] > lar) {
                lar = a[i];
            }
            if (a[i] < small) {
                small = a[i];
            }
        }

        System.out.println("Largest element in the array is: " + lar);
        System.out.println("Smallest element in the array is: " + small);
   }
}
