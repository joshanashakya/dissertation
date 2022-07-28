

// Java program to print terms of binomial 
// series and also calculate sum of series. 
  
import java.io.*; 
  
class GFG { 
      
    // function to calculate factorial of 
    // a number 
    static int factorial(int n) 
    { 
        int f = 1; 
        for (int i = 2; i <= n; i++) 
            f *= i; 
              
        return f; 
    } 
  
    // function to print the series 
    static void series(int A, int X, int n) 
    { 
          
        // calculating the value of n! 
        int nFact = factorial(n); 
  
        // loop to display the series 
        for (int i = 0; i < n + 1; i++) { 
  
            // For calculating the 
            // value of nCr 
            int niFact = factorial(n - i); 
            int iFact = factorial(i); 
  
            // calculating the value of 
            // A to the power k and X to 
            // the power k 
            int aPow = (int)Math.pow(A, n - i); 
            int xPow = (int)Math.pow(X, i); 
  
            // display the series 
            System.out.print((nFact * aPow * xPow)  
                         / (niFact * iFact) + " "); 
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

