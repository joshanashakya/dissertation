

// Java program for Check whether a number can be 
// represented by sum of two squares using binary search. 
import java.util.*; 
import java.lang.*; 
  
public class GfG { 
    public static boolean judgeSquareSum(int c) 
    { 
  
        // Iterating loop from 0 to c - a * a. 
        for (long a = 0; a * a <= c; a++) { 
            int b = c - (int)(a * a); 
  
            // If b is a square root of c - a * a 
            // then return true. 
            if (binary_search(0, b, b)) 
                return true; 
        } 
        return false; 
    } 
  
    // Function for binary search. 
    public static boolean binary_search(long s, long e, int n) 
    { 
  
        // If lower limit exceeds upper limit. 
        if (s > e) 
            return false; 
  
        // Calculating mid. 
        long mid = s + (e - s) / 2; 
        if (mid * mid == n) 
            return true; 
        if (mid * mid > n) 
            return binary_search(s, mid - 1, n); 
        return binary_search(mid + 1, e, n); 
    } 
  
    // Driver function 
    public static void main(String argc[]) 
    { 
        int c = 17; 
        System.out.println(judgeSquareSum(c)); 
    } 
} 

