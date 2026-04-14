
public class powerofanumber {
    public static void main(String[] args) {
        int n=2;
        int p=3;
        int result=1;
        for(int i=1;i<=p;i++)
        {
            result=result*n;
        }
        //double result = Math.pow(n, p);
        System.out.println(n + " raised to the power of " + p + " is: " + result);
        // Alternatively, you can use Math.pow
    }
}
