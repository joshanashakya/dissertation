

// Java implementation to find the position 
// of rightmost same bit 
class GFG { 
          
    // Function to find the position of 
    // rightmost set bit in 'n' 
    static int getRightMostSetBit(int n) 
    { 
        return (int)((Math.log(n & -n))/(Math.log(2))) 
                                                  + 1; 
    } 
      
    // Function to find the position of 
    // rightmost same bit in the 
    // binary representations of 'm' and 'n' 
    static int posOfRightMostSameBit(int m,int n) 
    { 
          
        // position of rightmost same bit 
        return getRightMostSetBit(~(m ^ n)); 
    } 
      
    //Driver code 
    public static void main (String[] args) 
    { 
        int m = 16, n = 7; 
          
        System.out.print("Position = "
            + posOfRightMostSameBit(m, n)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

