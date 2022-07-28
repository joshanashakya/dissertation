

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to return the 
// sum of digits of n 
static int sum(int n) 
{ 
    int sum = 0; 
    while (n > 0) 
    { 
  
        // Add the last digit to the sum 
        sum = sum + n % 10; 
  
        // Remove last digit 
        n = n / 10; 
    } 
  
    // Return the sum of digits 
    return sum; 
} 
  
// Function to print the first n numbers 
// whose sum of digits is 10 
static void firstN(int n) 
{ 
  
    // First number of the series is 19 
    int num = 19, cnt = 1; 
    while (cnt != n)  
    { 
  
        // If the sum of digits of the 
        // current number is equal to 10 
        if (sum(num) == 10) 
        { 
  
            // Print the number 
            System.out.print(num + " "); 
            cnt++; 
        } 
  
        // Add 9 to the previous number 
        num += 9; 
    } 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int n = 10; 
    firstN(n); 
} 
}  
  
// This code is contributed by Rajput-Ji 

