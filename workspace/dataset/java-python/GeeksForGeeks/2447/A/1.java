

// Java program of number of leading zeros in  
// binary representation of a given number 
class GFG  
{ 
static byte sizeofInt = 8; 
  
// Function to count the no. of leading zeros 
static int countZeros(int x) 
{ 
    // Keep shifting x by one until leftmost bit 
    // does not become 1. 
    int total_bits = sizeofInt * 8; 
    int res = 0; 
    while ((x & (1 << (total_bits - 1))) == 0) 
    { 
        x = (x << 1); 
        res++; 
    } 
  
    return res; 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    int x = 101; 
    System.out.println(countZeros(x)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

