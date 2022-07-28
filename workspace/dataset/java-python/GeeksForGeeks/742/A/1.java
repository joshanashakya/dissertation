

// Java implementation to find the 
// sum of all non-fibonacci numbers 
// in a range from L to R  
import java.util.*;  
   
// Array to precompute the sum of 
// non-fibonacci numbers 
  
class GFG 
{ 
static long pref[] = new long[100010]; 
   
// Function to find if a number 
// is a perfect square 
static boolean isPerfectSquare(int x) 
{ 
    int s =(int)Math.sqrt(x); 
    return (s * s == x); 
} 
   
// Function that returns N 
// if N is non-fibonacci number 
static int isNonFibonacci(int n) 
{ 
    // N is Fibinacci if one of 
    // 5*n*n + 4 or 5*n*n - 4 or both 
    // are perferct square 
    if (isPerfectSquare(5 * n * n + 4) 
        || isPerfectSquare(5 * n * n - 4)) 
        return 0; 
    else
        return n; 
} 
   
// Function to precompute sum of 
// non-fibonacci Numbers 
static void compute() 
{ 
    for (int i = 1; i <= 100000; ++i) { 
        pref[i] = pref[i - 1] 
                  + isNonFibonacci(i); 
    } 
} 
   
// Function to find the sum of all 
// non-fibonacci numbers in a range 
static void printSum(int L, int R) 
{ 
    int sum = (int)(pref[R] - pref[L - 1]); 
    System.out.print(sum + " "); 
} 
   
// Driver Code 
public static void main(String []args) 
{ 
    // Pre-computation 
    compute(); 
   
    int Q = 2; 
    int arr[][] = { { 1, 5 }, 
                     { 6, 10 } }; 
    // Loop to find the sum for 
    // each query 
    for (int i = 0; i < Q; i++) { 
        printSum(arr[i][0], arr[i][1]); 
    } 
} 
} 
  
// This code is contributed by chitranayal 

