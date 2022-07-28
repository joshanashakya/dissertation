

// Java implementation of the approach 
import java.io.*; 
  
class GFG 
{ 
static int MAX = 1000000; 
  
static int MOD = 10000007; 
  
// Declare result array globally 
static int []result = new int [MAX + 1]; 
static int []fact = new int [MAX + 1]; 
  
// Function to precompute the product 
// of factorials upto MAX 
static void preCompute() 
{ 
  
    // Initialize base condition if n = 0 
    // then factorial of 0 is equal to 1 
    // and answer for n = 0 is 1 
    fact[0] = 1; 
    result[0] = 1; 
  
    // Iterate loop from 1 to MAX 
    for (int i = 1; i <= MAX; i++)  
    { 
  
        // factorial(i) = factorial(i - 1) * i 
        fact[i] = ((fact[i - 1] % MOD) * i) % MOD; 
  
        // Result for current n is equal to result[i-1] 
        // multiplied by the factorial of i 
        result[i] = ((result[i - 1] % MOD) *  
                   (fact[i] % MOD)) % MOD; 
    } 
} 
  
// Function to perform the queries 
static void performQueries(int q[], int n) 
{ 
  
    // Precomputing the result till MAX 
    preCompute(); 
  
    // Perform queries 
    for (int i = 0; i < n; i++) 
        System.out.println (result[q[i]]); 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int q[] = { 4, 5 }; 
    int n = q.length; 
      
    performQueries(q, n); 
} 
} 
  
// This code is contributed by tushil.  

