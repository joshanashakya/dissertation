

// Java Program to print  
// Fibonacci sequence 
// using 2 variables 
import java.io.*; 
class GFG { 
      
static void fib(int n) 
{ 
    int a = 0, b = 1; 
    if (n >= 0) 
        System.out.print(a + " "); 
    if (n >= 1) 
        System.out.print(b + " "); 
    for (int i = 2; i <= n; i++)  
    { 
        System.out.print(a + b + " "); 
        b = a + b; 
        a = b - a; 
    } 
} 
  
    // Driver code 
    public static void main (String[] args)  
    { 
        fib(9); 
    } 
} 
  
// This code is contributed by anuj_67. 

