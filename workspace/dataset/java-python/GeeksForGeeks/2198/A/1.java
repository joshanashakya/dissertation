

// Java implementation of the approach 
class GFG { 
  
    // Function to return the smallest n digit 
    // number which is a multiple of 5 
    static int smallestMultiple(int n) 
    { 
        if (n == 1) 
            return 5; 
        return (int)(Math.pow(10, n - 1)); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int n = 4; 
        System.out.println(smallestMultiple(n)); 
    } 
} 

