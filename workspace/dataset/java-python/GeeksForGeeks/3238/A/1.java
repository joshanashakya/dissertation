

// Java Program to find the  
// number of arrays of size  
// N whose elements are positive  
// integers and sum is K 
import java.io.*; 
  
class GFG  
{ 
      
// Return nCr 
static int binomialCoeff(int n,  
                         int k) 
{ 
    int []C = new int[k + 1]; 
  
  
    C[0] = 1; // nC0 is 1 
  
    for (int i = 1; i <= n; i++)  
    { 
        // Compute next row of pascal  
        // triangle using the previous row 
        for (int j = Math.min(i, k); j > 0; j--) 
            C[j] = C[j] + C[j - 1]; 
    } 
    return C[k]; 
} 
  
// Return the number of  
// array that can be  
// formed of size n and 
// sum equals to k. 
static int countArray(int N, int K) 
{ 
    return binomialCoeff(K - 1, N - 1); 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
        int N = 2, K = 3; 
  
System.out.println( countArray(N, K)); 
} 
} 
  
// This code is contributed by anuj_67. 

