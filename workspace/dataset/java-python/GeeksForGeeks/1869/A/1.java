

// Java implementation to find the smallest number 
// with n set and m unset bits 
  
class GFG  
{ 
    // Function to toggle bits in the given range 
    static int toggleBitsFromLToR(int n, int l, int r) 
    { 
        // for invalid range 
        if (r < l) 
            return n; 
   
        // calculating a number 'num' having 'r' 
        // number of bits and bits in the range l 
        // to r are the only set bits 
        int num = ((1 << r) - 1) ^ ((1 << (l - 1)) - 1); 
   
        // toggle bits in the range l to r in 'n' 
        // and return the number 
        return (n ^ num); 
    } 
      
    // Function to find the smallest number 
    // with n set and m unset bits 
    static int smallNumWithNSetAndMUnsetBits(int n, int m) 
    { 
        // calculating a number 'num' having '(n+m)' bits 
        // and all are set 
        int num = (1 << (n + m)) - 1; 
   
        // required smallest number 
        return toggleBitsFromLToR(num, n, n + m - 1); 
    } 
      
    // driver program 
    public static void main (String[] args)  
    { 
        int n = 2, m = 2; 
        System.out.println(smallNumWithNSetAndMUnsetBits(n, m)); 
    } 
} 
  
// Contributed by Pramod Kumar 

