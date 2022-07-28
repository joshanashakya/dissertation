

// Java implementation of the approach 
import java.util.*; 
      
class GFG 
{ 
  
static int TOTAL_BITS = 32; 
  
// Function that returns true if it is 
// possible to arrange the bits of 
// n in alternate fashion 
static boolean isPossible(int n) 
{ 
  
    // To store the count of 1s in the 
    // binary representation of n 
    int cnt = Integer.bitCount(n); 
  
    // If the number set bits and the 
    // number of unset bits is equal 
    if (cnt == TOTAL_BITS / 2) 
        return true; 
    return false; 
} 
  
// Driver code 
static public void main (String []arr) 
{ 
    int n = 524280; 
  
    if (isPossible(n)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
} 
  
// This code is contributed by 29AjayKumar 

