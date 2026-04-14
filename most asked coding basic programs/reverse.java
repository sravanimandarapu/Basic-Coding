
// public class reverse {
//     public static void main(String[] args) {
//         int n=1026;
//         int sum=0,r=0;
//         while(n>0)
//         {
//             r=n%10;
//             sum=sum*10+r;
//             n=n/10;
//         }
//         System.out.println("Reverse of a number is: " + sum);
//     }
// }

// reversing a string in java

import java.util.Scanner;
public class reverse{
    public static void main(String[] args) {
    Scanner x= new Scanner(System.in);
    System.out.println("enter a string to  reverse");
    String str =x.nextLine();
    StringBuilder rev = new StringBuilder(str).reverse();
    System.out.println("string reversal: " + rev);
    }
}