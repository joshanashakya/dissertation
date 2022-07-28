

// Java program for finding k-th digit in a^b 
import java.util.*; 
import java.lang.*; 
  
public class GfG { 
    // To compute k-th digit in a^b 
    public static int kthdigit(int a, int b, int k) 
    { 
        // Computing a^b 
        int p = (int)Math.pow(a, b); 
  
        int count = 0; 
        while (p > 0 && count < k) { 
  
            // Getting last digit 
            int rem = p % 10; 
  
            // Increasing count by 1 
            count++; 
  
            // If current number is required digit 
            if (count == k) 
                return rem; 
  
            // Remove last digit 
            p = p / 10; 
        } 
  
        return 0; 
    } 
      
    // Driver Code  
    public static void main(String argc[]) { 
        int a = 5, b = 2; 
        int k = 1; 
        System.out.println(kthdigit(a, b, k)); 
    } 
      
} 
  
// This code is contributed by Sagar Shukla. 

