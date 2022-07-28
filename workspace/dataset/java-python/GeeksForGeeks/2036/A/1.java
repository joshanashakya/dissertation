

// Java program to calculate the  
// terms of summing of sum series 
  
import java.io.*; 
import java.util.*; 
import java.lang.*; 
  
class GFG { 
  
    static int MOD = 1000000007; 
  
    // Function to calculate 
    // twice of sum of first N natural numbers 
    static long sum(long N) 
    { 
        long val = N * (N + 1); 
  
        // taking modulo 10 ^ 9 + 7 
        val = val % MOD; 
  
        return val; 
    } 
  
    // Function to calculate the 
    // terms of summing of sum series 
    static int sumX(int N, int M, int K) 
    { 
        for (int i = 0; i < M; i++) { 
            N = (int)sum(K + N); 
        } 
        N = N % MOD; 
        return N; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int N = 1, M = 2, K = 3; 
        System.out.println(sumX(N, M, K)); 
    } 
} 

