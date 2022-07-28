

// Java implementation of the approach 
import java.lang.Math; 
class GFG 
{ 
      
// Function to return the nth Fibonacci number 
static int fib(int n) 
{ 
    double phi = (1 + Math.sqrt(5)) / 2; 
    return (int)Math.round(Math.pow(phi, n) / Math.sqrt(5)); 
} 
  
// Function to return the required sum 
static int calculateSum(int l, int r) 
{ 
  
    // To store the sum 
    int sum = 0; 
  
    // Calculate the sum 
    for (int i = l; i <= r; i++) 
        sum += fib(i); 
  
    return sum; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int l = 4, r = 8; 
    System.out.println(calculateSum(l, r)); 
  
} 
} 
  
//This code is contributed by Code_Mech. 

