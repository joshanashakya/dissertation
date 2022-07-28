

// Java program for  
// binomial coefficients 
import java.io.*; 
  
class GFG  
{ 
      
// Function to print  
// binomial table 
static void printbinomial(int max) 
{ 
    for (int m = 0; m <= max; m++) 
    { 
        System.out.print(m + " "); 
        int binom = 1; 
        for (int x = 0; x <= m; x++)  
        { 
  
            // B(m, x) is 1 if either  
            // m or x is is 0. 
            if (m != 0 && x != 0) 
  
                // Otherwise using  
                // recursive formula 
                // B(m, x) = B(m, x - 1) *  
                //            (m - x + 1) / x 
                binom = binom * (m - x + 1) / x; 
  
            System.out.print(binom + " "); 
        } 
        System.out.println(); 
    } 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int max = 10; 
    printbinomial(max); 
} 
} 
  
// This code is contributed 
// by akt_mit 

