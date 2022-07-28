

// Java program to count number of ways to color 
// a N node skewed tree with k colors such that 
// parent and children have different colors. 
import java.io.*; 
  
class GFG { 
    // fast_way is recursive 
    // method to calculate power 
    static int fastPow(int N, int K) 
    { 
        if (K == 0) 
            return 1; 
        int temp = fastPow(N, K / 2); 
        if (K % 2 == 0) 
            return temp * temp; 
        else
            return N * temp * temp; 
    } 
  
    static int countWays(int N, int K) 
    { 
        return K * fastPow(K - 1, N - 1); 
    } 
  
    // Driver program 
    public static void main(String[] args) 
    { 
        int N = 3, K = 3; 
        System.out.println(countWays(N, K)); 
    } 
} 
  
// This code is contributed by vt_m. 

