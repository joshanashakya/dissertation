

// Java program to find nth number that contains  
// the digit k or divisible by k. 
import java.io.*; 
  
class GFG  
{ 
    // Function for checking if digit k  
    // is in n or not 
    public static boolean checkdigit(int n, int k) 
    { 
        while (n != 0) 
        { 
            // finding remainder 
            int rem = n % 10; 
      
            // if digit found 
            if (rem == k) 
                return true; 
      
            n = n / 10; 
        } 
  
        return false; 
    } 
  
    // Function for finding nth number 
    public static int findNthNumber(int n, int k) 
    {  
        // since k is the first which satisfy th  
    // criteria, so consider it in count making count = 1 
    //  and starting from i = k + 1 
        for (int i = k + 1, count = 1; count < n; i++) 
        { 
        // checking that the number contain 
        // k digit or divisible by k 
        if (checkdigit(i, k) || (i % k == 0)) 
            count++; 
  
        if (count == n) 
        return i; 
        } 
  
    return -1; 
    } 
  
    // Driver code 
    public static void main (String[] args)  
    { 
        int n = 10, k = 2;  
        System.out.println(findNthNumber(n, k));  
          
    } 
} 
  
// This code is contributed 
// by  UPENDRA BARTWAL 

