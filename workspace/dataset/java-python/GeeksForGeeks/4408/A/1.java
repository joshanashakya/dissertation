

// Java Program to find sum of series 
// 1^2 - 2^2 +3^3 -4^4 + ... 
import java.util.*; 
import java.lang.*; 
  
class GFG 
{ 
// Function to find sum of series 
static int sum_of_series(int n) 
{ 
    int result = 0; 
  
    // If n is even 
    if (n % 2 == 0)  
    { 
        result = -(n * (n + 1)) / 2; 
    } 
  
    // If n is odd 
    else
    { 
        result = (n * (n + 1)) / 2; 
    } 
  
    // return the result 
    return result; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
  
    // Get n 
    int n = 3; 
  
    // Find the sum 
    System.out.println(sum_of_series(n)); 
  
    // Get n 
    n = 10; 
  
    // Find the sum 
    System.out.println(sum_of_series(n)); 
} 
} 
  
// This code is contributed  
// by Akanksha Rai(Abby_akku) 

