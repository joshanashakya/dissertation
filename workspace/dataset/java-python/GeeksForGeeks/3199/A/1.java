

// Java implementation to set  
// the rightmost unset bit 
  
class GFG { 
      
// function to find the position 
// of rightmost set bit 
static int getPosOfRightmostSetBit(int n)  
{ 
    return (int)((Math.log10(n & -n)) / (Math.log10(2))) + 1; 
} 
  
static int setRightmostUnsetBit(int n)  
{ 
    // if n = 0, return 1 
    if (n == 0) 
    return 1; 
  
    // if all bits of 'n' are set 
    if ((n & (n + 1)) == 0) 
    return n; 
  
    // position of rightmost unset bit in 'n' 
    // passing ~n as argument 
    int pos = getPosOfRightmostSetBit(~n); 
  
    // set the bit at position 'pos' 
    return ((1 << (pos - 1)) | n); 
} 
  
// Driver code 
public static void main(String arg[]) { 
    int n = 21; 
    System.out.print(setRightmostUnsetBit(n)); 
} 
} 
  
// This code is contributed by Anant Agarwal. 

