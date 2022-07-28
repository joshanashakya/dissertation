

// Java program to find the sum of n terms 
import java.io.*; 
  
public class GFG 
{ 
    static int calculateSum(int n) 
    { 
        return (int)((2 * Math.pow((n * (n + 1) / 2), 2))) +  
               ((n * (n + 1) * (2 * n + 1)) / 6); 
    } 
      
    public static void main (String[] args) { 
      
        int n = 4; 
        System.out.println("Sum = " +  calculateSum(n)); 
      
    } 
} 
// This code is contributed by Raj 

