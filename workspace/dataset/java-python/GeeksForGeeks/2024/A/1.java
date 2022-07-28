

// Efficient Java program to find  
// unit digit of x^y. 
import java.io.*; 
  
class GFG { 
    // Returns unit digit of x raised to power y 
    static int unitDigitXRaisedY(int x, int y) 
    { 
        // Initialize result as 1 to 
        // handle case when y is 0. 
        int res = 1; 
      
        // One by one multiply with x 
        // mod 10 to avoid overflow. 
        for (int i = 0; i < y; i++) 
            res = (res * x) % 10; 
      
        return res; 
    } 
      
    // Driver program 
    public static void main(String args[])throws IOException 
    {  
    System.out.println(unitDigitXRaisedY(4, 2)); 
    } 
} 
  
// This code is contributed by Nikita Tiwari. 

