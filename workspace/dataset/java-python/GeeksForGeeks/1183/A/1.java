

// Java implementation of the approach 
class GFG 
{ 
      
    // Function to return the bitwise AND 
    // of all the odd integers from 
    // the range [1, n] 
    static int bitwiseAndOdd(int n) 
    { 
        // Initialize result to 1 
        int result = 1; 
      
        // Starting from 3, bitwise AND 
        // all the odd integers less 
        // than or equal to n 
        for (int i = 3; i <= n; i = i + 2) 
        { 
            result = (result & i); 
        } 
        return result; 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
          
        int n = 10; 
          
        System.out.println(bitwiseAndOdd(n)); 
    } 
} 
  
// This code is contributed by AnkitRai01 

