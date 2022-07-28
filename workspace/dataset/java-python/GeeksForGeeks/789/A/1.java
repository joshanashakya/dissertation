

// Java implementation of the approach 
import java.io.*; 
  
class GFG  
{ 
      
// Function to return the required sum 
static long sumOfLastDig(long n, long m)  
{ 
    long sum = 0, k; 
  
    // Number of element beetween 
    // 1 to n divisible by m 
    k = n / m; 
  
    // Array to store the last digit 
    // of elements in a cycle 
    long []arr = new long[10]; 
  
    // Storing and adding last 
    // digit of cycle 
    for (int i = 0; i < 10; i++)  
    { 
        arr[i] = m * (i + 1) % 10; 
        sum += arr[i]; 
    } 
  
    // Number of elements 
    // present in last cycle 
    long rem = k % 10; 
  
    // Sum of k/10 cycle 
    long ans = (k / 10) * sum; 
  
    // Adding value of digits 
    // of last cycle to the answer 
    for (int i = 0; i < rem; i++)  
    { 
        ans += arr[i]; 
    } 
    return ans; 
} 
  
// Driver Code 
public static void main (String[] args) 
{ 
  
    // input n and m 
    long n = 100, m = 3; 
      
    System.out.println(sumOfLastDig(n, m)); 
} 
} 
  
// This code is contributed by jit_t 

