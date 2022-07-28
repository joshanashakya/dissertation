

// Java implementation of the approach 
import java.io.*; 
  
class GFG 
{ 
// Function to return the factorial of a number 
static int factorial(int f) 
{ 
    int fact = 1; 
  
    for (int i = 2; i <= f; i++) 
        fact *= (int)i; 
  
    return fact; 
} 
  
// Function to return the count of distinct 
// (N + M) digit numbers having N 0's 
// and and M 1's with no leading zeros 
static int findPermutation(int N, int M) 
{ 
    int permutation = factorial(N + M - 1) 
                    / (factorial(N) * factorial(M - 1)); 
    return permutation; 
} 
  
// Driver code 
public static void main (String[] args) 
{ 
  
    int N = 3, M = 3; 
    System.out.println(findPermutation(N, M)); 
} 
} 
  
// This code is contributed 
// by ajit 

