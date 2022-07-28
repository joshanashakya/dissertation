

// Java implementation of the approach 
import java.io.*; 
  
class GFG 
{ 
      
// Function to return the minimum 
// value K such that K % p = 0 
// and q % k = 0 
static int getMinVal(int p, int q) 
{ 
  
    // If K is possible 
    if (q % p == 0) 
        return p; 
  
    // No such K is possible 
    return -1; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int p = 24, q = 48; 
    System.out.println(getMinVal(p, q)); 
} 
} 
  
// This code is contributed by jit_t. 

