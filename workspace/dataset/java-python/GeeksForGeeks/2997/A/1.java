

// Java implementation to count unset bits in the 
// given range 
class GFG { 
      
    // Function to get no of set bits in the 
    // binary representation of 'n' 
    static int countSetBits(int n) 
    { 
        int count = 0; 
          
        while (n > 0) { 
            n &= (n - 1); 
            count++; 
        } 
          
        return count; 
    } 
  
    // function to count unset bits 
    // in the given range 
    static int countUnsetBitsInGivenRange(int n, 
                                    int l, int r) 
    { 
          
        // calculating a number 'num' having 'r' 
        // number of bits and bits in the range  
        // l to r are the only set bits 
        int num = ((1 << r) - 1) ^ ((1 <<  
                                   (l - 1)) - 1); 
  
        // returns number of unset bits in the range 
        // 'l' to 'r' in 'n' 
        return (r - l + 1) - countSetBits(n & num); 
    } 
      
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 80; 
        int l = 1, r = 4; 
          
        System.out.print( 
            countUnsetBitsInGivenRange(n, l, r)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

