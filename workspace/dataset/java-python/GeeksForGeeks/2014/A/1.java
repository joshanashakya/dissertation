

// Java program to find sum of first n terms  
  
import java.util.*; 
import java.lang.*; 
import java.io.*; 
class GFG 
{ 
      
// Function to calculate the sum  
static int calculateSum(int n)  
{  
    
    return n * (n + 1) / 2 + n *   
            (n + 1) * (2 * n + 1) / 6;  
}  
    
// Driver code  
public static void main(String args[])  
{  
    // number of terms to be  
    // included in the sum  
    int n = 3;  
    
    // find the Sn  
    System.out.print("Sum = " + calculateSum(n));  
    
} 
}  

