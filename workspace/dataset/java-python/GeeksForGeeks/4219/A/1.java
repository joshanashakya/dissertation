

// Java program to count numbers 
// whose XOR with n produces a 
// value more than n. 
import java.lang.*; 
class GFG { 
  
    static int countNumbers(int n) 
    { 
  
        // If there is a number like 
        // m = 11110000, then it is 
        // bigger than 1110xxxx. x 
        // can either be 0 or 1. So 
        // where k is the position of 
        // rightmost 1 in m. Now by 
        // using the XOR bit at each 
        // position can be changed. 
        // To change the bit at any 
        // position, it needs to 
        // XOR it with 1. 
        int k = 0; 
        // Position of current bit in n 
  
        // Traverse bits from LSB (least 
        // significant bit) to MSB 
  
        int count = 0; 
        // Initialize result 
        while (n > 0) { 
            // If the current bit is 0, then 
            // there are 2^k numbers with 
            // current bit 1 and whose XOR 
            // with n produces greater value 
            if ((n & 1) == 0) 
                count += (int)(Math.pow(2, k)); 
  
            // Increase position for next bit 
            k += 1; 
  
            // Reduce n to find next bit 
            n >>= 1; 
        } 
  
        return count; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 11; 
        System.out.println(countNumbers(n)); 
    } 
} 
  
// This code is contributed by Smitha. 

