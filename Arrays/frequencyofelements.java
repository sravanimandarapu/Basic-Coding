import java.util.*;

public class frequencyofelements {
    public static void main(String[] args) {
       int[] arr = {2, 3, 2, 5, 8, 3, 3, 5};
       Map<Integer,Integer> freqmap=new HashMap<>();
       for(int num:arr)
       {
        if(freqmap.containsKey(num)){
            freqmap.put(num,freqmap.get(num)+1);
        }
        else{
            freqmap.put(num,1);
        }
       }
//       Method       Meaning                   
// | ------------ | ---------------------------- |
// | `keySet()`   | All keys (as a Set)          |
// | `values()`   | All values (as a Collection) |
// | `entrySet()` | All key-value pairs          |

 System.out.println("Frequency of elements:");
        // for (Map.Entry<Integer, Integer> entry : freqmap.entrySet()) {
        //     System.out.println(entry.getKey() + " -> " + entry.getValue());
        // }

        for (int key : freqmap.keySet()) {
    System.out.println(key + " -> " + freqmap.get(key));
}

// for (int val : freqmap.values()) {
//     System.out.println("Value: " + val);
// }

    }
}
