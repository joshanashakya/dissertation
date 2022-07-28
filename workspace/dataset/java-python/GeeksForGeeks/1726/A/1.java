

// Program to find the series of  
// centered hexadecimal number. 
import java.io.*; 
  
class GFG  
{ 
    // Function to find the series of  
    // centered hexadecimal number. 
    static void centeredHexagonalSeries(int n) 
    { 
        // Formula to calculate nth  
        // centered hexadecimal number. 
        for (int i = 1; i <= n; i++) 
            System.out.print( 3 * i *  
                            (i - 1) + 1 + " "); 
    } 
      
    // Driver Code 
    public static void main(String args[]) 
    { 
        int n = 10; 
        centeredHexagonalSeries(n); 
    } 
} 
  
// This code is contributed by Nikita Tiwari. 

