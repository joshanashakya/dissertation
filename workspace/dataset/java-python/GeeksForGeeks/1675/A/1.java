

// Java implementation of the approach 
import java.io.*; 
  
class GFG  
{ 
  
// Function to return the sum of all the 
// powers of k from the range [1, n] 
static long sumPowersK(long n, long k) 
{ 
  
    // To store the sum of the series 
    long sum = 0, num = 1; 
  
    // While current power of k <= n 
    while (num <= n)  
    { 
  
        // Add current power to the sum 
        sum += num; 
  
        // Next power of k 
        num *= k; 
    } 
  
    // Return the sum of the series 
    return sum; 
} 
  
// Find to return the sum of the 
// elements from the range [1, n] 
// excluding those which are powers of k 
static long getSum(long n, long k) 
{ 
    // Sum of all the powers of k from [1, n] 
    long pwrK = sumPowersK(n, k); 
  
    // Sum of all the elements from [1, n] 
    long sumAll = (n * (n + 1)) / 2; 
  
    // Return the required sum 
    return (sumAll - pwrK); 
} 
  
    // Driver code 
    public static void main (String[] args)  
    { 
        long n = 10, k = 3; 
        System.out.println( getSum(n, k)); 
  
    } 
} 
  
// This code is contributed by anuj_67.. 

