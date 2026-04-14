
//merge 2 arrays

import java.util.Arrays;
import java.util.Scanner;

public class mergeArrays {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the size of an array1:");
        int n=x.nextInt();
        System.out.println("enter the size of an array2:");
        int m=x.nextInt();
        int[] arr1=new int[n];
        System.out.println("enter array1 elements:");
        for(int i=0;i<n;i++)
        {
            arr1[i]=x.nextInt();
        }
        int[] arr2=new int[n];
        System.out.println("enter array2 elements:");
        for(int i=0;i<m;i++)
        {
            arr2[i]=x.nextInt();
        }
        
        int[] merged= new int[n+m];
        for (int i=0;i<n;i++)
        {
             merged[i]=arr2[i];
        }
        for (int i=0;i<n;i++)
        {
             merged[n+i]=arr1[i];
        }

        System.out.println("Merged Array: " + Arrays.toString(merged));
    }
}
