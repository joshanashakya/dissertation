

// Java Program to find 
// maximum binomial  
// coefficient term 
import java.io.*; 
  
class GFG  
{ 
// Return maximum binomial  
// coefficient term value. 
static int maxcoefficientvalue(int n) 
{ 
    int [][]C = new int[n + 1][n + 1]; 
  
    // Calculate value of  
    // Binomial Coefficient   
    // in bottom up manner 
    for (int i = 0; i <= n; i++) 
    { 
        for (int j = 0;  
                 j <= Math.min(i, n); j++) 
        { 
              
            // Base Cases 
            if (j == 0 || j == i) 
                C[i][j] = 1; 
  
            // Calculate value 
            // using previously 
            // stored values 
            else
                C[i][j] = C[i - 1][j - 1] +  
                          C[i - 1][j]; 
        } 
    } 
          
    // finding the 
    // maximum value. 
    int maxvalue = 0; 
      
    for (int i = 0; i <= n; i++) 
        maxvalue = Math.max(maxvalue, C[n][i]); 
          
    return maxvalue; 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int n = 4; 
    System.out.println(maxcoefficientvalue(n)); 
} 
} 
  
// This code is contributed by ajit 

