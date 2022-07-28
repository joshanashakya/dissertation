

// Java program to find sum of modulo 
// K of first N natural numbers. 
import java.io.*; 
  
class GFG { 
  
    // Return sum of modulo K of 
    // first N natural numbers. 
    static int findSum(int N, int K) 
    { 
        int ans = 0; 
  
        // Counting the number of times 1, 2, .., 
        // K-1, 0 sequence occurs. 
        int y = N / K; 
  
        // Finding the number of elements left which 
        // are incomplete of sequence Leads to Case 1 type. 
        int x = N % K; 
  
        // adding multiplication of number of times 
        // 1, 2, .., K-1, 0 sequence occurs and sum 
        // of first k natural number and sequence 
        // from case 1. 
        ans = (K * (K - 1) / 2) * y + (x * (x + 1)) / 2; 
  
        return ans; 
    } 
  
    // Driver program 
    static public void main(String[] args) 
    { 
        int N = 10, K = 2; 
        System.out.println(findSum(N, K)); 
    } 
} 
  
// This Code is contributed by vt_m. 

