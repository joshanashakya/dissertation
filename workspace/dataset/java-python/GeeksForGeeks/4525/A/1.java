

// Java implementation to check whether bits are in 
// alternate pattern in the given range 
class GFG  
{ 
  
// function to check whether rightmost 
// kth bit is set or not in 'n' 
static boolean isKthBitSet(int n, 
                            int k) 
{ 
    if ((n >> (k - 1)) == 1) 
        return true; 
    return false; 
} 
  
// function to set the rightmost kth bit in 'n' 
static int setKthBit(int n, 
                    int k) 
{ 
    // kth bit of n is being set by this operation 
    return ((1 << (k - 1)) | n); 
} 
  
// function to check if all the bits are set or not 
// in the binary representation of 'n' 
static boolean allBitsAreSet(int n) 
{ 
    // if true, then all bits are set 
    if (((n + 1) & n) == 0) 
        return true; 
  
    // else all bits are not set 
    return false; 
} 
  
// function to check if a number 
// has bits in alternate pattern 
static boolean bitsAreInAltOrder(int n) 
{ 
    int num = n ^ (n >> 1); 
  
    // to check if all bits are set 
    // in 'num' 
    return allBitsAreSet(num); 
} 
  
// function to check whether bits are in 
// alternate pattern in the given range 
static boolean bitsAreInAltPatrnInGivenRange(int n, 
                                int l, int r) 
{ 
    int num, left_shift; 
  
    // preparing a number 'num' and 'left_shift' 
    // which can be further used for the check 
    // of alternate pattern in the given range 
    if (isKthBitSet(n, r))  
    { 
        num = n; 
        left_shift = r; 
    } 
    else
    { 
        num = setKthBit(n, (r + 1)); 
        left_shift = r + 1; 
    } 
  
    // unset all the bits which are left to the 
    // rth bit of (r+1)th bit 
    num = num & ((1 << left_shift) - 1); 
  
    // right shift 'num' by (l-1) bits 
    num = num >> (l - 1); 
  
    return bitsAreInAltOrder(num); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 18; 
    int l = 1, r = 3; 
    if (bitsAreInAltPatrnInGivenRange(n, l, r)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
} 
  
// This code has been contributed by 29AjayKumar 

