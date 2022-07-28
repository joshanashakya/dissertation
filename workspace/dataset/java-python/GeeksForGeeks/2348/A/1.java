

// Java implementation of above approach  
import java.util.*; 
public class GFG { 
  
// Function to return the max Length of  
// Fibonacci subsequence  
    static int LongestFibSubseq(int A[], int n) { 
        // Store all array elements in a hash  
        // table  
        TreeSet<Integer> S = new TreeSet<>(); 
        for (int t : A) { 
            // Add each element into the set  
            S.add(t); 
        } 
        int maxLen = 0, x, y; 
  
        for (int i = 0; i < n; ++i) { 
            for (int j = i + 1; j < n; ++j) { 
  
                x = A[j]; 
                y = A[i] + A[j]; 
                int length = 3; 
  
                // check until next fib element is found  
                while (S.contains(y) && (y != S.last())) { 
  
                    // next element of fib subseq  
                    int z = x + y; 
                    x = y; 
                    y = z; 
                    maxLen = Math.max(maxLen, ++length); 
                } 
            } 
        } 
        return maxLen >= 3 ? maxLen : 0; 
    } 
  
// Driver program  
    public static void main(String[] args) { 
        int A[] = {1, 2, 3, 4, 5, 6, 7, 8}; 
        int n = A.length; 
        System.out.print(LongestFibSubseq(A, n)); 
    } 
} 
// This code is contributed by 29AjayKumar 

