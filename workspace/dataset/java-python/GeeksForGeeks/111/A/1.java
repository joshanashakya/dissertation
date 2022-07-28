

// Java program to Find the GCD of N Fibonacci 
// Numbers with given Indices 
import java.io.*; 
  
// Function to return n'th 
// Fibonacci number 
  
public class GFG { 
    // Recursive function to return gcd of a and b  
    static int __gcd(int a, int b)  
    {  
        // Everything divides 0  
        if (a == 0)  
        return b;  
        if (b == 0)  
        return a;  
          
        // base case  
        if (a == b)  
            return a;  
          
        // a is greater  
        if (a > b)  
            return __gcd(a-b, b);  
        return __gcd(a, b-a);  
    }  
  
static int getFib(int n) 
{ 
    /* Declare an array to store Fibonacci numbers. */
    int f[] = new int[n + 2]; 
    // 1 extra to handle case, n = 0 
    int i; 
  
    // 0th and 1st number of the series 
    // are 0 and 1 
    f[0] = 0; 
    f[1] = 1; 
  
    for (i = 2; i <= n; i++) { 
        // Add the previous 2 numbers in the series 
        // and store it 
        f[i] = f[i - 1] + f[i - 2]; 
    } 
  
    return f[n]; 
} 
  
// Function to Find the GCD of N Fibonacci 
// Numbers with given Indices 
static int find(int arr[], int n) 
{ 
    int gcd_1 = 0; 
    // find the gcd of the indices 
    for (int i = 0; i < n; i++) { 
        gcd_1 = __gcd(gcd_1, arr[i]); 
    } 
  
    // find the fibonacci number at 
    // index gcd_1 
    return getFib(gcd_1); 
} 
  
// Driver code 
    public static void main (String[] args) { 
        int indices[] = { 3, 6, 9 }; 
    int N = indices.length; 
  
    System.out.println( find(indices, N)); 
    } 
} 

