

// Java program to find n-th number 
// with sum of digits as 10. 
  
import java.util.*; 
import java.lang.*; 
  
public class GFG { 
    public static int findNth(int n) 
    { 
        int count = 0; 
  
        for (int curr = 19;; curr += 9) { 
  
            // Find sum of digits in current no. 
            int sum = 0; 
            for (int x = curr; x > 0; x = x / 10) 
                sum = sum + x % 10; 
  
            // If sum is 10, we increment count 
            if (sum == 10) 
                count++; 
  
            // If count becomes n, we return current 
            // number. 
            if (count == n) 
                return curr; 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        System.out.print(findNth(5)); 
    } 
} 
  
// Contributed by _omg 

