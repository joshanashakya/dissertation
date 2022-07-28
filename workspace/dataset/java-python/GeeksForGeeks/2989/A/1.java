

// Java Program to find sum of  
// product of consecutive  
// Binomial Coefficient. 
import java.io.*; 
  
class GFG  
{ 
    static int MAX = 100; 
      
    // Find the binomial coefficient  
    // up to nth term 
    static int binomialCoeff(int n,  
                             int k) 
    { 
        int C[] = new int[k + 1]; 
          
        // memset(C, 0, sizeof(C)); 
        C[0] = 1; // nC0 is 1 
  
        for (int i = 1; i <= n; i++)  
        { 
  
            // Compute next row of  
            // pascal triangle  
            // using the previous row 
            for (int j = Math.min(i, k); j > 0; j--) 
                C[j] = C[j] + C[j - 1]; 
    } 
      
    return C[k]; 
} 
  
// Return the sum of the  
// product of consecutive 
// binomial coefficient. 
static int sumOfproduct(int n) 
{ 
    return binomialCoeff(2 * n,  
                         n - 1); 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int n = 3; 
    System.out.println(sumOfproduct(n)); 
} 
} 
  
// This code is contributed 
// by shiv_bhakt. 

