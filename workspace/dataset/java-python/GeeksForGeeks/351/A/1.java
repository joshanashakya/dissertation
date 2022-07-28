

// Java implementation to find 
// the Sum of numbers in the 
// Kth level of a Fibonacci triangle 
import java.util.*;  
  
class GFG  
{ 
  
// Function to return 
// the nth Fibonacci number 
static int fib(int n) 
{ 
    double phi = (1 + Math.sqrt(5)) / 2; 
    return (int)Math.round(Math.pow(phi, n) / Math.sqrt(5)); 
} 
  
// Function to return 
// the required sum of the array 
static int calculateSum(int l, int r) 
{ 
  
    // Using our deduced result 
    int sum = fib(r + 2) - fib(l + 1); 
  
    return sum; 
} 
  
// Function to return the sum of 
// fibonacci in the Kth array 
static int sumFibonacci(int k) 
{ 
    // Count of fibonacci which are in 
    // the arrays from 1 to k - 1 
    int l = (k * (k - 1)) / 2; 
    int r = l + k; 
  
    int sum = calculateSum(l, r - 1); 
  
    return sum; 
} 
  
// Driver code 
public static void main(String args[])  
{  
  
    int k = 3; 
  
    System.out.println(sumFibonacci(k)); 
} 
} 
  
// This code is contributed by AbhiThakur 

