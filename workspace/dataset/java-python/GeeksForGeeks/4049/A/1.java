

// javaProgram to finding the 
// sum of the nth series 
import java.io.*; 
  
class GFG { 
      
    // function that calculate 
    // the sum of the nth series 
    static int sum_series(int n) 
    { 
        int nSquare = n * n; 
      
        // using formula of the nth term 
        return nSquare * (nSquare - 1) / 4; 
    } 
  
    // Driver function 
    public static void main (String[] args)  
    { 
        int n = 2; 
        System.out.println( sum_series(n)) ; 
      
    } 
      
} 
// This article is contributed by vt_m 

