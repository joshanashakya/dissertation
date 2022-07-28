

// Java implementation of above approach 
import java.util.TreeMap; 
  
class Count 
{ 
    // Function to return the count of valid pairs 
    static int countPairs(int[] a, int n) 
    { 
  
        // To keep the element in sorted order 
        TreeMap<Integer, Integer> map = new TreeMap<>(); 
        for (int i = 0; i < n; i++) 
        { 
            map.put(a[i], 1); 
        } 
          
        // Start taking largest element each time 
        int count = 0; 
        for (int i = 0; i < n; i++) 
        { 
            // If element has already been paired 
            if (map.get(a[i]) < 1) 
                continue; 
  
            // Find the number which is greater than 
            // a[i] and power of two 
            int cur = 1; 
            while (cur <= a[i]) 
                cur <<= 1; 
  
            // If there is a number which adds up with a[i] 
            // to form a power of two 
            if (map.containsKey(cur - a[i])) 
            { 
                // Edge case when a[i] and crr - a[i] is same 
                // and we have only one occurrence of a[i] then 
                // it cannot be paired 
                if (cur - a[i] == a[i] && map.get(a[i]) == 1) 
                    continue; 
                count++; 
  
                // Remove already paired elements 
                map.put(cur - a[i], map.get(cur - a[i]) - 1); 
                map.put(a[i], map.get(a[i]) - 1); 
            } 
  
        } 
        // Return the count 
        return count; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int[] a = { 3, 11, 14, 5, 13 }; 
        int n = a.length; 
        System.out.println(countPairs(a, n)); 
    } 
} 
  
// This code is contributed by Vivekkumar Singh 

