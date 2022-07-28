

// Java program to find nth Hermite number 
import java.util.*; 
  
class GFG { 
  
    // Utility function to calculate 
    // double factorial of a number 
    static int doubleFactorial(int n) 
    { 
  
        int fact = 1; 
  
        for (int i = 1; i <= n; i = i + 2) { 
  
            fact = fact * i; 
        } 
  
        return fact; 
    } 
  
    // Function to return nth Hermite number 
    static int hermiteNumber(int n) 
    { 
  
        // If n is even then return 0 
        if (n % 2 == 1) 
            return 0; 
  
        // If n is odd 
        else { 
  
            // Calculate double factorial of (n-1) 
            // and multiply it with 2^(n/2) 
            int number = (int)(Math.pow(2, n / 2)) * doubleFactorial(n - 1); 
  
            // If n/2 is odd then 
            // nth Hermite number will be negative 
            if ((n / 2) % 2 == 1) 
                number = number * -1; 
  
            // Return nth Hermite number 
            return number; 
        } 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int n = 6; 
  
        // Print nth Hermite number 
        System.out.println(hermiteNumber(n)); 
    } 
} 

