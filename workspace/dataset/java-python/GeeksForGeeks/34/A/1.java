

// Java implementation to find the 
// minimum window size in the range 
// such that each window of that size 
// contains atleast P primes 
import java.util.*; 
  
class GFG{ 
   
// Function to check that a number is  
// a prime or not in O(Math.sqrt(N)) 
static boolean isPrime(int N) 
{ 
    if (N < 2) 
        return false; 
    if (N < 4) 
        return true; 
    if ((N & 1) == 0) 
        return false; 
    if (N % 3 == 0) 
        return false; 
    int curr = 5, s = (int) Math.sqrt(N); 
   
    // Loop to check if any number 
    // number is divisible by any  
    // other number or not 
    while (curr <= s) { 
        if (N % curr == 0) 
            return false; 
        curr += 2; 
        if (N % curr == 0) 
            return false; 
        curr += 4; 
    } 
    return true; 
} 
   
// Function to check whether window 
// size satisfies condition or not 
static boolean check(int s, int p,  
      int prefix_sum[], int n) 
{ 
    boolean satisfies = true; 
       
    // Loop to check each window of  
    // size have atleast P primes 
    for (int i = 0; i < n; i++) { 
        if (i + s - 1 >= n) 
            break; 
           
        // Checking condition  
        // using prefix sum 
        if (prefix_sum[i + s - 1] -  
          (i - 1 >= 0 ?  
          prefix_sum[i - 1] : 0) < p) 
            satisfies = false; 
    } 
    return satisfies; 
} 
   
// Function to find the minimum  
// window size possible for the 
// given range in X and Y 
static int minimumWindowSize(int x, int y, 
                             int p) 
{ 
    // Prefix array 
    int []prefix_sum = new int[y - x + 1]; 
   
    // Mark those numbers  
    // which are primes as 1 
    for (int i = x; i <= y; i++) { 
        if (isPrime(i)) 
            prefix_sum[i - x] = 1; 
    } 
   
    // Convert to prefix sum 
    for (int i = 1; i < y - x + 1; i++) 
        prefix_sum[i] +=  
              prefix_sum[i - 1]; 
   
    // Applying binary search  
    // over window size 
    int low = 1, high = y - x + 1; 
    int mid; 
    while (high - low > 1) { 
        mid = (low + high) / 2; 
           
        // Check whether mid satisfies  
        // the condition or not 
        if (check(mid, p,  
           prefix_sum, y - x + 1)) { 
               
            // If satisfies search 
            // in first half 
            high = mid; 
        } 
           
        // Else search in second half 
        else
            low = mid; 
    } 
    if (check(low, p,  
       prefix_sum, y - x + 1)) 
        return low; 
    return high; 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    int x = 12; 
    int y = 42; 
    int p = 3; 
   
    System.out.print(minimumWindowSize(x, y, p)); 
} 
} 
  
// This code is contributed by sapnasingh4991 

