

// Java program to print terms of binomial 
// series and also calculate sum of series. 
  
import java.io.*; 
  
class GFG { 
      
    // function to print the series 
    static void series(int A, int X, int n) 
    { 
          
        // Calculating and printing first  
        // term 
        int term = (int)Math.pow(A, n); 
        System.out.print(term + " "); 
  
        // Computing and printing  
        // remaining terms 
        for (int i = 1; i <= n; i++) { 
  
            // Find current term using  
            // previous terms We increment 
            // power of X by 1, decrement 
            // power of A by 1 and compute  
            // nCi using previous term by  
            // multiplying previous term  
            // with (n - i + 1)/i 
            term = term * X * (n - i + 1)  
                                / (i * A); 
  
            System.out.print(term + " "); 
        } 
    } 
  
    // main function started 
    public static void main(String[] args) 
    { 
        int A = 3, X = 4, n = 5; 
          
        series(A, X, n); 
    } 
} 
  
// This code is contributed by vt_m. 

