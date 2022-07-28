

// Java code for naive implementation 
import java.io.*; 
  
public class GFG { 
      
// Function for checking the condition 
// with 2 loops 
static void printNonDivisible(int []A, int []B, 
                              int n, int m) 
{ 
      
    for (int i = 0; i < m; i++) 
    { 
        int j = 0; 
        for (j = 0; j < n; j++) 
            if( B[i] % A[j] == 0 ) 
                break; 
  
        // If none of the elements  
        // in A[] divided B[i] 
        if (j == n) 
            System.out.println(B[i]); 
    } 
} 
  
    // Driver code 
    static public void main (String[] args) 
    { 
        int []A = {100, 200, 400, 100}; 
        int n = A.length; 
          
        int []B = {190, 200, 87, 600, 800}; 
        int m = B.length; 
          
        printNonDivisible(A, B, n, m); 
    } 
} 
  
// This code is contributed by vt_m . 

