

// java program to find sum of matrix 
// element where each element is integer 
// division of row and column. 
  
import java.io.*; 
  
class GFG { 
      
    // Return sum of matrix element  
    // where each element is division 
    // of its corresponding row and 
    // column. 
    static int findSum(int n) 
    { 
        int ans = 0; 
          
        // for rows 
        for (int i = 1; i <= n; i++)  
          
            // for columns 
            for (int j = 1; j <= n; j++)  
                ans += (i/j); 
                  
        return ans; 
    } 
      
    // Driven Program 
    public static void main (String[] args)  
    { 
        int N = 2; 
        System.out.println( findSum(N)); 
    } 
} 
  
// This code is contributed by anuj_67. 

