

// Java implementation of the above approach 
import java.util.*; 
  
class GFG{ 
  
    // Function to count the number of ways to divide 
    // C into two parts and add to A and B such 
    // that A is strictly greater than B 
    static int countWays(int A, int B, int C) 
    { 
        // Minimum value added to A to satisfy 
        // the given relation 
        int minAddA = Math.max(0, (C + B - A + 2) / 2); 
      
        // Number of different values of A, i.e., 
        // number of ways to divide C 
        int count_ways = Math.max(C - minAddA + 1, 0); 
      
        return count_ways; 
    } 
      
    // Driver code 
    public static void main(String args[]) 
    { 
        int A = 3, B = 5, C = 5; 
      
        System.out.println(countWays(A, B, C)); 
    } 
} 
  
// This code is contributed by AbhiThakur 

