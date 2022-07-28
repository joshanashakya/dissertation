

// Java program to generate tetrahedral 
// number series 
import java.io.*; 
  
class GFG { 
      
    // function to generate nth triangular 
    // number 
    static long findTriangularNumber(int n) 
    { 
        return (n * (n + 1)) / 2; 
    } 
      
    // function to print tetrahedral number  
    // series up to n 
    static void printSeries(int n) 
    { 
        // Initialize prev as 0. It store  
        // the sum of all previously generated 
        // triangular number 
        long prev = 0; 
        long curr; 
      
        // Loop to print series 
        for (int i = 1; i <= n; i++)  
        { 
            // Find ithh triangular number 
            curr = findTriangularNumber(i); 
      
            // Add ith triangular number to 
            // sum of all previously generated 
            // triangular number to get ith  
            // tetrahedral number 
            curr = curr + prev; 
            System.out.print(curr + " "); 
      
            // Update sum of all previously  
            // generated triangular number 
            prev = curr; 
        } 
    } 
  
    // Driver code 
    public static void main (String[] args)  
    { 
        int n = 10; 
      
        // function call to print series 
        printSeries(n); 
    } 
} 

