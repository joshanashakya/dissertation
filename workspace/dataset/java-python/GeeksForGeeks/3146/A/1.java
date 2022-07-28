

// Java program to compute 
// sum of digits in number. 
import java.io.*; 
  
class GFG { 
      
    /* Function to get sum of digits */
    static int getSum(int n) 
    { 
        int sum; 
  
        /* Single line that calculates sum */
        for (sum = 0; n > 0; sum += n % 10, 
                                  n /= 10); 
  
        return sum; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 687; 
  
        System.out.println(getSum(n)); 
    } 
} 
  
// This code is contributed by Gitanjali 

