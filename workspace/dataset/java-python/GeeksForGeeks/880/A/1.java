

// Java program to find the x in range [l, r]  
// such that x ^ n is maximum. 
  
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG 
{ 
// Function to calculate the maximum value of  
// N ^ X, where X is in the range [L, R] 
static int maximumXOR(int n, int l, int r) 
{ 
    int x = 0; 
    for (int i = (int)(Math.log(r)/Math.log(2)); i >= 0; --i) 
    { 
        if ((n & (1 << i))>0) // Set bit 
        { 
            if ((x > r) || (x + (1 << i) - 1 < l)) 
                x ^= (1 << i); 
        } 
        else // Unset bit 
        { 
            if ((x ^ (1 << i)) <= r) 
                x ^= (1 << i); 
        } 
    } 
    return n ^ x; 
} 
  
// Driver function 
public static void main(String args[]) 
{ 
    int n = 7, l = 2, r = 23; 
    System.out.println( "The output is " + maximumXOR(n, l, r)); 
  
} 
} 
  
// This code is Contributed by tufan_gupta2000 

