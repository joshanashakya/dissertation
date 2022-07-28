

// Java program to remove repeated digits 
import java.io.*; 
  
class GFG { 
  
    static long removeRecur(long n) 
    { 
          
        // Store first digits as previous 
        // digit 
        long prev_digit = n % 10; 
      
        // Initialize power 
        long pow = 10; 
        long res = prev_digit; 
      
        // Iterate through all digits of n, 
        // note that the digits are  
        // processed from least significant 
        // digit to most significant digit. 
        while (n>0) { 
              
            // Store current digit 
            long curr_digit = n % 10; 
      
            if (curr_digit != prev_digit)  
            { 
                // Add the current digit to 
                // the beginning of result 
                res += curr_digit * pow; 
      
                // Update previous result 
                // and power 
                prev_digit = curr_digit; 
                pow *= 10; 
            } 
      
            // Remove last digit from n 
            n = n / 10; 
        } 
      
        return res; 
    } 
      
    // Drive program 
    public static void main (String[] args) 
    { 
        long n = 12224; 
          
        System.out.println(removeRecur(n)); 
    } 
} 
  
// This code is contributed by anuj_67. 

