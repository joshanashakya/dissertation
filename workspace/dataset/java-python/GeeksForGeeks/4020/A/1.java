

// Java implementation of the approach 
  
import java.io.*; 
  
class GFG { 
      
  
// Function to calculate the sum of the digits of 
// n in the given base 
static int solve(int n, int base) 
{ 
    // Sum of digits 
    int sum = 0; 
  
    while (n > 0) { 
  
        // Digit of n in the given base 
        int remainder = n % base; 
  
        // Add the digit 
        sum += remainder; 
        n = n / base; 
    } 
  
    return sum; 
} 
  
// Function to calculate the sum of 
// digits of n in bases from 2 to n/2 
static void SumsOfDigits(int n) 
{ 
    // to store digit sum in all bases 
    int sum = 0; 
  
    // function call for multiple bases 
    for (int base = 2; base <= n / 2; ++base) 
        sum += solve(n, base); 
  
    System.out.println(sum); 
} 
  
// Driver program 
  
  
    public static void main (String[] args) { 
        int n = 8; 
    SumsOfDigits(n); 
    } 
      
} 
// This code is contributed by anuj_67.. 

