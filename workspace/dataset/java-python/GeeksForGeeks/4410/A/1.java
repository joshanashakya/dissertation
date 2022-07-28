

// Java implementation of  
// above approach 
import java.io.*; 
  
class GFG  
{ 
  
// Function to find the sum 
static double findSum(long n) 
{ 
    // Apply AP formula 
    return Math.sqrt(3) * (n *  
                    (n + 1) / 2); 
} 
// Driver code 
public static void main (String[] args)  
{ 
    // number of terms 
    long n = 10; 
      
    System.out.println( findSum(n)); 
} 
} 
  
// This code is contributed  
// by inder_verma.. 

