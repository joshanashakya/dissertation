

// Java program for toggle bits 
// expect first and last bit 
import java.io.*; 
  
class GFG { 
      
    // return set middle bits 
    static int setmiddlebits(int n) 
    { 
  
        // set all bit 
        n |= n >> 1; 
        n |= n >> 2; 
        n |= n >> 4; 
        n |= n >> 8; 
        n |= n >> 16; 
      
        // return middle set bits 
        // shift by 1 and xor with 1 
        return (n >> 1) ^ 1; 
    } 
  
    static int togglemiddlebits(int n) 
    { 
        // if number is 1 then  
        // simply return 
        if (n == 1) 
            return 1; 
      
        // XOR with middle bits 
        return n ^ setmiddlebits(n); 
    } 
      
    // Driver Code 
    public static void main (String[] args)  
    { 
      
        // Given number 
        int n = 9; 
      
        // print toggle bits 
        System.out.println(togglemiddlebits(n)); 
    } 
} 
  
// This code is contributed by vt_m 

