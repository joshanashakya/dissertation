

// Java Program to convert given 
// decimal number of gray code 
// into its inverse in decimal form 
import java.io.*; 
  
class GFG { 
      
    // Function to convert given 
    // decimal number of gray code 
    // into its inverse in decimal form 
    static int inversegrayCode(int n) 
    { 
        int inv = 0; 
      
        // Taking xor until n becomes zero 
        for ( ; n != 0 ; n = n >> 1) 
            inv ^= n; 
      
        return inv; 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
        int n = 15; 
        System.out.println(inversegrayCode(n)); 
    } 
} 
  
// This code is contributed by Ajit. 

