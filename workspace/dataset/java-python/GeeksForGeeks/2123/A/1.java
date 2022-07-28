

// Java implementation of the approach 
class GFG { 
  
    // Function to return the 
    // count of such numbers 
    static int countNumbers(int n) 
    { 
  
        // If n is odd 
        if (n % 2 == 1) 
            return 0; 
  
        return (9 * (int)Math.pow(10, n / 2 - 1)); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int n = 2; 
        System.out.print(countNumbers(n)); 
    } 
} 

