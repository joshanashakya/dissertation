

// Java program to find the product of N 
// with its largest odd digit 
  
class GFG 
{ 
      
// Function to return the largest 
// odd digit in n 
static int largestOddDigit(int n) 
{ 
    // If all digits are even then -1  
    // will be returned 
    int maxOdd = -1; 
    while (n > 0) 
    { 
  
        // Last digit from n 
        int digit = n % 10; 
  
        // If current digit is odd and > maxOdd 
        if (digit % 2 == 1 && digit > maxOdd) 
            maxOdd = digit; 
  
        // Remove last digit 
        n = n / 10; 
    } 
  
    // Return the maximum odd digit 
    return maxOdd; 
} 
  
// Function to return the product of n 
// with its largest odd digit 
static int getProduct(int n) 
{ 
    int maxOdd = largestOddDigit(n); 
  
    // If there are no odd digits in n 
    if (maxOdd == -1) 
        return -1; 
  
    // Product of n with its largest odd digit 
    return (n * maxOdd); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 12345; 
    System.out.println(getProduct(n)); 
} 
} 
  
// This code is contributed by chandan_jnu 

