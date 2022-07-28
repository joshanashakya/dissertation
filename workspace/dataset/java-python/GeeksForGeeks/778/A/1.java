

// Java program to print first n 
// non-square numbers. 
import java.io.*; 
import java.math.*; 
  
class GFG { 
      
    // Function to check perfect square 
    static boolean isPerfectSquare(int n) 
    { 
       if (n < 0) 
          return false; 
      
       int root = Math.round((int)(Math.sqrt(n))); 
       return n == root * root; 
    } 
      
    // function to print all 
    // non square number 
    static void printnonsquare(int n) 
    { 
        // variable which stores the 
        // count 
        int count = 0; 
        for (int i = 1; count < n; ++i) { 
      
            // not perfect square 
            if (!isPerfectSquare(i)) { 
      
                System.out.print(i + " "); 
                count++; 
            } 
        } 
    } 
      
    // Driver code 
    public static void main(String args[]) 
    { 
        int n = 10; 
        printnonsquare(n); 
    } 
} 
  
  
/* This code is contributed by Nikita Tiwari.*/

