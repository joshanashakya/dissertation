

// Java solution to count  
// solutions of a + b + c = n 
import java.io.*; 
  
class GFG  
{ 
    // Returns count of solutions  
    // of a + b + c = n 
    static int countIntegralSolutions(int n) 
    { 
    return ((n + 1) * (n + 2)) / 2; 
          
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
        int n = 3; 
        System.out.println ( countIntegralSolutions(n)); 
          
    } 
} 
// This article is contributed by vt_m 

