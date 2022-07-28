

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
  
        // Loop to calculate power of 2 
        // upto n and add them 
        for (int row = 0; row < n; row++) { 
            sum = sum + (1 << row); 
        } 
  
        return sum; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 10; 
        System.out.println("Sum of all elements:"
                           + calculateSum(n)); 
    } 
} 

