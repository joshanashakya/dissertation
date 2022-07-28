

// Java Program to find sum  
// of square of first n 
// natural numbers 
import java.io.*; 
  
class GFG { 
      
    // Return the sum of square  
    // of first n natural numbers 
    static int squaresum(int n) 
    { 
        return (n * (n + 1) * (2 * n + 1)) / 6; 
    } 
      
    // Driven Program 
    public static void main(String args[]) 
                            throws IOException 
    { 
        int n = 4; 
        System.out.println(squaresum(n)); 
    } 
} 
  
  
/*This code si contributed by Nikita Tiwari.*/

