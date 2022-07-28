

// Java implementation of the approach 
import java.io.*; 
  
class GFG { 
  
    // Function that returns true if n 
    // can be represented as the sum of 
    // exactly k distinct positive integers 
    static boolean solve(int n, int k) 
    { 
        // If n can be represented as 
        // 1 + 2 + 3 + ... + (k - 1) + (k + x) 
        if (n >= (k * (k + 1)) / 2) { 
            return true; 
        } 
  
        return false; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 12, k = 4; 
  
        if (solve(n, k)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 
  
// This code is contributed by anuj_67.. 

