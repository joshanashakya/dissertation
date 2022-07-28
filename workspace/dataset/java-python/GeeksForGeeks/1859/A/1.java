

// Java implementation of the approach 
import java.util.ArrayList; 
import java.util.Collections; 
import java.util.List; 
import java.io.*; 
  
class GFG { 
  
    // Function to return the minimum possible value 
    // of |K - X| where X is the bitwise AND of 
    // the elements of some sub-array 
    static int closetAND(int arr[], int n, int k) 
    { 
        int ans = Integer.MAX_VALUE; 
  
        // Check all possible sub-arrays 
        for (int i = 0; i < n; i++) { 
  
            int X = arr[i]; 
            for (int j = i; j < n; j++) { 
                X &= arr[j]; 
  
                // Find the overall minimum 
                ans = Math.min(ans, Math.abs(k - X)); 
            } 
        } 
        return ans; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = { 4, 7, 10 }; 
        int n = arr.length; 
        int k = 2; 
        System.out.println(closetAND(arr, n, k)); 
    } 
} 
  
// This code is contributed by jit_t 

