

// Java to find n such that XOR of n and n+1 
// is equals to given n 
class GFG  
{ 
      
    // function to return the required n 
    static int xorCalc(int k) 
    { 
        if (k == 1)  
            return 2; 
          
        // if k is of form 2^i-1 
        if (((k + 1) & k) == 0)  
            return k / 2; 
      
        return 1; 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
        int k = 31; 
          
        System.out.println(xorCalc(k)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

