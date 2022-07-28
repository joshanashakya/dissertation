

// Java program to find n-th Fibonacci number 
  
class GFG 
{ 
    // Approximate value of golden ratio 
    static double PHI = 1.6180339; 
      
    // Fibonacci numbers upto n = 5 
    static int f[] = { 0, 1, 1, 2, 3, 5 }; 
      
    // Function to find nth 
    // Fibonacci number 
    static int fib (int n) 
    { 
        // Fibonacci numbers for n < 6 
        if (n < 6) 
            return f[n]; 
      
        // Else start counting from  
        // 5th term 
        int t = 5; 
        int fn = 5; 
      
        while (t < n) { 
            fn = (int)Math.round(fn * PHI); 
            t++; 
        } 
      
        return fn;  
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
        int n = 9; 
        System.out.println(n + "th Fibonacci Number = "
                                                +fib(n)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

