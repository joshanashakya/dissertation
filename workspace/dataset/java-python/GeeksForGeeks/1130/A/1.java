

// A naive Java solution to count 
// solutions of a + b + c = n 
import java.io.*; 
  
class GFG  
{ 
    // Returns count of solutions of a + b + c = n 
    static int countIntegralSolutions(int n) 
    { 
        // Initialize result 
        int result = 0; 
      
        // Consider all triplets and increment 
        // result whenever sum of a triplet is n. 
        for (int i = 0; i <= n; i++) 
        for (int j = 0; j <= n - i; j++) 
            for (int k = 0; k <= (n - i - j); k++) 
                if (i + j + k == n) 
                result++; 
      
        return result; 
    } 
  
    // Driver code 
    public static void main (String[] args)  
    { 
        int n = 3; 
        System.out.println( countIntegralSolutions(n)); 
      
    } 
} 
  
// This article is contributed by vt_m 

