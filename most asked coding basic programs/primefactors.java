
public class primefactors {
    public static int isprime(int n){
      if(n<2)
            return 0;
      for(int i = 2; i<=Math.sqrt(n); i++){
        if(n%i==0)
          return 0;
      }

      return 1;
   }
    public static void main(String[] args) {
        int n=90;
        System.out.print("Prime factors of " + n + " are: ");
        for(int i=2;i<=n;i++)
        {
            if(isprime(i)==1)
            {
                int x=n;
                while(x%i==0)
                {
                    System.out.print(i + " ");
                    x=x/i;
                }
            }

        }
    }
}

//  Step-by-step Dry Run (n = 90)
// Let’s walk through each outer loop i = 2 to 90:

// ✅ i = 2
// isprime(2) → ✅ Prime

// x = 90

// while(x % 2 == 0):

// 90 % 2 == 0 → ✅ → print 2, x = 45

// 45 % 2 == 1 → ❌ → exit

// 🖨️ Output so far: 2

// ✅ i = 3
// isprime(3) → ✅ Prime

// x = 90

// while(x % 3 == 0):

// 90 % 3 == 0 → ✅ → print 3, x = 30

// 30 % 3 == 0 → ✅ → print 3, x = 10

// 10 % 3 == 1 → ❌ → exit

// 🖨️ Output so far: 2 3 3

// ❌ i = 4
// isprime(4) → ❌ Not Prime → Skip

// ✅ i = 5
// isprime(5) → ✅ Prime

// x = 90

// while(x % 5 == 0):

// 90 % 5 == 0 → ✅ → print 5, x = 18

// 18 % 5 == 3 → ❌ → exit

// 🖨️ Output so far: 2 3 3 5