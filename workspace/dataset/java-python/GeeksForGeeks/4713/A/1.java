

// Java implementation of the above approach 
import java.io.*; 
import java.util.*; 
  
class GFG { 
  
    // Function to find the maximum sum 
    static int maxValue(int a[], int n) 
    { 
        HashMap<Integer, Integer> first = new HashMap<>(); 
        HashMap<Integer, Integer> last = new HashMap<>(); 
        for (int i = 0; i < n; i++) { 
            first.put(a[i], 0); 
            last.put(a[i], 0); 
        } 
  
        int[] pr = new int[n]; 
        pr[0] = a[0]; 
  
        for (int i = 1; i < n; i++) { 
  
            // Build prefix sum array 
            pr[i] = pr[i - 1] + a[i]; 
  
            // If the value hasn't been encountered before, 
            // It is the first occurrence 
            if (Integer.parseInt(String.valueOf(first.get(a[i]))) == 0) 
                first.put(a[i], i); 
  
            // Keep updating the last occurrence 
            last.put(a[i], i); 
        } 
  
        int ans = 0; 
  
        // Find the maximum sum with same first and last value 
        for (int i = 0; i < n; i++) { 
            int start = Integer.parseInt(String.valueOf(first.get(a[i]))); 
            int end = Integer.parseInt(String.valueOf(last.get(a[i]))); 
            if (start != 0) 
                ans = Math.max(ans, pr[end] - pr[start - 1]); 
        } 
  
        return ans; 
    } 
  
    // Driver Code 
    public static void main(String args[]) 
    { 
        int[] arr = { 1, 3, 5, 2, 4, 18, 2, 3 }; 
        int n = arr.length; 
        System.out.print(maxValue(arr, n)); 
    } 
} 
  
// This code is contributed by rachana soma 

