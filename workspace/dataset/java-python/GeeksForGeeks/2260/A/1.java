

// Java implementation of the approach 
class Solution { 
  
    // Function to return smallest even 
    // number with n digits 
    static int smallestEven(int n) 
    { 
        if (n == 1) 
            return 0; 
        return Math.pow(10, n - 1); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int n = 4; 
        System.out.println(smallestEven(n)); 
    } 
} 

