

// Java Program to find nth 
// centered hexadecimal number 
import java.io.*; 
  
class GFG  
{ 
      
    // Function to find centered 
    // hexadecimal number 
    static int centeredHexagonalNumber(int n) 
    { 
        // Formula to calculate nth  
        // centered hexadecimal number 
        // and return it into main function 
        return 3 * n * (n - 1) + 1; 
    } 
      
    // Driver Code 
    public static void main(String args[]) 
    { 
        int n = 10; 
        System.out.print(n + "th centered " + 
                       "hexagonal number: "); 
        System.out.println(centeredHexagonalNumber(n)); 
          
    } 
} 
  
// This code is contributed by Nikita Tiwari. 

