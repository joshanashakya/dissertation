

// Java program to find maximum  
// sum of digits in all divisors 
// of n numbers. 
  
import java.io.*; 
import java.math.*; 
  
class GFG  
{ 
  
    // Function to get  
    // sum of digits  
    static int getSum(int n) 
    { 
        int sum = 0; 
        while (n != 0) 
        { 
            sum = sum + n % 10; 
            n = n / 10; 
        } 
        return sum; 
    } 
  
    // returns maximum sum 
    static int largestDigitSumdivisior(int n) 
    { 
        int res = 0; 
  
        // traverse till sqrt(n) 
        for (int i = 1; i <= Math.sqrt(n); i++) 
        { 
  
            // if i is factor of 
            // n then push the 
            // divisor in the stack. 
            if (n % i == 0)  
            { 
                  
                // check for both the divisors 
                res = Math.max(res, getSum(i)); 
                res = Math.max(res, getSum(n / i)); 
            } 
  
        } 
          
        return res; 
    } 
  
    // Driver Code 
    public static void main(String args[]) 
    { 
        int n = 14; 
        System.out.println(largestDigitSumdivisior(n)); 
    } 
} 
  
// This code is contributed 
// by Nikita Tiwari 

