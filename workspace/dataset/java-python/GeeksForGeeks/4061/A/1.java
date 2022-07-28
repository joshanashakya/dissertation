

import java.lang.Math; 
  
class GFG 
{ 
      
// Recursive C program to compute modular power 
static int exponent(int A, int B) 
{ 
    // Base cases 
    if (A == 0) 
        return 0; 
    if (B == 0) 
        return 1; 
  
    // If B is even 
    int y; 
    if (B % 2 == 0)  
    { 
        y = exponent(A, B / 2); 
        y = (y * y); 
    } 
  
    // If B is odd 
    else 
    { 
        y = A; 
        y = (y * exponent(A, B - 1)); 
    } 
  
    return y; 
} 
  
// Function to return sum 
static int sum(int k, int n) 
{ 
    int sum = exponent(k, n + 1) 
            - exponent(k - 1, n + 1); 
  
    return sum; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 3; 
    int K = 3; 
    System.out.println(sum(K, n)); 
} 
} 
  
// This code is contributed by Code_Mech. 

