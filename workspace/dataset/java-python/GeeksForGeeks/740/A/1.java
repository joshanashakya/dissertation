

// Java implementation to count  
// the occurence of a digit in  
// number using Recursion 
  
import java.util.*; 
   
class GFG { 
      
    // Function to count the digit K 
    // in the given number N 
    static double countdigits(int n, int k) 
    { 
        if (n == 0) 
            return 0; 
   
        // Extracting least  
        // significant digit 
        int digit = n % 10; 
        if (digit == k) 
            return 1 + countdigits(n / 10, k); 
   
        return countdigits(n / 10, k); 
    } 
   
    // Driver Code 
    public static void main(String[] args) 
    { 
        int n = 1000; 
        int k = 0; 
        System.out.println(countdigits(n, k)); 
    } 
} 

