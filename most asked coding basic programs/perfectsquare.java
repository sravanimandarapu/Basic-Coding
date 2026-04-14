
public class perfectsquare {
    public static boolean perfectsqr(int n) {
        if (n < 0) {
            return false; 
        }
        int sqrt = (int) Math.sqrt(n);
        return (sqrt * sqrt == n);
    }
    public static void main(String[] args) {
        int n=6;
        if(perfectsqr(n))
        {
            System.out.println(n + " is a perfect square");
        }
        else
        {
            System.out.println(n + " is not a perfect square");
        }
    }
}
