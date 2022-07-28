

// Java implementation of the approach  
import java.util.HashMap; 
  
class GFG  
{ 
  
    // Function to return the count of sub-arrays 
    // in the given permutation of first n natural 
    // numbers such that their median is m 
    public static int segments(int n, int[] p, int m) 
    { 
        HashMap<Integer, Integer> c = new HashMap<>(); 
        c.put(0, 1); 
        boolean has = false; 
        int sum = 0; 
        int ans = 0; 
        for (int r = 0; r < n; r++)  
        { 
  
            // If element is less than m 
            if (p[r] < m) 
                sum--; 
  
            // If element greater than m 
            else if (p[r] > m) 
                sum++; 
  
            // If m is found 
            if (p[r] == m) 
                has = true; 
  
            // Count the answer 
            if (has) 
                ans += (c.get(sum) == null ? 0 :  
                        c.get(sum)) +  
                       (c.get(sum - 1) == null ? 0 :  
                        c.get(sum - 1)); 
  
            // Increment sum 
            else
                c.put(sum, c.get(sum) == null ? 1 :  
                           c.get(sum) + 1); 
        } 
        return ans; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int[] a = { 2, 4, 5, 3, 1 }; 
        int n = a.length; 
        int m = 4; 
        System.out.println(segments(n, a, m)); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

