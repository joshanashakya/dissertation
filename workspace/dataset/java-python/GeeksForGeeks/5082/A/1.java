

// Java Program to find Product 
// of 2 Numbers using Recursion 
import java.io.*; 
import java.util.*; 
  
class GFG  
{ 
      
    // recursive function to calculate  
    // multiplication of two numbers 
    static int product(int x, int y) 
    { 
        // if x is less than  
        // y swap the numbers 
        if (x < y) 
            return product(y, x); 
      
        // iteratively calculate  
        // y times sum of x 
        else if (y != 0) 
            return (x + product(x, y - 1)); 
      
        // if any of the two numbers is  
        // zero return zero 
        else
            return 0; 
    } 
      
    // Driver Code 
    public static void main (String[] args) 
    { 
        int x = 5, y = 2; 
        System.out.println(product(x, y));  
    } 
} 
  
// This code is contributed by Gitanjali. 

