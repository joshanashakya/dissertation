

// Java program to find sum of modulo 
// K of first N natural numbers. 
import java.io.*; 
  
class GFG { 
  
    // Return sum of modulo K of 
    // first N natural numbers. 
    static int findSum(int N, int K) 
    { 
        int ans = 0; 
  
        // Iterate from 1 to N && evaluating 
        // and adding i % K. 
        for (int i = 1; i <= N; i++) 
            ans += (i % K); 
  
        return ans; 
    } 
  
    // Driver program 
    static public void main(String[] args) 
    { 
        int N = 10, K = 2; 
        System.out.println(findSum(N, K)); 
    } 
} 
  
// This code is contributed by vt_m. 

