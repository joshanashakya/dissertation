

// Java implementation of the approach 
import java.io.*; 
  
class GFG  
{ 
      
// Function to return the value of F(N) 
static int getValueOfF(int n) 
{ 
  
    // Base cases 
    if (n == 1) 
        return 0; 
    if (n == 2) 
        return 1; 
  
    int cnt = 0; 
  
    // Count the number of times a number 
    // if divisible by 2 
    while (n % 2 == 0) 
    { 
        cnt += 1; 
        n /= 2; 
    } 
  
    // Return the summation 
    return 2 * cnt; 
} 
  
// Driver code 
public static void main (String[] args) 
{ 
    int n = 20; 
    System.out.println (getValueOfF(n)); 
} 
} 
  
// This code is contributed by ajit. 

