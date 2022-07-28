

// Java program to find  
// sum of given series 
import java.io.*; 
  
class GFG { 
      
    // Function to find sum of series 
    // up-to n terms 
    static double seriesSum(int n) 
    { 
      
    // initializing counter by 1 
    int i = 1; 
      
    // variable to calculate result 
    double res = 0.0; 
    boolean sign = true; 
      
    // while loop until nth term  
    // is not reached 
    while (n > 0)  
    { 
        n--; 
          
        // boolean type variable  
        // for checking validation 
        if (sign) 
        { 
            sign = !sign; 
            res = res + (double)++i / ++i; 
        } 
          
        else 
        { 
            sign = !sign; 
            res = res - (double)++i / ++i; 
        } 
    } 
      
    return res; 
} 
      
    // Driver Code 
    public static void main (String[] args) { 
          
        int n = 5; 
          
        System.out.print(seriesSum(n)); 
    } 
} 
  
// This code is contributed by vt_m 

