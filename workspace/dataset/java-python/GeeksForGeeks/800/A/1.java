

//Java implementation of the approach 
  
import java.io.*; 
  
class GFG { 
    // Function to return the sum of the digits of n 
static int sumOfDigits(int n) 
{ 
    int res = 0; 
  
    // Loop for each digit of the number 
    while (n > 0) { 
        res += n % 10; 
        n /= 10; 
    } 
  
    return res; 
} 
  
// Function to return the greatest 
// number less than n such that 
// the sum of its digits is greater 
// than the sum of the digits of n 
static int findNumber(int n) 
{ 
  
    // Starting from n-1 
    int i = n - 1; 
  
    // Check until 1 
    while (i > 0) { 
  
        // If i satisfies the given condition 
        if (sumOfDigits(i) > sumOfDigits(n)) 
            return i; 
        i--; 
    } 
  
    // If the condition is not satisfied 
    return -1; 
} 
  
// Driver code 
    public static void main (String[] args) { 
  
    int n = 824; 
    System.out.println (findNumber(n)); 
    } 
//This code is contributed by akt_mit     
} 

