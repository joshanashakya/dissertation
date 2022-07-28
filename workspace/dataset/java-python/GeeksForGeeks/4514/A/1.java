

// Java program to toggle set bits  
// starting from MSB 
  
class GFG { 
      
// Returns a number which has all  
// set bits starting from MSB of n 
static int setAllBitsAfterMSB(int n) { 
      
    // This makes sure two bits 
    // (From MSB and including MSB) 
    // are set 
    n |= n >> 1; 
  
    // This makes sure 4 bits 
    // (From MSB and including MSB) 
    // are set 
    n |= n >> 2; 
  
    n |= n >> 4; 
    n |= n >> 8; 
    n |= n >> 16; 
    return n; 
} 
static int toggle(int n)  
{ 
    n = n ^ setAllBitsAfterMSB(n); 
    return n; 
} 
  
// Driver code 
public static void main(String arg[])  
{ 
    int n = 10; 
    n = toggle(n); 
    System.out.print(n); 
} 
} 
  
// This code is contributed by Anant Agarwal. 

