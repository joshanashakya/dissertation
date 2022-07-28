

// Java Program to validate the above logic 
import java.io.*; 
  
class GFG { 
  
// Function to check if the 
// number is divisible by 19 or not 
static boolean isDivisible(long n) 
{ 
  
    while (n / 100>0)  
    { 
        // Extracting the last digit 
        long d = n % 10; 
  
        // Truncating the number 
        n /= 10; 
  
        // Subtracting the five times the 
        // last digit from the remaining number 
        n += d * 2; 
    } 
  
    // Return n is divisible by 19 
    return (n % 19 == 0); 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
    long n = 101156; 
    if (isDivisible(n)) 
        System.out.println( "Yes"); 
    else
        System.out.println( "No"); 
    } 
} 
// This code is contributed by Raj. 

