

// Java Program to find sum 
// of Fibonacci numbers in  
// O(Log n) time. 
import java.io.*; 
import java.util.*; 
  
class GFG { 
    static int MAX = 1000; 
  
    // Create an array for memoization 
    static int f[] = new int[MAX]; 
      
    // Returns n'th Fibonacci  
    // number using table f[] 
    static int fib(int n) 
    { 
        Arrays.fill(f, 0); 
        // Base cases 
        if (n == 0) 
            return 0; 
        if (n == 1 || n == 2) 
            return (f[n] = 1); 
      
        // If fib(n) is already computed 
        if (f[n] == 1) 
            return f[n]; 
            int k; 
        if((n & 1) == 1)  
            k = (n + 1) / 2 ; 
        else
            k = n / 2; 
      
        // Applying above formula  
        // [Note value n&1 is 1  
        // if n is odd, else 0]. 
        if((n & 1) == 1)  
            f[n] = (fib(k) * fib(k) + 
            fib(k - 1) * fib(k - 1)); 
        else
            f[n] = (2 * fib(k - 1) + fib(k)) * fib(k); 
      
        return f[n]; 
    } 
      
    // Computes value of first  
    // Fibonacci numbers 
    static int calculateSum(int n) 
    { 
        return fib(n + 2) - 1; 
    } 
      
    // Driver program 
    public static void main(String args[]) 
    { 
        int n = 4; 
        System.out.println( "Sum of Fibonacci numbers is : "
                          + calculateSum(n)); 
          
    } 
} 
  
  
/*This code is contributed by Nikita Tiwari.*/

