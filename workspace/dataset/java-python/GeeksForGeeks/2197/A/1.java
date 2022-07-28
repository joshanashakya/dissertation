

// Java implementation of the approach 
class GFG { 
  
    // Function to print the largest and 
    // the smallest n-digit perfect cube 
    static void nDigitPerfectCubes(int n) 
    { 
  
        // Smallest n-digit perfect cube 
        int smallest = (int)Math.pow(Math.ceil(Math.cbrt(Math.pow(10, (n - 1)))), 3); 
        System.out.print(smallest + " "); 
  
        int largest = (int)Math.pow(Math.ceil(Math.cbrt(Math.pow(10, (n)))) - 1, 3); 
        System.out.print(largest); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int n = 3; 
        nDigitPerfectCubes(n); 
    } 
} 

