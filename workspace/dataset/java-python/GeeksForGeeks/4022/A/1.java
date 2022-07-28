

// Java implementation to find  
// the sum of the given series 
import java.util.*; 
  
class GFG { 
      
    // functionn to find the sum 
    // of the given series 
    static int sumOfTheSeries(int n) 
    { 
        int sum = 0; 
        for (int i = 1; i <= n; i++) 
        { 
       
            // first term of each  
            // i-th term 
            int k = 1; 
            for (int j = 1; j <= i; j++) 
            { 
                sum += k; 
       
                // next term 
                k += 2; 
            } 
        } 
       
        // required sum 
        return sum; 
    } 
  
    /* Driver program */
    public static void main(String[] args)  
    { 
         int n = 5; 
         System.out.println("Sum = " +  
                        sumOfTheSeries(n)); 
    } 
} 
  
// This code is contributed by Arnav Kr. Mandal. 

