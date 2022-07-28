

// Java implementation of above approach 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG { 
  
    // Function to sum the digits until it 
    // becomes a single digit 
    public static long repeatedSum(long n) 
    { 
        if (n == 0) 
            return 0; 
        return (n % 9 == 0) ? 9 : (n % 9); 
    } 
  
    // Function to product the digits until it 
    // becomes a single digit 
    public static long repeatedProduct(long n) 
    { 
        long prod = 1; 
  
        // Loop to do sum while 
        // sum is not less than 
        // or equal to 9 
        while (n > 0 || prod > 9) { 
            if (n == 0) { 
                n = prod; 
                prod = 1; 
            } 
            prod *= n % 10; 
            n /= 10; 
        } 
        return prod; 
    } 
  
    // Function to find the maximum among 
    // repeated sum and repeated product 
    public static long maxSumProduct(long N) 
    { 
  
        if (N < 10) 
            return N; 
  
        return Math.max(repeatedSum(N), repeatedProduct(N)); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
  
        long n = 631; 
        System.out.println(maxSumProduct(n)); 
    } 
} 

