

// Java Program to find even indexed Fibonacci Sum in  
// O(Log n) time.  
  
class GFG { 
  
    static int MAX = 1000; 
  
   // Create an array for memoization  
    static int f[] = new int[MAX]; 
  
// Returns n'th Fibonacci number  
// using table f[]  
    static int fib(int n) { 
        // Base cases  
        if (n == 0) { 
            return 0; 
        } 
        if (n == 1 || n == 2) { 
            return (f[n] = 1); 
        } 
  
        // If fib(n) is already computed  
        if (f[n] == 1) { 
            return f[n]; 
        } 
  
        int k = (n % 2 == 1) ? (n + 1) / 2 : n / 2; 
  
        // Applying above formula [Note value n&1 is 1  
        // if n is odd, else 0].  
        f[n] = (n % 2 == 1) ? (fib(k) * fib(k) + fib(k - 1) * fib(k - 1)) 
                : (2 * fib(k - 1) + fib(k)) * fib(k); 
  
        return f[n]; 
    } 
  
// Computes value of even-indexed Fibonacci Sum  
    static int calculateEvenSum(int n) { 
        return (fib(2 * n + 1) - 1); 
    } 
  
// Driver program to test above function  
    public static void main(String[] args) { 
        // Get n  
        int n = 8; 
  
        // Find the alternating sum  
        System.out.println("Even indexed Fibonacci Sum upto "
                + n + " terms: "
                + calculateEvenSum(n)); 
    } 
} 
// This code is contributed by Rajput-Ji 

