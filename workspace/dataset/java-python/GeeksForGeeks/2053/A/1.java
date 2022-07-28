

// Java code for Compute modulus division by  
// a power-of-2-number 
class GFG { 
      
    // This function will return n % d. 
    // d must be one of: 1, 2, 4, 8, 16, 32, 
    static int getModulo(int n, int d) 
    { 
        return ( n & (d-1) ); 
    }      
      
    // Driver Code 
    public static void main(String[] args) 
    { 
        int n = 6; 
          
        /*d must be a power of 2*/
        int d = 4;  
          
        System.out.println(n+" moduo " + d +  
                    " is " + getModulo(n, d)); 
    } 
}  
  
// This code is contributed  
// by Smitha Dinesh Semwal. 

