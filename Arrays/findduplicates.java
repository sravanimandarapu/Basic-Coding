import java.util.*;

class findduplicates{
    public static void main(String[] args) {
        int a[]={1, 2, 3, 2, 4, 5, 1};
        HashSet<Integer> set=new HashSet<>();
        for(int i:a)
        {
            if(!set.add(i))
            {
                System.out.println("Duplicate element found: " + i);
            }
        }
    }
}