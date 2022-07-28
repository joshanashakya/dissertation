

//Java implementation of the approach 
import java.io.*; 
  
class GFG  
{ 
      
// Function to print all the perfect 
// squares from the given range 
static void perfectSquares(int l, int r) 
{ 
  
    // For every element from the range 
    for (int i = l; i <= r; i++)  
    { 
  
        // If current element is 
        // a perfect square 
        if (Math.sqrt(i) == (int)Math.sqrt(i)) 
            System.out.print(i + " "); 
    } 
} 
  
// Driver code 
public static void main (String[] args) 
{ 
    int l = 2, r = 24; 
    perfectSquares(l, r); 
} 
} 
  
// This code is contributed by jit_t 

