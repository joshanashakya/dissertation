

// java program to find longest subsequence 
// such that there is no 0 after 1. 
import java.io.*; 
  
public class GFG { 
  
    static int maxSubseq(int []vec, int n) 
    {  
              
        // Store the count of number of 
        // ones from right to left in 
        // the array 
        int suffix = 0; 
          
        for (int i = n - 1; i >= 0; i--) 
        { 
            if (vec[i] == 1) 
            { 
                suffix++; 
                vec[i] = suffix; 
            } 
        } 
          
        // Traverse from left to right, keep 
        // count of 0s and for every 0, check 
        // number of 1s after it. Update the 
        // result if needed. 
        int res = 0; 
        int zero = 0;  
          
        for (int i = 0; i < n; i++) 
        { 
            if (vec[i] == 0) 
                zero++; 
          
            // Checking the maximum size 
            if (vec[i] > 0) 
                res = Math.max(res, zero + vec[i]); 
        } 
          
        // Checking the maximum size 
        return Math.max(res, zero); 
    } 
      
    // Driver Code 
    static public void main (String[] args) 
    { 
          
        int []input = { 0, 1, 0, 0, 1, 0 }; 
        int n = input.length; 
          
        System.out.println(maxSubseq(input, n)); 
    } 
} 
  
// This code is contributed by vt_m. 

