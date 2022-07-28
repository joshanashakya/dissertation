

// Java implementation of the approach 
import java.util.*; 
      
class GFG 
{ 
      
// Function that will check 
// whether number is prime or not 
static boolean prime(int n) 
{ 
    for (int i = 2; i * i <= n; i++)  
    { 
        if (n % i == 0) 
            return false; 
    } 
    return true; 
} 
  
// Function to print the 3rd number 
static void thirdNumber(int a, int b) 
{ 
    int sum = 0, temp = 0; 
  
    sum = a + b; 
    temp = 1; 
  
    // If the sum is odd 
    if (sum == 0)  
    { 
        temp = 2; 
    } 
  
    // If sum is not prime 
    while (!prime(sum + temp))  
    { 
        temp += 2; 
    } 
    System.out.print(temp); 
} 
  
// Driver code 
static public void main (String []arr) 
{ 
    int a = 3, b = 5; 
      
    thirdNumber(a, b); 
} 
} 
  
// This code is contributed by 29AjayKumar 

