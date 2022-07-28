

// Java implementation to check if a  
// number has bits in alternate pattern 
class AlternateSetBits 
{ 
    // function to check if all the bits  
    // are set or not in the binary  
    // representation of 'n' 
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
        int num = n ^ (n >>> 1); 
            
        // to check if all bits are set  
        // in 'num' 
        return allBitsAreSet(num);         
    } 
      
    // Driver Code 
    public static void main(String args[]) 
    { 
        int n = 10; 
          
        if (bitsAreInAltOrder(n)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 
/* This code is contributed by Danish Kaleem */

