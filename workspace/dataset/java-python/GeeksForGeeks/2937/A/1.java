

//Java  implementation of the approach 
  
import java.io.*; 
  
class GFG { 
      
    // Function to calculate gcd 
    static int __gcd(int a, int b) 
    { 
          
        // Everything divides 0  
        if (a == 0 || b == 0) 
            return 0; 
      
        // base case 
        if (a == b) 
            return a; 
      
        // a is greater 
        if (a > b) 
            return __gcd(a - b, b); 
              
        return __gcd(a, b - a); 
    } 
  
// Function to return the minimum valid number 
// that satisfies the given conditions 
static int minValidNumber(int p, int q) 
{ 
    // If possible 
    if (q % p == 0) 
        return __gcd(p, q); 
    else
        return -1; 
} 
  
// Driver Code 
    public static void main (String[] args) { 
        int p = 2, q = 6; 
        System.out.print(minValidNumber(p, q)); 
  
  
    // THis code is contributed by  Sachin. 
    } 
} 

