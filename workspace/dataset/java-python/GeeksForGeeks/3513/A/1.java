

// Java program to find the  
// Nth term of Fibonacci series 
import java.io.*; 
  
class GFG 
{ 
      
// Fibonacci Series  
// using Recursion 
static int fib(int n) 
{ 
  
    // Base case 
    if (n <= 1) 
        return n; 
  
    // recursive calls 
    return fib(n - 1) + 
           fib(n - 2); 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int n = 6; 
    System.out.println(fib(n)); 
} 
} 
  
// This code is contributed 
// by ajit 

