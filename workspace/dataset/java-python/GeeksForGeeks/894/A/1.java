

// Java implementation to find the sum 
// of the product of proper divisors of 
// all the numbers lying in the range [L, R] 
import java.util.*; 
  
class GFG{ 
  
static int mod = 1000000007; 
  
// Vector to store the product 
// of the proper divisors of a number 
static int []ans = new int[100002]; 
  
// Variable to store the prefix 
// sum of the product array 
static int []pref = new int[100002]; 
  
// Function to precompute the product 
// of proper divisors of a number at 
// it's corresponding index 
static void preCompute() 
{ 
    // Modificatino of sieve to store the 
    // product of the proper divisors 
    Arrays.fill(ans, 1); 
    for (int i = 2; i <= 100000 / 2; i++) { 
        for (int j = 2 * i; j <= 100000; j += i) { 
  
            // Multiplying the existing value 
            // with i because i is the 
            // proper divisor of ans[j] 
            ans[j] = (ans[j] * i) % mod; 
        } 
    } 
  
    // Loop to store the prefix sum of the 
    // previously computed product array 
    for (int i = 1; i < 100002; ++i) { 
  
        // Computing the prefix sum 
        pref[i] = pref[i - 1] 
                + ans[i]; 
        pref[i] %= mod; 
    } 
} 
  
// Function to print the sum 
// for each query 
static void printSum(int L, int R) 
{ 
    System.out.print(pref[R] - pref[L - 1]+" "); 
} 
  
// Function to print te sum of product 
// of proper divisors of a number in 
// [L, R] 
static void printSumProper(int [][]arr, int Q) 
{ 
  
    // Calling the function that 
    // pre computes 
    // the sum of product 
    // of proper divisors 
    preCompute(); 
  
    // Iterate over all Queries 
    // to print the sum 
    for (int i = 0; i < Q; i++) { 
        printSum(arr[i][0], arr[i][1]); 
    } 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int Q = 2; 
    int[][] arr = {{10, 20 }, 
                    { 12, 16 } }; 
  
    printSumProper(arr, Q); 
} 
} 
  
// This code is contributed by Surendra_Gangwar 

