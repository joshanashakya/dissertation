

// Java Program to find first and last 
// digits of a number 
import java.util.*; 
import java.lang.*; 
  
public class GfG{ 
      
    // Find the first digit 
    public static int firstDigit(int n) 
    { 
        // Remove last digit from number 
        // till only one digit is left 
        while (n >= 10)  
            n /= 10; 
      
        // return the first digit 
        return n; 
    } 
  
    // Find the last digit 
    public static int lastDigit(int n) 
    { 
        // return the last digit 
        return (n % 10); 
    } 
      
    // driver function 
    public static void main(String argc[]) 
    { 
        int n = 98562; 
        System.out.println(firstDigit(n) + " "
        + lastDigit(n)); 
    } 
} 
  
// This code is contributed by Sagar Shukla 

