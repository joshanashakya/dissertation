

// Java code to find total number of 
// Subsets of size at most K 
import java.lang.*; 
class GFG 
{ 
  
// Function to compute the value 
// of Binomial Coefficient C(n, k) 
public static int binomialCoeff(int n, int k) 
{ 
    int[][] C = new int[n + 1][k + 1]; 
    int i, j; 
  
    // Caculate value of Binomial Coefficient 
    // in bottom up manner 
    for (i = 0; i <= n; i++)  
    { 
        for (j = 0; j <= Math.min(i, k); j++) 
        { 
  
            // Base Cases 
            if (j == 0 || j == i) 
                C[i][j] = 1; 
  
            // Calculate value using previously 
            // stored values 
            else
                C[i][j] = C[i - 1][j - 1] + C[i - 1][j]; 
        } 
    } 
  
    return C[n][k]; 
} 
  
// Function to calculate sum of 
// nCj from j = 1 to k 
public static int count(int n, int k) 
{ 
    int sum = 0; 
    for (int j = 1; j <= k; j++) 
    { 
  
        // Calling the nCr function 
        // for each value of j 
        sum = sum + binomialCoeff(n, j); 
    } 
  
    return sum; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    GFG g = new GFG(); 
    int n = 3, k = 2; 
    System.out.print(count(n, k)); 
  
    int n1 = 5, k1 = 2; 
    System.out.print(count(n1, k1)); 
} 
} 
  
// This code is contributed by SoumikMondal 

