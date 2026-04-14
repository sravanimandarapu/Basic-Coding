
public class sumofdigits {
    public static void main(String[] args) {
        int n=1026;
        int sum=0,r=0;
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println("Sum of digits is: " + sum);
    }
}
