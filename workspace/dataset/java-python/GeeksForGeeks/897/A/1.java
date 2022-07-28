

// Java program to find if two numbers are 
// equivalent or not 
import java.math.*; 
  
class GFG { 
  
    // Function to calculate sum of all proper 
    // divisors num --> given natural number 
    static int divSum(int n) 
    { 
        // To store sum of divisors 
        int sum = 1; 
  
        // Find all divisors and add them 
        for (int i = 2; i * i <= n; i++) 
            if (n % i == 0) 
                sum = sum + i + n / i; 
  
        return sum; 
    } 
  
    // Function to check if both numbers 
    // are equivalent or not 
    static boolean areEquivalent(int num1, int num2) 
    { 
  
        return divSum(num1) == divSum(num2); 
    } 
  
    // Drivers code 
    public static void main(String[] args) 
    { 
        int num1 = 559; 
        int num2 = 703; 
  
        if (areEquivalent(num1, num2)) 
            System.out.println("Equivalent"); 
        else
            System.out.println("Not Equivalent"); 
    } 
} 

