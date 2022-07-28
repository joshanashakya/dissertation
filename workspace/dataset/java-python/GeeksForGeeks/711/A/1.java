

// Java Program to find  
// the bitwise OR of all  
// the intgers in range L-R 
import java.io.*; 
  
class GFG 
{ 
  
// Returns the Most Significant  
// Bit Position (MSB) 
static int MSBPosition(long N) 
{ 
    int msb_p = -1; 
    while (N > 0) 
    { 
        N = N >> 1; 
        msb_p++; 
    } 
    return msb_p; 
} 
  
// Returns the Bitwise  
// OR of all integers  
// between L and R 
static long findBitwiseOR(long L, 
                          long R) 
{ 
    long res = 0; 
  
    // Find the MSB  
    // position in L 
    int msb_p1 = MSBPosition(L); 
  
    // Find the MSB  
    // position in R 
    int msb_p2 = MSBPosition(R); 
  
    while (msb_p1 == msb_p2) 
    { 
        long res_val = (1 << msb_p1); 
  
        // Add this value until  
        // msb_p1 and msb_p2 are same; 
        res += res_val; 
  
        L -= res_val; 
        R -= res_val; 
  
        // Calculate msb_p1  
        // and msb_p2 
        msb_p1 = MSBPosition(L); 
        msb_p2 = MSBPosition(R); 
    } 
      
    // Find the max of  
    // msb_p1 and msb_p2 
    msb_p1 = Math.max(msb_p1,  
                      msb_p2); 
  
    // Set all the bits  
    // from msb_p1 upto 
    // 0th bit in the result 
    for (int i = msb_p1; i >= 0; i--)  
    { 
        long res_val = (1 << i); 
        res += res_val; 
    } 
    return res; 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int L = 12, R = 18; 
    System.out.println(findBitwiseOR(L, R)); 
} 
} 
  
// This code is contributed 
// by anuj_67. 

