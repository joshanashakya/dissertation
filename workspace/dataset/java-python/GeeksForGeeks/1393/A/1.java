

// java program to check if counts of  
// consecutive 1s are increasing order. 
import java .io.*; 
  
class GFG { 
      
    // Returns true if n has counts of 
    // consecutive 1's are increasing 
    // order. 
    static boolean areSetBitsIncreasing(int n) 
    { 
          
        // Initialize previous count 
        int prev_count = Integer.MAX_VALUE; 
      
        // We traverse bits from right to 
        // left and check if counts are  
        // decreasing order. 
        while (n > 0) 
        { 
              
            // Ignore 0s until we reach 
            // a set bit. 
            while (n > 0 && n % 2 == 0) 
            n = n/2; 
      
            // Count current set bits 
            int curr_count = 1; 
            while (n > 0 && n % 2 == 1) 
            { 
                n = n/2; 
                curr_count++; 
            } 
      
            // Compare current with previous 
            // and update previous. 
            if (curr_count >= prev_count) 
                return false; 
            prev_count = curr_count; 
        } 
      
        return true; 
    } 
      
    // Driver code 
    static public void main (String[] args) 
    { 
        int n = 10; 
          
        if (areSetBitsIncreasing(n)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 
  
// This code is contributed by anuj_67. 

