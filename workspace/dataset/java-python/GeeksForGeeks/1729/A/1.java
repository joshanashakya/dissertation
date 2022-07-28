

// Java program to find n-th Centered 
// heptagonal number 
import java.io.*; 
  
class GFG { 
  
    // Function to find Centered heptagonal 
    // number 
    static long centered_heptagonal_num(long n) 
    { 
          
        // Formula to calculate nth 
        // Centered heptagonal number 
        return (7 * n * n - 7 * n + 2) / 2; 
    } 
      
    // Driver Code 
    public static void main (String[] args) 
    { 
        long n = 5; 
        System.out.println( n + "th Centered "
                      + "heptagonal number : "
                + centered_heptagonal_num(n)); 
    } 
} 
  
// This code is contributed by anuj_67. 

