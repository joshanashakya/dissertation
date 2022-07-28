

// Java program to find maximum 
// sum of digits in all divisors 
// of n numbers. 
import java.util.*; 
import java.lang.*; 
  
class GfG 
{ 
      
    // Function to get  
    // sum of digits 
    public static int getSum(int n) 
    {  
        int sum = 0; 
        while (n != 0) 
        { 
            sum = sum + n % 10; 
            n = n/10; 
        } 
        return sum; 
    } 
  
    // returns maximum sum 
    public static int largestDigitSumdivisior(int n) 
    { 
        int res = 0; 
        for (int i = 1; i <= n; i++)  
  
            // if i is factor of n   
            // then push the divisor  
            // in the stack. 
            if (n % i == 0)  
            res = Math.max(res, getSum(i)); 
  
        return res; 
    } 
      
    // Driver Code 
    public static void main(String argc[]){ 
        int n = 14; 
          
        System.out.println(largestDigitSumdivisior(n)); 
    } 
      
} 
// This code is contributed 
// by Sagar Shukla 

