// strong number is a number that is equal to the sum of the factorials of its digits.
// For example, 145 is a strong number because 1! + 4! + 5! = 1 + 24 + 120 = 145.
public class strongnumber {
    public static void main(String[] args) {
        int n=145;
        int sum=0,r=0;
        int temp=n;
        while(n>0)
        {
            r=n%10;
            int fact=1;
            for(int i=1;i<=r;i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            n=n/10;
        }
        if(sum==temp)
        {
            System.out.println(temp + " is a strong number");
        }
        else
        {
            System.out.println(temp + " is not a strong number");
        }
    }
}
