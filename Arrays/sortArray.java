
// sort an array

import java.util.Arrays;
import java.util.Scanner;
public class sortArray
{
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the size of an array:");
        int n=x.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=x.nextInt();
        }
         Arrays.sort(arr);
        System.out.println("the sorted array is:" + Arrays.toString(arr)); // to print [1,2,3] we use tostring() fun
    }
}
// sorting first half in Ascending order and second half in Descending order
// import java.util.Arrays;
// import java.util.Collections;

// public class HalfSort {
//     public static void main(String[] args) {
//         Integer[] arr = {5, 2, 8, 7, 4, 1, 3, 6};

//         int n = arr.length;
//         int mid = n / 2;

//         // First half sort (ascending)
//         Arrays.sort(arr, 0, mid);

//         // Second half sort (descending)
//         Arrays.sort(arr, mid, n, Collections.reverseOrder());

//         // Output
//         System.out.println("After sorting:");
//         for (int i : arr) {
//             System.out.print(i + " ");
//         }
//     }
// }
