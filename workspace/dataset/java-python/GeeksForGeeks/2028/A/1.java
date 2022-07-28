

// Java program to find 
// count of digits in N  
// factorial raised to N 
import java.io.*; 
  
class GFG  
{ 
static int countDigits(int n) 
{ 
    // we take sum of logarithms  
    // as explained in the approach 
    double ans = 0; 
    for (int i = 1; i <= n; i++) 
        ans += Math.log10(i); 
  
    // multiply the 
    // result with n 
    ans = ans * n; 
    return 1 + (int)Math.floor(ans); 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int n = 4; 
    System.out.println( 
               countDigits(n) + "\n"); 
} 
} 
  
// This code is contributed 
// by anuj_67. 

