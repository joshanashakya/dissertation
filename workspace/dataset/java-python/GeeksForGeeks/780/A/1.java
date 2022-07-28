

// Java program to print first n 
// non-square numbers. 
import java.io.*; 
import java.math.*; 
  
class GFG { 
      
    static void printNonSquare(int n) 
    { 
        int curr_count = 2, num = 2, count = 0; 
        while (count < n) { 
      
            // Print curr_count numbers. curr_count is 
            //  current gap between two square numbers. 
            for (int i = 0; i < curr_count && 
                                count < n; i++) { 
                                  
                System.out.print( num+" "); 
                  
                count++; 
                num++; 
            } 
      
            // skip a square number. 
            num++; 
      
            // Count of next non-square  
            // numbers is next even number. 
            curr_count += 2; 
        } 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int n = 10; 
        printNonSquare(n); 
    } 
} 
  
  
/* This code is contributed by Nikita Tiwari.*/

