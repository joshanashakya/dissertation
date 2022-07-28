

// Java implementation of the approach 
class GFG  
{ 
static int NumUnsignBits = 64; 
  
// Function to return the number 
// closest to x which has equal 
// number of set bits as x 
static long findNum(long x) 
{ 
    // Loop for each bit in x and 
    // compare with the next bit 
    for (int i = 0; i < NumUnsignBits - 1; i++) 
    { 
        if (((x >> i) & 1) != ((x >> (i + 1)) & 1)) 
        { 
            x ^= (1 << i) | (1 << (i + 1)); 
            return x; 
        } 
    } 
    return Long.MIN_VALUE; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 92; 
  
    System.out.println(findNum(n)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

