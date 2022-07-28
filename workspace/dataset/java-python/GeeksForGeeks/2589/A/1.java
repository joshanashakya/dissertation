

// Java implementation to find the previous 
// smaller integer with one less number of 
// set bits 
class GFG { 
      
    // function to find the position of 
    // rightmost set bit. 
    static int getFirstSetBitPos(int n) 
    { 
        return (int)(Math.log(n & -n) / Math.log(2)) + 1; 
    } 
  
    // function to find the previous smaller 
    // integer 
    static int previousSmallerInteger(int n) 
    { 
          
        // position of rightmost set bit of n 
        int pos = getFirstSetBitPos(n); 
  
        // turn off or unset the bit at 
        // position 'pos' 
        return (n & ~(1 << (pos - 1))); 
    } 
      
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 25; 
        System.out.print("Previous smaller Integer =" 
                     + previousSmallerInteger(n)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

