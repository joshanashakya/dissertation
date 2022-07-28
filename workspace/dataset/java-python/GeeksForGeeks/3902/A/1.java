

// Java implementation of the approach 
import java.io.*; 
class GFG { 
  
    // Function to return the count 
    // of required pairs 
    static int CountAllPairs(int N, int K) 
    { 
  
        int count = 0; 
  
        if (N > K) { 
  
            // Initial count 
            count = N - K; 
            for (int i = K + 1; i <= N; i++) 
                count = count + ((N - K) / i); 
        } 
  
        return count; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int N = 11, K = 5; 
        System.out.println(CountAllPairs(N, K)); 
    } 
} 

