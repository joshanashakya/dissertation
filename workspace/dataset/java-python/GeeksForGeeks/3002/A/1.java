

// Java program to find sum of all elements 
// upto nth row in Pascal triangle. 
import java.io.*; 
  
class GFG { 
  
    // Function to find sum of aal elements 
    // upto nth row. 
    static long calculateSum(int n) 
    { 
  
        // Initialize sum with 0 
        long sum = 0; 
  
        // Calculate 2^n 
        sum = 1 << n; 
  
        return (sum - 1); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 10; 
        System.out.println("Sum of all elements:"
                           + calculateSum(n)); 
    } 
} 

