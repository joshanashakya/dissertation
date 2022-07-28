

// Java to find remainder and quotient 
import java.io.*; 
  
public class GFG { 
      
    // function to print remainder and 
    // quotient 
    static void divide(int n, int m) 
    { 
          
        // print Remainder by  
        // n AND (m-1) 
        System.out.println("Remainder = "
                        + ((n) &(m-1))); 
          
        // print quotient by right shifting 
        // n by (log2(m)) times 
        System.out.println("Quotient = "
            + (n >> (int)(Math.log(m) / Math.log(2)))); 
    } 
      
    // driver program 
    static public void main (String[] args) 
    { 
        int n = 43, m = 8; 
          
        divide(n, m); 
    } 
} 
  
// This code is contributed by vt_m. 

