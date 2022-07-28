

// java program to count non-decreasing 
// numner with n digits 
public class GFG { 
      
    static long countNonDecreasing(int n) 
    { 
        int N = 10; 
       
        // Compute value of N * (N+1)/2 * 
        // (N+2)/3 * ....* (N+n-1)/n 
        long count = 1; 
           
        for (int i = 1; i <= n; i++) 
        { 
            count *= (N + i - 1); 
            count /= i; 
        } 
       
        return count; 
    } 
  
    // Driver code 
    public static void main(String args[]) { 
          
        int n = 3; 
        System.out.print(countNonDecreasing(n)); 
    }    
} 
  
// This code is contributed by Sam007. 

