

// Java program to print first n 
// non-square numbers. 
import java.io.*; 
import java.math.*; 
  
class GFG { 
      
    // Returns n-th non-square number. 
    static int nonsquare(int n) 
    { 
        return n + (int)(0.5 + (Math.sqrt(n))); 
    } 
  
    static void printNonSquare(int n) 
    { 
        // loop to print non squares 
        // below n 
        for (int i = 1; i <= n; i++) 
            System.out.print(nonsquare(i)+" "); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int n = 10; 
        printNonSquare(n); 
    } 
} 
  
  
/* This code is contributed by Nikita Tiwari.*/

