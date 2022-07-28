

// Java Largest number in [2, 3, .. n]  
// which is co-prime with numbers  
// in [2, 3, .. m] 
import java.io.*; 
  
class GFG  
{ 
    // Returns true if i is co-prime with numbers  
    // in set [2, 3, ... m] 
    static boolean isValid(long i, long m) 
    { 
        // Running the loop till square root of n  
        // to reduce the time complexity from n 
        long sq_i = (long)Math.sqrt(i); 
      
        // Find the minimum of square root of n 
        // and m to run the loop until the smaller  
        // one 
        long sq = Math.min(m, sq_i); 
      
        // Check from 2 to min(m, sqrt(n)) 
        for (long j = 2; j <= sq; j++)  
            if (i % j == 0) 
                return false; 
          
        return true; 
    } 
      
    // Function to find the largest number less than n  
    // which is Co-prime with all numbers from 2 to m 
    static void findLargestNum(long n, long m) 
    { 
        // Iterating from n to m+1 to find the number 
        for (long i = n; i > m; i--) { 
      
            // checking every number for the given 
            // conditions 
            if (isValid(i, m)) { 
              
                // The first number which satisfy the  
                // conditions is the answer 
                System.out.println (i); 
                return; 
            } 
        } 
      
        // If there is no number which satisfy the  
        // conditions, then print number does not exist. 
        System.out.println("Number Doesn't Exists"); 
    } 
      
    // Driver Program 
    public static void main (String[] args)  
    { 
        long n = 16, m = 3; 
        findLargestNum(n, m); 
              
    } 
} 
          
// This code is contributed by vt_m. 

