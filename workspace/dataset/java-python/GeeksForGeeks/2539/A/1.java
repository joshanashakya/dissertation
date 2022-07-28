

// Java program to find sum of  
// product of x and y such that 
// n/x = y (Integer Division)  
import java.io.*; 
  
class GFG { 
      
// Return the sum of product x*y. 
static int sumofproduct(int n) 
{ 
    int ans = 0; 
  
    // Iterating x from 1 to n 
    for (int x = 1; x <= n; x++) 
    { 
        // Finding y = n/x. 
        int y = n / x; 
  
        // Adding product of x and  
        // y to answer. 
        ans += (y * x); 
    } 
  
    return ans; 
} 
  
    // Driver Code 
    static public void main(String[] args) 
    { 
        int n = 10; 
        System.out.println(sumofproduct(n)); 
    } 
} 
  
// This code is contributed by vt_m. 

