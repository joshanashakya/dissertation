

// Java program to find number of  
// ways to representing a number 
// as a sum of 1's and 2's 
class GFG  
{ 
  
// Function to multiply matrix. 
    static void multiply(int F[][], int M[][]) 
    { 
        int x = F[0][0] * M[0][0] + F[0][1] * M[1][0]; 
        int y = F[0][0] * M[0][1] + F[0][1] * M[1][1]; 
        int z = F[1][0] * M[0][0] + F[1][1] * M[1][0]; 
        int w = F[1][0] * M[0][1] + F[1][1] * M[1][1]; 
  
        F[0][0] = x; 
        F[0][1] = y; 
        F[1][0] = z; 
        F[1][1] = w; 
    } 
  
    // Power function in log n 
    static void power(int F[][], int n)  
    { 
        if (n == 0 || n == 1)  
        { 
            return; 
        } 
        int M[][] = {{1, 1}, {1, 0}}; 
  
        power(F, n / 2); 
        multiply(F, F); 
  
        if (n % 2 != 0)  
        { 
            multiply(F, M); 
        } 
    } 
  
    /* function that returns (n+1)th Fibonacci number 
    Or number of ways to represent n as sum of 1's 
    2's */
    static int countWays(int n)  
    { 
        int F[][] = {{1, 1}, {1, 0}}; 
        if (n == 0) 
        { 
            return 0; 
        } 
        power(F, n); 
        return F[0][0]; 
    } 
  
    // Driver program 
    public static void main(String[] args)  
    { 
        int n = 5; 
        System.out.println(countWays(n)); 
    } 
} 
  
// This code contributed by Rajput-Ji 

