

// Java program find the maximum sum of 
// digits of the product of two numbers 
import java.io.*; 
  
class GFG  
{ 
  
// Function to find the sum of the digits 
static int sumDigits(int n) 
{ 
    int digit_sum = 0; 
    while (n > 0)  
    { 
        digit_sum += n % 10; 
        n /= 10; 
    } 
    return digit_sum; 
} 
  
// Function to find the maximum sum  
// of digits of product 
static int productOfNumbers(int []arr, int n) 
{ 
    int sum = Integer.MIN_VALUE; 
  
    // Run nested loops 
    for (int i = 0; i < n - 1; i++)  
    { 
        for (int j = i + 1; j < n; j++) 
        { 
            int product = arr[i] * arr[j]; 
  
            // Find the maximum sum 
            sum = Math.max(sum, sumDigits(product)); 
        } 
    } 
  
    // Return the required answer 
    return sum; 
} 
  
// Driver code 
public static void main (String[] args) 
{ 
    int []arr = { 4, 3, 5 }; 
      
    int n = arr.length; 
      
    System.out.print( productOfNumbers(arr, n)); 
} 
} 
  
// This code is contributed by anuj_67.. 

