

// Java Program to find sum  
// of product of r and rth  
// Binomial Coefficient i.e 
// summation r * nCr 
class GFG 
{ 
static int MAX = 100; 
  
// Return the first n term  
// of binomial coefficient. 
static void binomialCoeff(int n,  
                          int C[]) 
{ 
    C[0] = 1; // nC0 is 1 
  
    for (int i = 1; i <= n; i++) 
    { 
  
        // Compute next row of 
        // pascal triangle using  
        // the previous row 
        for (int j = Math.min(i, n); j > 0; j--) 
            C[j] = C[j] + C[j - 1]; 
    } 
} 
  
// Return summation 
// of r * nCr 
static int summation(int n) 
{ 
    int C[] = new int[MAX]; 
      
    for(int i = 0; i < MAX; i++) 
    C[i] = 0; 
  
    // finding the first n term   
    // of binomial coefficient 
    binomialCoeff(n, C); 
  
    // Iterate a loop  
    // to find the sum. 
    int sum = 0; 
    for (int i = 0; i <= n; i++)  
        sum += (i * C[i]);  
  
    return sum; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    int n = 2; 
    System.out.println( summation(n)); 
} 
} 
  
// This code is contributed by Arnab Kundu 

