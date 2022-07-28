

// Java program to generate series of  
// tetrahedral numbers 
import java.io.*; 
  
class GFG { 
      
    // function to print tetrahedral  
    // number series up to n 
    static void printSeries(int n) 
    { 
      
        // loop to print series 
        for (int i = 1; i <= n; i++) 
        { 
            // Calculate and print ith  
            // tetrahedral number 
            int num = i * (i + 1) * (i + 2) / 6; 
              
            System.out.print(num + " "); 
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

