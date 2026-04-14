
public class palindrome {
    public static void main(String[] args) {
        int n=1001;
        int sum=0,r=0;
        int temp = n; // Store the original number for comparison
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        n=temp;
        if(n==sum)
        {
            System.out.println("yes its a palindrome");
        }
        else
        {
            System.out.println("no its not a palindrome");
        }
    }
}
// import java.util.Scanner;
// public class palondromeofstring {
//     public static void main(String[] args) {
//     Scanner x= new Scanner(System.in);
//     System.out.println("enter a string to  reverse");
//     String str =x.nextLine();
//     String rev = new StringBuilder(str).reverse().toString();
//     if(str.equals(rev))
//     System.out.println("yes its a palindrome");
//     else
//     System.out.println("no its not a palindrome");
// }
// }