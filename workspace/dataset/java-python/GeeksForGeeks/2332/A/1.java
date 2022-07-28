

// Java implementation of above approach 
import java.io.*; 
import java.util.*; 
public class GFG { 
  
    // Function that traverses digits in a number and 
    // modifies frequency count array 
    static void countDigits(double val, long[] arr) 
    { 
        while ((long)val > 0) { 
            long digit = (long)val % 10; 
            arr[(int)digit]++; 
            val = (long)val / 10; 
        } 
        return; 
    } 
  
    static void countFrequency(int x, int n) 
    { 
  
        // Array to keep count of digits 
        long[] freq_count = new long[10]; 
  
        // Traversing through x^1 to x^n 
        for (int i = 1; i <= n; i++) { 
            // For power function, both its parameters are 
            // to be in double 
            double val = Math.pow((double)x, (double)i); 
            // calling countDigits function on x^i 
            countDigits(val, freq_count); 
        } 
  
        // Printing count of digits 0-9 
        for (int i = 0; i <= 9; i++) { 
            System.out.print(freq_count[i] + " "); 
        } 
    } 
    // Driver code 
    public static void main(String args[]) 
    { 
        int x = 15, n = 3; 
        countFrequency(x, n); 
    } 
} 

