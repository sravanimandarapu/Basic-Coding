
public class gcd {
    public static void main(String[] args) {
        int a=36,b=60;
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }   
        System.out.println("GCD of 36 and 60 is: " + a);
    }
}

// Initial: a = 36, b = 60

// Step 1:
// temp = 60
// b = 36 % 60 = 36
// a = 60

// Now: a = 60, b = 36

// Step 2:
// temp = 36
// b = 60 % 36 = 24
// a = 36

// Now: a = 36, b = 24

// Step 3:
// temp = 24
// b = 36 % 24 = 12
// a = 24

// Now: a = 24, b = 12

// Step 4:
// temp = 12
// b = 24 % 12 = 0
// a = 12

// Now: b == 0 → loop stops
