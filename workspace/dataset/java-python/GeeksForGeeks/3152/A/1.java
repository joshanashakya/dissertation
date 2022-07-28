

// Java program to count squares  
// in a rectangle of size m x n  
import java.util.*; 
  
class GFG  
{ 
  
    // Returns count of all squares 
    // in a rectangle of size m x n 
    static int countSquares(int m, int n)  
    { 
  
        // If n is smaller, swap m and n 
        if (n < m)  
        { 
            int temp = m; 
            m = n; 
            n = temp; 
        } 
  
        // Now n is greater dimension, 
        // apply formula 
        return n * (n + 1) * (3 * m - n + 1) / 6; 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        int m = 4; 
        int n = 3; 
        System.out.print("Count of squares is " +  
                             countSquares(m, n)); 
    } 
} 
  
// This code is contributed by 29AjayKumar 

