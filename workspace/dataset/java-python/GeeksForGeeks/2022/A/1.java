

// Java program to find the sum of n terms  
import java.io.*; 
  
class GFG { 
  
  
// Function to calculate the sum  
static int calculateSum(int n)  
{  
  
    // Return total sum  
    return (int)Math.pow(n * (n + 1) / 2, 2);  
}  
  
// Driver code  
  
  
    public static void main (String[] args) { 
        int n = 4;  
    System.out.println( calculateSum(n));  
  
    } 
} 
// This code is contributed by inder_verma.. 

