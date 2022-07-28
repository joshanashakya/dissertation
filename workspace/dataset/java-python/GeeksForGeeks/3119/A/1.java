

// Java implementation of the approach 
class geeks 
{ 
      
    // Function to return the integer formed  
    // by taking the rightmost set bit in n 
    public static int firstSetBit(int n) 
    { 
          
        // n & (n - 1) unsets the first set  
        // bit from the right in n 
        int x = n & (n-1); 
          
        // Take xor with the original number  
        // The position of the 'changed bit'  
        // will be set and rest will be unset 
        return (n ^ x); 
    } 
      
    // Driver Code 
    public static void main (String[] args)  
    { 
        int n = 12; 
        System.out.println(firstSetBit(n)); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

