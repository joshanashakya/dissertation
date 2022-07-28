

// Java program to calculate  
// Different ways to represent 
// N as sum of K non-zero integers. 
import java.io.*; 
  
class GFG  
{ 
  
// Returns value of Binomial 
// Coefficient C(n, k) 
static int binomialCoeff(int n,  
                         int k) 
{ 
    int C[][] = new int [n + 1][k + 1]; 
    int i, j; 
  
    // Calculate value of Binomial 
    // Coefficient in bottom up manner 
    for (i = 0; i <= n; i++)  
    { 
        for (j = 0;  
             j <= Math.min(i, k); j++)  
        { 
            // Base Cases 
            if (j == 0 || j == i) 
                C[i][j] = 1; 
  
            // Calculate value using 
            // previously stored values 
            else
                C[i][j] = C[i - 1][j - 1] +  
                          C[i - 1][j]; 
        } 
    } 
  
    return C[n][k]; 
} 
  
// Driver Code 
public static void main (String[] args) 
{ 
    int n = 5, k = 3; 
    System.out.println( "Total number of " +  
                     "different ways are " + 
                        binomialCoeff(n - 1,  
                                      k - 1)); 
} 
} 
  
// This code is contributed 
// by anuj_67. 

