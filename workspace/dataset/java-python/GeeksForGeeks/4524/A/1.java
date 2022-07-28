

// Java implementation to check 
// whether bits are in alternate 
// pattern in the given range 
class GFG 
{ 
      
// function to check whether  
// bits are in alternate  
// pattern in the given range 
static boolean bitsAreInAltPatrnInGivenTRange(int n,  
                                       int l, int r) 
{ 
    int num, prev, curr; 
  
    // right shift n by (l - 1) bits 
    num = n >> (l - 1); 
  
    // get the bit at the 
    // last position in 'num' 
    prev = num & 1; 
  
    // right shift 'num' by 1 
    num = num >> 1; 
  
    // loop until there are  
    // bits in the given range 
    for (int i = 1; i <= (r - l); i++)  
    { 
  
        // get the bit at the 
        // last position in 'num' 
        curr = num & 1; 
  
        // if true, then bits are  
        // not in alternate pattern 
        if (curr == prev) 
            return false; 
  
        // update 'prev' 
        prev = curr; 
  
        // right shift 'num' by 1 
        num = num >> 1; 
    } 
  
    // bits are in alternate  
    // pattern in the given range 
    return true; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int n = 18; 
    int l = 1, r = 3; 
  
    if (bitsAreInAltPatrnInGivenTRange(n, l, r)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
} 
  
// This code is contributed by mits 

