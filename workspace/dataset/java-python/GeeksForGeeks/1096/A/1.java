

// Java implementation of the approach 
class GFG { 
  
    // Function to print the largest and 
    // the smallest n-digit perfect squares 
    static void nDigitPerfectSquares(int n) 
    { 
        // Smallest n-digit perfect square 
        int smallest = (int)Math.pow(Math.ceil(Math.sqrt(Math.pow(10, n - 1))), 2); 
        System.out.print(smallest + " "); 
  
        // Largest n-digit perfect square 
        int largest = (int)Math.pow(Math.ceil(Math.sqrt(Math.pow(10, n))) - 1, 2); 
        System.out.print(largest); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int n = 4; 
        nDigitPerfectSquares(n); 
    } 
} 

