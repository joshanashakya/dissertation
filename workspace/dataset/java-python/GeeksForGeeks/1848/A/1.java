

// Java implementation to unset bits in the given range 
import java.io.*; 
  
class GFG  
{ 
    // Function to toggle bits in the given range 
    static int toggleBitsFromLToR(int n, int l, int r) 
    { 
        // calculating a number 'num' having 'r' number of bits 
        // and bits in the range l to r are the only set bits 
        int num = ((1 << r) - 1) ^ ((1 << (l - 1)) - 1); 
   
        // toggle the bits in the range l to r in 'n' 
        // and return the number 
        return (n ^ num); 
    } 
      
    // Function to unset bits in the given range 
    static int unsetBitsInGivenRange(int n, int l, int r) 
    { 
        // 'num' is the highest positive integer number 
        // all the bits of 'num' are set 
        int num = (1 << (4 * 8 - 1)) - 1; 
   
        // toggle the bits in the range l to r in 'num' 
        num = toggleBitsFromLToR(num, l, r); 
   
        // unset the bits in the range l to r in 'n' 
        // and return the number 
        return (n & num); 
    } 
      
    // driver program 
    public static void main (String[] args)  
    { 
        int n = 42; 
        int l = 2, r = 5; 
        System.out.println(unsetBitsInGivenRange(n, l, r)); 
    } 
} 
  
// Contributed by Pramod Kumar 

