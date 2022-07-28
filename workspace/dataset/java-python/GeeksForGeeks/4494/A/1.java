

// java implementation to check  
// whether every digit in the  
// binary representation of the 
// given number is set or not 
import java.io.*; 
  
class GFG { 
      
    // function to check if all the bits 
    // are setthe bits are set or not 
    // in the binary representation of 'n' 
    static String areAllBitsSet(int n) 
    { 
        // all bits are not set 
        if (n == 0) 
            return "No"; 
      
        // loop till n becomes '0' 
        while (n > 0) 
        { 
            // if the last bit is not set 
            if ((n & 1) == 0) 
                return "No"; 
      
            // right shift 'n' by 1 
            n = n >> 1; 
        } 
      
            // all bits are set 
            return "Yes"; 
    } 
      
    // Driver program to test above 
    public static void main (String[] args) { 
    int n = 7; 
      
    System.out.println(areAllBitsSet(n)); 
    } 
} 
  
  
// This code is contributed by vt_m 

