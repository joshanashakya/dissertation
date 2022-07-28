

// Java implmentation to count the 
// consecutive fibonacci pairs in the array 
import java.util.*; 
import java.lang.*; 
  
class GFG 
{ 
   
// Function to find the previous 
// fibonacci for the number N 
static int previousFibonacci(int n) 
{ 
    double a = n / ((1 + (int)Math.sqrt(5)) / 2.0); 
    return (int)Math.round(a); 
} 
   
// Function to find the next 
// fibonacci number for the number N 
static int nextFibonacci(int n) 
{ 
    double a = n * (1 + (int)Math.sqrt(5)) / 2.0; 
    return (int)Math.round(a); 
} 
   
// Function to check that a Number 
// is a perfect square or not 
static boolean isPerfectSquare(int x) 
{ 
    int s = (int)Math.sqrt(x); 
    return (s * s == x); 
} 
   
// Function to check that a number 
// is fibonacci number or not 
static boolean isFibonacci(int n) 
{ 
    // N is Fibinacci if one of 
    // (5*n*n + 4) or (5*n*n - 4) 
    // is a perferct square 
    return (isPerfectSquare(5 * n * n + 4) 
            || isPerfectSquare(5 * n * n - 4)); 
} 
   
// Function to count the fibonacci 
// pairs in the array 
static int countFibonacciPairs(int arr[], int n) 
{ 
    int res = 0; 
   
    // Loop to iterate over the array 
    // to choose all pairs of the array 
    for (int i = 0; i < n; i++) 
        for (int j = i + 1; j < n; j++) 
   
            // Condition to check if both 
            // the number of pair is a 
            // fibonacci number 
            if (isFibonacci(arr[i]) 
                && isFibonacci(arr[j])) { 
   
                int prevFib = previousFibonacci(arr[i]); 
                int nextFib = nextFibonacci(arr[i]); 
   
                // Condition to check if both 
                // the number form consecutive 
                // fibonacci numbers 
                if (prevFib == arr[j] 
                    || nextFib == arr[j]) { 
                    res++; 
                } 
            } 
   
    return res; 
} 
   
// Driver Code 
public static void main(String []args) 
{ 
    int []a = { 3, 5, 8, 11 }; 
    int n = a.length; 
    System.out.print(countFibonacciPairs(a, n));     
} 
} 
  
// This code is contributed by chitranayal 

