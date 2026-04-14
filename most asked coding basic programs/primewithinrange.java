public class primewithinrange {
    public static boolean isprime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int a=1,b=10;
        for(int i=a;i<=b;i++)
        {
            if(isprime(i))
            {
                System.out.println("prime numbers are:"+i);
            }
        }
    }
}
