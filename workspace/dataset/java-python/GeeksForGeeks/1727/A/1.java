

// Java program to find nth Centered square 
// number 
import java.io.*; 
  
class GFG { 
  
    // Function to calculate Centered 
    // square number function 
    static int centered_square_num(int n) 
    { 
        // Formula to calculate nth 
        // Centered square number 
        return n * n + ((n - 1) * (n - 1)); 
    } 
      
    // Driver Code 
    public static void main (String[] args)  
    { 
        int n = 7; 
        System.out.print( n + "th Centered"
                       + " square number: "
                 + centered_square_num(n)); 
    } 
} 
  
// This code is contributed by anuj_67. 

