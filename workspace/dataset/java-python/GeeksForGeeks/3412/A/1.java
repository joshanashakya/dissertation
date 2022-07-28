

// Java program to check whether the number 
// can be made perfect square after adding K 
import java.util.*; 
  
class GFG 
{ 
      
    // Function to check whether the number 
    // can be made perfect square after adding K 
    static void isPerfectSquare(int x) 
    { 
      
        // Computing the square root of 
        // the number 
        int sr = (int)Math.sqrt(x); 
      
        // Print Yes if the number 
        // is a perfect square 
        if (sr * sr == x) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
      
    // Driver code 
    public static void main(String args[]) 
    { 
        int n = 7, k = 2; 
        isPerfectSquare(n + k); 
      
    } 
} 
  
// This code is contributed by Yash_R 

